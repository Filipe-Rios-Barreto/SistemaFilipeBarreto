/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FrbVenda;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;

/**
 *
 * @author 
 */
public class FrbControllerVendas extends AbstractTableModel {

    private List lstVendas;

    public void setList(List lstVendas) {
        this.lstVendas = lstVendas;
        this.fireTableDataChanged();
    }

    public FrbVenda getBean(int rowIndex) {
        return (FrbVenda) lstVendas.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendas.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FrbVenda frbVendas = (FrbVenda) lstVendas.get(rowIndex);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (columnIndex == 0) {
            return frbVendas.getFrbIdVenda();
        } else if (columnIndex == 1) {
            return frbVendas.getFrbClientes();
        } else if (columnIndex == 2) {
            return frbVendas.getFrbVendedor();
        } else if (columnIndex == 3) {
            return (frbVendas.getFrbDataVenda() != null)
                    ? dateFormat.format(frbVendas.getFrbDataVenda())
                    : "";
        } else if (columnIndex == 4) {
            return frbVendas.getFrbValorTotal();
        }

        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Código Cliente";
        } else if (columnIndex == 2) {
            return "Código Vendedor";
        } else if (columnIndex == 3) {
            return "Data da Venda";
        } else if (columnIndex == 4) {
            return "Valor Total";
        }

        return "";
    }
}
