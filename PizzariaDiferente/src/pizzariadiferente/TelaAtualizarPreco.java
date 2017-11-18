/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariadiferente;

import Bean.TipoSabor;
import DAO.TipoSaborDAO;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author George
 */
public class TelaAtualizarPreco extends javax.swing.JFrame {

    /**
     * Creates new form TelaAtualizarPreco
     */
  
    public TelaAtualizarPreco() {

        initComponents();
        TipoSaborDAO dao = new TipoSaborDAO();
        List<TipoSabor> lista = dao.getAll();
        id1Label.setText(String.valueOf(lista.get(0).id));
        nome1Label.setText(lista.get(0).nome);
        preco1TextField.setText(String.valueOf(lista.get(0).preco));
        id2Label.setText(String.valueOf(lista.get(1).id));
        nome2Label.setText(lista.get(1).nome);
        preco2TextField.setText(String.valueOf(lista.get(1).preco));
        id3Label.setText(String.valueOf(lista.get(2).id));
        nome3Label.setText(lista.get(2).nome);
        preco3TextField.setText(String.valueOf(lista.get(2).preco));       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloLabel = new javax.swing.JLabel();
        id1Label = new javax.swing.JLabel();
        nome1Label = new javax.swing.JLabel();
        preco1TextField = new javax.swing.JTextField();
        id2Label = new javax.swing.JLabel();
        nome2Label = new javax.swing.JLabel();
        preco2TextField = new javax.swing.JTextField();
        id3Label = new javax.swing.JLabel();
        nome3Label = new javax.swing.JLabel();
        preco3TextField = new javax.swing.JTextField();
        atualizarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tituloLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        tituloLabel.setText("Atualizacao dos valores");

        id1Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        id1Label.setText("id");

        nome1Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nome1Label.setText("nome");

        preco1TextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        id2Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        id2Label.setText("jLabel3");

        nome2Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nome2Label.setText("jLabel4");

        preco2TextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        id3Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        id3Label.setText("jLabel5");

        nome3Label.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nome3Label.setText("jLabel6");

        preco3TextField.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        atualizarButton.setText("Atualizar");
        atualizarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(id1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nome1Label))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(preco1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(preco2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id3Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nome3Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preco3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(atualizarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(tituloLabel)))
                .addContainerGap(255, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {preco1TextField, preco2TextField, preco3TextField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id1Label)
                            .addComponent(nome1Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id2Label)
                            .addComponent(nome2Label)
                            .addComponent(preco2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(tituloLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(preco1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id3Label)
                    .addComponent(nome3Label)
                    .addComponent(preco3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(atualizarButton)
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarButtonActionPerformed
        TipoSabor t1 = new TipoSabor();
        TipoSabor t2 = new TipoSabor();
        TipoSabor t3 = new TipoSabor();
        TipoSaborDAO t1d = new TipoSaborDAO();
        TelaAtualizarPreco ta = new TelaAtualizarPreco();
        boolean valido = false;
        if (preco1TextField.getText().trim().length() == 0){
            JOptionPane.showMessageDialog(ta, "Voce precisa preencher o campo Preço 1","ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }else{
            t1.setId(1);
            t1.setPreco(Integer.parseInt(preco1TextField.getText()));
        }
        if(valido){
            t1d.update(t1);
            dispose();
        }        
    }//GEN-LAST:event_atualizarButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAtualizarPreco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarPreco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarPreco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarPreco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizarPreco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarButton;
    private javax.swing.JLabel id1Label;
    private javax.swing.JLabel id2Label;
    private javax.swing.JLabel id3Label;
    private javax.swing.JLabel nome1Label;
    private javax.swing.JLabel nome2Label;
    private javax.swing.JLabel nome3Label;
    private javax.swing.JTextField preco1TextField;
    private javax.swing.JTextField preco2TextField;
    private javax.swing.JTextField preco3TextField;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables
}