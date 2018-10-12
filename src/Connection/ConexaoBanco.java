/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gusta
 */
public class ConexaoBanco
{

    public Connection getConexao() throws ClassNotFoundException, SQLException
    {
        
        Class.forName("com.mysql.cj.jdbc.Driver");        
        DriverManager.getConnection("jdbc:mysql://localhost:3306/fidelizacao?useTimezone=true&serverTimezone=UTC&useSSL=false","root","7227234888Gg");
        System.out.println("Connectou");
        return null;
        
    }
    
}
