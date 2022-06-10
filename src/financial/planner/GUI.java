/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package financial.planner;
import java.awt.Color;
import java.awt.*;
import financial.planner.jPanels.*;
import javax.swing.JPanel;
/**
 *
 * @author salih
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
       
    public void nextPage(){
        introduction.jLabel1.setText(getName.name);
        //FinancialCalculator.calculateMoney();
        CardLayout card = (CardLayout)jPanel1.getLayout();
        card.next(jPanel1);
    }
    
    public void prevPage(){
        CardLayout card = (CardLayout)jPanel1.getLayout();
        JPanel cards = null;
        for (Component comp : jPanel1.getComponents()) {
            if (comp.isVisible() == true) {
                cards = (JPanel) comp;
                card.previous(jPanel1);
            }
        }
    }
    
    public GUI() {
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
        frontPage2 = new financial.planner.jPanels.FrontPage();
        secondPage2 = new financial.planner.jPanels.SecondPage();
        introduction1 = new financial.planner.jPanels.introduction();
        housing1 = new financial.planner.jPanels.Housing();
        otherExpenses2 = new financial.planner.jPanels.OtherExpenses();
        monthlyIncome1 = new financial.planner.jPanels.MonthlyIncome();
        goal1 = new financial.planner.jPanels.goal();
        results1 = new financial.planner.jPanels.Results();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Financial Planner");
        setResizable(false);
        setSize(new java.awt.Dimension(648, 480));
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        frontPage2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(frontPage2, "card2");

        secondPage2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(secondPage2, "card3");
        jPanel1.add(introduction1, "card7");
        jPanel1.add(housing1, "card4");
        jPanel1.add(otherExpenses2, "card5");
        jPanel1.add(monthlyIncome1, "card6");
        jPanel1.add(goal1, "card8");
        jPanel1.add(results1, "card9");

        jButton1.setText("Next Page");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Previous Page");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nextPage();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        prevPage();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private financial.planner.jPanels.FrontPage frontPage2;
    private financial.planner.jPanels.goal goal1;
    private financial.planner.jPanels.Housing housing1;
    private financial.planner.jPanels.introduction introduction1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    public javax.swing.JPanel jPanel1;
    private financial.planner.jPanels.MonthlyIncome monthlyIncome1;
    private financial.planner.jPanels.OtherExpenses otherExpenses2;
    private financial.planner.jPanels.Results results1;
    private financial.planner.jPanels.SecondPage secondPage2;
    // End of variables declaration//GEN-END:variables
}
