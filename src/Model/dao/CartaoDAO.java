package Model.dao;

import Model.bean.CartaoBEAN;
import Model.bean.CartaoTipoSeloBEAN;

public class CartaoDAO extends CRUD
{
   public boolean criarCartao(CartaoBEAN cartaoBEAN)
   {
    return super.inserir("INSERT INTO cartao (DataVencimento,IdCliente,IdFuncionario,IdEmpresa) values (?,?,?,?)",cartaoBEAN.getDataVencimento(),cartaoBEAN.getCliente().getIdCliente(),cartaoBEAN.getFuncionario().getIdFuncionario(),cartaoBEAN.getEmpresa().getIdEmpresa());
   }
}
