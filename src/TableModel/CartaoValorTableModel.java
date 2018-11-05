/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;


import Model.bean.CartaoTipoValorBEAN;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gusta
 */
public class CartaoValorTableModel extends AbstractTableModel
{
    private List<CartaoTipoValorBEAN> cartoesValorList = new ArrayList();
    
    private String[] colunas =
    {
        "Nome Cliente", "Nome Funcionário", "Valor", "Data de Vencimento"
    };

    
    @Override
    public String getColumnName(int coluna)
    {
        return colunas[coluna];
    }

    
    @Override
    public int getRowCount()
    {
        return cartoesValorList.size();
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
                return cartoesValorList.get(linha).getCliente().getNome();
            case 1:
                return cartoesValorList.get(linha).getFuncionario().getNome();
            case 2:
                return cartoesValorList.get(linha).getValor();
            case 3:
                return cartoesValorList.get(linha).getDataVencimento();
        }
        return null;
    }
    public void popularLista(List<CartaoTipoValorBEAN> cartoes)
    {
        this.cartoesValorList = cartoes;
        this.fireTableDataChanged();
    }
    public void addRow(CartaoTipoValorBEAN cartao)
    {
        this.cartoesValorList.add(cartao);
        this.fireTableDataChanged();
    }
    public CartaoTipoValorBEAN retornarObjeto(int linha)
    {
        return cartoesValorList.get(linha);
    }
}
