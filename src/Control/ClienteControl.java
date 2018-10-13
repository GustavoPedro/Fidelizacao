/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.bean.ClienteBEAN;
import Model.dao.ClienteDAO;


/**
 *
 * @author gusta
 */
public class ClienteControl
{

    public void inserirCliente(ClienteBEAN cliente)
    {
        
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.inserirCliente(cliente);
    }
}
