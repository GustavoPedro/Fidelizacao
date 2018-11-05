/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.bean.CartaoTipoValorBEAN;
import Model.dao.CartaoTipoValorDAO;

/**
 *
 * @author gusta
 */
public class CartaoValorControl extends CartaoControl
{
    public boolean inserirCartaoValor(CartaoTipoValorBEAN cartaoValorBEAN)
    {        
        int numeroCartao = super.criarCartao(cartaoValorBEAN);
        
        CartaoTipoValorDAO cartaoDAO = new CartaoTipoValorDAO();
        cartaoValorBEAN.setNumeroCartao(numeroCartao);
        return cartaoDAO.criarCartaoTipoValor(cartaoValorBEAN);
    }
}
