/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package courses;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
import java.sql.*;
import javax.swing.JFrame;

public class Courses1 extends javax.swing.JDialog {
     private Connection con;
    private int IDcourses;

    /**
     * Creates new form Courses1
     */
    public Courses1(java.awt.Frame parent, boolean modal,Connection con, int IDcourses) {
        super(parent, modal);
        initComponents();
        this.setTitle("courses");
        this.setLocationRelativeTo(this);
        this.con = con;
        this.IDcourses = IDcourses;
        populate();
    }
private void populate() {
        try {
            Statement stmt = con.createStatement();
            ResultSet rs
                    = stmt.executeQuery("Select * "
                            + "From tbl_courses Where ID_courses =" + IDcourses);
            if (rs.next()) {
                txtcode.setText(rs.getString("code"));
                txtname.setText(rs.getString("Name"));
                txtdescription.setText(rs.getString("decription"));
                cbxtype.setSelectedItem(rs.getString("type"));
                cbxcredit.setSelectedItem(rs.getString("numberofcredit"));
                if(rs.getString("Lab").equals("Yes")){
                    chklab.setSelected(true);
                }else{
                    chklab.setSelected(false);
                }
      }          
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
}


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtcode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chklab = new javax.swing.JCheckBox();
        btnsave = new javax.swing.JButton();
        cbxtype = new javax.swing.JComboBox();
        cbxcredit = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtdescription = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel5.setText("NB of credit");

        jLabel4.setText("type");

        jLabel3.setText("description");

        jLabel2.setText("courses NAME");

        chklab.setText("Lab");

        btnsave.setText("SAVE");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        cbxtype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "major", "elective" }));

        cbxcredit.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3" }));

        jLabel1.setText("code courses");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtcode, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(cbxcredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(btnsave))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(cbxtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(chklab))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chklab))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbxcredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnsave)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void txtCodeKeyTyped(java.awt.event.KeyEvent evt) {                                 
        // TODO add your handling code here:
           if ((!Character.isDigit(evt.getKeyChar())|| txtcode.getText().length() > 6)
             &&(Character.isDigit(evt.getKeyChar())|| txtcode.getText().length() > 6)) {
            evt.consume();
        }
    }
    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {                                 
        // TODO add your handling code here:
         if ((!Character.isDigit(evt.getKeyChar())|| txtname.getText().length() > 30)
            && (Character.isDigit(evt.getKeyChar())|| txtname.getText().length() > 30)  ) {
            evt.consume();
        }
    }
    private void txtDescriptionKeyTyped(java.awt.event.KeyEvent evt) {                                        
        // TODO add your handling code here:
        if ((!Character.isDigit(evt.getKeyChar())|| txtdescription.getText().length() > 250)
          &&(Character.isDigit(evt.getKeyChar())|| txtdescription.getText().length() > 250)   ) {
            evt.consume();
        }
    }             
    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (txtcode.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                "Enter a code", "Warning",
                JOptionPane.WARNING_MESSAGE);
        } else if (txtname.getText().equals("")) {
            JOptionPane.showMessageDialog(this,
                "Enter a Name", "Warning",
                JOptionPane.WARNING_MESSAGE);
        }
       
                else {
            String code = txtcode.getText();
            String Name = txtname.getText();
            String decription = txtdescription.getText();
            String type= cbxtype.getSelectedItem().toString();
            int numberofcredit= Integer.parseInt(cbxcredit.getSelectedItem().toString());
            String Lab;
            if (!chklab.isSelected()) {
                Lab = "No";
            } else {
                Lab = "Yes";
            }

            try {
                PreparedStatement pstmt;
                if(IDcourses==0){
                      pstmt = con.prepareStatement("Insert Into "
                                + "tbl_courses (code,"
                                + "Name, decription, "
                                + "type, numberofcredit, "
                                + "Lab) "
                                + "Values ( '" + code + "', "
                                + "'" + Name + "', '" + decription+ "', '"
                                + type + "', " + numberofcredit + ", '"
                                + Lab + "')");
                }else{
                     pstmt = con.prepareStatement("Update tbl_courses "
                            + "Set code = '" + code + "', "
                            + "Name = '" + Name + "', "
                            + "decription = '" + decription + "', "
                            + "type = '" + type + "', "
                            + "numberofcredit= " + numberofcredit + ", "
                            + "Lab = '" + Lab + "'" 
                            + "Where ID_courses = " + IDcourses);
                }
               pstmt.execute();
                this.dispose();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        /**   course jframe = new course();
        *jframe.setVisible(true);
        dispose(); **/

    }//GEN-LAST:event_btnsaveActionPerformed

    
   
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
            java.util.logging.Logger.getLogger(Courses1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Courses1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Courses1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Courses1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Courses1 dialog = new Courses1(new javax.swing.JFrame(), true,null,0);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox cbxcredit;
    private javax.swing.JComboBox cbxtype;
    private javax.swing.JCheckBox chklab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtdescription;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
