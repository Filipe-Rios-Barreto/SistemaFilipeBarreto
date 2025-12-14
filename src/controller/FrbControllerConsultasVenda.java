package controller;

import bean.FrbVenda;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FrbControllerConsultasVenda extends AbstractTableModel {

    private List lstVendas;

    public void setList(List lstVendas) {
        this.lstVendas = lstVendas;
        this.fireTableDataChanged();
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
        FrbVenda venda = (FrbVenda) lstVendas.get(rowIndex);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        if (columnIndex == 0) {
            return venda.getFrbIdVenda();
        } else if (columnIndex == 1) {
            return venda.getFrbClientes();
        } else if (columnIndex == 2) {
            return venda.getFrbVendedor();
        } else if (columnIndex == 3) {
            return sdf.format(venda.getFrbDataVenda());
        } else if (columnIndex == 4) {
            return venda.getFrbValorTotal();
        }

        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Cliente";
        } else if (columnIndex == 2) {
            return "Vendedor";
        } else if (columnIndex == 3) {
            return "Data";
        } else if (columnIndex == 4) {
            return "Valor Total";
        }
        return "";
    }
}
