/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Model.bean.CartaoTipoSeloBEAN;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gusta
 */
public class CartaoSeloTableModel extends AbstractTableModel
{
        private List<CartaoTipoSeloBEAN> cartoesSeloList = new ArrayList();
    
    private String[] colunas =
    {
        "Nome Cliente", "Nome Funcionário", "Quantidade", "Data de Vencimento"
    };

    
    @Override
    public String getColumnName(int coluna)
    {
        return colunas[coluna];
    }

    
    @Override
    public int getRowCount()
    {
        return cartoesSeloList.size();
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
                return cartoesSeloList.get(linha).getCliente().getNome();
            case 1:
                return cartoesSeloList.get(linha).getFuncionario().getNome();
            case 2:
                return cartoesSeloList.get(linha).getQnt();
            case 3:
                return cartoesSeloList.get(linha).getDataVencimento();
        }
        return null;
    }
    public void popularLista(List<CartaoTipoSeloBEAN> cartoes)
    {
        this.cartoesSeloList = cartoes;
        this.fireTableDataChanged();
    }
    public void addRow(CartaoTipoSeloBEAN cartao)
    {
        this.cartoesSeloList.add(cartao);
        this.fireTableDataChanged();
    }
    public CartaoTipoSeloBEAN retornarObjeto(int linha)
    {
        return cartoesSeloList.get(linha);
    }
}
