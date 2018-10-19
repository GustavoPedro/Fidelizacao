/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Connection.ConexaoBanco;
import Model.bean.FuncionarioBEAN;
import Model.bean.FuncionarioSessaoBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gusta
 */
public class FuncionarioDAO
{

    private Connection con = null;

    public FuncionarioDAO()
    {
        this.con = ConexaoBanco.getConexao();
    }

    public boolean inserirFuncionario(FuncionarioBEAN funcionario)
    {
        //idCliente, Nome, Cpf, Telefone, DataNasc
        String sql = "";

        PreparedStatement stmt = null;

        try
        {
            stmt = con.prepareStatement(sql);
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

    public boolean loginFuncionario(FuncionarioBEAN funcionario)
    {
        String sql = "select nome from funcionario where Login = ? and Senha = ?";
        PreparedStatement stmt = null;
        ResultSet res = null;
        try
        {
            // create the java statement
            stmt = con.prepareStatement(sql);
            stmt.setString(1, funcionario.getLogin());
            stmt.setString(2, funcionario.getSenha());
            res = stmt.executeQuery();            
            while (res.next())
            {
                FuncionarioSessaoBEAN.setNome(res.getString("Nome"));
                return true;
            }
            return false;
        } catch (SQLException ex)
        {
            System.err.println(ex.toString());
            return false;
        } finally
        {
            ConexaoBanco.closeConnection(con, stmt, res);
        }
    }
}
