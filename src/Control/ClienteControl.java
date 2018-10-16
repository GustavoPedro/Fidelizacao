/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.bean.ClienteBEAN;
import Model.dao.ClienteDAO;
import java.util.List;

/**
 *
 * @author gusta
 */
public class ClienteControl
{

    public boolean inserirCliente(ClienteBEAN cliente)
    {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.inserirCliente(cliente);
    }

    public void alterarCliente(ClienteBEAN cliente)
    {
        ClienteDAO clienteDAO = new ClienteDAO();
        clienteDAO.atualizarCliente(cliente);
    }
    public List<ClienteBEAN> selecionarClientes()
    {
        return null;
    }
}
