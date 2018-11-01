package Model.bean;

public class CartaoTipoValorBEAN extends CartaoBEAN
{

    private double valor;
    
    public CartaoTipoValorBEAN(String dataVencimento, ClienteBEAN cliente, FuncionarioBEAN funcionario, EmpresaBEAN empresa,double valor)
    {
        super(dataVencimento, cliente, funcionario, empresa);
        this.valor = valor;
    }
      
}
