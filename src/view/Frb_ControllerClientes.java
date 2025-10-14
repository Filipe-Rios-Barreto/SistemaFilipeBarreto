package view;

import bean.Frb_Clientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Frb_ControllerClientes extends AbstractTableModel {
    
    List lista;
    
    public void setList(List lista){
        this.lista = lista;
    }
    public Object getBean(int rowIndex){
        return lista.get(rowIndex);
    } 

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Frb_Clientes frb_clientes = (Frb_Clientes) lista.get(rowIndex);
        if(columnIndex == 0){
         return frb_clientes.getFrb_idCliente();   
        }if(columnIndex == 1){
         return frb_clientes.getFrb_nome();   
        }if(columnIndex == 2){
         return frb_clientes.getFrb_cpf();   
        }if(columnIndex == 3){
         return frb_clientes.getFrb_dataNascimento();   
        }
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if(column == 0){
            return "ID";
        }
        if(column == 1){
            return "Nome";
        }
        if(column == 2){
            return "CPF";
        }
        if(column == 3){
            return "Data de Nascimento";
        }
        return null;
    }
}