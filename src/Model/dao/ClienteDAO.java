/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Connection.ConexaoBanco;
import Model.bean.ClienteBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
            ConexaoBanco.closeConection(con, stmt);
        }
    }

}
