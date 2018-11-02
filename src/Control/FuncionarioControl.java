/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.bean.FuncionarioBEAN;
import Model.dao.FuncionarioDAO;
import java.util.List;

/**
 *
 * @author gusta
 */
public class FuncionarioControl
{

    public boolean login(FuncionarioBEAN funcionario)
    {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.login(funcionario);
    }
    public List<FuncionarioBEAN>selecionarFuncionariosPorNome(String nome)
    {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.selecionarFuncionariosPorNome(nome);
    }

    public boolean inserirFuncionario(FuncionarioBEAN funcionario)
    {
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        return funcionarioDAO.inserirFuncionario(funcionario);
    }
    public List<FuncionarioBEAN>selecionarFuncionarios()
    {
         FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
         return funcionarioDAO.selecionarFuncionarios();
    }
    public boolean alterarFuncionario(FuncionarioBEAN funcionario)
    {
         FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
         return funcionarioDAO.alterarFuncionario(funcionario);
    }
    public boolean deletarFuncionario(FuncionarioBEAN funcionario)
    {
         FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
         return funcionarioDAO.deletarFuncionario(funcionario);
    }
}
