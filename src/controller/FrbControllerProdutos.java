/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.FrbProdutos;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;

/**
 *
 * @author 
 */
public class FrbControllerProdutos extends AbstractTableModel {

    private List lstProdutos;

    public void setList(List lstProdutos) {
        this.lstProdutos = lstProdutos;
        this.fireTableDataChanged();
    }

    public FrbProdutos getBean(int rowIndex) {
        return (FrbProdutos) lstProdutos.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FrbProdutos frbProdutos = (FrbProdutos) lstProdutos.get(rowIndex);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (columnIndex == 0) {
            return frbProdutos.getFrbIdProduto();
        } else if (columnIndex == 1) {
            return frbProdutos.getFrbSabor();
        } else if (columnIndex == 2) {
            return frbProdutos.getFrbDescricao();
        } else if (columnIndex == 3) {
            return frbProdutos.getFrbPreco();
        } else if (columnIndex == 4) {
            return frbProdutos.getFrbEstoque();
        } else if (columnIndex == 5) {
            return frbProdutos.getFrbTamanho();
        } else if (columnIndex == 6) {
            java.util.Date dataValidade = frbProdutos.getFrbDataValidade();
            return (dataValidade != null) ? dateFormat.format(dataValidade) : "";
        }

        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Sabor";
        } else if (columnIndex == 2) {
            return "Descrição";
        } else if (columnIndex == 3) {
            return "Preço";
        } else if (columnIndex == 4) {
            return "Estoque";
        } else if (columnIndex == 5) {
            return "Tamanho";
        } else if (columnIndex == 6) {
            return "Data de Validade";
        }

        return "";
    }
}
