/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Connection.ConexaoBanco;
import Control.DataConversoes;
import Model.bean.ClienteBEAN;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ClienteDAO extends CRUD
{

    public ClienteDAO()
    {

    }

    public boolean inserirCliente(ClienteBEAN cliente)
    {
        //idCliente, Nome, Cpf, Telefone, DataNasc
        return super.inserir("INSERT INTO cliente(Nome,Cpf,Telefone,DataNasc) values(?,?,?,?)", cliente.getNome(), cliente.getCpf(), cliente.getTelefone(), cliente.getDataNasc());
    }

    public boolean atualizarCliente(ClienteBEAN cliente)
    {
        //idCliente, Nome, Cpf, Telefone, DataNasc
        return super.alterar("UPDATE cliente SET Nome = ? , Cpf = ?, Telefone = ?, DataNasc = ? WHERE idCliente = ?", cliente.getIdCliente(), cliente.getNome(), cliente.getCpf(), cliente.getTelefone(), cliente.getDataNasc());
    }

    public List<ClienteBEAN> buscarClientes()
    {

        ResultSet res = null;
        List<ClienteBEAN> clientesList = new ArrayList();

        try
        {
            res = super.selecionar("select * from cliente", (Object[]) null);

            while (res.next())
            {
                ClienteBEAN cliente = new ClienteBEAN();
                cliente.setIdCliente(res.getInt("idCliente"));
                cliente.setNome(res.getString("Nome"));
                cliente.setCpf(res.getString("Cpf"));
                cliente.setTelefone(res.getString("Telefone"));
                cliente.setDataNasc(DataConversoes.reverterData(res.getString("DataNasc")));
                clientesList.add(cliente);
            }
            return clientesList;
        } catch (SQLException ex)
        {
            return null;
        } finally
        {
            ConexaoBanco.closeConnection(getConnection(), getStatement(), res);
        }
    }

    public List<ClienteBEAN> buscarPorCpf(String cpf)
    {
        List<ClienteBEAN> clientesList = new ArrayList<>();
        ResultSet res = null;

        try
        {
            res = super.selecionar("select * from fidelizacao.cliente where Cpf like concat(\"%\",?,\"%\")", cpf);

            while (res.next())
            {
                ClienteBEAN cliente = new ClienteBEAN();
                cliente.setIdCliente(res.getInt("idCliente"));
                cliente.setNome(res.getString("Nome"));
                cliente.setCpf(res.getString("Cpf"));
                cliente.setTelefone(res.getString("Telefone"));
                cliente.setDataNasc(DataConversoes.reverterData(res.getString("DataNasc")));
                clientesList.add(cliente);
            }
            return clientesList;
        } catch (SQLException ex)
        {
            System.err.println(ex.toString());
            return null;
        } finally
        {
            ConexaoBanco.closeConnection(getConnection(), getStatement(), res);
        }
    }

    public List<ClienteBEAN> buscarPorNome(String nome)
    {
        List<ClienteBEAN> clientesList = new ArrayList<>();
        ResultSet res = null;

        try
        {
            res = super.selecionar("select * from fidelizacao.cliente where Nome like concat(\"%\",?,\"%\")", nome);

            while (res.next())
            {
                ClienteBEAN cliente = new ClienteBEAN();
                cliente.setIdCliente(res.getInt("idCliente"));
                cliente.setNome(res.getString("Nome"));
                cliente.setCpf(res.getString("Cpf"));
                cliente.setTelefone(res.getString("Telefone"));
                cliente.setDataNasc(DataConversoes.reverterData(res.getString("DataNasc")));
                clientesList.add(cliente);
            }
            return clientesList;
        } catch (SQLException ex)
        {
            System.err.println(ex.toString());
            return null;
        } finally
        {
            ConexaoBanco.closeConnection(getConnection(), getStatement(), res);
        }
    }
}
