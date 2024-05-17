/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.crm.gui;


import com.mycompany.crm.exceptions.ComandaException;
import com.mycompany.crm.validator.Validations;

import java.awt.Color;
import java.awt.Window;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
//import lectorExcel.ExcelLoader;

/**
 *
 * @author admin
 */
public class LoginFrame extends javax.swing.JFrame {

    int xMouse, yMouse;
    public LoginFrame() {
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

        bg = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        logname = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();
        icono = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        userLabel1 = new javax.swing.JLabel();
        passText = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitText = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        btnPrueba = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/image.png"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 330, 150));

        logname.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        logname.setForeground(new java.awt.Color(60, 119, 199));
        logname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logname.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/letrasCRM5.png"))); // NOI18N
        bg.add(logname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 330, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo2.jpg"))); // NOI18N
        fondo.setText("jLabel1");
        bg.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 0, 330, 500));

        icono.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/miniLogo-removebg2.png"))); // NOI18N
        icono.setText("Customer Relationship Management");
        bg.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 430, 80));

        titulo.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        titulo.setText("INICIAR SESION");
        bg.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        userLabel.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        userLabel.setText("USUARIO");
        bg.add(userLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        userText.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        userText.setForeground(new java.awt.Color(204, 204, 204));
        userText.setText("Ingresa tu nombre de usuario");
        userText.setBorder(null);
        userText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userTextMousePressed(evt);
            }
        });
        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });
        bg.add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 400, 30));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 283, 400, 10));
        bg.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 400, 10));

        userLabel1.setFont(new java.awt.Font("Roboto Light", 1, 12)); // NOI18N
        userLabel1.setText("CONTRASEÑA");
        bg.add(userLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        passText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        passText.setForeground(new java.awt.Color(204, 204, 204));
        passText.setText("************");
        passText.setBorder(null);
        passText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTextMousePressed(evt);
            }
        });
        passText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTextActionPerformed(evt);
            }
        });
        bg.add(passText, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 400, -1));

        loginBtn.setBackground(new java.awt.Color(100, 116, 129));
        loginBtn.setForeground(new java.awt.Color(74, 102, 141));
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        loginBtnTxt.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("ENTRAR");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 120, 40));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitText.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        exitText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitText.setText("X");
        exitText.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitText, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 40));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        btnPrueba.setText("Click Me");
        btnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaActionPerformed(evt);
            }
        });
        bg.add(btnPrueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTextActionPerformed

    private void loginBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseEntered
        loginBtn.setBackground(new Color (53,66,83));
    }//GEN-LAST:event_loginBtnTxtMouseEntered

    private void loginBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseExited
        loginBtn.setBackground(new Color (100,116,129));

    }//GEN-LAST:event_loginBtnTxtMouseExited

    private void userTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userTextMousePressed
        if (userText.getText().equals("Ingresa tu nombre de usuario")) {
            userText.setText("");
            userText.setForeground(Color.black);
        }
        if (String.valueOf(passText.getPassword()).isEmpty()) {
            passText.setText("************");
            passText.setForeground(Color.gray);
        }
        
        
    }//GEN-LAST:event_userTextMousePressed

    private void passTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTextMousePressed
        if (String.valueOf(passText.getPassword()).equals("************")) {
            passText.setText("");
            passText.setForeground(Color.black);
        }
        if (userText.getText().isEmpty()) {
            userText.setText("Ingresa tu nombre de usuario");
            userText.setForeground(Color.gray);
        }

        
    }//GEN-LAST:event_passTextMousePressed

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
//        if (!userText.getText().equals("admin") || !String.valueOf(passText.getPassword()).equals("1234")) {
//            javax.swing.JOptionPane.showMessageDialog(this, "Error: intento de login con los datos:\nUsuario: "+ userText.getText()+"\nContraseña: "+String.valueOf(passText.getPassword()),"LOGIN",javax.swing.JOptionPane.ERROR_MESSAGE);
//        }else{
//            javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: "+ userText.getText()+"\nContraseña: "+String.valueOf(passText.getPassword()),"LOGIN",javax.swing.JOptionPane.INFORMATION_MESSAGE);
//
//            MenuPrincipal m = new MenuPrincipal();
//            m.setSize(810, 461);
//            m.setLocationRelativeTo(null);
//            m.setVisible(true);
//            this.dispose();
//
//        }
//        
        try {
           
            Validations.getInstance().valLogin(userText.getText(),String.valueOf(passText.getPassword()));  
            
            javax.swing.JOptionPane.showMessageDialog(this, "Intento de login con los datos:\nUsuario: "+ userText.getText()+"\nContraseña: "+String.valueOf(passText.getPassword()),"LOGIN",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            MenuPrincipal m = new MenuPrincipal();
            m.setSize(810, 461);
            m.setLocationRelativeTo(null);
            m.setVisible(true);
            this.dispose();
                
          
              
            
        } catch (ComandaException | SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex ,"ERROR",javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    private void passTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTextActionPerformed

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse,y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTextMouseClicked

    private void exitTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseEntered
        exitBtn.setBackground(Color.red);
        exitText.setForeground(Color.white);
    }//GEN-LAST:event_exitTextMouseEntered

    private void exitTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTextMouseExited
        exitBtn.setBackground(Color.white);
        exitText.setForeground(Color.black);
    }//GEN-LAST:event_exitTextMouseExited

    private void btnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaActionPerformed
                MenuPrincipal m = new MenuPrincipal();
                m.setSize(810, 461);
                m.setLocationRelativeTo(null);
                m.setVisible(true);
                this.dispose();
        
    }//GEN-LAST:event_btnPruebaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
//        ExcelLoader l = new ExcelLoader();
//        l.loadTabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnPrueba;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitText;
    private javax.swing.JLabel fondo;
    private javax.swing.JPanel header;
    private javax.swing.JLabel icono;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JLabel logname;
    private javax.swing.JLabel logo;
    private javax.swing.JPasswordField passText;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel userLabel1;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
