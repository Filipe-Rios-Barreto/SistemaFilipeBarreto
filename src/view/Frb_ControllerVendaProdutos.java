package view;

import bean.Frb_VendaProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Frb_ControllerVendaProdutos extends AbstractTableModel {
    
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
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Frb_VendaProdutos frb_vendaProdutos = (Frb_VendaProdutos) lista.get(rowIndex);
        if(columnIndex == 0){
         return frb_vendaProdutos.getFrb_idVendaProdutos();   
        }if(columnIndex == 1){
         return frb_vendaProdutos.getFrb_fkVenda();   
        }if(columnIndex == 2){
         return frb_vendaProdutos.getFrb_fkProduto();   
        }if(columnIndex == 3){
         return frb_vendaProdutos.getFrb_quantidade();   
        }if(columnIndex == 4){
         return frb_vendaProdutos.getFrb_precoUnitario();   
        }if(columnIndex == 5){
         return frb_vendaProdutos.getFrb_descontoAplicado();   
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        if(column == 0){
            return "ID Venda Produto";
        }if(column == 1){
            return "ID Venda";
        }if(column == 2){
            return "ID Produto";
        }if(column == 3){
            return "Quantidade";
        }if(column == 4){
            return "Preço Unitário";
        }if(column == 5){
            return "Desconto Aplicado";
        }
        return null;
    }
}