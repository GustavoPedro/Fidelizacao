package Model.dao;

import Control.ClienteControl;
import Model.bean.CartaoBEAN;
import Model.bean.ClienteBEAN;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CartaoDAO extends CRUD
{

    public int criarCartao(CartaoBEAN cartaoBEAN)
    {
        ClienteControl clienteControl = new ClienteControl();
        List<ClienteBEAN> cliente = clienteControl.buscarPorCpf(cartaoBEAN.getCliente().getCpf());

        for (ClienteBEAN cli : cliente)
        {
            cartaoBEAN.getCliente().setIdCliente(cli.getIdCliente());
        }

        boolean x = super.inserir("INSERT INTO cartao (DataVencimento,IdCliente,IdFuncionario,IdEmpresa) values (?,?,?,?)", cartaoBEAN.getDataVencimento(), cartaoBEAN.getCliente().getIdCliente(), cartaoBEAN.getFuncionario().getIdFuncionario(), cartaoBEAN.getEmpresa().getIdEmpresa());

        if (x)
        {
            return retornarIdInserido(cartaoBEAN.getCliente().getIdCliente());
        } else
        {
            return -1;
        }
    }

    private int retornarIdInserido(int idCliente)
    {
        try
        {
            CRUD crud = new CRUD();
            ResultSet res = crud.selecionar("select NumeroCartao FROM cartao where IdCliente = ?", idCliente);
            while (res.next())
            {
                return res.getInt("NumeroCartao");
            }
            return -1;
        } catch (SQLException ex)
        {
            return -1;
        }
    }

   
}
