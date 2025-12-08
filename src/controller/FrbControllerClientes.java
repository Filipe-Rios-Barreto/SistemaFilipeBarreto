/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.FrbClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author 
 */
public class FrbControllerClientes extends AbstractTableModel {

    private List lstClientes;

    public void setList(List lstClientes) {
        this.lstClientes = lstClientes;
    }
    
    public FrbClientes getBean(int rowIndex) {
        return (FrbClientes) lstClientes.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstClientes.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FrbClientes frbClientes = (FrbClientes) lstClientes.get(rowIndex);
        
        if (columnIndex == 0) {
            return frbClientes.getFrbIdCliente();
        } else if (columnIndex == 1) {
            return frbClientes.getFrbNome();
        } else if (columnIndex == 2) {
            return frbClientes.getFrbCpf();
        } else if (columnIndex == 3) {
            return frbClientes.getFrbDataNascimento();
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
        } else if (columnIndex == 3) {
            return "Data de Nascimento";
        }
        return "";
    }
}
