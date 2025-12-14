package view;

import controller.FrbControllerConsultasVenda;
import dao.FrbVendaDAO;
import java.util.List;

public class JDlgFrbConsultaVendas extends javax.swing.JDialog {

    FrbVendaDAO frbVendaDAO = new FrbVendaDAO();
    FrbControllerConsultasVenda controller;

    public JDlgFrbConsultaVendas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Consultar Vendas");

        controller = new FrbControllerConsultasVenda();
        controller.setList((List) frbVendaDAO.listAll());
        jTable1.setModel(controller);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTxtCliente = new javax.swing.JTextField();
        jTxtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jBtnConsultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jBtnOk.setText("OK");
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });

        jLabel1.setText("Cliente");

        jLabel2.setText("Valor Maior que");

        jBtnConsultar.setText("Consultar");
        jBtnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBtnOk))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBtnConsultar)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTxtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTxtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnConsultar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnOk)
                .addContainerGap())
        );

        pack();
    }

    private void jBtnConsultarActionPerformed(java.awt.event.ActionEvent evt) {

        if (!jTxtCliente.getText().isEmpty() && !jTxtValor.getText().isEmpty()) {
            controller.setList((List) frbVendaDAO.listClienteValor(
                    jTxtCliente.getText(),
                    Double.parseDouble(jTxtValor.getText())
            ));
        } else if (!jTxtCliente.getText().isEmpty()) {
            controller.setList((List) frbVendaDAO.listCliente(jTxtCliente.getText()));
        } else if (!jTxtValor.getText().isEmpty()) {
            controller.setList((List) frbVendaDAO.listValor(
                    Double.parseDouble(jTxtValor.getText())
            ));
        } else {
            controller.setList((List) frbVendaDAO.listAll());
        }
    }

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {
        setVisible(false);
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            jBtnOkActionPerformed(null);
        }
    }

    private javax.swing.JButton jBtnConsultar;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCliente;
    private javax.swing.JTextField jTxtValor;
}
