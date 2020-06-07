/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subui;

import ctrl.helper;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mainui.Home;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojos.SaveWadiWorker;
import pojos.User;
import pojos.WadiReturnLog;
import pojos.WorkerCommissionPay;
import pojos.Workers;

/**
 *
 * @author SCORFi3LD
 */
public class paycommission extends javax.swing.JInternalFrame {

    /**
     * Creates new form item
     */
    Session ses = utils.HibernateUtil.getSessionFactory().openSession();
    User user = Home.getLogedUser();
    DecimalFormat df = new DecimalFormat("#0.00");

    //variable on update
    int on_update = 0;
    int on_update_item_id = 0;

    public paycommission() {
        initComponents();
        clear();
        loadWorkersToDropDown();

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
        jLabel3 = new javax.swing.JLabel();
        txt_worker_pay = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_save1 = new javax.swing.JButton();
        worker_list = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        paybale_amount = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        btn_save2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Pay Commission");
        setFrameIcon(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(9, 132, 227));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pay Commission");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Amount RS :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Worker :");

        txt_worker_pay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_worker_pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_worker_payKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_worker_payKeyReleased(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_x24.png"))); // NOI18N
        btn_save.setText("PAY");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_save1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_save1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reset_x24.png"))); // NOI18N
        btn_save1.setText("CLEAR");
        btn_save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save1ActionPerformed(evt);
            }
        });

        worker_list.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        worker_list.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Permanent", "Temporary" }));
        worker_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                worker_listActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setBackground(new java.awt.Color(0, 184, 148));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Select Worker");
        jLabel5.setOpaque(true);

        paybale_amount.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        paybale_amount.setText("0.00");

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel7.setBackground(new java.awt.Color(0, 184, 148));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Payable Commission");
        jLabel7.setOpaque(true);

        btn_save2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_save2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save_x24.png"))); // NOI18N
        btn_save2.setText("PAY + PRINT");
        btn_save2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(worker_list, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(paybale_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_worker_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_save)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_save2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_save1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(594, 594, 594)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(422, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(worker_list, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(paybale_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 23, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_worker_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save)
                    .addComponent(btn_save1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save2))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(0, 28, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Worker ID", "Name", "Amount RS.", "Added Date", "Added Time", "User"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setBackground(new java.awt.Color(255, 195, 18));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Payment History");
        jLabel4.setOpaque(true);

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refresh_x24.png"))); // NOI18N
        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_x24.png"))); // NOI18N
        jButton3.setText("Delete Selected Item");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 184, 148));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Commission History");
        jLabel6.setOpaque(true);

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Wadi Name", "Commission", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowHeight(18);
        jScrollPane2.setViewportView(jTable2);

        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Wadi Name", "Commission", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setRowHeight(18);
        jScrollPane3.setViewportView(jTable3);

        jLabel8.setBackground(new java.awt.Color(234, 32, 39));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Commission Return History");
        jLabel8.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_worker_payKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_worker_payKeyReleased

    }//GEN-LAST:event_txt_worker_payKeyReleased

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        if (!worker_list.getSelectedItem().equals("") && !txt_worker_pay.getText().equals("")) {
            saveItem(txt_worker_pay.getText(), worker_list.getSelectedItem().toString());
        } else {
            JOptionPane.showMessageDialog(this, "Emty Data ! Please Retry.");
        }


    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_worker_payKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_worker_payKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txt_worker_pay.getText().equals("")) {

            }
        }
    }//GEN-LAST:event_txt_worker_payKeyPressed

    private void btn_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save1ActionPerformed
        clear();
    }//GEN-LAST:event_btn_save1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear();
        loadWorkersToDropDown();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void worker_listActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_worker_listActionPerformed
        loadWorkersData();
    }//GEN-LAST:event_worker_listActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this Payment ?");
            if (option == 0) {
                on_update_item_id = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                Transaction tr = ses.beginTransaction();
                WorkerCommissionPay item = (WorkerCommissionPay) ses.load(WorkerCommissionPay.class, on_update_item_id);
                item.setStatus(0);
                ses.update(item);
                Workers worker = item.getWorkers();
                double amount = worker.getPaybleAmount() + item.getAmount();
                worker.setPaybleAmount(amount);
                ses.update(worker);
                tr.commit();
                paybale_amount.setText(df.format(worker.getPaybleAmount()));
                clear();
                loadDataToTable(worker.getWorkersId());

            }

        } else {
            JOptionPane.showMessageDialog(this, "Plase Select Row From Table !");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_save2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_save2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_save1;
    private javax.swing.JButton btn_save2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel paybale_amount;
    private javax.swing.JTextField txt_worker_pay;
    private javax.swing.JComboBox<String> worker_list;
    // End of variables declaration//GEN-END:variables

    private boolean saveItem(String Amount, String Type) {
        boolean flag = false;
        if (!Amount.equals("") && !Type.equals("")) {
            try {
                Transaction tr = ses.beginTransaction();
                String ID = worker_list.getSelectedItem().toString().split("-")[0];
                int worker_id = Integer.parseInt(ID);
                Workers item = (Workers) ses.load(Workers.class, worker_id);
                if (item != null) {
                    double amount = Double.parseDouble(Amount);
                    if (item.getPaybleAmount() >= amount) {
                        WorkerCommissionPay p = new WorkerCommissionPay();
                        p.setAmount(amount);
                        p.setPayDate(helper.getDate());
                        p.setPayTime(helper.getTime());
                        p.setStatus(1);
                        p.setUser(user);
                        p.setWorkers(item);
                        ses.save(p);

                        double curr = item.getPaybleAmount() - amount;
                        item.setPaybleAmount(curr);
                        ses.update(item);
                        tr.commit();
                        JOptionPane.showMessageDialog(this, "Data Saved !");
                        paybale_amount.setText(df.format(item.getPaybleAmount()));
                        clear();
                        loadDataToTable(worker_id);

                    } else {
                        JOptionPane.showMessageDialog(this, "Amount is too high !");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Emty Data ! Please Retry.");

                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Emty Data ! Please Retry.");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Emty Data ! Please Retry.");
        }

        return flag;
    }

    private void clear() {
        btn_save.setText("PAY");
        txt_worker_pay.setText("");
        txt_worker_pay.grabFocus();
        on_update = 0;
        on_update_item_id = 0;
    }

    private void loadWorkersToDropDown() {
        worker_list.removeAllItems();
        Criteria cr = ses.createCriteria(Workers.class);
        cr.add(Restrictions.eq("status", 1));
        List<Workers> item_list = cr.list();
        for (Workers it : item_list) {
            worker_list.addItem(it.getWorkersId() + "-" + it.getName());
        }

    }

    private void loadWorkersData() {
        try {
            String ID = worker_list.getSelectedItem().toString().split("-")[0];
            int worker_id = Integer.parseInt(ID);
            Workers item = (Workers) ses.load(Workers.class, worker_id);
            paybale_amount.setText(df.format(item.getPaybleAmount()));
            loadDataToTable(worker_id);
            loadCommissonHistory(worker_id);
            loadCommissonReturnHistory(worker_id);
        } catch (Exception e) {
        }

    }

    private void loadDataToTable(int id) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.setRowCount(0);
                Criteria cr = ses.createCriteria(WorkerCommissionPay.class);
                cr.add(Restrictions.eq("status", 1));
                List<WorkerCommissionPay> item_list = cr.list();
                Collections.reverse(item_list);
                for (WorkerCommissionPay it : item_list) {
                    int iid = it.getWorkers().getWorkersId();
                    if (iid == id) {
                        Vector v = new Vector();
                        v.add(it.getWorkerCommissionPayId());
                        v.add(it.getWorkers().getName());
                        v.add(df.format(it.getAmount()));
                        v.add(it.getPayDate());
                        v.add(it.getPayTime());
                        v.add(it.getUser().getName());
                        dtm.addRow(v);
                    }
                }
            }
        }).start();

    }

    private void loadCommissonHistory(int id) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
                dtm.setRowCount(0);
                Criteria cr = ses.createCriteria(SaveWadiWorker.class);
                cr.add(Restrictions.eq("status", 1));
                List<SaveWadiWorker> item_list = cr.list();
                Collections.reverse(item_list);
                for (SaveWadiWorker it : item_list) {
                    int iid = it.getWorkers().getWorkersId();
                    if (iid == id) {
                        Vector v = new Vector();
                        v.add(it.getSaveWadi().getWadi().getName());
                        v.add(df.format(it.getCommission()));
                        v.add(it.getSaveWadi().getSavedDate());
                        dtm.addRow(v);
                    }
                }
            }
        }).start();

    }
    
    private void loadCommissonReturnHistory(int id) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                DefaultTableModel dtm = (DefaultTableModel) jTable3.getModel();
                dtm.setRowCount(0);
                Criteria cr = ses.createCriteria(WadiReturnLog.class);
                List<WadiReturnLog> item_list = cr.list();
                Collections.reverse(item_list);
                for (WadiReturnLog it : item_list) {
                    int iid = it.getSaveWadiWorker().getWorkers().getWorkersId();
                    if (iid == id) {
                        Vector v = new Vector();
                        v.add(it.getSaveWadiWorker().getSaveWadi().getWadi().getName());
                        v.add(df.format(it.getReturnCommission()));
                        v.add(it.getSaveWadiWorker().getSaveWadi().getSavedDate());
                        dtm.addRow(v);
                    }
                }
            }
        }).start();

    }
    
    private void PrintRecipt(){
        
    }
    
    
}
