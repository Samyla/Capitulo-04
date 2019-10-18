package cap04;
import javax.swing.JOptionPane;
public class Questao25 {
    public static void main(final String[] args) {
        final double hrex = Double.parseDouble(JOptionPane.showInputDialog(
                "Informe o número de horas extras: "));
        final double hrfalt = Double.parseDouble(JOptionPane.showInputDialog(
                "Informe o número de horas faltadas: "));
        final double resul = hrex - 2.0 * hrfalt / 3.0;
        final double min = resul * 60.0;
        if (min >= 2400.0) {
            JOptionPane.showMessageDialog(null, "Bônus de 500 reais");
        }
        else if (min >= 1800.0) {
            JOptionPane.showMessageDialog(null, "Bônus de 400 reais");
        }
        else if (min >= 1200.0) {
            JOptionPane.showMessageDialog(null, "Bônus de 300 reais");
        }
        else if (min >= 600.0) {
            JOptionPane.showMessageDialog(null, "Bônus de 200 reais");
        }
        else {
            JOptionPane.showMessageDialog(null, "Bônus de 100 reais");
        }
    }
}
