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
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gusta
 */
public class FuncionarioDAO extends CRUD
{

    public FuncionarioDAO()
    {

    }

    //Insere funcionario no banco de dados
    public boolean inserirFuncionario(FuncionarioBEAN funcionario)
    {
        return super.inserir("INSERT INTO funcionario(Nome,Empresa_idEmpresa,Login,Senha) values(?,?,?,?)",
                funcionario.getNome(),
                funcionario.getEmpresa().getIdEmpresa(),
                funcionario.getLogin(),
                funcionario.getSenha()
        );

    }
    
    public boolean login(FuncionarioBEAN funcionario)
    {
        ResultSet res = null;
        try
        {
           res = super.selecionar("select idFuncionario,nome from funcionario where Login = ? and Senha = ?", funcionario.getLogin(),funcionario.getSenha());
            while (res.next())
            {
                //idFuncionario, Nome, Empresa_idEmpresa, Login, Senha
                FuncionarioSessaoBEAN.setNome(res.getString("Nome"));
                FuncionarioSessaoBEAN.setIdFuncionario(res.getInt("idFuncionario"));                
            }
            return true;
        } catch (SQLException ex)
        {
           return false;
        }
        finally
        {
            ConexaoBanco.closeConnection(getConnection(), getStatement(), res);
        }
    }
    
    public List<FuncionarioBEAN> selecionarFuncionarios()
    {
        ResultSet res = null;
        try
        {
            List<FuncionarioBEAN>funcionariosList = new ArrayList();
            res = super.selecionar("select * from fidelizacao.funcionario inner join fidelizacao.empresa on fidelizacao.empresa.idEmpresa = fidelizacao.funcionario.Empresa_idEmpresa", (Object[]) null);
            
            while (res.next())
            {
                FuncionarioBEAN funcionarioBEAN = new FuncionarioBEAN();
                EmpresaBEAN empresaBEAN = new EmpresaBEAN();

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
            return null;
        }
        finally
        {
            ConexaoBanco.closeConnection(getConnection(),getStatement(),res);
        }
    }

    public boolean alterarFuncionario(FuncionarioBEAN funcionario)
    {
        //idFuncionario, Nome, Empresa_idEmpresa, Login, Senha
        return super.alterar(
                "UPDATE funcionario SET Nome = ?, Empresa_idEmpresa = ?, Login = ?, Senha = ? WHERE idFuncionario = ? ",
                funcionario.getIdFuncionario(),
                funcionario.getNome(),
                funcionario.getEmpresa().getIdEmpresa(),
                funcionario.getLogin(),
                funcionario.getSenha()
        );
    }

    public boolean deletarFuncionario(FuncionarioBEAN funcionario)
    {
        return super.deletar("DELETE FROM funcionario WHERE idFuncionario = ?", funcionario.getIdFuncionario());
    }    
    
    public List<FuncionarioBEAN> selecionarFuncionariosPorNome(String nome)
    {
         ResultSet res = null;
        try
        {
            List<FuncionarioBEAN>funcionariosList = new ArrayList();
            res = super.selecionar("select * from fidelizacao.funcionario inner join fidelizacao.empresa on fidelizacao.empresa.idEmpresa = fidelizacao.funcionario.Empresa_idEmpresa where Nome like concat('%',?,'%')",nome);
            
            while (res.next())
            {
                FuncionarioBEAN funcionarioBEAN = new FuncionarioBEAN();
                EmpresaBEAN empresaBEAN = new EmpresaBEAN();

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
            return null;
        }
        finally
        {
            ConexaoBanco.closeConnection(getConnection(),getStatement(),res);
        }
    }
}
