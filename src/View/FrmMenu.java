/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.sql.Connection;
import javax.swing.JInternalFrame;
import Connection.ConexaoBanco;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gusta
 */
public class FrmMenu extends javax.swing.JFrame
{

    /**
     * Creates new form FrmMenu
     */
    public FrmMenu()
    {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        
        
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

        Painel = new javax.swing.JPanel();
        DpContainer = new javax.swing.JDesktopPane();
        MbMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MiCadastrarCliente = new javax.swing.JMenuItem();
        MiPesquisarClientes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MiCadastrarFuncionario = new javax.swing.JMenuItem();
        MiPesquisarFuncionario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MiCadastrarEmpresa = new javax.swing.JMenuItem();
        MiAlterarEmpresa = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MiPesquisarCartoes = new javax.swing.JMenuItem();
        MiPesquisarPontos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout DpContainerLayout = new javax.swing.GroupLayout(DpContainer);
        DpContainer.setLayout(DpContainerLayout);
        DpContainerLayout.setHorizontalGroup(
            DpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        DpContainerLayout.setVerticalGroup(
            DpContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DpContainer)
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DpContainer)
        );

        jMenu1.setText("Cliente");

        MiCadastrarCliente.setText("Cadastrar");
        MiCadastrarCliente.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MiCadastrarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(MiCadastrarCliente);

        MiPesquisarClientes.setText("Pesquisar");
        MiPesquisarClientes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MiPesquisarClientesActionPerformed(evt);
            }
        });
        jMenu1.add(MiPesquisarClientes);

        MbMenu.add(jMenu1);

        jMenu2.setText("Funcionario");

        MiCadastrarFuncionario.setText("Cadastrar");
        MiCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MiCadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenu2.add(MiCadastrarFuncionario);

        MiPesquisarFuncionario.setText("Pesquisar");
        MiPesquisarFuncionario.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MiPesquisarFuncionarioActionPerformed(evt);
            }
        });
        jMenu2.add(MiPesquisarFuncionario);

        MbMenu.add(jMenu2);

        jMenu3.setText("Empresa");

        MiCadastrarEmpresa.setText("Cadastrar");
        MiCadastrarEmpresa.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MiCadastrarEmpresaActionPerformed(evt);
            }
        });
        jMenu3.add(MiCadastrarEmpresa);

        MiAlterarEmpresa.setText("Alterar");
        MiAlterarEmpresa.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MiAlterarEmpresaActionPerformed(evt);
            }
        });
        jMenu3.add(MiAlterarEmpresa);

        MbMenu.add(jMenu3);

        jMenu4.setText("Cartão");
        jMenu4.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jMenu4ActionPerformed(evt);
            }
        });

        MiPesquisarCartoes.setText("Gestão Cartões");
        MiPesquisarCartoes.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MiPesquisarCartoesActionPerformed(evt);
            }
        });
        jMenu4.add(MiPesquisarCartoes);

        MiPesquisarPontos.setText("Pesquisar Pontos");
        MiPesquisarPontos.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                MiPesquisarPontosActionPerformed(evt);
            }
        });
        jMenu4.add(MiPesquisarPontos);

        MbMenu.add(jMenu4);

        setJMenuBar(MbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MiCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiCadastrarClienteActionPerformed
        IFrmCadastroCliente frmCadastrarCliente = new IFrmCadastroCliente();
        DpContainer.add(frmCadastrarCliente);
        frmCadastrarCliente.setVisible(true);
        frmCadastrarCliente.setPosicao();
    }//GEN-LAST:event_MiCadastrarClienteActionPerformed

    private void MiCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiCadastrarFuncionarioActionPerformed
        IFrmCadastroFuncionario frmCadastroFuncionario = new IFrmCadastroFuncionario();
        DpContainer.add(frmCadastroFuncionario);
        frmCadastroFuncionario.setVisible(true);
        frmCadastroFuncionario.setPosicao();
    }//GEN-LAST:event_MiCadastrarFuncionarioActionPerformed

    private void MiCadastrarEmpresaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MiCadastrarEmpresaActionPerformed
    {//GEN-HEADEREND:event_MiCadastrarEmpresaActionPerformed
        IFrmGestaoEmpresa frmCadastroEmpresa = new IFrmGestaoEmpresa();
        DpContainer.add(frmCadastroEmpresa);
        frmCadastroEmpresa.setVisible(true);
        frmCadastroEmpresa.setPosicao();
    }//GEN-LAST:event_MiCadastrarEmpresaActionPerformed

    private void MiPesquisarClientesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MiPesquisarClientesActionPerformed
    {//GEN-HEADEREND:event_MiPesquisarClientesActionPerformed
        IFrmPesquisarClientes frmPesquisarClientes = new IFrmPesquisarClientes();
        DpContainer.add(frmPesquisarClientes);
        frmPesquisarClientes.setVisible(true);
        frmPesquisarClientes.setPosicao();        
    }//GEN-LAST:event_MiPesquisarClientesActionPerformed

    private void MiPesquisarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiPesquisarFuncionarioActionPerformed
        IFrmPesquisarFuncionarios iFrmPesquisarFuncionarios = new IFrmPesquisarFuncionarios(this);
        DpContainer.add(iFrmPesquisarFuncionarios);
        iFrmPesquisarFuncionarios.setVisible(true);
        iFrmPesquisarFuncionarios.setPosicao();
    }//GEN-LAST:event_MiPesquisarFuncionarioActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jMenu4ActionPerformed
    {//GEN-HEADEREND:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    private void MiAlterarEmpresaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MiAlterarEmpresaActionPerformed
    {//GEN-HEADEREND:event_MiAlterarEmpresaActionPerformed
        IFrmCadastroEmpresa gestaoEmpresa = new IFrmCadastroEmpresa(CRUD.Alterar);
        DpContainer.add(gestaoEmpresa);
        gestaoEmpresa.setVisible(true);
        gestaoEmpresa.setPosicao();
    }//GEN-LAST:event_MiAlterarEmpresaActionPerformed

    private void MiPesquisarCartoesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MiPesquisarCartoesActionPerformed
    {//GEN-HEADEREND:event_MiPesquisarCartoesActionPerformed
        IFrmPesquisarCartoes iFrmPesquisarCartoes = new IFrmPesquisarCartoes();
        DpContainer.add(iFrmPesquisarCartoes);
        iFrmPesquisarCartoes.setVisible(true);
        iFrmPesquisarCartoes.setPosicao();
    }//GEN-LAST:event_MiPesquisarCartoesActionPerformed

    private void MiPesquisarPontosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MiPesquisarPontosActionPerformed
    {//GEN-HEADEREND:event_MiPesquisarPontosActionPerformed
        IFrmPesquisarPontos iFrmPesquisarPontos = new IFrmPesquisarPontos();
        DpContainer.add(iFrmPesquisarPontos);
        iFrmPesquisarPontos.setVisible(true);
        iFrmPesquisarPontos.setPosicao();
    }//GEN-LAST:event_MiPesquisarPontosActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JDesktopPane DpContainer;
    private javax.swing.JMenuBar MbMenu;
    private javax.swing.JMenuItem MiAlterarEmpresa;
    private javax.swing.JMenuItem MiCadastrarCliente;
    private javax.swing.JMenuItem MiCadastrarEmpresa;
    private javax.swing.JMenuItem MiCadastrarFuncionario;
    private javax.swing.JMenuItem MiPesquisarCartoes;
    private javax.swing.JMenuItem MiPesquisarClientes;
    private javax.swing.JMenuItem MiPesquisarFuncionario;
    private javax.swing.JMenuItem MiPesquisarPontos;
    public javax.swing.JPanel Painel;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    // End of variables declaration//GEN-END:variables
}
