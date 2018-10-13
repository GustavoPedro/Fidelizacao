/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author gusta
 */
public class ConexaoBanco
{

    public static Connection getConexao()
    {

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fidelizacao?useTimezone=true&serverTimezone=UTC&useSSL=false", "root", "7227234888Gg");
            System.out.println("Connectou");
            return con;

        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new RuntimeException("Erro", ex);
        }
    }

    public static void closeConection(Connection con)
    {
        if (con != null)
        {
            try
            {
                con.close();

            } catch (SQLException ex)
            {
                throw new RuntimeException("Erro", ex);
            }
        }
    }

    public static void closeConection(Connection con, PreparedStatement stmt)
    {
        if (stmt != null)
        {
            try
            {
                stmt.close();

            } catch (SQLException ex)
            {
                throw new RuntimeException("Erro", ex);
            }
        }
        closeConection(con);
    }
    public static void closeConection(Connection con, PreparedStatement stmt,ResultSet res)
    {
        if (res != null)
        {
            try
            {
                res.close();

            } catch (SQLException ex)
            {
                throw new RuntimeException("Erro", ex);
            }
        }
        closeConection(con,stmt);
    }

}
