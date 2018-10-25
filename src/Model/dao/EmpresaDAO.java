/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Connection.ConexaoBanco;
import Model.bean.EmpresaBEAN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author gusta
 */
public class EmpresaDAO
{

    Connection con = null;

    public EmpresaDAO()
    {
        con = ConexaoBanco.getConexao();
    }

    //Pega o numero do id da empresa para a criação do cartão
    public int getIdEmpresa()
    {
        String sql = "select idEmpresa from Empresa";
        PreparedStatement stmt = null;
        ResultSet res = null;
        
        try
        {
            // create the java statement
            stmt = con.prepareStatement(sql);
            res = stmt.executeQuery();
            
            while (res.next())
            {            
                return res.getInt("idEmpresa");
            }
            return 0;
        } catch (SQLException ex)
        {
            System.err.println(ex.toString());
            return 0;
        } finally
        {
            ConexaoBanco.closeConnection(con, stmt, res);
        }
    }
    public boolean inserirEmpresa(EmpresaBEAN empresa)
    {
       // idEmpresa, RazaoSocial, CNPJ, Telefone, Tipo_Cartao
        String sql = "INSERT INTO Empresa(RazaoSocial,CNPJ,Telefone,Tipo_Cartao) values(?,?,?,?)";

        PreparedStatement stmt = null;
        
        try
        {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, empresa.getRazaoSocial());
            stmt.setString(2, empresa.getCNPJ());
            stmt.setString(3, empresa.getTelefone());
            stmt.setInt(4, empresa.getTipo_Cartao());
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

}
