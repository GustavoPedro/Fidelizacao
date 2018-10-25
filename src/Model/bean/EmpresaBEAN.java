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
    private String RazaoSocial;
    private String CNPJ;
    private String Telefone;
    private int Tipo_Cartao;

    public EmpresaBEAN(String RazaoSocial, String CNPJ, String Telefone, int Tipo_Cartao) {
        this.RazaoSocial = RazaoSocial;
        this.CNPJ = CNPJ;
        this.Telefone = Telefone;
        this.Tipo_Cartao=Tipo_Cartao;
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public int getTipo_Cartao() {
    return Tipo_Cartao;
    }

    public void setTipo_Cartao(int Tipo_Cartao) {
        this.Tipo_Cartao = Tipo_Cartao;
    }
    
}
