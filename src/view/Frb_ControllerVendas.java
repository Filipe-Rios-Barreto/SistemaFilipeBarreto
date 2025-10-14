package view;

import bean.Frb_Vendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;

public class Frb_ControllerVendas extends AbstractTableModel {

    List<Frb_Vendas> lista;

    public void setList(List<Frb_Vendas> lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public Frb_Vendas getBean(int rowIndex){
        return lista.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "ID";
            case 1: return "ID Cliente";
            case 2: return "ID Vendedor";
            case 3: return "Data Venda";
            case 4: return "Valor Total";
            case 5: return "Status Pgto";
            case 6: return "Forma Pgto";
            default: return "";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Frb_Vendas frb_vendas = lista.get(rowIndex);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        switch (columnIndex) {
            case 0: return frb_vendas.getFrb_idVenda();
            case 1: return frb_vendas.getFrb_fkCliente();
            case 2: return frb_vendas.getFrb_fkVendedor();
            case 3: return dateFormat.format(frb_vendas.getFrb_dataVenda());
            case 4: return frb_vendas.getFrb_valorTotal();
            case 5: return frb_vendas.getFrb_statusVenda();
            case 6: return frb_vendas.getFrb_formaPagamento();
            default: return null;
        }
    }
}
