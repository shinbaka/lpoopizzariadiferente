/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariadiferente;

import Bean.Circulo;
import Bean.Forma;
import Bean.Quadrado;
import Bean.Sabor;
import Bean.Triangulo;
import DAO.SaborDAO;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author George
 */
public class TelaPizza extends javax.swing.JFrame {

    Forma forma = null;
    NumberFormat formatter = new DecimalFormat("#0.00");  

    /**
     * Creates new form TelaPizza
     */
    public TelaPizza() {
        initComponents();
        preencheCombo();
    }
    
    public void preencheCombo(){
        SaborDAO sabordao = new SaborDAO();
        List<Sabor> sabor1 = sabordao.getAll();
        List<Sabor> sabor2 = sabordao.getAll();
        sabor1ComboBox.setModel(new DefaultComboBoxModel(sabor1.toArray()));
        sabor2ComboBox.setModel(new DefaultComboBoxModel(sabor2.toArray()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pizzaLabel = new javax.swing.JLabel();
        formaLabel = new javax.swing.JLabel();
        formasComboBox = new javax.swing.JComboBox<>();
        tamanhoLabel = new javax.swing.JLabel();
        ladoLabel = new javax.swing.JLabel();
        ladoTextField = new javax.swing.JTextField();
        alfaLabel = new javax.swing.JLabel();
        alfaTextField = new javax.swing.JTextField();
        sabor1Label = new javax.swing.JLabel();
        sabor1ComboBox = new javax.swing.JComboBox<>();
        sabor2Label = new javax.swing.JLabel();
        sabor2ComboBox = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        valorLabel = new javax.swing.JLabel();
        totalLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pizzaLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        pizzaLabel.setText("Pizza");

        formaLabel.setText("Forma");

        formasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Circulo", "Quadrado", "Triangulo" }));
        formasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formasComboBoxActionPerformed(evt);
            }
        });

        tamanhoLabel.setText("Tamanho");

        ladoLabel.setText("Lado/Raio");

        ladoTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ladoTextFieldFocusLost(evt);
            }
        });
        ladoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ladoTextFieldActionPerformed(evt);
            }
        });

        alfaLabel.setText("ou Area");

        alfaTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                alfaTextFieldFocusLost(evt);
            }
        });

        sabor1Label.setText("Sabor 1");

        sabor1ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        sabor2Label.setText("Sabor 2");

        sabor2ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        sabor2ComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sabor2ComboBoxFocusLost(evt);
            }
        });

        addButton.setText("Adicionar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        valorLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        valorLabel.setText("R$:");

        totalLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ladoLabel)
                            .addComponent(formaLabel)
                            .addComponent(sabor1Label)
                            .addComponent(sabor2Label)
                            .addComponent(valorLabel)
                            .addComponent(tamanhoLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addButton))
                            .addComponent(sabor2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sabor1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(formasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ladoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(alfaLabel)
                                .addGap(18, 18, 18)
                                .addComponent(alfaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(pizzaLabel)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {alfaTextField, ladoTextField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pizzaLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(formaLabel)
                    .addComponent(formasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(tamanhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ladoLabel)
                            .addComponent(ladoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alfaLabel)
                            .addComponent(alfaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sabor1Label)
                            .addComponent(sabor1ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sabor2Label)
                            .addComponent(sabor2ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(valorLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code he
    }//GEN-LAST:event_addButtonActionPerformed

    private void ladoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ladoTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ladoTextFieldActionPerformed

    private void ladoTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ladoTextFieldFocusLost
        if (ladoTextField.getText().trim().length() > 0) {
            double lado = Double.parseDouble(ladoTextField.getText());
            forma.setMedida(lado);
            alfaTextField.setText(String.valueOf(formatter.format(forma.getArea())));
        }
    }//GEN-LAST:event_ladoTextFieldFocusLost

    private void formasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formasComboBoxActionPerformed
        // TODO add your handling code here:
        switch (formasComboBox.getSelectedIndex()) {
            case 0:
                forma = null;
                ladoTextField.setText("");
                alfaTextField.setText("");
                break;
            case 1:
                ladoTextField.setText("");
                alfaTextField.setText("");
                forma = new Circulo();
                break;
            case 2:
                ladoTextField.setText("");
                alfaTextField.setText("");
                forma = new Quadrado();
                break;
            case 3:
                ladoTextField.setText("");
                alfaTextField.setText("");
                forma = new Triangulo();
                break;
        }
    }//GEN-LAST:event_formasComboBoxActionPerformed

    private void alfaTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_alfaTextFieldFocusLost
        if (alfaTextField.getText().trim().length() > 0) {
            double area = Double.parseDouble(alfaTextField.getText());
            forma.setArea(area);
            ladoTextField.setText(String.valueOf(formatter.format(forma.getMedida())));
        }
    }//GEN-LAST:event_alfaTextFieldFocusLost

    private void sabor2ComboBoxFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sabor2ComboBoxFocusLost
        // TODO add your handling code here:
        
        totalLabel.setText("Teste");
    }//GEN-LAST:event_sabor2ComboBoxFocusLost

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
            java.util.logging.Logger.getLogger(TelaPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPizza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel alfaLabel;
    private javax.swing.JTextField alfaTextField;
    private javax.swing.JLabel formaLabel;
    private javax.swing.JComboBox<String> formasComboBox;
    private javax.swing.JLabel ladoLabel;
    private javax.swing.JTextField ladoTextField;
    private javax.swing.JLabel pizzaLabel;
    private javax.swing.JComboBox<String> sabor1ComboBox;
    private javax.swing.JLabel sabor1Label;
    private javax.swing.JComboBox<String> sabor2ComboBox;
    private javax.swing.JLabel sabor2Label;
    private javax.swing.JLabel tamanhoLabel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JLabel valorLabel;
    // End of variables declaration//GEN-END:variables
}
