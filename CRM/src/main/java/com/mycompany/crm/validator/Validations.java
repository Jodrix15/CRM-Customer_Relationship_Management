/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crm.validator;


import com.mycompany.crm.utils.CastData;
import com.mycompany.crm.utils.InputData;

/**
 *
 * @author admin
 */
public class Validations {

    public static boolean valPhone(String tel){
        //TODO Valentinalinda
        if(tel.length() == 9) {
            for (int i = 0; i < tel.length(); i++) {
            if (!Character.isDigit(tel.charAt(i))) {
                System.out.println("El número de teléfono introducido no es válido.");
                return false;
            }
        }
        System.out.println("Número de teléfono ingresado correctamente.");
        return true;
       }
        System.out.println("El numero de telefono introducido no es valido.");
        return false;
    }


    public static boolean valName(String name, String tipo){
        //TODO Santi
        name = name.trim();

        if (name.isEmpty()){
            System.out.println("Error; no has introducio ningun dato");
            return false;
        }
        String[] partes = name.split("\\s+");
        
        if (tipo.equals("apellido") && partes.length != 2){
            System.out.println("Error: debes introducir dos apellidos");
            return false;
        }
        if (tipo.equals("nombre") && partes.length > 2){
            System.out.println("Error: debes introducir un máximo de dos nombres");
            return false;
        }

        for (String part : partes) {
            if (part.length() < 2 || part.length() > 20) {
                System.out.println("Error: cada parte del " + tipo + " debe tener al menos 2 caracteres y un máximo de 20.");
                return false;
            } else if (!part.matches("[\\p{L}]+")) {
                System.out.println("Error: solo puedes introducir caracteres alfabéticos en cada parte del " + tipo);
                return false;
            }
        }

        return true;
    }

    public static boolean valDni(String dni){
        //TODO Jordi
        dni = dni.strip().toUpperCase();
        boolean isValid = false;
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
                System.out.println("DNI registrado correctamente");
            } else{
                System.out.println("El último carácter solo puede ser una letra y tiene que ser válida");
            }
        }else{
            System.out.println("El formato del DNi debe ser '12345678X'");
        }

        return isValid;
    }
    
    public static String getNumDni(String dni){
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

    public static boolean valEmail(String email) {
        if (email.isEmpty()) {
            System.out.println("El correo electrónico no puede estar vacío.");
            return false;
        } else {
            if (email.startsWith("-") || email.endsWith("-") || email.startsWith(".") || email.endsWith(".") || email.contains("..")) {
                System.out.println("El correo electrónico no puede comenzar o terminar con '-' o '.' ni contener '..'");
                return false;
            } else {
                if (!email.contains("@") || email.indexOf("@") != email.lastIndexOf("@")) {
                    System.out.println("El correo electrónico debe contener un solo '@'.");
                    return false;
                } else {
                    String[] emailSeparado = email.split("@");
                    if (emailSeparado.length < 2) {
                        System.out.println("El correo electrónico debe tener caracteres antes y después de '@'.");
                        return false;
                    } else {
                        String[] dominioEmail = emailSeparado[1].split("\\.");
                        if (dominioEmail.length < 2) {
                            System.out.println("El dominio del correo electrónico debe contener '.'.");
                            return false;
                        } else {
                            if (dominioEmail[0].length() > 63 || dominioEmail[1].length() > 63) {
                                System.out.println("Ninguna parte del dominio del correo electrónico puede exceder los 63 caracteres.");
                                return false;
                            } else {
                                if (!email.matches("^[a-zA-Z0-9.ñÑ_-]+@[a-zA-Z0-9.ñÑ-]+$")) {
                                    System.out.println("El correo electrónico solo puede contener caracteres alfanuméricos y . _ -");
                                    return false;
                                } else {
                                    if (emailSeparado[0].isEmpty() || emailSeparado[0].length() > 64) {
                                        System.out.println("La parte local del correo electrónico (antes de @) debe tener entre 1 y 64 caracteres.");
                                        return false;
                                    } else {
                                        if (emailSeparado[1].isEmpty() || emailSeparado[1].length() > 64) {
                                            System.out.println("La parte del dominio del correo electrónico (después de @) debe tener entre 1 y 64 caracteres.");
                                            return false;
                                        } else {
                                            System.out.println("El correo electrónico es válido.");
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
