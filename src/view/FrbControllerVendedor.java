/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.FrbVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;

/**
 *
 * @author 
 */
public class FrbControllerVendedor extends AbstractTableModel {

    private List lstVendedores;

    public void setList(List lstVendedores) {
        this.lstVendedores = lstVendedores;
        this.fireTableDataChanged();
    }

    public FrbVendedor getBean(int rowIndex) {
        return (FrbVendedor) lstVendedores.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstVendedores.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FrbVendedor frbVendedor = (FrbVendedor) lstVendedores.get(rowIndex);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        if (columnIndex == 0) {
            return frbVendedor.getFrbIdVendedor();
        } else if (columnIndex == 1) {
            return frbVendedor.getFrbNome();
        } else if (columnIndex == 2) {
            return frbVendedor.getFrbTelefone();
        } else if (columnIndex == 3) {
            return frbVendedor.getFrbEmail();
        } else if (columnIndex == 4) {
            return frbVendedor.getFrbComissao();
        } else if (columnIndex == 5) {
            return frbVendedor.getFrbCpf();
        } else if (columnIndex == 6) {
            return (frbVendedor.getFrbDataContrato() != null)
                    ? dateFormat.format(frbVendedor.getFrbDataContrato())
                    : "";
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
            return "Telefone";
        } else if (columnIndex == 3) {
            return "E-mail";
        } else if (columnIndex == 4) {
            return "Comissão";
        } else if (columnIndex == 5) {
            return "CPF";
        } else if (columnIndex == 6) {
            return "Data de Contrato";
        }

        return "";
    }
}
