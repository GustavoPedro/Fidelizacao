/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.bean.CartaoTipoSeloBEAN;
import Model.dao.CartaoTipoSeloDAO;

/**
 *
 * @author gusta
 */
public class CartaoSeloControl
{
 public boolean inserirCartaoSelo(CartaoTipoSeloBEAN cartaoSeloBEAN)
 {
     CartaoTipoSeloDAO cartaoDAO = new CartaoTipoSeloDAO();
     return cartaoDAO.criarCartaoTipoSelo(cartaoSeloBEAN);
 }   
}
