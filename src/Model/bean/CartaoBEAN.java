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
    private int numeroCartao;
    private String dataVencimento;
    private int idCliente;
    private int idFuncionario;
    private int idEmpresa;

    public CartaoBEAN(int numeroCartao, String dataVencimento, int idCliente, int idFuncionario, int idEmpresa)
    {
        this.numeroCartao = numeroCartao;
        this.dataVencimento = dataVencimento;
        this.idCliente = idCliente;
        this.idFuncionario = idFuncionario;
        this.idEmpresa = idEmpresa;
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

    public int getIdCliente()
    {
        return idCliente;
    }

    public void setIdCliente(int idCliente)
    {
        this.idCliente = idCliente;
    }

    public int getIdFuncionario()
    {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario)
    {
        this.idFuncionario = idFuncionario;
    }

    public int getIdEmpresa()
    {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa)
    {
        this.idEmpresa = idEmpresa;
    }
    
    
}
