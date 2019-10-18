package cap04;
import javax.swing.JOptionPane;
public class Questao22 {
    public static void main(String[] args) {
        //
        int i, g = 0;
        double p;
        i = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
        p = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
        if (i < 20) {
            if (p <= 60) {
                g = 9;
            } else {
                if (p > 60 && p <= 90) {
                    g = 8;
                } else {
                    g = 7;
                }
            }
        } else {
            if (i >= 20 && i <= 50) {
                if (p <= 60) {
                    g = 6;
                } else {
                    if (p > 60 && p <= 90) {
                        g = 5;
                    } else {
                        g = 4;
                    }
                }
            }
        }
        if (i > 50) {
            if (p <= 60) {
                g = 3;
            } else {
                if (p > 60 && p <= 90) {
                    g = 2;
                } else {
                    g = 1;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Você se enquadra no grupo de risco "+g);
    }
}