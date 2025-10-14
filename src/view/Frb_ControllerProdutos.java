package view;

import bean.Frb_Produtos;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import java.text.SimpleDateFormat;

public class Frb_ControllerProdutos extends AbstractTableModel {

    List<Frb_Produtos> lista;

    public void setList(List<Frb_Produtos> lista){
        this.lista = lista;
        this.fireTableDataChanged();
    }

    public Frb_Produtos getBean(int rowIndex){
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
            case 1: return "Sabor";
            case 2: return "Descrição";
            case 3: return "Preço";
            case 4: return "Estoque";
            case 5: return "Tamanho";
            case 6: return "Data Validade";
            default: return "";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Frb_Produtos frb_produtos = lista.get(rowIndex);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        switch (columnIndex) {
            case 0: return frb_produtos.getFrb_idProduto();
            case 1: return frb_produtos.getFrb_sabor();
            case 2: return frb_produtos.getFrb_descricao();
            case 3: return frb_produtos.getFrb_preco();
            case 4: return frb_produtos.getFrb_estoque();
            case 5: return frb_produtos.getFrb_tamanho();
            case 6:
                java.util.Date dataValidade = frb_produtos.getFrb_dataValidade();
                return (dataValidade != null) ? dateFormat.format(dataValidade) : "";
            default: return null;
        }
    }
}