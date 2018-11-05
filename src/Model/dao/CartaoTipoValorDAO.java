/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;


import Model.bean.CartaoTipoValorBEAN;
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
public class CartaoTipoValorDAO extends CartaoDAO
{

    public boolean criarCartaoTipoValor(CartaoTipoValorBEAN cartaoValorBEAN)
    {
        //NumeroCartao qnt        
        return super.inserir("INSERT INTO valor(NumeroCartao,Valor) values (?,?)", cartaoValorBEAN.getNumeroCartao(), cartaoValorBEAN.getValor());
    }

    public List<CartaoTipoValorBEAN> selecionarCartoes()
    {
        ResultSet res = null;
        List<CartaoTipoValorBEAN> cartaoValor = new ArrayList();
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
                    + "valor.Valor "
                    + "from cartao "
                    + "inner join valor on cartao.NumeroCartao = valor.NumeroCartao "
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
                CartaoTipoValorBEAN cartao = new CartaoTipoValorBEAN();
                cartao.setCliente(cliente);
                cartao.setFuncionario(funcionario);
                cartao.setEmpresa(empresa);
                cartao.setDataVencimento(res.getString("DataVencimento"));
                cartao.setNumeroCartao(res.getInt("NumeroCartao"));
                cartao.setValor(res.getDouble("Valor"));
                
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
