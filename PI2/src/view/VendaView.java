/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.ClienteController;
import controler.ProdutoController;
import controler.VendaController;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import model.Produto;
import model.Venda;

/**
 *
 * @author lucas.afsilva6
 */
public class VendaView extends javax.swing.JFrame {

    /**
     * Creates new form VendaView
     */
    public VendaView() throws SQLException {
        initComponents();
        ClienteController control = new ClienteController();
         List<Cliente> clientes = control.listar();

         for (Cliente cliente : clientes) {
          jComboBox1.addItem(cliente.getCpf());
       }

        ProdutoController controlproduto = new ProdutoController();

        List<Produto> produtos = controlproduto.listar();

        for (Produto produto : produtos) {
            jComboBox2.addItem(String.valueOf(produto.getCodigo()));
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

        jPanel2 = new javax.swing.JPanel();
        txtQuantidade = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();
        bntExcluir = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVenda = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblEstoque = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens Venda"));

        txtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtQuantidadeKeyTyped(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        bntExcluir.setText("Excluir");
        bntExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntExcluirActionPerformed(evt);
            }
        });

        btnAdd.setText("Salvar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnFinalizar.setText("Finalizar Venda");
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        tableVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Descrição Produto", "Quantidade", "Valor Unitário"
            }
        ));
        jScrollPane1.setViewportView(tableVenda);

        jLabel7.setText("Quantidade:");

        jLabel6.setText("Código do  Produto:");

        lblTotal.setText("0");

        jLabel2.setText("CPF:");

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel3.setText("IDCont");

        jLabel1.setText("Valor Total:");

        jLabel5.setText("Quantidade Em Estoque:");

        lblEstoque.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstoque)
                            .addComponent(jLabel5))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotal)
                            .addComponent(jLabel1)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(23, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEstoque))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jLabel4.setText("MENU");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int id = tableVenda.getSelectedRow();
        String cpf = jComboBox1.getSelectedItem().toString();
        int codigo = Integer.parseInt(jComboBox2.getSelectedItem().toString());
        int quantidade = Integer.parseInt(txtQuantidade.getText());

        ProdutoController nha = new ProdutoController();

//        List<Produto> produto = nha.listar();
//        Produto valor = produto.get(codigo - 1);
//        int valor2 = valor.getValor();

//        Venda venda = new Venda();
//        venda.setCpf(cpf);
//        venda.setCodigo(codigo);
//        venda.setQuantidade(quantidade);
//        venda.setValor(valor2);

//        limparTabela();
//        List<Venda> vendas = VendaController.alterarVenda(id, venda);
//        inserirDadosTabela(vendas);


    }//GEN-LAST:event_btnEditarActionPerformed
    int soma;   
    int estoque;
     
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

         String cpf = jComboBox1.getSelectedItem().toString();
         int codigo = Integer.parseInt(jComboBox2.getSelectedItem().toString());
         int quantidade = Integer.parseInt(txtQuantidade.getText());
 
         ProdutoController nha = new ProdutoController();
        try {
            List<Produto> produto = nha.listar();
            Produto valor = produto.get(codigo - 1);
            int valor2 = valor.getValor();
            int somador = 0;
            int estoque1 = estoque;



        if(estoque > 0){
        estoque1 = estoque - quantidade;
        }else{
            JOptionPane.showMessageDialog(this, "Este Produto Não existe No estoque");
            return;
        }
        
        if(estoque1 >= 0){
        lblEstoque.setText("" + estoque1);
        }
     
        if(estoque1 >= 0){
             somador = valor2 * quantidade;
             soma = soma + somador;
        }
        
        if (estoque < 0){
            
            return;
        }
        estoque = estoque1;
        lblTotal.setText("" + soma);
        
        nha.alterarEstoque(codigo,estoque1);
        
        Venda venda = new Venda();
        venda.setCpf(cpf);
        venda.setCodigo(codigo);
        venda.setQuantidade(quantidade);
        venda.setValor(valor2);
        
        


        Produto model = new Produto();
        model.setEstoque(estoque1);
        
        
        

   
        
        limparTabela();
        List<Venda> vendas = VendaController.cadastrarVenda(venda);
        inserirDadosTabela(vendas);

        jComboBox1.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(VendaView.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnAddActionPerformed
    private void inserirDadosTabela(List<Venda> vendas) {

        DefaultTableModel model = (DefaultTableModel) tableVenda.getModel();
        for (Venda venda : vendas) {

            model.addRow(new String[]{venda.getCpf(), String.valueOf(venda.getCodigo()), String.valueOf(venda.getQuantidade()), String.valueOf(venda.getValor())});
        }
    }

    private void limparTabela() {
        DefaultTableModel model = (DefaultTableModel) tableVenda.getModel();

        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);

        }

    }

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        MenuView tela = new MenuView();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed

        Venda model = new Venda();
        VendaController control = new VendaController();
        control.vendaEfetuada();
        
       
        
       
        JOptionPane.showMessageDialog(this, "Sua venda Foi salva em nossos dados!(array)");
        limparTabela();
        jComboBox1.setEnabled(true);
    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
        int id = tableVenda.getSelectedRow();
        limparTabela();
        List<Venda> vendas = VendaController.remover(id);
        inserirDadosTabela(vendas);
    }//GEN-LAST:event_bntExcluirActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        ProdutoController controlproduto = new ProdutoController();
        List<Produto> produtos = null;
        try {
            produtos = controlproduto.listar();
        } catch (SQLException ex) {
            Logger.getLogger(VendaView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       String idproduto = jComboBox2.getSelectedItem().toString();
       int idProdutoInt = Integer.parseInt(idproduto);
       
       lblEstoque.setText(String.valueOf(produtos.get(idProdutoInt - 1).getEstoque()));
       
       estoque = produtos.get(idProdutoInt - 1).getEstoque();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void txtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtQuantidadeKeyTyped
       String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_txtQuantidadeKeyTyped

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
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VendaView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VendaView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntExcluir;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEstoque;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JTable tableVenda;
    private javax.swing.JTextField txtQuantidade;
    // End of variables declaration//GEN-END:variables
}
