/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author linah
 */
public class Authentification1 extends javax.swing.JFrame {

    /**
     * Creates new form Authentification1
     */
    public Authentification1() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        logintext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mdptext = new javax.swing.JPasswordField();
        Buttonvalider = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Authentification");
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(20, 20, 100, 100));
        setMinimumSize(new java.awt.Dimension(800, 550));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Notre Cabinet Medical ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addContainerGap(194, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 790, 47);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Bienvenue!");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 50, 128, 32);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Login");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 360, 60, 24);

        logintext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logintextActionPerformed(evt);
            }
        });
        getContentPane().add(logintext);
        logintext.setBounds(580, 350, 160, 24);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("mot de passe");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 400, 140, 24);
        getContentPane().add(mdptext);
        mdptext.setBounds(580, 400, 160, 22);

        Buttonvalider.setText("Valider");
        Buttonvalider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonvaliderActionPerformed(evt);
            }
        });
        getContentPane().add(Buttonvalider);
        Buttonvalider.setBounds(560, 470, 120, 32);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interface/pexels-karolina-grabowska-4021769.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 80, 790, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logintextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logintextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logintextActionPerformed

        
    private void ButtonvaliderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonvaliderActionPerformed
        // TODO add your handling code here:
        String nomsaisie= logintext.getText();
        System.out.println(nomsaisie);
        char[]password= mdptext.getPassword();
             
        
        String pass = new String(password);
        

        if (nomsaisie.equals("admin")&& pass.equals("admin"))
        {
            Dossiers hello=new Dossiers();
            hello.setVisible(true);
            this.setVisible(false);
        }
        else
        
               JOptionPane.showMessageDialog(rootPane," le mot de passe est incorrect  ");
      
        
         
    }//GEN-LAST:event_ButtonvaliderActionPerformed

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
            java.util.logging.Logger.getLogger(Authentification1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Authentification1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Authentification1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Authentification1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Authentification1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buttonvalider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField logintext;
    private javax.swing.JPasswordField mdptext;
    // End of variables declaration//GEN-END:variables
}