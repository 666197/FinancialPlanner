/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package financial.planner.jPanels;

/**
 *
 * @author salih
 */
public class MonthlyIncome extends javax.swing.JPanel {

    /**
     * Creates new form MonthlyIncome
     */
    public MonthlyIncome() {
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

        jLabel1 = new javax.swing.JLabel();
        income = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("What is your monthly Income?");

        income.setForeground(new java.awt.Color(153, 153, 153));
        income.setText("0");
        income.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                incomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                incomeFocusLost(evt);
            }
        });
        income.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                incomeActionPerformed(evt);
            }
        });
        income.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                incomeKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel2.setText("$");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(188, 188, 188))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(income, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(232, 232, 232))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(income, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(219, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void incomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_incomeFocusGained
        textField.textFocus("Please enter your income here...", income);
    }//GEN-LAST:event_incomeFocusGained

    private void incomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_incomeFocusLost
        textField.textUnfocus("Please enter your income here...", income);
    }//GEN-LAST:event_incomeFocusLost

    private void incomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_incomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_incomeActionPerformed

    private void incomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_incomeKeyTyped
        char c = evt.getKeyChar();
        
        if (!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_incomeKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField income;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
