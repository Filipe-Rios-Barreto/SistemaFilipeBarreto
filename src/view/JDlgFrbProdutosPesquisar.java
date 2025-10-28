/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import bean.FrbProdutos;
import dao.FrbProdutosDAO;
import java.util.List;

/**
 *
 * @author 
 */
public class JDlgFrbProdutosPesquisar extends javax.swing.JDialog {

    private JDlgFrbProdutos jDlgFrbProdutos;
    FrbControllerProdutos frbControllerProdutos;

    /**
     * Creates new form JDlgFrbProdutosPesquisar
     */
    public JDlgFrbProdutosPesquisar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Pesquisar Produtos");

        // Inicializa controller e DAO
        frbControllerProdutos = new FrbControllerProdutos();
        FrbProdutosDAO frbProdutosDAO = new FrbProdutosDAO();

        // Carrega lista de produtos
        List lista = (List) frbProdutosDAO.listAll();
        frbControllerProdutos.setList(lista);

        // Define o modelo da tabela
        jTblFrbTabela.setModel(frbControllerProdutos);
    }

    public void setTelaPai(JDlgFrbProdutos jDlgFrbProdutos) {
        this.jDlgFrbProdutos = jDlgFrbProdutos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPanelFrbPainel = new javax.swing.JScrollPane();
        jTblFrbTabela = new javax.swing.JTable();
        jBtnFrbOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTblFrbTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Descrição", "Preço", "Estoque"
            }
        ));
        jScrollPanelFrbPainel.setViewportView(jTblFrbTabela);

        jBtnFrbOK.setText("OK");
        jBtnFrbOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFrbOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnFrbOK)
                    .addComponent(jScrollPanelFrbPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPanelFrbPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jBtnFrbOK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void jBtnFrbOKActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // Recupera produto selecionado e envia para a tela pai
        int selectedRow = jTblFrbTabela.getSelectedRow();
        if (selectedRow >= 0) {
            FrbProdutos frbProdutos = frbControllerProdutos.getBean(selectedRow);
            jDlgFrbProdutos.beanView(frbProdutos);
            this.setVisible(false);
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione um produto na tabela!");
        }
    }                                         

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(JDlgFrbProdutosPesquisar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgFrbProdutosPesquisar dialog = new JDlgFrbProdutosPesquisar(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify                     
    private javax.swing.JButton jBtnFrbOK;
    private javax.swing.JScrollPane jScrollPanelFrbPainel;
    private javax.swing.JTable jTblFrbTabela;
    // End of variables declaration                   
}
