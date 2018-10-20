/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Model.bean.ClienteBEAN;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gusta
 */
// Utilizada para implementar o jTable da form pesquisar clientes
public class ClienteTableModel extends AbstractTableModel
{

    private List<ClienteBEAN> clientesList = new ArrayList<>();
    private String[] colunas =
    {
        "Codigo Cliente", "Nome", "Cpf", "Telefone", "DataNasc"
    };

    @Override
    public String getColumnName(int coluna)
    {
        return colunas[coluna];
    }

    
    @Override
    public int getRowCount()
    {
        return clientesList.size();
    }

    @Override
    public int getColumnCount()
    {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna)
    {
        switch (coluna)
        {
            case 0:
                return clientesList.get(linha).getIdCliente();
            case 1:
                return clientesList.get(linha).getNome();
            case 2:
                return clientesList.get(linha).getCpf();
            case 3:
                return clientesList.get(linha).getTelefone();
            case 4:
                return clientesList.get(linha).getDataNasc();
        }
        return null;
    }

}
