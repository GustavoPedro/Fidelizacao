/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.bean;

/**
 *
 * @author gusta
 */
public class FuncionarioSessaoBEAN
{

    private static String nome;
    private static int idFuncionario;

    public static String getNome()
    {
        return nome;
    }

    public static void setNome(String Nome)
    {
        nome = Nome;
    }

    public static int getIdFuncionario()
    {
        return idFuncionario;
    }

    public static void setIdFuncionario(int idFuncionario)
    {
        FuncionarioSessaoBEAN.idFuncionario = idFuncionario;
    }
    
}
