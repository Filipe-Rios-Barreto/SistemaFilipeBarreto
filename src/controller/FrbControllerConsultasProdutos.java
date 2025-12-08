/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bean.FrbProdutos;
import bean.FrbUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author Marcos
 */
public class FrbControllerConsultasProdutos extends AbstractTableModel {

    private List lstFrbProdutos;

    public void setList(List lstFrbProdutos) {
        this.lstFrbProdutos = lstFrbProdutos;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstFrbProdutos.size();
                
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FrbProdutos frbProdutos = (FrbProdutos) lstFrbProdutos.get( rowIndex);
        if ( columnIndex == 0 ){
            return frbProdutos.getFrbIdProduto();
        } else if (columnIndex ==1) {
            return frbProdutos.getFrbSabor();        
        } else if (columnIndex ==2) {
            return frbProdutos.getFrbPreco();
        } 
        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if ( columnIndex == 0) {
            return "Código";
        } else if ( columnIndex == 1) {
            return "Nome";         
        } else if ( columnIndex == 2) {
            return "Valor Unitário";
        }
        return "";
    }
}
