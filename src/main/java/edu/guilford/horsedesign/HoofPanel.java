package edu.guilford.horsedesign;

import java.awt.Color;

public class HoofPanel extends javax.swing.JPanel {

    HorsePanel hPanel;

    public HorsePanel gethPanel() {
        return hPanel;
    }

    public void sethPanel(HorsePanel hPanel) {
        this.hPanel = hPanel;
    }

    public HoofPanel() {
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

        blackButton = new javax.swing.JButton();
        greyButton = new javax.swing.JButton();
        creamButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        blackButton.setBackground(new java.awt.Color(51, 51, 51));
        blackButton.setOpaque(true);
        blackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blackButtonActionPerformed(evt);
            }
        });

        greyButton.setBackground(new java.awt.Color(102, 102, 102));
        greyButton.setOpaque(true);
        greyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greyButtonActionPerformed(evt);
            }
        });

        creamButton.setBackground(new java.awt.Color(245, 244, 201));
        creamButton.setOpaque(true);
        creamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creamButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(blackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(greyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(creamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(creamButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(blackButton, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                        .addComponent(greyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void blackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blackButtonActionPerformed
        // TODO add your handling code here:
        Color bLColor = this.blackButton.getBackground();
        hPanel.hoofColorset(bLColor);
    }//GEN-LAST:event_blackButtonActionPerformed

    private void greyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greyButtonActionPerformed
        // TODO add your handling code here:
        Color gColor = this.greyButton.getBackground();
        hPanel.hoofColorset(gColor);
    }//GEN-LAST:event_greyButtonActionPerformed

    private void creamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creamButtonActionPerformed
        // TODO add your handling code here:
        Color cColor = this.creamButton.getBackground();
        hPanel.hoofColorset(cColor);
    }//GEN-LAST:event_creamButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blackButton;
    private javax.swing.JButton creamButton;
    private javax.swing.JButton greyButton;
    // End of variables declaration//GEN-END:variables
}
