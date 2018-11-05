/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.bean.CartaoBEAN;
import Model.dao.CartaoDAO;

/**
 *
 * @author gusta
 */
public class CartaoControl
{
    public int criarCartao(CartaoBEAN cartaoBEAN)
    {
        CartaoDAO cartao = new CartaoDAO();
        return  cartao.criarCartao(cartaoBEAN);
    }
}
