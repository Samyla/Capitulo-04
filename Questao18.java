package cap04;
import javax.swing.JOptionPane;
public class Questao18 {
    public static void main(String[] args) {
        //Declaração de variáveis
        double mI = 18, i;
        //Entrada
        i = Double.parseDouble(JOptionPane.showInputDialog("Informe sua idade: "));
        //Processamento e saída
        if (i >= mI)
            JOptionPane.showMessageDialog(null, "Você já atingiu a maioridade");
        if (i < mI)
            JOptionPane.showMessageDialog(null, "Você não atingiu a maioridade");
    }
}
