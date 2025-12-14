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
        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }

        // 🎨 cores escuras
        UIManager.put("control", new java.awt.Color(60, 63, 65));
        UIManager.put("info", new java.awt.Color(60, 63, 65));
        UIManager.put("nimbusBase", new java.awt.Color(18, 30, 49));
        UIManager.put("nimbusAlertYellow", new java.awt.Color(248, 187, 0));
        UIManager.put("nimbusDisabledText", new java.awt.Color(128, 128, 128));
        UIManager.put("nimbusFocus", new java.awt.Color(115, 164, 209));
        UIManager.put("nimbusGreen", new java.awt.Color(176, 179, 50));
        UIManager.put("nimbusInfoBlue", new java.awt.Color(66, 139, 221));
        UIManager.put("nimbusLightBackground", new java.awt.Color(43, 43, 43));
        UIManager.put("nimbusOrange", new java.awt.Color(191, 98, 4));
        UIManager.put("nimbusRed", new java.awt.Color(169, 46, 34));
        UIManager.put("nimbusSelectedText", new java.awt.Color(255, 255, 255));
        UIManager.put("nimbusSelectionBackground", new java.awt.Color(104, 93, 156));
        UIManager.put("text", new java.awt.Color(230, 230, 230));

    } catch (Exception e) {
        // ignora
    }
    
    
}
public static void alternarTema() {
    try {
        if (temaEscuro) {
            // 🌞 TEMA CLARO (Nimbus padrão)
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            temaEscuro = false;
        } else {
            // 🌙 TEMA ESCURO
            aplicarTemaEscuroSimples();
            temaEscuro = true;
        }

        // 🔄 atualiza TODAS as janelas abertas
        for (Window w : Window.getWindows()) {
            SwingUtilities.updateComponentTreeUI(w);
        }

    } catch (Exception e) {
        // ignora
    }
}
}
