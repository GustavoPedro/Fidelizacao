/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import Model.bean.FuncionarioBEAN;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author gusta
 */
public class FuncionarioTableModel extends AbstractTableModel
{
     private List<FuncionarioBEAN> funcionariosList = new ArrayList<>();
    
    private String[] colunas =
    {
        "Nome", "Login"
    };    
    @Override
    public String getColumnName(int coluna)
    {
        return colunas[coluna];
    }

    
    @Override
    public int getRowCount()
    {
        return funcionariosList.size();
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
                return funcionariosList.get(linha).getNome();
            case 1:
                return funcionariosList.get(linha).getLogin();         
        }
        return null;
    }
    public void popularLista(List<FuncionarioBEAN> funcionarios)
    {
        this.funcionariosList = funcionarios;
        this.fireTableDataChanged();
    }
    public void addRow(FuncionarioBEAN funcionario)
    {
        this.funcionariosList.add(funcionario);
        this.fireTableDataChanged();
    }
    public FuncionarioBEAN retornarObjeto(int linha)
    {
        return funcionariosList.get(linha);
    }
}
