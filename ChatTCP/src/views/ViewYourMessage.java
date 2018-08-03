/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Hieutt
 */
public class ViewYourMessage extends javax.swing.JFrame {

    public void clock() {
        Thread clock;
        clock = new Thread() {
            @Override
            public void run() {
                try {
                    while (true) {
                        Calendar cal = new GregorianCalendar();
                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR_OF_DAY);
                        lblClock.setText(hour + ":" + minute + ":" + second);
                        sleep(1000);
                    }
                } catch (InterruptedException e) {
                }
            }
        };
        clock.start();
    }

    /**
     * Creates new form ViewYourMessage
     */
    public ViewYourMessage() {
        clock();
        initComponents();
        this.setTitle("ChatRoom");
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(576,520);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTittle = new javax.swing.JLabel();
        btnDelete4 = new javax.swing.JCheckBox();
        btnDelete7 = new javax.swing.JCheckBox();
        lblClock = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblLogout = new javax.swing.JButton();
        lblTittle1 = new javax.swing.JLabel();
        jScrollPane = new javax.swing.JScrollPane();
        tblViewYourMessage = new javax.swing.JTable();
        btnSelectAll = new javax.swing.JCheckBox();
        jButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        btnExit = new javax.swing.JMenuItem();
        mnView = new javax.swing.JMenu();
        btnYourMessage = new javax.swing.JMenuItem();
        btnAllMessage = new javax.swing.JMenuItem();

        lblTittle.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblTittle.setText("CHAT BOX");

        btnDelete4.setText("Delete");

        btnDelete7.setText("Delete");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblClock.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblClock.setForeground(new java.awt.Color(255, 0, 0));

        lblUserName.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 0, 0));
        lblUserName.setText("Client 1");

        lblLogout.setText("Logout");
        lblLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblLogoutActionPerformed(evt);
            }
        });

        lblTittle1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblTittle1.setText("VIEW YOUR MESSAGE");

        tblViewYourMessage.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "How are you? ", "02/08/2018", null},
                {"2", "What is this", "03/08/2018", null},
                {"3", "Hi", "01/01/2018", null},
                {"4", "Hello", "03/03/2017", null}
            },
            new String [] {
                "ID", "Message", "Date", "Checkbox"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane.setViewportView(tblViewYourMessage);

        btnSelectAll.setText("Select All");
        btnSelectAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectAllActionPerformed(evt);
            }
        });

        jButton.setText("Delete");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });

        mnFile.setText("File");

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        mnFile.add(btnExit);

        jMenuBar1.add(mnFile);

        mnView.setText("View");

        btnYourMessage.setText("Your Message");
        btnYourMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYourMessageActionPerformed(evt);
            }
        });
        mnView.add(btnYourMessage);

        btnAllMessage.setText("All Message");
        btnAllMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllMessageActionPerformed(evt);
            }
        });
        mnView.add(btnAllMessage);

        jMenuBar1.add(mnView);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnSelectAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblLogout))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lblTittle1))))
                    .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblClock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLogout)
                        .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(19, 19, 19)
                .addComponent(lblTittle1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelectAll))
                .addGap(21, 21, 21))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Are you sure to exit this application") == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnYourMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYourMessageActionPerformed
        this.setVisible(false);
        ViewYourMessage viewYourMessage = new ViewYourMessage();
        viewYourMessage.setVisible(true);
    }//GEN-LAST:event_btnYourMessageActionPerformed

    private void btnAllMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllMessageActionPerformed
        this.setVisible(false);
        ViewAllMessage viewAllMessage = new ViewAllMessage();
        viewAllMessage.setVisible(true);
    }//GEN-LAST:event_btnAllMessageActionPerformed

    private void lblLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblLogoutActionPerformed
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);

    }//GEN-LAST:event_lblLogoutActionPerformed

    private void btnSelectAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelectAllActionPerformed

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonActionPerformed

   

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
            java.util.logging.Logger.getLogger(ViewYourMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewYourMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewYourMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewYourMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewYourMessage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAllMessage;
    private javax.swing.JCheckBox btnDelete4;
    private javax.swing.JCheckBox btnDelete7;
    private javax.swing.JMenuItem btnExit;
    private javax.swing.JCheckBox btnSelectAll;
    private javax.swing.JMenuItem btnYourMessage;
    private javax.swing.JButton jButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblClock;
    private javax.swing.JButton lblLogout;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JLabel lblTittle1;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenu mnView;
    private javax.swing.JTable tblViewYourMessage;
    // End of variables declaration//GEN-END:variables
}
