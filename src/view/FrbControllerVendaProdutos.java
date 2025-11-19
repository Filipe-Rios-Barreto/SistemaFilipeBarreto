/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FrbVendaprodutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 
 */
public class FrbControllerVendaProdutos extends AbstractTableModel {

    private List lstVendaProdutos;

    public void setList(List lstVendaProdutos) {
        this.lstVendaProdutos = lstVendaProdutos;
        this.fireTableDataChanged();
    }

    public FrbVendaprodutos getBean(int rowIndex) {
        return (FrbVendaprodutos) lstVendaProdutos.get(rowIndex);
    }

    public void addBean(FrbVendaprodutos frbVendaprodutos) {
        this.lstVendaProdutos.add(frbVendaprodutos);
        this.fireTableDataChanged();
    }
    
    public void removeBean(int rowIndex){
        this.lstVendaProdutos.remove(rowIndex);
        this.fireTableDataChanged();
    }
    @Override
    public int getRowCount() {
        return lstVendaProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FrbVendaprodutos frbVendaProdutos = (FrbVendaprodutos) lstVendaProdutos.get(rowIndex);

        if (columnIndex == 0) {
            return frbVendaProdutos.getFrbProdutos().getFrbIdProduto();
        } else if (columnIndex == 1) {
            return frbVendaProdutos.getFrbProdutos().getFrbSabor();
        } else if (columnIndex == 2) {
            return frbVendaProdutos.getFrbQuantidade();
        } else if (columnIndex == 3) {
            return frbVendaProdutos.getFrbPrecoUnitario();
        } else if (columnIndex == 4) {
            return frbVendaProdutos.getFrbQuantidade() * frbVendaProdutos.getFrbPrecoUnitario();
        }

        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código Produto";
        } else if (columnIndex == 1) {
            return "Sabor";
        } else if (columnIndex == 2) {
            return "Quantidade";
        } else if (columnIndex == 3) {
            return "Preço";
        } else if (columnIndex == 4) {
            return "Total";
        }

        return "";
    }
}
