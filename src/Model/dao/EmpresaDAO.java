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
    public EmpresaBEAN selecionarEmpresa()
    {
        // idEmpresa, RazaoSocial, CNPJ, Telefone, Tipo_Cartao
        String sql = "select*from Empresa";
        PreparedStatement stmt = null;
        ResultSet res = null;
        EmpresaBEAN empresaBEAN = null;
        try
        {
            // create the java statement
            stmt = con.prepareStatement(sql);
            res = stmt.executeQuery();

            while (res.next())
            {
                empresaBEAN = new EmpresaBEAN();
                empresaBEAN.setIdEmpresa(res.getInt("idEmpresa"));
                empresaBEAN.setRazaoSocial(res.getString("RazaoSocial"));
                empresaBEAN.setCNPJ(res.getString("CNPJ"));
                empresaBEAN.setTelefone(res.getString("Telefone"));
                empresaBEAN.setTipoCartao(res.getString("Tipo_Cartao"));
            }
            return empresaBEAN;
        } catch (SQLException ex)
        {
            System.err.println(ex.toString());
            return null;
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
            stmt.setString(4, empresa.getTipoCartao());
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

    public boolean alterarEmpresa(EmpresaBEAN empresa)
    {
        // idEmpresa, RazaoSocial, CNPJ, Telefone, Tipo_Cartao
        String sql = "UPDATE empresa SET RazaoSocial = ?, CNPJ = ?,Telefone = ?, Tipo_Cartao = ? where idEmpresa = ?";

        PreparedStatement stmt = null;

        try
        {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, empresa.getRazaoSocial());
            stmt.setString(2, empresa.getCNPJ());
            stmt.setString(3, empresa.getTelefone());
            stmt.setString(4, empresa.getTipoCartao());
            stmt.setInt(5, empresa.getIdEmpresa());
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
