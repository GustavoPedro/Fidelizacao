/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author gusta
 */
public enum EnumTipoCartao
{
    Selo(1),Valor(2);
    public int tipo;

    EnumTipoCartao(int tipo) {
        this.tipo = tipo;
    }
}
