package View;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 31825961
 */
public enum CRUD {
    Cadastrar(1),Alterar(2);
    public int valor;

    CRUD(int valor) {
        this.valor = valor;
    }
}