package tools;

import java.awt.Window;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Util {
public static boolean temaEscuro = true;
    public static void habilitar(boolean valor, JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);           
        }
    }

    public static void limpar(JComponent ... componentes) {
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof JTextField) {
                ((JTextField) componentes[i]).setText("");
            }
            if (componentes[i] instanceof JFormattedTextField) {
                ((JFormattedTextField) componentes[i]).setText("");
            }
            if (componentes[i] instanceof JComboBox) {
                ((JComboBox) componentes[i]).setSelectedIndex(-1);
            }
            if (componentes[i] instanceof JCheckBox) {
                ((JCheckBox) componentes[i]).setSelected(false);
            }
        }
    }
    
    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }
    
    public static boolean perguntar(String cad){
        int perguntar = JOptionPane.showConfirmDialog(null, cad, cad, JOptionPane.YES_NO_OPTION);
        return perguntar == JOptionPane.YES_OPTION;
    }
    
    public static int strToInt(String cad) {
        return Integer.parseInt(cad);
    }
    
    public static String intToStr(int num) {
        return String.valueOf(num);
    }
    
    public static double strToDouble(String num) {
        return Double.parseDouble(num);
    }
    
    public static Date strToDate(String cad) {
        try {
            SimpleDateFormat datafromato = new SimpleDateFormat("dd/MM/yyyy");
            return datafromato.parse(cad);
        } catch (ParseException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public static String dateToStr(Date data) {
        SimpleDateFormat datafromato = new SimpleDateFormat("dd/MM/yyyy");
        return datafromato.format(data);
    }
    
    public static String doubleToString(double num) {
        return String.valueOf(num);
    }

 public static void aplicarTemaEscuroSimples() {
        try {
            aplicarNimbus();

            UIManager.put("control", new java.awt.Color(60, 63, 65));
            UIManager.put("info", new java.awt.Color(60, 63, 65));
            UIManager.put("nimbusBase", new java.awt.Color(18, 30, 49));
            UIManager.put("nimbusLightBackground", new java.awt.Color(43, 43, 43));
            UIManager.put("text", new java.awt.Color(230, 230, 230));
            UIManager.put("nimbusSelectionBackground", new java.awt.Color(104, 93, 156));
            UIManager.put("nimbusSelectedText", new java.awt.Color(255, 255, 255));
        } catch (Exception e) {
        }
    }

    public static void aplicarTemaClaro() {
        try {
            aplicarNimbus();

            // limpa cores customizadas
            UIManager.put("control", null);
            UIManager.put("info", null);
            UIManager.put("nimbusBase", null);
            UIManager.put("nimbusLightBackground", null);
            UIManager.put("text", null);
            UIManager.put("nimbusSelectionBackground", null);
            UIManager.put("nimbusSelectedText", null);
        } catch (Exception e) {
        }
    }

    private static void aplicarNimbus() throws Exception {
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    }

    public static void alternarTema() {
        try {
            if (temaEscuro) {
                aplicarTemaClaro();
            } else {
                aplicarTemaEscuroSimples();
            }

            temaEscuro = !temaEscuro;

            for (Window w : Window.getWindows()) {
                SwingUtilities.updateComponentTreeUI(w);
            }

        } catch (Exception e) {
        }
    }
}
