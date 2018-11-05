/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Control.CartaoSeloControl;
import Control.CartaoValorControl;

import Control.ClienteControl;

import Control.EmpresaControl;

import Model.bean.CartaoTipoSeloBEAN;
import Model.bean.CartaoTipoValorBEAN;
import Model.bean.ClienteBEAN;
import Model.bean.EmpresaBEAN;
import Model.bean.FuncionarioBEAN;
import Model.bean.FuncionarioSessaoBEAN;
import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author gusta
 */
public class IFrmCadastroCliente extends javax.swing.JInternalFrame
{

    private int id;
    private EnumCRUD crud = null;
    private IFrmPesquisarClientes frmPesquisarClientes = null;
    private EmpresaBEAN empresa;

    /**
     * Creates new form FrmCadastroUsuario
     */
    public IFrmCadastroCliente()
    {
        initComponents();
        EmpresaControl empresaControl = new EmpresaControl();
        empresa = empresaControl.selecionarEmpresa();
    }

    public IFrmCadastroCliente(EnumCRUD crud, ClienteBEAN clienteBEAN, IFrmPesquisarClientes frmPesquisarClientes)
    {
        this();
        this.crud = crud;
        this.frmPesquisarClientes = frmPesquisarClientes;

        if (this.crud == EnumCRUD.Alterar)
        {
            txbCpf.setText(clienteBEAN.getCpf());
            txbDataNascimento.setText(clienteBEAN.getDataNasc());
            txbNomeCompleto.setText(clienteBEAN.getNome());
            txbTelefone.setText(clienteBEAN.getTelefone());
            id = clienteBEAN.getIdCliente();
            btnAcao.setText("Alterar");
        } else
        {
            btnAcao.setText("Cadastrar");
        }
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

        jPanel1 = new javax.swing.JPanel();
        txbDataNascimento = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txbNomeCompleto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txbTelefone = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnAcao = new javax.swing.JButton();
        txbCpf = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setClosable(true);
        setForeground(java.awt.Color.white);
        setTitle("Cadastrar Cliente");

        try
        {
            txbDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }

        jLabel1.setText("Data de Nascimento:");

        jLabel2.setText("Nome Completo:");

        jLabel3.setText("CPF:");

        jLabel4.setText("Telefone:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAcao.setText("Cadastrar");
        btnAcao.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnAcaoActionPerformed(evt);
            }
        });

        try
        {
            txbCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex)
        {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAcao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancelar)
                .addGap(29, 29, 29))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txbCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txbTelefone, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txbDataNascimento, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(txbNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcao)
                    .addComponent(btnCancelar))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnAcaoActionPerformed
    {//GEN-HEADEREND:event_btnAcaoActionPerformed
        ClienteBEAN clienteBean = new ClienteBEAN(txbNomeCompleto.getText(), txbCpf.getText(), txbTelefone.getText(), Control.DataConversoes.inverterData(txbDataNascimento.getText()));
        ClienteControl clienteControl = new ClienteControl();

        if (crud == EnumCRUD.Cadastrar || crud == null)
        {
            if (clienteControl.inserirCliente(clienteBean))
            {
                if (frmPesquisarClientes != null)
                {
                    frmPesquisarClientes.atualizarTable();
                }
                //Ta errado
                String tipoCartao = empresa.getTipoCartao();
                boolean cadastrou = true;
                CartaoTipoSeloBEAN cartaoSeloBEAN = null;
                CartaoTipoValorBEAN cartaoValorBEAN = null;

                FuncionarioBEAN funcionarioBEAN = new FuncionarioBEAN();
                funcionarioBEAN.setIdFuncionario(FuncionarioSessaoBEAN.getIdFuncionario());
                funcionarioBEAN.setNome(FuncionarioSessaoBEAN.getNome());

                if (tipoCartao.equals("Valor"))
                {
                    CartaoValorControl cartaoControl = new CartaoValorControl();
                    cartaoValorBEAN = new CartaoTipoValorBEAN(
                            "1999-11-30",
                            clienteBean,
                            funcionarioBEAN,
                            empresa,
                            0.00
                    );
                    cadastrou = cartaoControl.inserirCartaoValor(cartaoValorBEAN);
                } else
                {

                    CartaoSeloControl cartaoControl = new CartaoSeloControl();
                    cartaoSeloBEAN = new CartaoTipoSeloBEAN("1999-11-30",
                            clienteBean,
                            funcionarioBEAN,
                            empresa,
                            0
                    );
                    cadastrou = cartaoControl.inserirCartaoSelo(cartaoSeloBEAN);
                }
                if (cadastrou)
                {

                    if (JOptionPane.showConfirmDialog(null, "Cadastro realizado com sucesso! \n Deseja inserir algum valor no cartão do cliente", "Cadastro realizado", JOptionPane.YES_NO_OPTION) == 0)
                    {
                        if (tipoCartao.equals("Valor"))
                        {
                            FrmCadastrarCartaoPorValor frmCadastrarCartaoPorValor = new FrmCadastrarCartaoPorValor(cartaoValorBEAN);
                            frmCadastrarCartaoPorValor.show();
                        } else
                        {
                            FrmCadastroCartaoPorQuantidade frmCadastroCartaoPorQuantidade = new FrmCadastroCartaoPorQuantidade(cartaoSeloBEAN);
                            frmCadastroCartaoPorQuantidade.show();
                        }
                        this.dispose();
                    } else
                    {
                        this.dispose();
                    }
                } else
                {
                    JOptionPane.showMessageDialog(this, "Não foi possível criar o cartão", "Erro ao criar cartão", JOptionPane.ERROR_MESSAGE);
                }
            } else
            {
                JOptionPane.showMessageDialog(this, "Não foi possível cadastrar cliente", "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);
            }
        } //Caso seja alterar ...
        else
        {
            clienteBean.setIdCliente(id);
            if (clienteControl.alterarCliente(clienteBean) == true)
            {
                frmPesquisarClientes.atualizarTable();
                JOptionPane.showMessageDialog(this, "Cliente alterado com sucesso", "Alteração realizada", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();

            } else
            {
                JOptionPane.showMessageDialog(this, "Não foi possível alterar cliente", "Erro ao cadastrar", JOptionPane.ERROR_MESSAGE);

            }
        }
    }//GEN-LAST:event_btnAcaoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcao;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txbCpf;
    private javax.swing.JFormattedTextField txbDataNascimento;
    private javax.swing.JTextField txbNomeCompleto;
    private javax.swing.JTextField txbTelefone;
    // End of variables declaration//GEN-END:variables
}
