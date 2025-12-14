package controller;

import bean.FrbVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FrbControllerConsultasVendedor extends AbstractTableModel {

    private List lstFrbVendedor;

    public void setList(List lstFrbVendedor) {
        this.lstFrbVendedor = lstFrbVendedor;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstFrbVendedor.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FrbVendedor frbVendedor = (FrbVendedor) lstFrbVendedor.get(rowIndex);

        if (columnIndex == 0) {
            return frbVendedor.getFrbIdVendedor();
        } else if (columnIndex == 1) {
            return frbVendedor.getFrbNome();
        } else if (columnIndex == 2) {
            return frbVendedor.getFrbComissao();
        }

        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Nome";
        } else if (columnIndex == 2) {
            return "Comissão";
        }
        return "";
    }
}
