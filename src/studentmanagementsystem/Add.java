
package studentmanagementsystem;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Add extends javax.swing.JFrame {
         private static final String username="root";
    private static final String password="";
    private static final String dataConn ="jdbc:mysql://localhost:3306/studentdata";

    Connection sqlConn =null;
    PreparedStatement pst = null;
    ResultSet rs=null;

    
     int q,i,id;
     public Add() {
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
                         }
                         RecordTable.addRow(columnData);
                         
                     }    
        }    catch (Exception ex) { 
                 JOptionPane.showMessageDialog(null, ex);
             } 
        
                     }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblFN = new javax.swing.JLabel();
        lblSN = new javax.swing.JLabel();
        lblclass = new javax.swing.JLabel();
        lblcity = new javax.swing.JLabel();
        lblgndr = new javax.swing.JLabel();
        lbladdress = new javax.swing.JLabel();
        lblphono = new javax.swing.JLabel();
        txtstudentid = new javax.swing.JTextField();
        txtFN = new javax.swing.JTextField();
        txtSN = new javax.swing.JTextField();
        comclass = new javax.swing.JComboBox<>();
        comcity = new javax.swing.JComboBox<>();
        comgender = new javax.swing.JComboBox<>();
        txtaddress = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        btnadd = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fast Com\\Downloads\\abstract-background-of-four-colored-triangles.jpg")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fast Com\\Downloads\\abstract-background-of-four-colored-triangles.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Add Info");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 10, 92, 25));

        lblid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblid.setText("studentid");
        getContentPane().add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 82, 90, -1));

        lblFN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblFN.setText("FirstName");
        getContentPane().add(lblFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 132, 100, -1));

        lblSN.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSN.setText("SecondName");
        getContentPane().add(lblSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 181, 130, -1));

        lblclass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblclass.setText("Class");
        getContentPane().add(lblclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 231, -1, -1));

        lblcity.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcity.setText("City");
        getContentPane().add(lblcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 283, -1, -1));

        lblgndr.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblgndr.setText("Gender");
        getContentPane().add(lblgndr, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 333, -1, -1));

        lbladdress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbladdress.setText("Address");
        getContentPane().add(lbladdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 385, -1, -1));

        lblphono.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblphono.setText("PhoneNo");
        getContentPane().add(lblphono, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 435, -1, -1));

        txtstudentid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudentidActionPerformed(evt);
            }
        });
        getContentPane().add(txtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 79, 126, -1));
        getContentPane().add(txtFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 129, 126, -1));
        getContentPane().add(txtSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 178, 126, -1));

        comclass.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gujrat", "Sialkot", "Wazirabad", "Lahore" }));
        getContentPane().add(comclass, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 228, 126, -1));

        comcity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSSE", "BSCS", "BSIT", "BSEconomics", " " }));
        getContentPane().add(comcity, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 280, 126, -1));

        comgender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(comgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 330, 126, -1));
        getContentPane().add(txtaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 382, 126, -1));

        txtphone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtphoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 429, 126, -1));

        btnback.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnback.setText("Back");
        btnback.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 515, 60, 30));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 183, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jTable1.setBackground(new java.awt.Color(253, 253, 228));
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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, 560, 568));
        jPanel1.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        btnadd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnadd.setText("Add");
        btnadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 70, 30));

        btnclear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnclear.setText("Clear");
        btnclear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 66, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("                        Student Info");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 300, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("                                          Student Info");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 444, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fast Com\\Downloads\\abstract-background-of-four-colored-triangles.jpg")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -30, 1170, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 620));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fast Com\\Downloads\\abstract-background-of-four-colored-triangles.jpg")); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-740, -420, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtphoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtphoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtphoneActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.toBack();
       Add a=new Add();
       a.setVisible(false);
       a.toFront();
      int c= JOptionPane.showConfirmDialog(null,"Are you sure,you want to Back");
       if( c==JOptionPane.OK_OPTION)
       {
            this.toBack();
       Add a1=new Add();
       a1.setVisible(false);
       a1.toFront();

       }
       else if(c==JOptionPane.NO_OPTION)
       {
     a.setVisible(true);
       }
        
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try
        { 
           Class.forName("com.mysql.cj.jdbc.Driver"); 
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement("insert into studentdata5(studentid,FirstName,SecondName,"
                    + "Class,City,Gender,Address,PhoneNo)values"
                    + "(?,?,?,?,?,?,?,?)");  
            pst.setString(1, txtstudentid.getText());
            pst.setString(2, txtFN.getText());
            pst.setString(3, txtSN.getText());
            pst.setString(4, (String) comclass.getSelectedItem());
            pst.setString(5, (String) comcity.getSelectedItem());
            pst.setString(6, (String) comgender.getSelectedItem());
            pst.setString(7, txtaddress.getText());
            pst.setString(8, txtphone.getText());
         
           
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Student Record Added");
          updateDB();
        }
        
        catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (SQLException ex) {
        java.util.logging.Logger.getLogger(StudentManagementSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
             //System.err.println(ex);
 
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtstudentidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudentidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudentidActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
       txtstudentid.setText("");
            txtstudentid.requestFocus();
            txtFN.setText("");
            txtSN.setText("");
            comclass.setSelectedIndex(0);
            comcity.setSelectedIndex(0);
            comgender.setSelectedIndex(0);
            txtaddress.setText("");
            txtphone.setText("");
          //  DefaultTableModel RecordTable = (DefaultTableModel) jTable1.getModel();
           // RecordTable.setRowCount(0);
            
        
    }//GEN-LAST:event_btnclearActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnclear;
    private javax.swing.JComboBox<String> comcity;
    private javax.swing.JComboBox<String> comclass;
    private javax.swing.JComboBox<String> comgender;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
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
