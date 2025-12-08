/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import pesquisar.JDlgFrbProdutosPesquisar;
import bean.FrbProdutos;
import dao.FrbProdutosDAO;
import tools.Util;
/**
 *
 * @author U42977829873
 */
public class JDlgFrbProdutos extends javax.swing.JDialog {
    /**
     * Creates new form JDlgUsuarios
     */
    
    private boolean incluir;
    
    public JDlgFrbProdutos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro de Produtos");
        setLocationRelativeTo(null);
        Util.habilitar(false, jTxtFrbCodigo, jTxtFrbSabor, jTxtFrbTamanho, jTxtFrbEstoque,
        jTxtFrbDescricao, jTxtFrbPreco, jFmtFrbDataValidade, jBtnConfirmar, jBtnCancelar, jBtnExcluir, jBtnAlterar);
    }
    public FrbProdutos viewBean() {
    FrbProdutos frbProdutos = new FrbProdutos();

    frbProdutos.setFrbIdProduto(Util.strToInt(jTxtFrbCodigo.getText()));
    frbProdutos.setFrbSabor(jTxtFrbSabor.getText());
    frbProdutos.setFrbDescricao(jTxtFrbDescricao.getText());
    frbProdutos.setFrbPreco(Util.strToDouble(jTxtFrbPreco.getText()));
    frbProdutos.setFrbEstoque(Util.strToInt(jTxtFrbEstoque.getText()));
    frbProdutos.setFrbTamanho(Util.strToInt(jTxtFrbTamanho.getText()));
    frbProdutos.setFrbDataValidade(Util.strToDate(jFmtFrbDataValidade.getText()));
    return frbProdutos;
}
    
    public FrbProdutos beanView(FrbProdutos frbProdutos) {
    jTxtFrbCodigo.setText(Util.intToStr(frbProdutos.getFrbIdProduto()));
    jTxtFrbSabor.setText(frbProdutos.getFrbSabor());
    jTxtFrbDescricao.setText(frbProdutos.getFrbDescricao());
    jTxtFrbPreco.setText(Util.doubleToString(frbProdutos.getFrbPreco()));
    jTxtFrbEstoque.setText(Util.intToStr(frbProdutos.getFrbEstoque()));
    jTxtFrbTamanho.setText(Util.intToStr(frbProdutos.getFrbTamanho()));
    jFmtFrbDataValidade.setText(Util.dateToStr(frbProdutos.getFrbDataValidade()));
    return frbProdutos;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTxtFrbCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTxtFrbSabor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTxtFrbDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTxtFrbPreco = new javax.swing.JTextField();
        jTxtFrbTamanho = new javax.swing.JTextField();
        jTxtFrbEstoque = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jFmtFrbDataValidade = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnIncluir = new javax.swing.JButton();
        jBtnAlterar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jBtnConfirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Codigo");

        jLabel2.setText("Sabor");

        jTxtFrbSabor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFrbSaborActionPerformed(evt);
            }
        });

        jLabel3.setText("Descricao");

        jLabel4.setText("Tamanho");

        jLabel5.setText("Preço");

        jTxtFrbTamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFrbTamanhoActionPerformed(evt);
            }
        });

        jLabel7.setText("Quantidade");

        jLabel9.setText("Validade");

        try {
            jFmtFrbDataValidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFmtFrbDataValidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFmtFrbDataValidadeActionPerformed(evt);
            }
        });

        jLabel6.setText("L");

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jBtnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar.setText("Alterar");
        jBtnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ok.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtFrbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jTxtFrbSabor)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTxtFrbDescricao))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jTxtFrbPreco))
                            .addComponent(jFmtFrbDataValidade)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTxtFrbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jTxtFrbEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel9)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnPesquisar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtFrbCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFrbSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFrbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFrbEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtFrbDescricao))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtFrbPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFmtFrbDataValidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnIncluir)
                    .addComponent(jBtnAlterar)
                    .addComponent(jBtnExcluir)
                    .addComponent(jBtnConfirmar)
                    .addComponent(jBtnCancelar)
                    .addComponent(jBtnPesquisar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFrb_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFrb_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFrb_CodigoActionPerformed

    private void jTxtFrbSaborActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFrbSaborActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFrbSaborActionPerformed

    private void jTxtFrb_DescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFrb_DescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFrb_DescricaoActionPerformed

    private void jTxtFrb_PrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFrb_PrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFrb_PrecoActionPerformed

    private void jTxtFrbTamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFrbTamanhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFrbTamanhoActionPerformed

    private void jTxtFrb_EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFrb_EstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFrb_EstoqueActionPerformed

    private void jFmtFrb_DataValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtFrb_DataValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtFrb_DataValidadeActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(false, jTxtFrbCodigo, jTxtFrbSabor, jTxtFrbTamanho, jTxtFrbEstoque,
            jTxtFrbDescricao, jTxtFrbPreco, jFmtFrbDataValidade, jBtnConfirmar, jBtnAlterar, jBtnCancelar, jBtnExcluir, jBtnAlterar);
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
        Util.limpar(jTxtFrbCodigo, jTxtFrbSabor, jTxtFrbTamanho, jTxtFrbEstoque,
            jTxtFrbDescricao, jTxtFrbPreco, jFmtFrbDataValidade);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        JDlgFrbProdutosPesquisar jDlgFrbProdutosPesquisar = new JDlgFrbProdutosPesquisar(null,true);
                jDlgFrbProdutosPesquisar.setTelaPai(this);
        jDlgFrbProdutosPesquisar.setVisible(true);
        Util.habilitar(true, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        Util.habilitar(false, jBtnIncluir);
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true,jTxtFrbCodigo, jTxtFrbSabor, jTxtFrbTamanho, jTxtFrbEstoque,
            jTxtFrbDescricao, jTxtFrbPreco, jFmtFrbDataValidade, jBtnConfirmar, jBtnAlterar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluir = true;
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterarActionPerformed
        // TODO add your handling code here:
        Util.habilitar(true, jTxtFrbCodigo, jTxtFrbSabor, jTxtFrbTamanho, jTxtFrbEstoque,
            jTxtFrbDescricao, jTxtFrbPreco, jFmtFrbDataValidade, jBtnConfirmar, jBtnAlterar, jBtnCancelar);
        Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir, jBtnPesquisar);
        incluir = false;
    }//GEN-LAST:event_jBtnAlterarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        // TODO add your handling code here:
       if(Util.perguntar("Deseja Excluir?") == true){
            FrbProdutosDAO frbProdutosDAO = new FrbProdutosDAO();
            frbProdutosDAO.delete(viewBean());}
        Util.limpar(jTxtFrbCodigo, jTxtFrbSabor, jTxtFrbTamanho, jTxtFrbEstoque,
            jTxtFrbDescricao, jTxtFrbPreco, jFmtFrbDataValidade);
        Util.habilitar(false, jBtnAlterar, jBtnExcluir);
         Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        // TODO add your handling code here:
        FrbProdutosDAO frbProdutosDAO = new FrbProdutosDAO();
        FrbProdutos frbProdutos = viewBean();
        if (incluir == true) {
            frbProdutosDAO.insert(viewBean());
        } else {
            frbProdutosDAO.update(viewBean());
        }
        Util.habilitar(false, jTxtFrbCodigo, jTxtFrbSabor, jTxtFrbTamanho, jTxtFrbEstoque,
            jTxtFrbDescricao, jTxtFrbPreco, jFmtFrbDataValidade, jBtnConfirmar, jBtnAlterar, jBtnCancelar);
        Util.habilitar(true, jBtnIncluir, jBtnPesquisar);
        Util.limpar(jTxtFrbCodigo, jTxtFrbSabor, jTxtFrbTamanho, jTxtFrbEstoque,
            jTxtFrbDescricao, jTxtFrbPreco, jFmtFrbDataValidade);
        
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jFmtFrbDataValidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFmtFrbDataValidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFmtFrbDataValidadeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc="Look and feel setting code (optional) ">
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
            java.util.logging.Logger.getLogger(JDlgFrbProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgFrbProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgFrbProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgFrbProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFrbProdutos dialog = new JDlgFrbProdutos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JFormattedTextField jFmtFrbDataValidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTxtFrbCodigo;
    private javax.swing.JTextField jTxtFrbDescricao;
    private javax.swing.JTextField jTxtFrbEstoque;
    private javax.swing.JTextField jTxtFrbPreco;
    private javax.swing.JTextField jTxtFrbSabor;
    private javax.swing.JTextField jTxtFrbTamanho;
    // End of variables declaration//GEN-END:variables
}