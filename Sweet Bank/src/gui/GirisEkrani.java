/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.DbConnection;
import gui.ayarlar.ActionAyarlari;
import gui.ayarlar.ButtonAyarlari;
import gui.ayarlar.IDuzenleyici;
import gui.ayarlar.TextAyarlari;
import java.awt.Color;

/** 
 *
 * @author feda1
 */
public final class GirisEkrani extends javax.swing.JFrame implements IDuzenleyici{

    /**
     * Creates new form GirisEkrani
     * 
     * 
     */
    
    private final String KIMLIK_TEXT_ORIGINAL="T.C No/Müşteri No";
    private final String SIFRE_TEXT_ORIGINAL="*************";
    
    public GirisEkrani() {
        
        initComponents();
        getEdits();
        new DbConnection();
        
    } 
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisEkrani = new javax.swing.JPanel();
        hosgeldinizLabel = new javax.swing.JLabel();
        kimlikText = new javax.swing.JTextField();
        sifreText = new javax.swing.JPasswordField();
        basvurButton = new javax.swing.JButton();
        soruLabel = new javax.swing.JLabel();
        girisButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sweet Bank Giriş Ekranı");

        girisEkrani.setBackground(new java.awt.Color(0, 204, 153));

        hosgeldinizLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        hosgeldinizLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinizLabel.setText("SWEET BANKAYA HOŞGELDİNİZ");

        kimlikText.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });

        sifreText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                sifreTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                sifreTextFocusLost(evt);
            }
        });

        basvurButton.setText("Başvur");
        basvurButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurButtonMouseEntered(evt);
            }
        });
        basvurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurButtonActionPerformed(evt);
            }
        });

        soruLabel.setBackground(new java.awt.Color(0, 0, 0));
        soruLabel.setText("Halen müşterimiz değil misiniz ?");

        girisButton.setText("Giriş");
        girisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisButtonMouseEntered(evt);
            }
        });
        girisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Şifreni mi unuttun ?");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout girisEkraniLayout = new javax.swing.GroupLayout(girisEkrani);
        girisEkrani.setLayout(girisEkraniLayout);
        girisEkraniLayout.setHorizontalGroup(
            girisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniLayout.createSequentialGroup()
                .addGroup(girisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(girisEkraniLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(girisEkraniLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(girisEkraniLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(girisEkraniLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(soruLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(girisEkraniLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
            .addGroup(girisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(girisEkraniLayout.createSequentialGroup()
                    .addGap(212, 212, 212)
                    .addComponent(girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(249, Short.MAX_VALUE)))
        );
        girisEkraniLayout.setVerticalGroup(
            girisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisEkraniLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(hosgeldinizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(sifreText, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(girisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soruLabel)
                    .addComponent(basvurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
            .addGroup(girisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, girisEkraniLayout.createSequentialGroup()
                    .addContainerGap(355, Short.MAX_VALUE)
                    .addComponent(girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(123, 123, 123)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(girisEkrani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisEkrani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        //girisEkraniPanel.setFocusable(true);
        kimlikText.setText(KIMLIK_TEXT_ORIGINAL);
        sifreText.setText(SIFRE_TEXT_ORIGINAL);
        TextAyarlari.setOnlyNumber(kimlikText);

    }

    
    private void girisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButtonActionPerformed
        ActionAyarlari.setVisible(this,new HesapEkrani());
        
        
    }//GEN-LAST:event_girisButtonActionPerformed

    private void girisButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseEntered
        // TODO add your handling code here:
        ButtonAyarlari.setBgFg(girisButton, Color.cyan, Color.blue);
    }//GEN-LAST:event_girisButtonMouseEntered

    private void girisButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseExited
        // TODO add your handling code here:
           
           ButtonAyarlari.setOriginalBg(girisButton);
        
    }//GEN-LAST:event_girisButtonMouseExited

    private void basvurButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseEntered
        // TODO add your handling code here:
     
        ButtonAyarlari.setBgFg(basvurButton, Color.MAGENTA, Color.GREEN);
    }//GEN-LAST:event_basvurButtonMouseEntered

    private void basvurButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurButtonMouseExited
        // TODO add your handling code here:
        ButtonAyarlari.setOriginalBg(basvurButton);
    }//GEN-LAST:event_basvurButtonMouseExited

    private void kimlikTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusGained
        TextAyarlari.checkTheTextFocusGained(kimlikText, KIMLIK_TEXT_ORIGINAL);
    }//GEN-LAST:event_kimlikTextFocusGained

    private void kimlikTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusLost
        TextAyarlari.checkTheTextFocusLost(kimlikText);
    }//GEN-LAST:event_kimlikTextFocusLost

    private void sifreTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusGained
        TextAyarlari.checkTheTextFocusGained(sifreText, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_sifreTextFocusGained

    private void sifreTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sifreTextFocusLost
        TextAyarlari.checkTheTextFocusLost(sifreText);
    }//GEN-LAST:event_sifreTextFocusLost

    private void basvurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurButtonActionPerformed
        ActionAyarlari.setVisible(this, new BasvuruEkrani());
         
    }//GEN-LAST:event_basvurButtonActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        SifreYenilemeEkrani sifreYenilemeEkrani=new SifreYenilemeEkrani();
        ActionAyarlari.setVisible(this, sifreYenilemeEkrani);
        sifreYenilemeEkrani.getEskiSifreText().setEnabled(false);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basvurButton;
    private javax.swing.JButton girisButton;
    private javax.swing.JPanel girisEkrani;
    private javax.swing.JLabel hosgeldinizLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JPasswordField sifreText;
    private javax.swing.JLabel soruLabel;
    // End of variables declaration//GEN-END:variables
}
