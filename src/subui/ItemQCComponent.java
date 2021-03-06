/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subui;

import java.awt.Toolkit;

/**
 *
 * @author SCORFi3LD
 */
public class ItemQCComponent extends javax.swing.JPanel {

    public int item_id;

    /**
     * Creates new form ItemQCComponent
     *
     * @param item_id
     * @param itemName
     * @param totalQty
     */
    public ItemQCComponent(int item_id, String itemName, int totalQty) {
        initComponents();
        this.item_id = item_id;
        lb_title.setText(itemName);
        lb_totalQty.setText(String.valueOf(totalQty));
        txt_qualityPRCNTG.setText("100");
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lb_title = new javax.swing.JLabel();
        lb_totalQty = new javax.swing.JLabel();
        txt_qualityPRCNTG = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheked.png"))); // NOI18N
        jCheckBox1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cheked.png"))); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Status");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quality");

        lb_title.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lb_title.setText("title here");

        lb_totalQty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lb_totalQty.setForeground(new java.awt.Color(102, 102, 102));
        lb_totalQty.setText("total qty here");

        txt_qualityPRCNTG.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt_qualityPRCNTG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_qualityPRCNTGKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Total Qty");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Quality Percentage");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_totalQty, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_qualityPRCNTG, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(0, 0, 0)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_title)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lb_totalQty, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_qualityPRCNTG, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        checkQualityPercentage_Validity();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void txt_qualityPRCNTGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_qualityPRCNTGKeyTyped

        if (!Character.isDigit(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_qualityPRCNTGKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lb_title;
    private javax.swing.JLabel lb_totalQty;
    private javax.swing.JTextField txt_qualityPRCNTG;
    // End of variables declaration//GEN-END:variables

    private void checkQualityPercentage_Validity() {

        // check status & show msg...
//        if (isQualityPrcntgValid()) {
//            JOptionPane.showMessageDialog(this, "XXXXXPlease Insert Valid Quality Percentage");
//            txt_qualityPRCNTG.setText("0");
//            txt_qualityPRCNTG.grabFocus();
//        }
    }

    public boolean isChecked() {
        return jCheckBox1.isSelected();
    }

    public int getQualityPrcntg() {
        return Integer.valueOf(txt_qualityPRCNTG.getText());
    }

    public boolean isQualityPrcntgValid() {
        boolean flagSts = false;
        if (txt_qualityPRCNTG.getText() == null) {
            flagSts = false;
        } else if (txt_qualityPRCNTG.getText().isEmpty()) {
            flagSts = false;
        } else {
            int qltyPrcntg = Integer.valueOf(txt_qualityPRCNTG.getText());
            if (qltyPrcntg > 100) {
                flagSts = false;
            } else {
                flagSts = true;
            }
        }

        return flagSts;
    }
}
