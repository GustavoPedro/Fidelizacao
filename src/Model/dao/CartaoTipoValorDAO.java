/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.dao;

import Model.bean.CartaoTipoValorBEAN;

/**
 *
 * @author gusta
 */
public class CartaoTipoValorDAO extends CartaoDAO
{
    public boolean criarCartaoTipoValor(CartaoTipoValorBEAN cartaoValorBEAN)
    {
        //NumeroCartao qnt        
        return super.inserir("INSERT INTO valor(NumeroCartao,Valor) values (?,?)", cartaoValorBEAN.getNumeroCartao(), cartaoValorBEAN.getValor());
    }
}
