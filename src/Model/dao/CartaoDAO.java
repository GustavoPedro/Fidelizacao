package Model.dao;

import Model.bean.CartaoBEAN;


public class CartaoDAO extends CRUD
{
   public boolean criarCartao(CartaoBEAN cartaoBEAN)
   {
    return super.inserir("INSERT INTO cartao (DataVencimento,IdCliente,IdFuncionario,IdEmpresa) values (?,?,?,?)",cartaoBEAN.getDataVencimento(),cartaoBEAN.getCliente().getIdCliente(),cartaoBEAN.getFuncionario().getIdFuncionario(),cartaoBEAN.getEmpresa().getIdEmpresa());
   }
}
