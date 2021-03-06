/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.ClienteControl;
import Model.bean.ClienteBEAN;
import java.awt.Dimension;
import java.util.List;
import TableModel.ClienteTableModel;

/**
 *
 * @author gusta
 */
public class IFrmPesquisarClientes extends javax.swing.JInternalFrame
{

    /**
     * Creates new form FrmPesquisarClientes
     */
    private FrmMenu frmMenu;
    private ClienteTableModel clienteModel = null;

    public IFrmPesquisarClientes()
    {
        initComponents();
        rbrPorNome.setSelected(true);
        clienteModel = new ClienteTableModel();
        atualizarTable();
    }

    public IFrmPesquisarClientes(FrmMenu frmMenu)
    {
        this();
        this.frmMenu = frmMenu;
    }

    public void atualizarTable()
    {   
        ClienteControl clienteControl = new ClienteControl();
        List<ClienteBEAN> clientes = clienteControl.buscarClientes();
        clienteModel.popularLista(clientes);
        tblClientes.setModel(clienteModel);
    }
    private void atualizarTablePorNome(String nome)
    {   
        ClienteControl clienteControl = new ClienteControl();
        List<ClienteBEAN> clientes = clienteControl.buscarPorNome(nome);
        clienteModel.popularLista(clientes);
        tblClientes.setModel(clienteModel);
    }
    private void atualizarTablePorCpf(String cpf)
    {   
        ClienteControl clienteControl = new ClienteControl();
        List<ClienteBEAN> clientes = clienteControl.buscarPorCpf(cpf);
        clienteModel.popularLista(clientes);
        tblClientes.setModel(clienteModel);
    }

    public void setPosicao()
    {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        GrupoRadioButtonPesquisar = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        txbPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnCadastrarCliente = new javax.swing.JButton();
        rbrPorNome = new javax.swing.JRadioButton();
        rbrPorCpf = new javax.swing.JRadioButton();

        setClosable(true);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String []
            {
                "Nome", "CPF", "Telefone", "Data de Nascimento", "id"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean []
            {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex)
            {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        jLabel5.setText("Pesquisar:");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCadastrarCliente.setText("Cadastrar");
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        GrupoRadioButtonPesquisar.add(rbrPorNome);
        rbrPorNome.setText("Pesquisar por Nome");

        GrupoRadioButtonPesquisar.add(rbrPorCpf);
        rbrPorCpf.setText("Pesquisar por Cpf");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrarCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbrPorNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbrPorCpf))
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisar)))
                        .addGap(0, 170, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbrPorNome)
                    .addComponent(rbrPorCpf))
                .addGap(8, 8, 8)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar)
                    .addComponent(btnCadastrarCliente))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        ClienteBEAN cli = null;
        if (tblClientes.getSelectedRow() != -1)
        {
            cli = clienteModel.retornarObjeto(tblClientes.getSelectedRow());
        }
        IFrmCadastroCliente frmCadastroCliente = new IFrmCadastroCliente(EnumCRUD.Alterar, cli,this);
        frmMenu.DpContainer.add(frmCadastroCliente);
        frmCadastroCliente.setVisible(true);
        frmCadastroCliente.setPosicao();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        IFrmCadastroCliente frmCadastroCliente = new IFrmCadastroCliente(EnumCRUD.Cadastrar, null,this);
        frmMenu.DpContainer.add(frmCadastroCliente);
        frmCadastroCliente.setVisible(true);
        frmCadastroCliente.setPosicao();
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnPesquisarActionPerformed
    {//GEN-HEADEREND:event_btnPesquisarActionPerformed
        if (rbrPorCpf.isSelected())
        {
            atualizarTablePorCpf(txbPesquisar.getText());
        }
        else
        {
            atualizarTablePorNome(txbPesquisar.getText());
        }
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoRadioButtonPesquisar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbrPorCpf;
    private javax.swing.JRadioButton rbrPorNome;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txbPesquisar;
    // End of variables declaration//GEN-END:variables
}
