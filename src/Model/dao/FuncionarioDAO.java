/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Connection.ConexaoBanco;
import Model.bean.EmpresaBEAN;
import Model.bean.FuncionarioBEAN;
import Model.bean.FuncionarioSessaoBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    //Insere funcionario no banco de dados
    public boolean inserirFuncionario(FuncionarioBEAN funcionario)
    {
        //idFuncionario, Nome, Empresa_idEmpresa, Login, Senha
        String sql = "INSERT INTO funcionario(Nome,Empresa_idEmpresa,Login,Senha) values(?,?,?,?)";
        PreparedStatement stmt = null;

        try
        {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setInt(2, funcionario.getEmpresa().getIdEmpresa());
            stmt.setString(3, funcionario.getLogin());
            stmt.setString(4, funcionario.getSenha());
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

    // Executa o login do funcionario e configura o nome e o id do funcionario para o uso durante o programa
    public boolean loginFuncionario(FuncionarioBEAN funcionario)
    {
        String sql = "select idFuncionario,nome from funcionario where Login = ? and Senha = ?";
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
                //idFuncionario, Nome, Empresa_idEmpresa, Login, Senha
                FuncionarioSessaoBEAN.setNome(res.getString("Nome"));
                FuncionarioSessaoBEAN.setIdFuncionario(res.getInt("idFuncionario"));
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

    public List<FuncionarioBEAN> selecionarFuncionarios()
    {
        String sql = "select * from fidelizacao.funcionario inner join fidelizacao.empresa on fidelizacao.empresa.idEmpresa = fidelizacao.funcionario.Empresa_idEmpresa";

        List<FuncionarioBEAN> funcionariosList = new ArrayList();
        FuncionarioBEAN funcionarioBEAN = new FuncionarioBEAN();
        EmpresaBEAN empresaBEAN = new EmpresaBEAN();
        PreparedStatement stmt = null;
        ResultSet res = null;

        try
        {
            // create the java statement
            stmt = con.prepareStatement(sql);
            res = stmt.executeQuery();
            while (res.next())
            {
                //idFuncionario, Nome, Empresa_idEmpresa, Login, Senha, idEmpresa, RazaoSocial, CNPJ, Telefone, Tipo_Cartao
                funcionarioBEAN.setIdFuncionario(res.getInt("idFuncionario"));
                funcionarioBEAN.setNome(res.getString("Nome"));
                funcionarioBEAN.setLogin(res.getString("Login"));
                funcionarioBEAN.setSenha(res.getString("Senha"));
                //Populando o objeto empresa referente ao funcionario
                empresaBEAN.setIdEmpresa(res.getInt("idEmpresa"));
                empresaBEAN.setRazaoSocial(res.getString("RazaoSocial"));
                empresaBEAN.setCNPJ(res.getString("CNPJ"));
                empresaBEAN.setTelefone(res.getString("Telefone"));
                empresaBEAN.setTipoCartao(res.getString("Tipo_Cartao"));
                //Adicionando no objeto funcionario
                funcionarioBEAN.setEmpresa(empresaBEAN);
                //Adicionando na lista
                funcionariosList.add(funcionarioBEAN);
            }
            return funcionariosList;
        } catch (SQLException ex)
        {
            System.err.println(ex.toString());
            return null;
        } finally
        {
            ConexaoBanco.closeConnection(con, stmt, res);
        }
    }
}
