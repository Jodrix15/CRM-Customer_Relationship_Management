/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.crm.crm.gui;


import com.mycompany.crm.crm.exceptions.ComandaException;
import com.mycompany.crm.crm.validator.Validations;

/**
 *
 * @author admin
 */
public class AltaEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form AltaEmpleado
     */
    public AltaEmpleado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        nombreLabel = new javax.swing.JLabel();
        apellidosLabel = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        dni = new javax.swing.JTextField();
        numeroLabel = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        codigoLabel = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        contrasenyaLabel = new javax.swing.JLabel();
        contrasenya = new javax.swing.JTextField();
        comisionLabel = new javax.swing.JLabel();
        comision = new javax.swing.JTextField();
        fechaLabel = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 255));

        titulo.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        titulo.setText("Alta Empleado");

        nombre.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        nombreLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        nombreLabel.setText("Nombre");

        apellidosLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        apellidosLabel.setText("Apellidos");

        apellido.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        dni.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        numeroLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        numeroLabel.setText("DNI");

        okBtn.setText("REGISTRAR");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });

        codigoLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        codigoLabel.setText("Codigo");

        codigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoActionPerformed(evt);
            }
        });

        contrasenyaLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        contrasenyaLabel.setText("Contrasenya");

        contrasenya.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        contrasenya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contrasenyaActionPerformed(evt);
            }
        });

        comisionLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        comisionLabel.setText("Comisión");

        comision.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        comision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comisionActionPerformed(evt);
            }
        });

        fechaLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        fechaLabel.setText("Fecha");

        fecha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(numeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dni))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(apellidosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreLabel)
                            .addComponent(codigoLabel)
                            .addComponent(contrasenyaLabel)
                            .addComponent(comisionLabel)
                            .addComponent(fechaLabel))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comision, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(okBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(okBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contrasenyaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contrasenya, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comisionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(294, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
        try {
            Validations.getInstance().valAltaEmpleado(dni.getText(), codigo.getText(), nombre.getText(), apellido.getText(), comision.getText(), fecha.getText(), contrasenya.getText());
            javax.swing.JOptionPane.showMessageDialog(this, "Empleado registrado correctamente","Alta Empleado",javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } catch (ComandaException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex,"ERROR",javax.swing.JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_okBtnActionPerformed

    private void codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoActionPerformed

    private void contrasenyaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contrasenyaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contrasenyaActionPerformed

    private void comisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comisionActionPerformed

    private void fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel apellidosLabel;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JTextField comision;
    private javax.swing.JLabel comisionLabel;
    private javax.swing.JTextField contrasenya;
    private javax.swing.JLabel contrasenyaLabel;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField fecha;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JTextField nombre;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JLabel numeroLabel;
    private javax.swing.JButton okBtn;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}