/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Connection.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 31825961
 */
public abstract class CRUD
{

    private Connection connection = null;

    protected CRUD()
    {
        this.connection = ConexaoBanco.getConexao();
    }

    protected Connection getConnection()
    {
        return connection;
    }

    protected boolean inserir(String insertSql, Object... parametros)
    {
        PreparedStatement pstmt = null;
        try
        {
            pstmt = connection.prepareStatement(insertSql);
            for (int i = 0; i < parametros.length; i++)
            {
                pstmt.setObject(i + 1, parametros[i]);
            }
            pstmt.execute();
            return true;
        } catch (SQLException ex)
        {
            return false;
        } finally
        {
            ConexaoBanco.closeConnection(connection, pstmt);
        }
    }

    protected boolean alterar(String updateSql, Object id, Object... parametros)
    {
        PreparedStatement pstmt = null;
        try
        {
            pstmt = connection.prepareStatement(updateSql);
            for (int i = 0; i < parametros.length; i++)
            {
                pstmt.setObject(i + 1, parametros[i]);
            }
            pstmt.setObject(parametros.length + 1, id);
            pstmt.execute();
            return true;
        } catch (SQLException ex)
        {
            return false;
        } finally
        {
            ConexaoBanco.closeConnection(connection, pstmt);
        }
    }

    protected boolean deletar(String deleteSql, Object... parametros)
    {
        PreparedStatement pstmt = null;
        try
        {
            pstmt = connection.prepareStatement(deleteSql);
            for (int i = 0; i < parametros.length; i++)
            {
                pstmt.setObject(i + 1, parametros[i]);
            }
            pstmt.execute();
            return true;
        } catch (SQLException ex)
        {
            return false;
        } finally
        {
            ConexaoBanco.closeConnection(connection, pstmt);
        }
    }
}
