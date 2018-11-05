/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 *
 * @author gusta
 */
public class CartaoTipoSeloBEAN extends CartaoBEAN
{
    private int qnt;
   

    public CartaoTipoSeloBEAN(String dataVencimento, ClienteBEAN cliente, FuncionarioBEAN funcionario, EmpresaBEAN empresa,int qnt)
    {        
        super(dataVencimento, cliente, funcionario, empresa);
        this.qnt = qnt;
    }    
    public CartaoTipoSeloBEAN()
    {
        
    }
    
     public int getQnt()
    {
        return qnt;
    }

    public void setQnt(int qnt)
    {
        this.qnt = qnt;
    }
    
}
