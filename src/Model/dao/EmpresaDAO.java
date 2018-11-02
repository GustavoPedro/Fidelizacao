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
public class EmpresaDAO extends CRUD
{


    public EmpresaDAO()
    {

    }

    //Pega o numero do id da empresa para a criação do cartão
    public EmpresaBEAN selecionarEmpresa()
    {
        // idEmpresa, RazaoSocial, CNPJ, Telefone, Tipo_Cartao        
        ResultSet res = null;
        EmpresaBEAN empresaBEAN = null;
        try
        {
            res = super.selecionar("select*from Empresa", (Object[]) null);
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
            ConexaoBanco.closeConnection(getConnection(), getStatement(), res);
        }
    }

    public boolean inserirEmpresa(EmpresaBEAN empresa)
    {
        // idEmpresa, RazaoSocial, CNPJ, Telefone, Tipo_Cartao        
        return super.inserir("INSERT INTO Empresa(RazaoSocial,CNPJ,Telefone,Tipo_Cartao) values(?,?,?,?)",
                empresa.getRazaoSocial(),
                empresa.getCNPJ(),
                empresa.getTelefone(),
                empresa.getTipoCartao());
    }

    public boolean alterarEmpresa(EmpresaBEAN empresa)
    {
        // idEmpresa, RazaoSocial, CNPJ, Telefone, Tipo_Cartao
        return super.alterar("UPDATE empresa SET RazaoSocial = ?, CNPJ = ?,Telefone = ?, Tipo_Cartao = ? where idEmpresa = ?", empresa.getIdEmpresa(),
                empresa.getRazaoSocial(),
                empresa.getCNPJ(),
                empresa.getTelefone(),
                empresa.getTipoCartao());
    }

}
