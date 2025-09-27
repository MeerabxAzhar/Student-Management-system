
package studentmanagementsystem;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
public class Update extends javax.swing.JFrame {
   private static final String username="root";
    private static final String password="";
    private static final String dataConn ="jdbc:mysql://localhost:3306/studentdata";

    Connection sqlConn =null;
    PreparedStatement pst = null;
    ResultSet rs=null;

    
     int q,i,id;
    public Update() {
        initComponents();
         updateDB(); 
    }
public void updateDB(){
         {  
           
                 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                     sqlConn = DriverManager.getConnection(dataConn,username,password);
                     pst = sqlConn.prepareStatement("select * from studentdata5");
                     
                     rs =pst.executeQuery();
                     ResultSetMetaData StData = rs.getMetaData();
                     
                     q = StData.getColumnCount();
                     
                     DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
                     RecordTable.setRowCount(0);
                     
                     while(rs.next()){
                         
                         Vector columnData = new Vector();
                         
                         for (i = 1; i <= q; i++)
                         {columnData.add(rs.getString("id"));
                         columnData.add(rs.getString("studentid"));
                         columnData.add(rs.getString("FirstName"));
                         columnData.add(rs.getString("SecondName"));
                         columnData.add(rs.getString("Class"));
                         columnData.add(rs.getString("City"));
                         columnData.add(rs.getString("Gender"));
                         columnData.add(rs.getString("Address"));
                         columnData.add(rs.getString("PhoneNo"));
                         } RecordTable.addRow(columnData);
                         
                     }    
        }    catch (Exception ex) { 
                 JOptionPane.showMessageDialog(null, ex);
             } 
        
                     }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblid = new javax.swing.JLabel();
        txtstudentid = new javax.swing.JTextField();
        lblFN = new javax.swing.JLabel();
        txtFN = new javax.swing.JTextField();
        lblSN = new javax.swing.JLabel();
        txtSN = new javax.swing.JTextField();
        lblclass = new javax.swing.JLabel();
        comclass = new javax.swing.JComboBox<>();
        lblcity = new javax.swing.JLabel();
        comcity = new javax.swing.JComboBox<>();
        lblgndr = new javax.swing.JLabel();
        comgender = new javax.swing.JComboBox<>();
        lbladdress = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        lblphono = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnback = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(219, 159, 159));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "studentid", "FirstName", "SecondName", "Class", "City", "Gender", "Address", "PhoneNo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 610, 600));

        lblid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblid.setText("studentid");
        getContentPane().add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 109, -1, -1));

        txtstudentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentidActionPerformed(evt);
            }
        });
        getContentPane().add(txtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 106, 161, -1));

        lblFN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFN.setText("FirstName");
        getContentPane().add(lblFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 159, -1, -1));
        getContentPane().add(txtFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 156, 161, -1));

        lblSN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSN.setText("SecondName");
        getContentPane().add(lblSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 210, -1, -1));
        getContentPane().add(txtSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 210, 161, -1));

        lblclass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblclass.setText("Class");
        getContentPane().add(lblclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 254, -1, -1));

        comclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gujrat", "Sialkot", "Wazirabad", "Lahore" }));
        getContentPane().add(comclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 303, 161, -1));

        lblcity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcity.setText("City");
        getContentPane().add(lblcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 306, -1, -1));

        comcity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSSE", "BSCS", "BSIT", "BSEconomics", " " }));
        comcity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comcityActionPerformed(evt);
            }
        });
        getContentPane().add(comcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 254, 161, -1));

        lblgndr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblgndr.setText("Gender");
        getContentPane().add(lblgndr, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 351, -1, -1));

        comgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(comgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 348, 161, -1));

        lbladdress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbladdress.setText("Address");
        getContentPane().add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 404, -1, -1));
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 401, 161, -1));
        getContentPane().add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 447, 161, -1));

        lblphono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblphono.setText("PhoneNo");
        getContentPane().add(lblphono, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 450, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student Info");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, 140, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Update Info");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 150, 25));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setText("Back");
        btnback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 528, 60, -1));

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        getContentPane().add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 528, 50, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fast Com\\Downloads\\abstract-background-of-four-colored-triangles.jpg")); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -10, 1180, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtstudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudentidActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.toBack();
        Delete d=new Delete();
        d.setVisible(false);
        d.toFront();
        int c= JOptionPane.showConfirmDialog(null,"Are you sure,you want to Back");
        if( c==JOptionPane.OK_OPTION)
        {
            this.toBack();
            Delete d1=new Delete();
            d1.setVisible(false);
            d1.toFront();

        }
        else if(c==JOptionPane.NO_OPTION)
        {
            d.setVisible(true);
        }

    }//GEN-LAST:event_btnbackActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
        
        txtstudentid.setText(RecordTable.getValueAt(SelectedRows, 1).toString());
        txtFN.setText(RecordTable.getValueAt(SelectedRows, 2).toString());
        txtSN.setText(RecordTable.getValueAt(SelectedRows, 3).toString());
        comclass.setSelectedItem(RecordTable.getValueAt(SelectedRows, 4).toString());        
        comcity.setSelectedItem(RecordTable.getValueAt(SelectedRows, 5).toString());
        comgender.setSelectedItem(RecordTable.getValueAt(SelectedRows, 6).toString());
         txtaddress.setText(RecordTable.getValueAt(SelectedRows, 7).toString());
          txtphone.setText(RecordTable.getValueAt(SelectedRows, 8).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
       DefaultTableModel RecordTable = (DefaultTableModel)jTable1.getModel();
        int SelectedRows = jTable1.getSelectedRow();
     
         try    {  
             id=Integer.parseInt(RecordTable.getValueAt(SelectedRows, 0).toString());
               Class.forName("com.mysql.cj.jdbc.Driver");
           sqlConn = DriverManager.getConnection(dataConn,username,password);
             
                pst = sqlConn.prepareStatement("update studentdata5 set studentid =?,FirstName=?,SecondName=?,"
                + "Class=?,City=?,Gender=?,Address=?,PhoneNo=? where id=?");
            
           pst.setString(1, txtstudentid.getText());
            pst.setString(2, txtFN.getText());
            pst.setString(3, txtSN.getText());
            pst.setString(4, (String) comclass.getSelectedItem());
            pst.setString(5, (String) comcity.getSelectedItem());
            pst.setString(6, (String) comgender.getSelectedItem());
            pst.setString(7, txtaddress.getText());
            pst.setString(8, txtphone.getText());
            pst.setInt(9, id);
           pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Student Record updated");
          updateDB();
        } catch (SQLException ex) {
            System.err.println(ex);

        } catch (ClassNotFoundException ex) {
             java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void comcityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comcityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comcityActionPerformed

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnback;
    private javax.swing.JComboBox<String> comcity;
    private javax.swing.JComboBox<String> comclass;
    private javax.swing.JComboBox<String> comgender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblFN;
    private javax.swing.JLabel lblSN;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblclass;
    private javax.swing.JLabel lblgndr;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblphono;
    private javax.swing.JTextField txtFN;
    private javax.swing.JTextField txtSN;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txtstudentid;
    // End of variables declaration//GEN-END:variables
}
