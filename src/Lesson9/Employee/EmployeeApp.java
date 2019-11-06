/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson9.Employee;

import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author lola1590
 */
public class EmployeeApp extends javax.swing.JFrame {

    Employee emp[];
    int size = 0;
    NumberFormat nf;

    /**
     * Creates new form EmployeeApp
     */
    public EmployeeApp() {
        initComponents();
        emp = new Employee[10];
        nf = NumberFormat.getCurrencyInstance();
    }

    public void clearform() {
        txtname.setText("");
        txthours.setText("");
        txtrate.setText("");
        buttonGroup1.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbft = new javax.swing.JRadioButton();
        rbpt = new javax.swing.JRadioButton();
        addbutton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblemp = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtrate = new javax.swing.JTextField();
        txthours = new javax.swing.JTextField();
        btnquit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lbltotalpay = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Type");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(99, 167, 111, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        buttonGroup1.add(rbft);
        rbft.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rbft.setSelected(true);
        rbft.setText("Full Time");
        rbft.setActionCommand("FT");

        buttonGroup1.add(rbpt);
        rbpt.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rbpt.setText("Part Time");
        rbpt.setActionCommand("pt");
        rbpt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbft)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(rbpt)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbft)
                    .addComponent(rbpt))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 198, 218, 61);

        addbutton.setBackground(new java.awt.Color(214, 240, 255));
        addbutton.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        addbutton.setText("Add To List");
        addbutton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), java.awt.Color.white, null, null));
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(addbutton);
        addbutton.setBounds(40, 277, 99, 21);

        tblemp.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblemp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Pay"
            }
        ));
        tblemp.setEnabled(false);
        jScrollPane1.setViewportView(tblemp);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 326, 220, 191);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 26, 41, 16);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Rate:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 73, 38, 18);

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hours:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 123, 42, 16);
        getContentPane().add(txtname);
        txtname.setBounds(99, 25, 159, 30);
        getContentPane().add(txtrate);
        txtrate.setBounds(99, 74, 159, 30);
        getContentPane().add(txthours);
        txthours.setBounds(99, 122, 159, 30);

        btnquit.setBackground(new java.awt.Color(214, 240, 255));
        btnquit.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        btnquit.setText("Quit");
        btnquit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, null, null));
        btnquit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquitActionPerformed(evt);
            }
        });
        getContentPane().add(btnquit);
        btnquit.setBounds(157, 277, 103, 21);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Total Pay:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 540, 63, 16);

        lbltotalpay.setBackground(new java.awt.Color(214, 240, 255));
        getContentPane().add(lbltotalpay);
        lbltotalpay.setBounds(113, 535, 147, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Lesson9/Employee/photo_backgrounds_textures_app04.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 300, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        Employee temp;
        String nm;
        int hours;
        double rate;
        try {
            nm = txtname.getText();
            hours = Integer.parseInt(txthours.getText());
            rate = Double.parseDouble(txtrate.getText());

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Must fill out form correctly");
            return;
        }

        String type = buttonGroup1.getSelection().getActionCommand();
        if (type.equals("FT")) {
            System.out.println("You chose full time");
        } else {
            System.out.println("You chose part time");
        }

        if (type.equals("FT")) {
            temp = new FTEmployee();
        } else {
            temp = new PTEmployee();
        }

        if (temp.setName(nm) && temp.setHours(hours) && temp.setRate(rate)) {
            emp[size] = temp;
            tblemp.setValueAt(temp.getName(), size, 0);
            tblemp.setValueAt(nf.format(temp.getPay()), size, 1);
            size++;
            lbltotalpay.setText(nf.format(Employee.getTotalPay()));
            clearform();
            return; //leave now
        }
        String error = "ERROR\n=======\n";
        if (temp.setName(nm) == false) {
            error += "Name: " + Employee.getNameRules() + "\n";
        }
        if (temp.setHours(hours) == false) {
            error += "Hours: " + Employee.getHoursRules() + "\n";
        }
        if (temp.setRate(rate) == false) {
            error += "Rate: " + Employee.getRateRules() + "\n";
        }
        JOptionPane.showMessageDialog(this, error);


    }//GEN-LAST:event_addbuttonActionPerformed

    private void btnquitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquitActionPerformed
        System.exit(0);


    }//GEN-LAST:event_btnquitActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton btnquit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lbltotalpay;
    private javax.swing.JRadioButton rbft;
    private javax.swing.JRadioButton rbpt;
    private javax.swing.JTable tblemp;
    private javax.swing.JTextField txthours;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtrate;
    // End of variables declaration//GEN-END:variables
}
