
package databaseproject1;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DataBaseProjectDemo extends javax.swing.JFrame {

    Connection con;
   
    public DataBaseProjectDemo() {
        initComponents();
        getConnection();
    }

    void getConnection(){
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/staff?useSSL=false","root","root");
            
            System.out.println("Connection to DataBase Made");
        }catch(ClassNotFoundException ex){
            System.out.println(ex);
        }catch(SQLException es){
            System.out.println(es);
        }
        
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        staff_id = new javax.swing.JTextField();
        staff_name = new javax.swing.JTextField();
        staff_age = new javax.swing.JTextField();
        INSERT = new javax.swing.JButton();
        REFRESH = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        edit_name = new javax.swing.JTextField();
        edit_age = new javax.swing.JTextField();
        UPDATE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("   ID");

        jLabel2.setText(" NAME");

        jLabel3.setText(" AGE");

        INSERT.setText("INSERT");
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });

        REFRESH.setText("REFRESH");
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });

        EDIT.setText("EDIT");
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "AGE"
            }
        ));
        jScrollPane1.setViewportView(table);

        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(staff_id, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(staff_name, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(staff_age, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(INSERT)
                            .addGap(18, 18, 18)
                            .addComponent(REFRESH)
                            .addGap(18, 18, 18)
                            .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(edit_name, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(42, 42, 42)
                            .addComponent(edit_age, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(65, 65, 65)
                            .addComponent(UPDATE)
                            .addGap(55, 55, 55)
                            .addComponent(DELETE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(staff_id, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staff_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staff_age, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INSERT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(REFRESH, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edit_name)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(edit_age, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UPDATE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
        
        try{
            
            int id = Integer.parseInt(staff_id.getText());
            String name = staff_name.getText();
            int age = Integer.parseInt(staff_age.getText());
            
            String query = "insert into staff_details value(?,?,?)";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setInt(1, id);
            stmt.setString(2, name);
            stmt.setInt(3, age);
            
            stmt.execute();
            System.out.println("Data Inserted In the Table");
            stmt.close();
            
        }catch(SQLException es){
            System.out.println(es);
        }
        
    }//GEN-LAST:event_INSERTActionPerformed

    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESHActionPerformed
        
        DefaultTableModel tableModel = (DefaultTableModel)  table.getModel();
        
        try{
            String query = "select * from staff_details";
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                
                tableModel.addRow(new Object[]{id,name,age});
                System.out.println("Data Reflecting From Table");
            }
            stmt.close();
            
        }catch(SQLException es){
            System.out.println(es);
        }
        
        
    }//GEN-LAST:event_REFRESHActionPerformed

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel)table.getModel();
        int row = table.getSelectedRow();
        
        String name = (String) tableModel.getValueAt(row, 1);
        String age = tableModel.getValueAt(row, 2).toString();
        
        edit_name.setText(name);
        edit_age.setText(age);
    }//GEN-LAST:event_EDITActionPerformed

    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        try{
            String query = "update staff_details set age = ? where name = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setInt(1, Integer.parseInt(edit_age.getText()));
            stmt.setString(2, edit_name.getText());
            
            stmt.executeUpdate();
            System.out.println("Data Updated");
            stmt.close();
            REFRESH.doClick();
        
        }catch(SQLException es){
            System.out.println(es);
        }
        
    }//GEN-LAST:event_UPDATEActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        
        try{
            
            int row = table.getSelectedRow(); //selecting the row which is required to be deleted
            String name = (String) table.getValueAt(row, 1); // 
            
            String query = " Delete from staff_details where name = ? ";
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setString(1, name);
            stmt.executeUpdate();
        
            System.out.println("Value from Table deleted");
            stmt.close();
            
            REFRESH.doClick();
            
        }catch(SQLException es){
            System.out.println(es);
        } 
        
    }//GEN-LAST:event_DELETEActionPerformed

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
            java.util.logging.Logger.getLogger(DataBaseProjectDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataBaseProjectDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataBaseProjectDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataBaseProjectDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataBaseProjectDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DELETE;
    private javax.swing.JButton EDIT;
    private javax.swing.JButton INSERT;
    private javax.swing.JButton REFRESH;
    private javax.swing.JButton UPDATE;
    private javax.swing.JTextField edit_age;
    private javax.swing.JTextField edit_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField staff_age;
    private javax.swing.JTextField staff_id;
    private javax.swing.JTextField staff_name;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
