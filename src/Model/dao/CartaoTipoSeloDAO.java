/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Control.ClienteControl;
import Model.bean.CartaoTipoSeloBEAN;
import Model.bean.ClienteBEAN;
import java.util.List;

/**
 *
 * @author gusta
 */
public class CartaoTipoSeloDAO extends CartaoDAO
{

    public boolean criarCartaoTipoSelo(CartaoTipoSeloBEAN cartaoSeloBEAN)
    {
        ClienteControl clienteControl = new ClienteControl();
        //NumeroCartao, DataVencimento, IdCliente, IdFuncionario, IdEmpresa
        List<ClienteBEAN> cliente = clienteControl.buscarPorCpf(cartaoSeloBEAN.getCliente().getCpf());

        for(ClienteBEAN cli : cliente)
        {
            cartaoSeloBEAN.getCliente().setIdCliente(cli.getIdCliente());
        }

        boolean x;
        x = super.criarCartao(cartaoSeloBEAN);        
        if (x)
        {
            return super.inserir("INSERT INTO selo(NumeroCartao,Frequencia) values (?,?)", cartaoSeloBEAN.getNumeroCartao(), cartaoSeloBEAN.getQnt());
        } else
        {
            return false;
        }
    }
}
