/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gusta
 */
public class ConexaoBanco
{

    public Connection getConexao() 
    {
        
        try        
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fidelizacao?useTimezone=true&serverTimezone=UTC&useSSL=false","root","7227234888Gg");
            System.out.println("Connectou");
            return con;
            
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new RuntimeException("Erro",ex);
        }
    }
    
}
