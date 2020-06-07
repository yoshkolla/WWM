/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subui;

import ctrl.helper;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import pojos.SaveWadi;
import pojos.SaveWadiItems;
import pojos.SaveWadiWorker;
import pojos.WadiReturn;
import pojos.WadiReturnLog;
import pojos.Workers;
import utils.Connection;

/**
 *
 * @author SCORFi3LD
 */
public class ReturnItems extends javax.swing.JInternalFrame {

    /**
     * Creates new form ReturnItems
     */
    public ReturnItems() {
        initComponents();
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
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dt_date = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_wadi = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_all_items = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_return_items = new javax.swing.JTable();
        btn_add = new javax.swing.JButton();
        btn_remove = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Return Wadi Items");
        setFrameIcon(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setBackground(new java.awt.Color(0, 184, 148));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Search the wadi");
        jLabel5.setOpaque(true);

        jLabel1.setText("Date");

        dt_date.setCalendarPreferredSize(new java.awt.Dimension(300, 200));
        dt_date.setFormat(1);

        tbl_wadi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tbl_wadi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Wadi Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_wadi.setRowHeight(25);
        tbl_wadi.getTableHeader().setReorderingAllowed(false);
        tbl_wadi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_wadiMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_wadi);
        if (tbl_wadi.getColumnModel().getColumnCount() > 0) {
            tbl_wadi.getColumnModel().getColumn(0).setMinWidth(0);
            tbl_wadi.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbl_wadi.getColumnModel().getColumn(0).setMaxWidth(0);
        }

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(dt_date, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setBackground(new java.awt.Color(0, 184, 148));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Select the returnning Items");
        jLabel6.setOpaque(true);

        tbl_all_items.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tbl_all_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "commission", "precentage", "Item Name", "Total Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_all_items.setRowHeight(25);
        tbl_all_items.getTableHeader().setReorderingAllowed(false);
        tbl_all_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_all_itemsMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_all_items);
        if (tbl_all_items.getColumnModel().getColumnCount() > 0) {
            tbl_all_items.getColumnModel().getColumn(0).setMinWidth(0);
            tbl_all_items.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbl_all_items.getColumnModel().getColumn(0).setMaxWidth(0);
            tbl_all_items.getColumnModel().getColumn(1).setMinWidth(0);
            tbl_all_items.getColumnModel().getColumn(1).setPreferredWidth(0);
            tbl_all_items.getColumnModel().getColumn(1).setMaxWidth(0);
            tbl_all_items.getColumnModel().getColumn(2).setMinWidth(0);
            tbl_all_items.getColumnModel().getColumn(2).setPreferredWidth(0);
            tbl_all_items.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        tbl_return_items.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        tbl_return_items.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "commission", "precentage", "Item Name", "Total Qty", "Return Qty"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_return_items.setRowHeight(25);
        tbl_return_items.getTableHeader().setReorderingAllowed(false);
        tbl_return_items.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tbl_return_itemsMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_return_items);
        if (tbl_return_items.getColumnModel().getColumnCount() > 0) {
            tbl_return_items.getColumnModel().getColumn(0).setMinWidth(0);
            tbl_return_items.getColumnModel().getColumn(0).setPreferredWidth(0);
            tbl_return_items.getColumnModel().getColumn(0).setMaxWidth(0);
            tbl_return_items.getColumnModel().getColumn(1).setMinWidth(0);
            tbl_return_items.getColumnModel().getColumn(1).setPreferredWidth(0);
            tbl_return_items.getColumnModel().getColumn(1).setMaxWidth(0);
            tbl_return_items.getColumnModel().getColumn(2).setMinWidth(0);
            tbl_return_items.getColumnModel().getColumn(2).setPreferredWidth(0);
            tbl_return_items.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        btn_add.setText(">");
        btn_add.setEnabled(false);
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_remove.setText("<");
        btn_remove.setEnabled(false);
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        btn_save.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn_save.setText("Save");
        btn_save.setEnabled(false);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_add, btn_remove});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 203, Short.MAX_VALUE)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 213, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String date = helper.getDate(dt_date.getSelectedDate());
        resetOnSearch();
        Session s = Connection.getConnection();
        List<SaveWadi> swList = s.createCriteria(SaveWadi.class).add(Restrictions.eq("savedDate", date)).list();

        DefaultTableModel dtm = (DefaultTableModel) tbl_wadi.getModel();
        dtm.setRowCount(0);
        for (SaveWadi sw : swList) {
            Vector v = new Vector();
            v.add(sw.getSaveWadiId());
            v.add(sw.getWadi().getName());
            dtm.addRow(v);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_wadiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_wadiMouseReleased

        if (tbl_wadi.isRowSelected(tbl_wadi.getSelectedRow())) {
            DefaultTableModel dtm1 = (DefaultTableModel) tbl_all_items.getModel();
            DefaultTableModel dtm2 = (DefaultTableModel) tbl_return_items.getModel();
            dtm1.setRowCount(0);
            dtm2.setRowCount(0);
            btn_add.setEnabled(false);
            btn_remove.setEnabled(false);
            btn_save.setEnabled(false);

            Session s = Connection.getConnection();
            
            
            SaveWadi sw = (SaveWadi) s.load(SaveWadi.class, Integer.parseInt(tbl_wadi.getValueAt(tbl_wadi.getSelectedRow(), 0).toString()));
            WadiReturn wr = (WadiReturn) s.createCriteria(WadiReturn.class).add(Restrictions.eq("wadi", sw.getWadi())).uniqueResult();
            if (wr != null) {
                JOptionPane.showMessageDialog(rootPane, "This wadi has already returned!");
                return;
            }
            List<SaveWadiItems> wiList = s.createCriteria(SaveWadiItems.class).add(Restrictions.eq("saveWadi", sw)).list();

            DefaultTableModel dtm = (DefaultTableModel) tbl_all_items.getModel();
            dtm.setRowCount(0);
            for (SaveWadiItems wi : wiList) {
                Vector v = new Vector();
                v.add(wi.getSaveWadiItemsId());
                v.add(wi.getCommissionPerItem());
                v.add(wi.getPercentage());
                v.add(wi.getItem().getName());
                v.add(wi.getQty());
                dtm.addRow(v);
            }
        }
    }//GEN-LAST:event_tbl_wadiMouseReleased

    private void tbl_all_itemsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_all_itemsMouseReleased

        if (tbl_all_items.isRowSelected(tbl_all_items.getSelectedRow())) {
            btn_add.setEnabled(true);
        }
    }//GEN-LAST:event_tbl_all_itemsMouseReleased

    private void tbl_return_itemsMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_return_itemsMouseReleased

        if (tbl_return_items.isRowSelected(tbl_return_items.getSelectedRow())) {
            btn_remove.setEnabled(true);
        }
    }//GEN-LAST:event_tbl_return_itemsMouseReleased

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed

        DefaultTableModel dtm = (DefaultTableModel) tbl_all_items.getModel();
        AddReturnQtyDialog dialog = new AddReturnQtyDialog(null, true, Integer.parseInt(dtm.getValueAt(tbl_all_items.getSelectedRow(), 4).toString()));
        dialog.setVisible(true);
        if (dialog.done) {
            // "id", "commission", "precentage", "Item Name", "Total Qty"
            String id = tbl_all_items.getValueAt(tbl_all_items.getSelectedRow(), 0).toString();
            String commission = tbl_all_items.getValueAt(tbl_all_items.getSelectedRow(), 1).toString();
            String precentage = tbl_all_items.getValueAt(tbl_all_items.getSelectedRow(), 2).toString();
            String name = tbl_all_items.getValueAt(tbl_all_items.getSelectedRow(), 3).toString();
            String qty = tbl_all_items.getValueAt(tbl_all_items.getSelectedRow(), 4).toString();

            dtm.removeRow(tbl_all_items.getSelectedRow());

            //"id", "commission", "precentage", "Item Name", "Total Qty", "Return Qty"
            DefaultTableModel dtm1 = (DefaultTableModel) tbl_return_items.getModel();
            Vector v = new Vector();
            v.add(id);
            v.add(commission);
            v.add(precentage);
            v.add(name);
            v.add(qty);
            v.add(dialog.qty);
            dtm1.addRow(v);
        }
        if (isReturnItemAdded()) {
            btn_save.setEnabled(true);
        } else {
            btn_save.setEnabled(false);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed

        //"id", "commission", "precentage", "Item Name", "Total Qty", "Return Qty"
        String id = tbl_return_items.getValueAt(tbl_return_items.getSelectedRow(), 0).toString();
        String commission = tbl_return_items.getValueAt(tbl_return_items.getSelectedRow(), 1).toString();
        String precentage = tbl_return_items.getValueAt(tbl_return_items.getSelectedRow(), 2).toString();
        String name = tbl_return_items.getValueAt(tbl_return_items.getSelectedRow(), 3).toString();
        String qty = tbl_return_items.getValueAt(tbl_return_items.getSelectedRow(), 4).toString();

        DefaultTableModel dtm = (DefaultTableModel) tbl_return_items.getModel();
        dtm.removeRow(tbl_return_items.getSelectedRow());

        // "id", "commission", "precentage", "Item Name", "Total Qty"
        DefaultTableModel dtm1 = (DefaultTableModel) tbl_all_items.getModel();
        Vector v = new Vector();
        v.add(id);
        v.add(commission);
        v.add(precentage);
        v.add(name);
        v.add(qty);
        dtm1.addRow(v);

        if (isReturnItemAdded()) {
            btn_save.setEnabled(true);
        } else {
            btn_save.setEnabled(false);
        }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        Session s = Connection.getConnection();
        Transaction tr = s.beginTransaction();

        SaveWadi w = (SaveWadi) s.load(SaveWadi.class, Integer.parseInt(tbl_wadi.getValueAt(tbl_wadi.getSelectedRow(), 0).toString()));

        DefaultTableModel dtm_return = (DefaultTableModel) tbl_return_items.getModel();
        for (int i = 0; i < dtm_return.getRowCount(); i++) {
            int item_id = Integer.parseInt(dtm_return.getValueAt(i, 0).toString());
            double comm = Double.parseDouble(dtm_return.getValueAt(i, 1).toString());
            double prec = Double.parseDouble(dtm_return.getValueAt(i, 2).toString());
            int ret_qty = Integer.parseInt(dtm_return.getValueAt(i, 5).toString());
            double tot = ((ret_qty / 100) * prec) * comm;
            SaveWadiItems wi = (SaveWadiItems) s.load(SaveWadiItems.class, item_id);

            WadiReturn wr = new WadiReturn();
            wr.setWadi(w.getWadi());
            wr.setSaveWadiItems(wi);
            wr.setReturnQty(ret_qty);
            wr.setReturnCommission(tot);
            wr.setStatus(1);
            s.save(wr);

            List<SaveWadiWorker> wList = s.createCriteria(SaveWadiWorker.class).add(Restrictions.eq("saveWadi", w)).list();
            for (SaveWadiWorker ww : wList) {
                Workers wo = ww.getWorkers();
                wo.setPaybleAmount(wo.getPaybleAmount() - (tot / wList.size()));
                s.update(wo);

                WadiReturnLog log = new WadiReturnLog();
                log.setSaveWadiWorker(ww);
                log.setReturnCommission(tot / wList.size());
                s.save(log);
            }
        }

        tr.commit();
        JOptionPane.showMessageDialog(rootPane, "Successfuly Returned!");
        resetAll();
    }//GEN-LAST:event_btn_saveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_remove;
    private javax.swing.JButton btn_save;
    private datechooser.beans.DateChooserCombo dt_date;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tbl_all_items;
    private javax.swing.JTable tbl_return_items;
    private javax.swing.JTable tbl_wadi;
    // End of variables declaration//GEN-END:variables

    private boolean isReturnItemAdded() {
        return tbl_return_items.getRowCount() != 0;
    }

    private void resetAll() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_wadi.getModel();
        DefaultTableModel dtm1 = (DefaultTableModel) tbl_all_items.getModel();
        DefaultTableModel dtm2 = (DefaultTableModel) tbl_return_items.getModel();

        dtm.setRowCount(0);
        dtm1.setRowCount(0);
        dtm2.setRowCount(0);

        btn_add.setEnabled(false);
        btn_remove.setEnabled(false);
        btn_save.setEnabled(false);

        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        dt_date.setSelectedDate(c);
    }

    private void resetOnSearch() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_wadi.getModel();
        DefaultTableModel dtm1 = (DefaultTableModel) tbl_all_items.getModel();
        DefaultTableModel dtm2 = (DefaultTableModel) tbl_return_items.getModel();

        dtm.setRowCount(0);
        dtm1.setRowCount(0);
        dtm2.setRowCount(0);

        btn_add.setEnabled(false);
        btn_remove.setEnabled(false);
        btn_save.setEnabled(false);
    }
}
