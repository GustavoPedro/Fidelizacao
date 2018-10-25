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
    private EmpresaBEAN empresa;
    private String login;
    private String senha;

    public FuncionarioBEAN(String nome, EmpresaBEAN empresa, String login, String senha)
    {
        this.nome = nome;
        this.empresa = empresa;
        this.login = login;
        this.senha = senha;
    }   

    public FuncionarioBEAN()
    {

    }

    public EmpresaBEAN getEmpresa()
    {
        return empresa;
    }

    public void setEmpresa(EmpresaBEAN empresa)
    {
        this.empresa = empresa;
    }

    public void setIdFuncionario(int idFuncionario)
    {
        this.idFuncionario = idFuncionario;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
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
    public String getLogin()
    {
        return login;
    }

    public String getSenha()
    {
        return senha;
    }

}
