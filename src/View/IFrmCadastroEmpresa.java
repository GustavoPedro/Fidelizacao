package View;

import Control.EmpresaControl;
import Model.bean.EmpresaBEAN;
import java.awt.Dimension;
import javax.swing.JOptionPane;

public class IFrmCadastroEmpresa extends javax.swing.JInternalFrame
{

    private EnumCRUD crud;
    private EmpresaBEAN empresa;

    public IFrmCadastroEmpresa()
    {
        initComponents();
    }

    public IFrmCadastroEmpresa(EnumCRUD crud)
    {
        initComponents();

        this.crud = crud;

        EmpresaControl empresaControl = new EmpresaControl();
        empresa = empresaControl.selecionarEmpresa();

        if (empresa != null)
        {
            txbRazaoSocial.setText(empresa.getRazaoSocial());
            txbTelefone.setText(empresa.getTelefone());
            txbCNPJ.setText(empresa.getCNPJ());
            cbxTipo.setSelectedItem(empresa.getTipoCartao());
            if (this.crud == EnumCRUD.Cadastrar)
            {
                txbRazaoSocial.setEnabled(false);
                txbTelefone.setEnabled(false);
                txbCNPJ.setEnabled(false);
                cbxTipo.setEnabled(false);
                btnCadastrarEmpresa.setEnabled(false);
            }
        }
        if (this.crud == EnumCRUD.Alterar)
        {
            btnCadastrarEmpresa.setText("Alterar");
            if (empresa == null)
            {
                JOptionPane.showMessageDialog(this, "Não há empresas cadastradas para alterá-las", "Aviso", JOptionPane.ERROR_MESSAGE);
                btnCadastrarEmpresa.setEnabled(false);
            }
        }
    }

    public void setPosicao()
    {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txbRazaoSocial = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txbCNPJ = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        txbTelefone = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnCadastrarEmpresa = new javax.swing.JButton();
        cbxTipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Cadastrar Empresa");

        jLabel1.setText("Razão Social:");

        jLabel2.setText("CNPJ:");

        try {
            txbCNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setText("Telefone:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnCadastrarEmpresa.setText("Cadastrar");
        btnCadastrarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarEmpresaActionPerformed(evt);
            }
        });

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selo", "Valor", "Ambos" }));

        jLabel4.setText("Tipo de Cartão:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(234, Short.MAX_VALUE)
                .addComponent(btnCadastrarEmpresa)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addGap(22, 22, 22))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel1)
                        .addComponent(txbRazaoSocial)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(txbCNPJ, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                        .addComponent(txbTelefone))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnCadastrarEmpresa))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelarActionPerformed
    {//GEN-HEADEREND:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCadastrarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarEmpresaActionPerformed
        EmpresaBEAN empresaBean = new EmpresaBEAN(txbRazaoSocial.getText(), txbCNPJ.getText(), txbTelefone.getText(), (String) cbxTipo.getSelectedItem());
        
        EmpresaControl empresaControl = new EmpresaControl();

        if (crud == EnumCRUD.Cadastrar)
        {
            if (empresaControl.inserir(empresaBean))
            {
                JOptionPane.showMessageDialog(this, "Cadastro feito com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else
            {
                JOptionPane.showMessageDialog(this, "Erro ao cadastrar empresa", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else
        {
            empresaBean.setIdEmpresa(empresa.getIdEmpresa());
            if (empresaControl.alterar(empresaBean))
            {
                
                JOptionPane.showMessageDialog(this, "Empresa alterada com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            } else
            {
                JOptionPane.showMessageDialog(this, "Erro ao alterar empresa", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnCadastrarEmpresaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarEmpresa;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txbCNPJ;
    private javax.swing.JTextField txbRazaoSocial;
    private javax.swing.JTextField txbTelefone;
    // End of variables declaration//GEN-END:variables
}
