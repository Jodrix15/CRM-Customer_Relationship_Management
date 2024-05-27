/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.crm.gui;


import com.mycompany.crm.exceptions.ComandaException;
import com.mycompany.crm.validator.Validations;

/**
 *
 * @author admin
 */
public class ListaEmpleados extends javax.swing.JPanel {

    /**
     * Creates new form ListaEmpleados
     */
    public ListaEmpleados() {
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

        jLabel1 = new javax.swing.JLabel();
        okBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        info = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(204, 204, 255));
        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(630, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        jLabel1.setText("Lista de Empleados");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        okBtn.setText("Buscar");
        okBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okBtnActionPerformed(evt);
            }
        });
        add(okBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 110, 70));

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        info.setBackground(new java.awt.Color(204, 204, 255));
        info.setColumns(20);
        info.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        info.setRows(5);
        jScrollPane2.setViewportView(info);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 90, 390, 350));
    }// </editor-fold>//GEN-END:initComponents

    private void okBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okBtnActionPerformed
//        try {
//            String infoCliente = Validations.getInstance().valEmpleadosList();;
//            info.setText(infoCliente);
//        } catch (ComandaException ex) {
//            javax.swing.JOptionPane.showMessageDialog(this, ex,"ERROR",javax.swing.JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_okBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton okBtn;
    // End of variables declaration//GEN-END:variables
}