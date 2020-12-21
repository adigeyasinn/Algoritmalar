
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author feda1
 */
public class home extends javax.swing.JFrame {

    public int i=0;
    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addDiagnosisButton = new javax.swing.JButton();
        patientHistoryButton = new javax.swing.JButton();
        patientUptadeButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        addNewPatientButton = new javax.swing.JButton();
        hospitalInformationButton = new javax.swing.JButton();
        arrowButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addDiagnosisButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add diag.png"))); // NOI18N
        addDiagnosisButton.setText("Add Diagnosis Information");
        addDiagnosisButton.setPreferredSize(new java.awt.Dimension(240, 59));
        getContentPane().add(addDiagnosisButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 266, -1, 71));

        patientHistoryButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_history1.png"))); // NOI18N
        patientHistoryButton.setText("Full History of the Patient");
        patientHistoryButton.setPreferredSize(new java.awt.Dimension(240, 59));
        getContentPane().add(patientHistoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 369, -1, 71));

        patientUptadeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_update_details.png"))); // NOI18N
        patientUptadeButton.setText("Uptade Patient Record");
        patientUptadeButton.setPreferredSize(new java.awt.Dimension(240, 59));
        getContentPane().add(patientUptadeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 469, -1, 71));

        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exit.png"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setPreferredSize(new java.awt.Dimension(240, 59));
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 663, 149, 71));

        addNewPatientButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add new patient.png"))); // NOI18N
        addNewPatientButton.setText("Add New Patient Record");
        addNewPatientButton.setPreferredSize(new java.awt.Dimension(240, 59));
        addNewPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewPatientButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addNewPatientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 160, 237, 71));

        hospitalInformationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rsz_hospital_information.png"))); // NOI18N
        hospitalInformationButton.setText("Hospital Information");
        hospitalInformationButton.setPreferredSize(new java.awt.Dimension(240, 59));
        getContentPane().add(hospitalInformationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 574, -1, 71));

        arrowButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/two arrow.png"))); // NOI18N
        arrowButton.setPreferredSize(new java.awt.Dimension(240, 59));
        arrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrowButtonActionPerformed(evt);
            }
        });
        getContentPane().add(arrowButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 30, 96, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -100, -1, 970));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to logout","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_logoutButtonActionPerformed

    private void arrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrowButtonActionPerformed
        /*if(i==0){
            addNewPatientButton.setLocation(90,30);
            addDiagnosisButton.setLocation(333,30);
            patientHistoryButton.setLocation(570,30);
            patientUptadeButton.setLocation(810,30);
            hospitalInformationButton.setLocation(1060,30);
            logoutButton.setLocation(1060,30);
            i=1;
        }
        else{
             addNewPatientButton.setLocation(10,100);
            addDiagnosisButton.setLocation(10,180);
            patientHistoryButton.setLocation(10,260);
            patientUptadeButton.setLocation(10,330);
            hospitalInformationButton.setLocation(10,400);
            logoutButton.setLocation(10,300);
            i=0;
        }*/
    }//GEN-LAST:event_arrowButtonActionPerformed

    private void addNewPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewPatientButtonActionPerformed
        new addNewPatientRecord().setVisible(true);
    }//GEN-LAST:event_addNewPatientButtonActionPerformed

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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDiagnosisButton;
    private javax.swing.JButton addNewPatientButton;
    private javax.swing.JButton arrowButton;
    private javax.swing.JButton hospitalInformationButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton patientHistoryButton;
    private javax.swing.JButton patientUptadeButton;
    // End of variables declaration//GEN-END:variables
}
