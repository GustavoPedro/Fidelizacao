/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.bean.FuncionarioBEAN;
import Model.dao.FuncionarioDAO;

/**
 *
 * @author gusta
 */
public class FuncionarioControl
{

    public boolean login(FuncionarioBEAN funcionario)
    {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.loginFuncionario(funcionario);
    }
}
