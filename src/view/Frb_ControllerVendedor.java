package view;

import bean.Frb_Vendedor; 
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;

public class Frb_ControllerVendedor extends AbstractTableModel { 

    private List<Frb_Vendedor> lista; 

    public void setList(List<Frb_Vendedor> lista) { 
        this.lista = lista;
        this.fireTableDataChanged(); 
    }

    public Frb_Vendedor getBean(int rowIndex) { 
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
            case 1: return "Nome";
            case 2: return "Telefone";
            case 3: return "Email";
            case 4: return "Comissão";
            case 5: return "CPF";
            case 6: return "Data Contrato";
            default: return "";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Frb_Vendedor frb_vendedor = lista.get(rowIndex); 
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        switch (columnIndex) {
            case 0: return frb_vendedor.getFrb_idVendedor();
            case 1: return frb_vendedor.getFrb_nome();
            case 2: return frb_vendedor.getFrb_telefone();
            case 3: return frb_vendedor.getFrb_email();
            case 4: return frb_vendedor.getFrb_comissao();
            case 5: return frb_vendedor.getFrb_cpf();
            case 6: return dateFormat.format(frb_vendedor.getFrb_dataContrato());
            default: return null;
        }
    }
}