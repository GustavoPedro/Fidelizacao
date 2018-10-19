/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 *
 * @author gusta
 */
public class FuncionarioBEAN
{
    //idFuncionario, Nome, Empresa_idEmpresa, Login, Senha
    
    private int idFuncionario;
    private String nome;
     private int idEmpresa;
    private String login;
    private String senha;
    
    public FuncionarioBEAN()
    {
        
    }

    public void setIdFuncionario(int idFuncionario)
    {
        this.idFuncionario = idFuncionario;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setIdEmpresa(int idEmpresa)
    {
        this.idEmpresa = idEmpresa;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public void setSenha(String senha)
    {
        this.senha = senha;
    }

    public int getIdFuncionario()
    {
        return idFuncionario;
    }

    public String getNome()
    {
        return nome;
    }

    public int getIdEmpresa()
    {
        return idEmpresa;
    }

    public String getLogin()
    {
        return login;
    }

    public String getSenha()
    {
        return senha;
    }

    public FuncionarioBEAN(int idFuncionario, String nome, int idEmpresa, String login, String senha)
    {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.idEmpresa = idEmpresa;
        this.login = login;
        this.senha = senha;
    }
   
}
