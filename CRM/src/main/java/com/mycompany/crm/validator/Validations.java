/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crm.validator;



import com.mycompany.crm.controller.Gestor;
import com.mycompany.crm.crm.entity.Comercial;
import com.mycompany.crm.crm.entity.Empresa;
import com.mycompany.crm.exceptions.ComandaException;
import com.mycompany.crm.utils.CastData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Validations {

    private Gestor gestor = new Gestor();
    private static Validations v;
    private Validations() {

    }
    public static Validations getInstance() {
        if (v == null) {
            v = new Validations();
        }
        return v;
    }
    public boolean valLogin(String dni, String password) throws ComandaException, SQLException{
        if (!password.equals("1234")) {
            System.out.println("ERROR ContraseÃ±a");
            throw new ComandaException(ComandaException.ERROR_CONTRASEÑA);
        }
        return gestor.login(dni,password);

    }

    public void valAltaCliente(String nombre, String agente, String phone, String email, String codigo, String direccion, String cp, String region, String web, String ciudad) throws ComandaException {
        if (valPhone(phone)) {
                if (valName(nombre, "nombre")) {
                    if (valName(agente, "apellido")) {
                        if (valEmail(email)) {
                            try{
                                gestor.altaEmpresa(nombre, agente, phone, email, codigo, direccion, Integer.parseInt(cp), region, web, ciudad);
                            }catch(SQLException e){
                                System.out.println(e.getMessage());
                            }
                        }
                    }
                }
            }
    }

    public void valAltaEmpleado(String dni, String name, String apellidos, String porcentajeComision, String fechaIncorporacion, String contrasenya) throws ComandaException{
        valDni(dni);
        valName(name, "nombre");
        valName(apellidos, "apellido");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        try{
            Date sqlDate = new java.sql.Date(dateFormat.parse("2024/05/07").getTime());
            gestor.altaEmpleado(dni, name,apellidos, Integer.parseInt(porcentajeComision), sqlDate, contrasenya);

        }catch(ParseException e){
            System.out.println("No se puede modificar"); // Añadir excepcion formato fecha incorrecto
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            throw new ComandaException(ComandaException.EMPLEADO_EXISTE);
        }
    }

    /*public void valBajaEmpleado(String dni) throws ComandaException {
        if (valDni(dni)) {
            gestor.bajaEmpleado(dni);
        }
    }*/

    public String valClienteInfo(String phone) throws ComandaException {
        valPhone(phone);
        String info = "";
        try{
            info = gestor.infoCliente(phone).toString();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return info;
        
    }

    public String valEmpleadoInfo(String dni) throws ComandaException{
        valDni(dni);
        String info = "";
        try{
            info = gestor.infoEmpleado(dni).toString();
        }catch(SQLException e){
            System.out.println(e.getMessage()); //  TODO lanzar excepcion para recoger en boton
            throw new ComandaException(ComandaException.NOEXISTE_EMPLEADO);
        }
        return info;
    }

    public ArrayList<Empresa> valClientesList() throws ComandaException {
        ArrayList<Empresa> empresas = new ArrayList<>();
        try{
            empresas = gestor.listClientes();
            
        }catch(SQLException e){
            System.out.println(e.getMessage()); // añadir lanzar excepcion comanda exception
        }
        return empresas;
    }
//    public ArrayList<Empresa> valClientesList2() throws ComandaException {
//        return gestor.listClientes2();
//    }

    public String valEmpleadosList() throws ComandaException {
        String info = "";
        try{
            ArrayList<Comercial> comerciales = gestor.listEmpleados();
            for(Comercial c: comerciales){
                info += c.toString();
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return info;
    }

//    public void valAsignarCliente(String[] args){
//        if (valLength(args.length, 3)){
//            if (valPhone(args[1])){
//                if (valDni(args[2])){
//                    gestor.asignarCliente(args[1],args[2]);
//                }
//            }
//        }
//    }
    public boolean valLength(int argsLength,int lengthEsperada) throws ComandaException {
        boolean Validacion = false;
        if (argsLength == lengthEsperada){
            Validacion = true;
        } else {
            System.out.println("ERROR. El nÃºmero de argumentos es incorrecto.");
            throw new ComandaException(ComandaException.ARGS_INCORRECTOS);
        }
        return Validacion;
    }
    public boolean valPhone(String tel)throws ComandaException{
        //TODO Valentina
        boolean esCorrecto = true;
        if(tel.length() == 9) {
            for (int i = 0; i < tel.length(); i++) {
                if (!Character.isDigit(tel.charAt(i))) {
                    System.out.println("El nÃºmero de telÃ©fono introducido no es vÃ¡lido.");
                    esCorrecto = false;
                    throw new ComandaException(ComandaException.ERROR_TEL);
                }
            }
       }else{
            System.out.println("El numero de telefono introducido no es valido.");
            esCorrecto =false;
            throw new ComandaException(ComandaException.ERROR_TEL);
        }

        return esCorrecto;
    }


    public boolean valName(String name, String tipo) throws ComandaException {
        //TODO Santi
        name = name.trim();

        if (name.isEmpty()){
            System.out.println("Error; no has introducio ningun dato");
            throw new ComandaException(ComandaException.NO_DATO);
        }
        String[] partes = name.split("\\s+");
        
        if (tipo.equals("apellido") && partes.length != 2){
            System.out.println("Error: debes introducir dos apellidos");
            throw new ComandaException(ComandaException.DOS_APELLIDOS);
        }
        if (tipo.equals("nombre") && partes.length > 2){
            System.out.println("Error: debes introducir un mÃ¡ximo de dos nombres");
            throw new ComandaException(ComandaException.MAX_NOMBRES);
        }

        for (String part : partes) {
            if (part.length() < 2 || part.length() > 20) {
                System.out.println("Error: cada parte del " + tipo + " debe tener al menos 2 caracteres y un mÃ¡ximo de 20.");
                throw new ComandaException(ComandaException.ERROR_AP);
            } else if (!part.matches("[\\p{L}]+")) {
                System.out.println("Error: solo puedes introducir caracteres alfabÃ©ticos en cada parte del " + tipo);
                throw new ComandaException(ComandaException.DATO_INCORRECTO);
            }
        }

        return true;
    }

    public boolean valDni(String dni) throws ComandaException {
        //TODO Jordi
        dni = dni.strip().toUpperCase();
        boolean isValid = true;
        int resto = 0;
        String dniNum = getNumDni(dni);
        int numDni = 0;
        String validLetters = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (dniNum.length() == 8 && dni.length() == 9){
            numDni = CastData.toInt(dniNum);
            char letter = dni.charAt(dni.length()-1);

            resto = numDni%23;
            if (letter == validLetters.charAt(resto)){
                isValid = true;
            } else{
                System.out.println("El Ãºltimo carÃ¡cter solo puede ser una letra y tiene que ser vÃ¡lida");
                throw new ComandaException(ComandaException.ERROR_DNI);
            }
        }else{
            System.out.println("El formato del DNi debe ser '12345678X'");
            throw new ComandaException(ComandaException.ERROR_DNI);
        }

        return isValid;
    }
    
    public String getNumDni(String dni){
        String validNumbers = "0123456789";
        String numDni = "";
        for(int i = 0; i<dni.length()-1; i++){
            for(int j = 0; j<validNumbers.length(); j++){
                if (dni.charAt(i) == validNumbers.charAt(j)){
                    numDni += dni.charAt(i);
                }
            }
        }      
        return numDni;
    }

    public boolean valEmail(String email) throws ComandaException {
        if (email.isEmpty()) {
            System.out.println("El correo electrÃ³nico no puede estar vacÃ­o.");
            throw new ComandaException(ComandaException.ERROR_CORREO);
        } else {
            if (email.startsWith("-") || email.endsWith("-") || email.startsWith(".") || email.endsWith(".") || email.contains("..")) {
                System.out.println("El correo electrÃ³nico no puede comenzar o terminar con '-' o '.' ni contener '..'");
                throw new ComandaException(ComandaException.ERROR_CORREO);
            } else {
                if (!email.contains("@") || email.indexOf("@") != email.lastIndexOf("@")) {
                    System.out.println("El correo electrÃ³nico debe contener un solo '@'.");
                    throw new ComandaException(ComandaException.ERROR_CORREO);
                } else {
                    String[] emailSeparado = email.split("@");
                    if (emailSeparado.length < 2) {
                        System.out.println("El correo electrÃ³nico debe tener caracteres antes y despuÃ©s de '@'.");
                        throw new ComandaException(ComandaException.ERROR_CORREO);
                    } else {
                        String[] dominioEmail = emailSeparado[1].split("\\.");
                        if (dominioEmail.length < 2) {
                            System.out.println("El dominio del correo electrÃ³nico debe contener '.'.");
                            throw new ComandaException(ComandaException.ERROR_CORREO);
                        } else {
                            if (dominioEmail[0].length() > 63 || dominioEmail[1].length() > 63) {
                                System.out.println("Ninguna parte del dominio del correo electrÃ³nico puede exceder los 63 caracteres.");
                                throw new ComandaException(ComandaException.ERROR_CORREO);
                            } else {
                                if (!email.matches("^[a-zA-Z0-9.Ã±Ã‘_-]+@[a-zA-Z0-9.Ã±Ã‘-]+$")) {
                                    System.out.println("El correo electrÃ³nico solo puede contener caracteres alfanumÃ©ricos y . _ -");
                                    throw new ComandaException(ComandaException.ERROR_CORREO);
                                } else {
                                    if (emailSeparado[0].isEmpty() || emailSeparado[0].length() > 64) {
                                        System.out.println("La parte local del correo electrÃ³nico (antes de @) debe tener entre 1 y 64 caracteres.");
                                        throw new ComandaException(ComandaException.ERROR_CORREO);
                                    } else {
                                        if (emailSeparado[1].isEmpty() || emailSeparado[1].length() > 64) {
                                            System.out.println("La parte del dominio del correo electrÃ³nico (despuÃ©s de @) debe tener entre 1 y 64 caracteres.");
                                            throw new ComandaException(ComandaException.ERROR_CORREO);
                                        } else {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
