/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariadiferente;

import Bean.Pedido;
import DAO.PedidoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author dell-soncini
 */
public class TelaListaPedidos extends javax.swing.JFrame {

    private ModeloTabelaPedido modeloTabela;

    /**
     * Creates new form TelaListaPedidos
     */
    public TelaListaPedidos() {
        modeloTabela = new ModeloTabelaPedido();
        initComponents();
        atualizaTabela();

    }

    public void atualizaTabela() {

        try {
            PedidoDAO dao = new PedidoDAO();
            List<Pedido> lista;
            if (StatusId.getSelectedIndex() == 0) {
                lista = dao.getAll();
            } else {
                lista = dao.getByIdStatus(StatusId.getSelectedIndex());
            }
            modeloTabela.setListaPedido(lista);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pedidoTable = new javax.swing.JTable();
        Novo = new javax.swing.JButton();
        Caminho = new javax.swing.JButton();
        Entregue = new javax.swing.JButton();
        StatusId = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        Visualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Pedidos");

        pedidoTable.setModel(modeloTabela);
        jScrollPane2.setViewportView(pedidoTable);

        Novo.setText("Novo");
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });

        Caminho.setText("A Caminho");
        Caminho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaminhoActionPerformed(evt);
            }
        });

        Entregue.setText("Entregue");
        Entregue.setToolTipText("");
        Entregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntregueActionPerformed(evt);
            }
        });

        StatusId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos Status", "Abertos", "A Caminho", "Entregue" }));
        StatusId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusIdActionPerformed(evt);
            }
        });

        jButton1.setText("Tipos de Sabor");
        jButton1.setActionCommand("alteraPreco");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Visualizar.setText("Visualizar");
        Visualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StatusId, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(308, 308, 308)
                            .addComponent(voltar)
                            .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Novo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Visualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Caminho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Entregue)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(voltar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel1)))
                .addGap(15, 15, 15)
                .addComponent(StatusId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Novo)
                    .addComponent(Caminho)
                    .addComponent(Entregue)
                    .addComponent(jButton1)
                    .addComponent(Visualizar))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CaminhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaminhoActionPerformed
        // TODO add your handling code here:
        try {
            PedidoDAO dao = new PedidoDAO();
            int[] linhasSelecionadas = pedidoTable.getSelectedRows();
            List<Pedido> listaExcluir = new ArrayList<Pedido>();
            for (int i = 0; i < linhasSelecionadas.length; i++) {
                Pedido pedido = modeloTabela.getPedido(linhasSelecionadas[i]);
                dao.updateStatus(pedido, 2);
                atualizaTabela();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar exclusão de contatos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CaminhoActionPerformed

    private void EntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntregueActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
            PedidoDAO dao = new PedidoDAO();
            int[] linhasSelecionadas = pedidoTable.getSelectedRows();
            List<Pedido> listaExcluir = new ArrayList<Pedido>();
            for (int i = 0; i < linhasSelecionadas.length; i++) {
                Pedido pedido = modeloTabela.getPedido(linhasSelecionadas[i]);
                dao.updateStatus(pedido, 3);
                atualizaTabela();
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar exclusão de contatos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_EntregueActionPerformed

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed
        // TODO add your handling code here:
        TelaPedido tp = new TelaPedido();
        dispose();
        tp.setVisible(true);
    }//GEN-LAST:event_NovoActionPerformed

    private void StatusIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusIdActionPerformed
        // TODO add your handling code here:
        atualizaTabela();
    }//GEN-LAST:event_StatusIdActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        PizzariaDiferente TI = new PizzariaDiferente();
        dispose();
        TI.setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TelaAtualizarPreco telaPreco = new TelaAtualizarPreco();
        dispose();
        telaPreco.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void VisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarActionPerformed
        // TODO add your handling code here:
        
          try {
            int[] linhasSelecionadas = pedidoTable.getSelectedRows();
            for (int i = 0; i < linhasSelecionadas.length; i++) {
                Pedido pedido = modeloTabela.getPedido(linhasSelecionadas[i]);
                TelaPedido tp = new TelaPedido();
                tp.visualizar(pedido);
                dispose();
                tp.setVisible(true);
                        
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar exclusão de contatos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_VisualizarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaListaPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaListaPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Caminho;
    private javax.swing.JButton Entregue;
    private javax.swing.JButton Novo;
    private javax.swing.JComboBox<String> StatusId;
    private javax.swing.JButton Visualizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable pedidoTable;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
