/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Connection.ConexaoBanco;
import Control.DataConversoes;
import Model.bean.ClienteBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ClienteDAO
{

    private Connection con = null;

    public ClienteDAO()
    {
        this.con = ConexaoBanco.getConexao();
    }

    public boolean inserirCliente(ClienteBEAN cliente)
    {
        //idCliente, Nome, Cpf, Telefone, DataNasc
        String sql = "INSERT INTO cliente(Nome,Cpf,Telefone,DataNasc) values(?,?,?,?)";

        PreparedStatement stmt = null;

        try
        {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getDataNasc());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex)
        {
            System.err.println(ex.toString());
            return false;
        } finally
        {
            ConexaoBanco.closeConnection(con, stmt);
        }
    }

    public boolean atualizarCliente(ClienteBEAN cliente)
    {
        //idCliente, Nome, Cpf, Telefone, DataNasc
        String sql = "UPDATE cliente SET Nome = ? , Cpf = ?, Telefone = ?, DataNasc = ? WHERE idCliente = ?";

        PreparedStatement stmt = null;

        try
        {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getDataNasc());
            stmt.setInt(5, cliente.getIdCliente());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex)
        {
            System.err.println(ex.toString());
            return false;
        } finally
        {
            ConexaoBanco.closeConnection(con, stmt);
        }
    }

    public List<ClienteBEAN> buscarClientes()
    {
        List<ClienteBEAN> clientesList = new ArrayList<>();
        String sql = "select * from cliente";
        PreparedStatement stmt = null;
        ResultSet res = null;
        try
        {
            // create the java statement
            stmt = con.prepareStatement(sql);
            res = stmt.executeQuery();
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
            ConexaoBanco.closeConnection(con, stmt, res);
        }
    }

    public List<ClienteBEAN> buscarPorCpf(String cpf)
    {
        List<ClienteBEAN> clientesList = new ArrayList<>();
        String sql = "select * from fidelizacao.cliente where Cpf like concat(\"%\",?,\"%\")";
        PreparedStatement stmt = null;
        ResultSet res = null;
        try
        {
            // create the java statement            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, cpf);
            res = stmt.executeQuery();
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
            ConexaoBanco.closeConnection(con, stmt, res);
        }
    }

    public List<ClienteBEAN> buscarPorNome(String nome)
    {
        List<ClienteBEAN> clientesList = new ArrayList<>();
        String sql = "select * from fidelizacao.cliente where Nome like concat(\"%\",?,\"%\")";
        PreparedStatement stmt = null;
        ResultSet res = null;
        try
        {
            // create the java statement
            
            stmt = con.prepareStatement(sql);
            stmt.setString(1, nome);
            res = stmt.executeQuery();
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
            ConexaoBanco.closeConnection(con, stmt, res);
        }
    }
}
