package cap04;
import javax.swing.JOptionPane;
public class Questao04 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double n1, n2, n3;
        //Entrada
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º número: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 3º número: "));
        //Processamento e saída
        if (n1>n2 && n1>n3)
            {JOptionPane.showMessageDialog(null, "O maior número é "+n1);}
        if (n2>n1 && n2>n3)
            {JOptionPane.showMessageDialog(null, "O maior número é "+n2);}
        if (n3>n1 && n3>n2)
            {JOptionPane.showMessageDialog(null, "O maior número é "+n3);}
        if (n1==n2 && n1==n3)
            {JOptionPane.showMessageDialog(null, "Os números são equivalentes");}
    }
}
