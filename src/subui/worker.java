/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subui;

import ctrl.helper;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mainui.Home;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojos.Item;
import pojos.User;
import pojos.Workers;

/**
 *
 * @author SCORFi3LD
 */
public class worker extends javax.swing.JInternalFrame {

    /**
     * Creates new form item
     */
    Session ses = utils.HibernateUtil.getSessionFactory().openSession();
    helper help = new helper();
    User user = Home.getLogedUser();

    //variable on update
    int on_update = 0;
    int on_update_item_id = 0;

    public worker() {
        initComponents();
        clear();
        loadDataToTable();
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
        txt_worker_name = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_save1 = new javax.swing.JButton();
        worker_type = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setTitle("Manage Workers");
        setFrameIcon(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(0, 184, 148));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Create Worker");
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Type :");

        txt_worker_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_worker_name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_worker_nameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_worker_nameKeyReleased(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_save.setText("SAVE");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_save1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_save1.setText("CLEAR");
        btn_save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_save1ActionPerformed(evt);
            }
        });

        worker_type.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        worker_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Permanent", "Temporary" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_worker_name, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(worker_type, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_save)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_save1)
                .addContainerGap(223, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(txt_worker_name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_save1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(btn_save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(worker_type, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(0, 37, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Worker ID", "Name", "Type", "Added Date", "Added Time", "User"
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

        jLabel4.setBackground(new java.awt.Color(0, 184, 148));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Workers List");
        jLabel4.setOpaque(true);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Update Selected Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setText("Delete Selected Item");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_worker_nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_worker_nameKeyReleased

    }//GEN-LAST:event_txt_worker_nameKeyReleased

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        if (on_update == 0) {
            if (!worker_type.getSelectedItem().equals("") && !txt_worker_name.getText().equals("")) {
                saveItem(txt_worker_name.getText(), worker_type.getSelectedItem().toString());
            } else {
                JOptionPane.showMessageDialog(this, "Emty Data ! Please Retry.");
            }
        } else {
            updateItem(on_update_item_id);
        }

    }//GEN-LAST:event_btn_saveActionPerformed

    private void txt_worker_nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_worker_nameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!txt_worker_name.getText().equals("")) {

            }
        }
    }//GEN-LAST:event_txt_worker_nameKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            int option = JOptionPane.showConfirmDialog(this, "Do you want to delete this Worker ?");
            if (option == 0) {
                on_update_item_id = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
                Transaction tr = ses.beginTransaction();
                Workers item = (Workers) ses.load(Workers.class, on_update_item_id);
                item.setStatus(0);
                tr.commit();
                clear();
                loadDataToTable();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Plase Select Row From Table !");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_save1ActionPerformed
        clear();
    }//GEN-LAST:event_btn_save1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear();
        loadDataToTable();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jTable1.getSelectedRow() >= 0) {
            on_update_item_id = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            txt_worker_name.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
            String type = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
            //Permanent, Temporary
            if (type.equals("Permanent")) {
                worker_type.setSelectedIndex(0);
            } else {
                worker_type.setSelectedIndex(1);
            }
            btn_save.setText("UPDATE");
            txt_worker_name.grabFocus();
            on_update = 1;
        } else {
            JOptionPane.showMessageDialog(this, "Plase Select Row From Table !");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_save1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_worker_name;
    private javax.swing.JComboBox<String> worker_type;
    // End of variables declaration//GEN-END:variables

    private void updateItem(int Item_Id) {
        try {
            if (Item_Id > 0) {
                Transaction tr = ses.beginTransaction();
                Workers item = (Workers) ses.load(Workers.class, Item_Id);
                if (!txt_worker_name.getText().equals("")) {
                    item.setName(txt_worker_name.getText());
                }
                int selected_type = worker_type.getSelectedIndex();
                if (selected_type == 0) {

                    item.setType(1);

                } else {
                    item.setType(2);

                }
                tr.commit();
                clear();
                loadDataToTable();
            } else {
                JOptionPane.showMessageDialog(this, "Plase Select Row From Table !");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Plase Select Row From Table !");
        }
    }

    private boolean saveItem(String Name, String Type) {
        boolean flag = false;
        if (!Name.equals("") && !Type.equals("")) {
            try {
                Transaction tr = ses.beginTransaction();
                Workers item = new Workers();
                item.setName(Name);
                int selected_type = worker_type.getSelectedIndex();
                if (selected_type == 0) {

                    item.setType(1);

                } else {
                    item.setType(2);

                }
                item.setAddedDate(help.getDate());
                item.setAddedTime(help.getTime());
                item.setUser(user);
                item.setStatus(1);
                ses.save(item);
                tr.commit();
                JOptionPane.showMessageDialog(this, "Worker Saved !");
                loadDataToTable();
                clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Emty Data ! Please Retry.");
            }

        } else {
            JOptionPane.showMessageDialog(this, "Emty Data ! Please Retry.");
        }

        return flag;
    }

    private void clear() {
        btn_save.setText("SAVE");
        txt_worker_name.setText("");
        txt_worker_name.grabFocus();
        on_update = 0;
        on_update_item_id = 0;
    }

    private void loadDataToTable() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        Criteria cr = ses.createCriteria(Workers.class);
        cr.add(Restrictions.eq("status", 1));
        List<Workers> item_list = cr.list();
        for (Workers it : item_list) {
            Vector v = new Vector();
            v.add(it.getWorkersId());
            v.add(it.getName());
            //Permanent, Temporary
            int selected_type = it.getType();
            if (selected_type == 1) {

                v.add("Permanent");

            } else {
                v.add("Temporary");

            }

            v.add(it.getAddedDate());
            v.add(it.getAddedTime());
            v.add(it.getUser().getName());
            dtm.addRow(v);
        }

    }
}