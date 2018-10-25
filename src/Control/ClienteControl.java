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

    public boolean alterarCliente(ClienteBEAN cliente)
    {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.atualizarCliente(cliente);
    }
    public List<ClienteBEAN> buscarClientes()
    {
        ClienteDAO clienteDAO = new ClienteDAO();
        return clienteDAO.buscarClientes();
    }
    
    public List<ClienteBEAN>buscarPorCpf(String cpf)
    {
          ClienteDAO clienteDAO = new ClienteDAO();
          return clienteDAO.buscarPorCpf(cpf);
    }

    public List<ClienteBEAN> buscarPorNome(String nome)
    {
       ClienteDAO clienteDAO = new ClienteDAO();
       return clienteDAO.buscarPorNome(nome);
    }
}
