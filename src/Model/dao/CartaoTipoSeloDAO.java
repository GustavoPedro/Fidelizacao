/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.bean.CartaoTipoSeloBEAN;

/**
 *
 * @author gusta
 */
public class CartaoTipoSeloDAO extends CartaoDAO
{
     public boolean criarCartaoTipoSelo(CartaoTipoSeloBEAN cartaoSeloBEAN)
    {
        //NumeroCartao, DataVencimento, IdCliente, IdFuncionario, IdEmpresa
        boolean x;        
        x = super.criarCartao(cartaoSeloBEAN);
        if (x)
        {
            return super.inserir("INSERT INTO selo(NumeroCartao,Frequencia) values (?,?)",cartaoSeloBEAN.getNumeroCartao(),cartaoSeloBEAN.getQnt());
        }
        else
        {
            return false;
        }
    }    
}
