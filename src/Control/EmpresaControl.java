/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.bean.EmpresaBEAN;
import Model.dao.EmpresaDAO;

/**
 *
 * @author gusta
 */
public class EmpresaControl
{

    public int getIdEmpresa()
    {
        EmpresaDAO empresaDAO = new EmpresaDAO();
        return empresaDAO.getIdEmpresa();
    }
    public boolean inserir(EmpresaBEAN empresa){
          EmpresaDAO empresaDAO = new EmpresaDAO();
        return empresaDAO.inserirEmpresa(empresa);
        
    }
}
