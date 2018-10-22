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

/**
 *
 * @author 31825961
 */
public abstract class CRUD
{

    private Connection connection;

    protected CRUD()
    {
        this.connection = ConexaoBanco.getConexao();
    }

    protected Connection getConnection()
    {
        return connection;
    }

    protected void save(String insertSql, Object... parametros) throws SQLException
    {
        PreparedStatement pstmt = getConnection().prepareStatement(insertSql);

        for (int i = 0; i < parametros.length; i++)
        {
            pstmt.setObject(i + 1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
        connection.close();
    }

    protected void update(String updateSql, Object id, Object... parametros) throws SQLException
    {
        PreparedStatement pstmt = getConnection().prepareStatement(updateSql);

        for (int i = 0; i < parametros.length; i++)
        {
            pstmt.setObject(i + 1, parametros[i]);
        }
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
        connection.close();
    }

    protected void delete(String deleteSql, Object... parametros) throws SQLException
    {
        PreparedStatement pstmt = getConnection().prepareStatement(deleteSql);

        for (int i = 0; i < parametros.length; i++)
        {
            pstmt.setObject(i + 1, parametros[i]);
        }

        pstmt.execute();
        pstmt.close();
        connection.close();
    }
}
