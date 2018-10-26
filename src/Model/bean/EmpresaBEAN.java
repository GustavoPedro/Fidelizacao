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
public class EmpresaBEAN
{
    private int idEmpresa;
    private String razaoSocial;
    private String cnpj;
    private String telefone;
    private String tipoCartao;

    public EmpresaBEAN(String razaoSocial, String cnpj, String telefone, String tipoCartao) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.tipoCartao = tipoCartao;
    }

    public EmpresaBEAN()
    {
        
    }

    public int getIdEmpresa()
    {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa)
    {
        this.idEmpresa = idEmpresa;
    }
    

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipoCartao() {
    return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }
    
}
