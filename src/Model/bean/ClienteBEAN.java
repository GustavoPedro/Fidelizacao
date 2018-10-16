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
public class ClienteBEAN
{

    private String nome;
    private String cpf;
    private String telefone;
    private String dataNasc;

    public ClienteBEAN(String nome, String cpf, String telefone, String dataNasc)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone)
    {
        this.telefone = telefone;
    }

    public void setDataNasc(String dataNasc)
    {
        this.dataNasc = dataNasc;
    }

    public String getNome()
    {
        return nome;
    }

    public String getCpf()
    {
        return cpf;
    }

    public String getTelefone()
    {
        return telefone;
    }

    public String getDataNasc()
    {    
        return dataNasc;
    }

}
