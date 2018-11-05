/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.bean.CartaoTipoSeloBEAN;
import Model.dao.CartaoTipoSeloDAO;
import java.util.List;

/**
 *
 * @author gusta
 */
public class CartaoSeloControl extends CartaoControl
{
    public boolean inserirCartaoSelo(CartaoTipoSeloBEAN cartaoSeloBEAN)
    {        
        int numeroCartao = super.criarCartao(cartaoSeloBEAN);
        
        CartaoTipoSeloDAO cartaoDAO = new CartaoTipoSeloDAO();
        cartaoSeloBEAN.setNumeroCartao(numeroCartao);
        return cartaoDAO.criarCartaoTipoSelo(cartaoSeloBEAN);
    }
    public List<CartaoTipoSeloBEAN> buscarCartoes()
    {
        CartaoTipoSeloDAO cartaoDAO = new CartaoTipoSeloDAO();
        return cartaoDAO.selecionarCartoes();
    }
}
