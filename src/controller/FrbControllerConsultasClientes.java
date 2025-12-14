package controller;

import bean.FrbClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class FrbControllerConsultasClientes extends AbstractTableModel {

    private List lstFrbClientes;

    public void setList(List lstFrbClientes) {
        this.lstFrbClientes = lstFrbClientes;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstFrbClientes.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FrbClientes frbClientes = (FrbClientes) lstFrbClientes.get(rowIndex);

        if (columnIndex == 0) {
            return frbClientes.getFrbIdCliente();
        } else if (columnIndex == 1) {
            return frbClientes.getFrbNome();
        } else if (columnIndex == 2) {
            return frbClientes.getFrbCpf();
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
            return "CPF";
        }
        return "";
    }
}
