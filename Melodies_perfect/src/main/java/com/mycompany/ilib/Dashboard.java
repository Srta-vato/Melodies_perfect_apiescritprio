/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ilib;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import com.mycompany.views.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Insets;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.swing.JPanel;
import javax.swing.UIManager;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Antonio
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        InitStyles();
        SetDate();
        InitContent();
    }
    
    private void InitStyles() {
        mensaje.putClientProperty("FlatLaf.style", "font: 14 $light.font");
        mensaje.setForeground(Color.black);
        navText.putClientProperty("FlatLaf.style", "font: bold $h3.regular.font");
        navText.setForeground(Color.white);
        dateText.putClientProperty("FlatLaf.style", "font: 24 $light.font");
        dateText.setForeground(Color.white);
        appName.putClientProperty("FlatLaf.style", "font: bold $h1.regular.font");
        appName.setForeground(Color.white);
    }
    
    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
    private void InitContent() {
        ShowJPanel(new Principal());
    }
    
    public static void ShowJPanel(JPanel p) {
        p.setSize(750, 430);
        p.setLocation(0,0);
        
        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_prin = new javax.swing.JButton();
        viento = new javax.swing.JButton();
        btn_returns = new javax.swing.JButton();
        btn_users = new javax.swing.JButton();
        btn_books = new javax.swing.JButton();
        btn_reports1 = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        navText = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        mensaje = new javax.swing.JLabel();
        btn_users1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1050, 660));

        background.setBackground(new java.awt.Color(255, 255, 255));

        menu.setBackground(new java.awt.Color(13, 71, 161));
        menu.setPreferredSize(new java.awt.Dimension(270, 640));

        appName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName.setText("Melodies Perfect");

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        btn_prin.setBackground(new java.awt.Color(21, 101, 192));
        btn_prin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_prin.setForeground(new java.awt.Color(255, 255, 255));
        btn_prin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home-outline.png"))); // NOI18N
        btn_prin.setText("Principal");
        btn_prin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_prin.setBorderPainted(false);
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_prin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_prin.setIconTextGap(13);
        btn_prin.setInheritsPopupMenu(true);
        btn_prin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_prinActionPerformed(evt);
            }
        });

        viento.setBackground(new java.awt.Color(21, 101, 192));
        viento.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viento.setForeground(new java.awt.Color(255, 255, 255));
        viento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/flauta.png"))); // NOI18N
        viento.setText("Viento");
        viento.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        viento.setBorderPainted(false);
        viento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        viento.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        viento.setIconTextGap(13);
        viento.setInheritsPopupMenu(true);
        viento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vientoActionPerformed(evt);
            }
        });

        btn_returns.setBackground(new java.awt.Color(21, 101, 192));
        btn_returns.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_returns.setForeground(new java.awt.Color(255, 255, 255));
        btn_returns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tambor.png"))); // NOI18N
        btn_returns.setText("Percusion");
        btn_returns.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_returns.setBorderPainted(false);
        btn_returns.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_returns.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_returns.setIconTextGap(13);
        btn_returns.setInheritsPopupMenu(true);
        btn_returns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnsActionPerformed(evt);
            }
        });

        btn_users.setBackground(new java.awt.Color(21, 101, 192));
        btn_users.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_users.setForeground(new java.awt.Color(255, 255, 255));
        btn_users.setIcon(new javax.swing.ImageIcon(getClass().getResource("/account-multiple.png"))); // NOI18N
        btn_users.setText("Contacto");
        btn_users.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_users.setBorderPainted(false);
        btn_users.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_users.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_users.setIconTextGap(13);
        btn_users.setInheritsPopupMenu(true);
        btn_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usersActionPerformed(evt);
            }
        });

        btn_books.setBackground(new java.awt.Color(21, 101, 192));
        btn_books.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_books.setForeground(new java.awt.Color(255, 255, 255));
        btn_books.setIcon(new javax.swing.ImageIcon(getClass().getResource("/instrumento-de-guitarra (1).png"))); // NOI18N
        btn_books.setText("Cuerda");
        btn_books.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_books.setBorderPainted(false);
        btn_books.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_books.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_books.setIconTextGap(13);
        btn_books.setInheritsPopupMenu(true);
        btn_books.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_booksActionPerformed(evt);
            }
        });

        btn_reports1.setBackground(new java.awt.Color(21, 101, 192));
        btn_reports1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_reports1.setForeground(new java.awt.Color(255, 255, 255));
        btn_reports1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guitarra-electrica.png"))); // NOI18N
        btn_reports1.setText("Eletricos");
        btn_reports1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_reports1.setBorderPainted(false);
        btn_reports1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_reports1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_reports1.setIconTextGap(13);
        btn_reports1.setInheritsPopupMenu(true);
        btn_reports1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reports1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(viento, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_users, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_books, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_returns, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_prin, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reports1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(viento, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btn_users, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btn_books, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btn_returns, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_prin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btn_reports1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );

        header.setBackground(new java.awt.Color(25, 118, 210));
        header.setPreferredSize(new java.awt.Dimension(744, 150));

        navText.setText("Melodies Perfect App de escritorio");

        dateText.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(navText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateText, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
                .addContainerGap(260, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(navText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        content.setBackground(new java.awt.Color(255, 255, 255));
        content.setLayout(new java.awt.BorderLayout());

        mensaje.setText("Bienvenido ♥");

        btn_users1.setBackground(new java.awt.Color(21, 101, 192));
        btn_users1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_users1.setForeground(new java.awt.Color(255, 255, 255));
        btn_users1.setText("Registrar si no cuentas con usuario");
        btn_users1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_users1.setBorderPainted(false);
        btn_users1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_users1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_users1.setIconTextGap(13);
        btn_users1.setInheritsPopupMenu(true);
        btn_users1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_users1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_users1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
                    .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_users1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_prinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_prinActionPerformed
        ShowJPanel(new Principal());
    }//GEN-LAST:event_btn_prinActionPerformed

    private void vientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vientoActionPerformed
 
    }//GEN-LAST:event_vientoActionPerformed

    private void btn_returnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnsActionPerformed

    }//GEN-LAST:event_btn_returnsActionPerformed

    private void btn_usersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usersActionPerformed
        ShowJPanel(new Contacto());
    }//GEN-LAST:event_btn_usersActionPerformed

    private void btn_booksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_booksActionPerformed
        ShowJPanel(new Cuerda());
    }//GEN-LAST:event_btn_booksActionPerformed

    private void btn_reports1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reports1ActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btn_reports1ActionPerformed

    private void btn_users1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_users1ActionPerformed
        // TODO add your handling code here:
        ShowJPanel(new UpUsers());
    }//GEN-LAST:event_btn_users1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_books;
    private javax.swing.JButton btn_prin;
    private javax.swing.JButton btn_reports1;
    private javax.swing.JButton btn_returns;
    private javax.swing.JButton btn_users;
    private javax.swing.JButton btn_users1;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JPanel menu;
    private javax.swing.JLabel navText;
    private javax.swing.JButton viento;
    // End of variables declaration//GEN-END:variables
}
