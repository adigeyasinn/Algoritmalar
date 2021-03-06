/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.IDuzenleyici;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author feda1
 */
public class ÖdemelerEkrani extends javax.swing.JFrame implements IDuzenleyici{

    /**
     * Creates new form ÖdemelerEkrani
     */
    public ÖdemelerEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        odemelerEkraniPanel.setFocusable(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private void setBgFg(Component c){
        ButtonAyarlari.setBgFg((JButton)c, Color.black, Color.WHITE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odeButton1 = new javax.swing.JButton();
        elektrikBorcLabel1 = new javax.swing.JLabel();
        toplamElektrikBorcLabel1 = new javax.swing.JLabel();
        odemelerEkraniPanel = new javax.swing.JPanel();
        adSoyadLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        toplamElektrikBorcLabel = new javax.swing.JLabel();
        elektrikBorcLabel = new javax.swing.JLabel();
        suOdeButton = new javax.swing.JButton();
        toplamSuBorcLabel = new javax.swing.JLabel();
        suBorcLabel = new javax.swing.JLabel();
        elektrikOdeButton = new javax.swing.JButton();
        toplamGazBorcLabel = new javax.swing.JLabel();
        gazBorcLabel = new javax.swing.JLabel();
        gazOdeButton = new javax.swing.JButton();
        toplamNetBorcLabel = new javax.swing.JLabel();
        netBorcLabel = new javax.swing.JLabel();
        netOdeButton = new javax.swing.JButton();

        odeButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        odeButton1.setText("Öde");
        odeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                odeButton1ActionPerformed(evt);
            }
        });

        elektrikBorcLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elektrikBorcLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elektrikBorcLabel1.setText("[ELEKTRİK BORÇ]");

        toplamElektrikBorcLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamElektrikBorcLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamElektrikBorcLabel1.setText("Toplam elektrik faturası borcunuz:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        odemelerEkraniPanel.setBackground(new java.awt.Color(255, 204, 204));

        adSoyadLabel.setBackground(new java.awt.Color(255, 0, 51));
        adSoyadLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        adSoyadLabel.setForeground(new java.awt.Color(255, 0, 0));
        adSoyadLabel.setText("Sayın [KULLANICI ADI SOYADI]");

        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Iconlar/backIcon.png"))); // NOI18N
        backLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        toplamElektrikBorcLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamElektrikBorcLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamElektrikBorcLabel.setText("Toplam elektrik faturası borcunuz:");

        elektrikBorcLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elektrikBorcLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elektrikBorcLabel.setText("[ELEKTRİK BORÇ]");

        suOdeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        suOdeButton.setText("Öde");
        suOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                suOdeButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                suOdeButtonMouseEntered(evt);
            }
        });
        suOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suOdeButtonActionPerformed(evt);
            }
        });

        toplamSuBorcLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamSuBorcLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamSuBorcLabel.setText("Toplam su faturası borcunuz:");

        suBorcLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suBorcLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suBorcLabel.setText("[SU BORÇ]");

        elektrikOdeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        elektrikOdeButton.setText("Öde");
        elektrikOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                elektrikOdeButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                elektrikOdeButtonMouseEntered(evt);
            }
        });
        elektrikOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektrikOdeButtonActionPerformed(evt);
            }
        });

        toplamGazBorcLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamGazBorcLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamGazBorcLabel.setText("Toplam doğalgaz faturası borcunuz:");

        gazBorcLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gazBorcLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gazBorcLabel.setText("[GAZ BORÇ]");

        gazOdeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gazOdeButton.setText("Öde");
        gazOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                gazOdeButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gazOdeButtonMouseEntered(evt);
            }
        });
        gazOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gazOdeButtonActionPerformed(evt);
            }
        });

        toplamNetBorcLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        toplamNetBorcLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamNetBorcLabel.setText("Toplam internet faturası borcunuz:");

        netBorcLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        netBorcLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        netBorcLabel.setText("[NET BORÇ]");

        netOdeButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        netOdeButton.setText("Öde");
        netOdeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                netOdeButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                netOdeButtonMouseEntered(evt);
            }
        });
        netOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netOdeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout odemelerEkraniPanelLayout = new javax.swing.GroupLayout(odemelerEkraniPanel);
        odemelerEkraniPanel.setLayout(odemelerEkraniPanelLayout);
        odemelerEkraniPanelLayout.setHorizontalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(backLabel)
                        .addGap(43, 43, 43)
                        .addComponent(adSoyadLabel)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odemelerEkraniPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                    .addComponent(toplamNetBorcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(netBorcLabel))
                                .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                    .addComponent(toplamGazBorcLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(gazBorcLabel)))
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addComponent(toplamSuBorcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(suBorcLabel))
                            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                                .addComponent(toplamElektrikBorcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(elektrikBorcLabel)))
                        .addGap(45, 45, 45)))
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gazOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(netOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elektrikOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        odemelerEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {elektrikOdeButton, gazOdeButton, netOdeButton, suOdeButton});

        odemelerEkraniPanelLayout.setVerticalGroup(
            odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(odemelerEkraniPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(adSoyadLabel)))
                .addGap(48, 48, 48)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamElektrikBorcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elektrikBorcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(elektrikOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamSuBorcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suBorcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamGazBorcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gazBorcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gazOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(odemelerEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netBorcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(netOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toplamNetBorcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        odemelerEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {elektrikOdeButton, gazOdeButton, netOdeButton, suOdeButton});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemelerEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_backLabelMouseClicked

    private void suOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suOdeButtonActionPerformed
        JOptionPane.showMessageDialog(this,"Su ödemesi başarılı.");
        ActionAyarlari.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_suOdeButtonActionPerformed

    private void odeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_odeButton1ActionPerformed
        JOptionPane.showMessageDialog(this,"Elektrik ödemesi başarılı.");
        ActionAyarlari.setVisible(this, new HesapEkrani()); 
    }//GEN-LAST:event_odeButton1ActionPerformed

    private void elektrikOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektrikOdeButtonActionPerformed
        JOptionPane.showMessageDialog(this,"Elektrik ödemesi başarılı.");
        ActionAyarlari.setVisible(this, new HesapEkrani()); 
    }//GEN-LAST:event_elektrikOdeButtonActionPerformed

    private void gazOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gazOdeButtonActionPerformed
        JOptionPane.showMessageDialog(this,"Doğalgaz ödemesi başarılı.");
        ActionAyarlari.setVisible(this, new HesapEkrani()); 
    }//GEN-LAST:event_gazOdeButtonActionPerformed

    private void netOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netOdeButtonActionPerformed
        JOptionPane.showMessageDialog(this,"İnternet ödemesi başarılı.");
        ActionAyarlari.setVisible(this, new HesapEkrani()); 
    }//GEN-LAST:event_netOdeButtonActionPerformed

    private void elektrikOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_elektrikOdeButtonMouseEntered

    private void elektrikOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_elektrikOdeButtonMouseExited
        ButtonAyarlari.setOriginalBg((JButton)evt.getComponent());
    }//GEN-LAST:event_elektrikOdeButtonMouseExited

    private void suOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_suOdeButtonMouseEntered

    private void suOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suOdeButtonMouseExited
        ButtonAyarlari.setOriginalBg((JButton)evt.getComponent());
    }//GEN-LAST:event_suOdeButtonMouseExited

    private void gazOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gazOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_gazOdeButtonMouseEntered

    private void gazOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gazOdeButtonMouseExited
        ButtonAyarlari.setOriginalBg((JButton)evt.getComponent());
    }//GEN-LAST:event_gazOdeButtonMouseExited

    private void netOdeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_netOdeButtonMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_netOdeButtonMouseEntered

    private void netOdeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_netOdeButtonMouseExited
        ButtonAyarlari.setOriginalBg((JButton)evt.getComponent());
    }//GEN-LAST:event_netOdeButtonMouseExited

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
            java.util.logging.Logger.getLogger(ÖdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ÖdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ÖdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ÖdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ÖdemelerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel elektrikBorcLabel;
    private javax.swing.JLabel elektrikBorcLabel1;
    private javax.swing.JButton elektrikOdeButton;
    private javax.swing.JLabel gazBorcLabel;
    private javax.swing.JButton gazOdeButton;
    private javax.swing.JLabel netBorcLabel;
    private javax.swing.JButton netOdeButton;
    private javax.swing.JButton odeButton1;
    private javax.swing.JPanel odemelerEkraniPanel;
    private javax.swing.JLabel suBorcLabel;
    private javax.swing.JButton suOdeButton;
    private javax.swing.JLabel toplamElektrikBorcLabel;
    private javax.swing.JLabel toplamElektrikBorcLabel1;
    private javax.swing.JLabel toplamGazBorcLabel;
    private javax.swing.JLabel toplamNetBorcLabel;
    private javax.swing.JLabel toplamSuBorcLabel;
    // End of variables declaration//GEN-END:variables
}
