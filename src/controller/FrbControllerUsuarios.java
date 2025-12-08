/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.FrbUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class FrbControllerUsuarios extends AbstractTableModel {

    private List lstUsuarios;

    public void setList(List lstUsuarios) {
        this.lstUsuarios = lstUsuarios;
    }
    
 public FrbUsuarios getBean(int rowIndex) {
    if (rowIndex < 0 || rowIndex >= lstUsuarios.size()) {
        return null;
    }
    return (FrbUsuarios) lstUsuarios.get(rowIndex);
}


    @Override
    public int getRowCount() {
        return lstUsuarios.size();
                
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        FrbUsuarios frbUsuarios = (FrbUsuarios) lstUsuarios.get( rowIndex);
        if ( columnIndex == 0 ){
            return frbUsuarios.getFrbIdUsuario();
        } else if (columnIndex ==1) {
            return frbUsuarios.getFrbNome();        
        } else if (columnIndex ==2) {
            return frbUsuarios.getFrbApelido();
        } else if (columnIndex ==3) {
            return frbUsuarios.getFrbCpf();
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
            return "Apelido";
        } else if ( columnIndex == 3) {
            return "Cpf";
        } 
        return "";
    }
    
}
