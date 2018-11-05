/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.bean.CartaoTipoSeloBEAN;
import Model.bean.ClienteBEAN;
import Model.bean.EmpresaBEAN;
import Model.bean.FuncionarioBEAN;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class CartaoTipoSeloDAO extends CartaoDAO
{

    public boolean criarCartaoTipoSelo(CartaoTipoSeloBEAN cartaoSeloBEAN)
    {
        //NumeroCartao qnt        
        return super.inserir("INSERT INTO selo(NumeroCartao,Frequencia) values (?,?)", cartaoSeloBEAN.getNumeroCartao(), cartaoSeloBEAN.getQnt());
    }
    public List<CartaoTipoSeloBEAN> selecionarCartoes()
    {
        ResultSet res = null;
        List<CartaoTipoSeloBEAN> cartaoValor = new ArrayList();
        try
        {
            res = super.selecionar("select "
                    + "cartao.NumeroCartao,"
                    + "cartao.DataVencimento,"
                    + "cartao.IdCliente,"
                    + "empresa.idEmpresa,"
                    + "cartao.IdFuncionario,"
                    + "cliente.Nome as NomeCliente,"
                    + "funcionario.Nome as NomeFuncionario,"
                    + "selo.Frequencia "
                    + "from cartao "
                    + "inner join selo on cartao.NumeroCartao = selo.NumeroCartao "
                    + "inner join cliente on cartao.idCliente = cliente.idCliente "
                    + "inner join funcionario on cartao.idFuncionario = funcionario.idFuncionario "
                    + "inner join empresa on cartao.idEmpresa = empresa.idEmpresa", (Object[]) null);
            while (res.next())
            {
                //Objeto cliente
                ClienteBEAN cliente = new ClienteBEAN();
                cliente.setIdCliente(res.getInt("IdCliente"));
                cliente.setNome(res.getString("NomeCliente"));

                //Objeto funcionario
                FuncionarioBEAN funcionario = new FuncionarioBEAN();
                funcionario.setIdFuncionario(res.getInt("IdFuncionario"));
                funcionario.setNome(res.getString("NomeFuncionario"));

                //Objeto empresa
                EmpresaBEAN empresa = new EmpresaBEAN();
                empresa.setIdEmpresa(res.getInt("idEmpresa"));

                //Objeto Cartao Valor
                CartaoTipoSeloBEAN cartao = new CartaoTipoSeloBEAN();
                cartao.setCliente(cliente);
                cartao.setFuncionario(funcionario);
                cartao.setEmpresa(empresa);
                cartao.setDataVencimento(res.getString("DataVencimento"));
                cartao.setNumeroCartao(res.getInt("NumeroCartao"));
                cartao.setQnt(res.getInt("Frequencia"));
                
                //Adicionando na lista
                cartaoValor.add(cartao);
            }
            return cartaoValor;
        } catch (SQLException ex)
        {
            System.err.print(ex.toString());
            return null;
        }
    }
}
