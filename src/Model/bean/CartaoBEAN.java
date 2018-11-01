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
public class CartaoBEAN
{

    //NumeroCartao, DataVencimento, IdCliente, IdFuncionario, IdEmpresa
    protected int numeroCartao;
    protected String dataVencimento;
    protected ClienteBEAN cliente;
    protected FuncionarioBEAN funcionario;
    protected EmpresaBEAN empresa;

    public CartaoBEAN(String dataVencimento, ClienteBEAN cliente, FuncionarioBEAN funcionario, EmpresaBEAN empresa)
    {
        
        this.dataVencimento = dataVencimento;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.empresa = empresa;
    }

    public int getNumeroCartao()
    {
        return numeroCartao;
    }

    public void setNumeroCartao(int numeroCartao)
    {
        this.numeroCartao = numeroCartao;
    }

    public String getDataVencimento()
    {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento)
    {
        this.dataVencimento = dataVencimento;
    }

    public ClienteBEAN getCliente()
    {
        return cliente;
    }

    public void setCliente(ClienteBEAN cliente)
    {
        this.cliente = cliente;
    }

    public FuncionarioBEAN getFuncionario()
    {
        return funcionario;
    }

    public void setFuncionario(FuncionarioBEAN funcionario)
    {
        this.funcionario = funcionario;
    }

    public EmpresaBEAN getEmpresa()
    {
        return empresa;
    }

    public void setEmpresa(EmpresaBEAN empresa)
    {
        this.empresa = empresa;
    }

}
