package cap04;
import javax.swing.JOptionPane;
public class Questao03 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double n1, n2;
        //Entrada
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º número: "));
        //Processamento e saída
        if (n1>n2)
            {JOptionPane.showMessageDialog(null, "O menor número é "+n2);}
        if (n1<n2)
            {JOptionPane.showMessageDialog(null, "O menor número é "+n1);}
        if (n1==n2)
            {JOptionPane.showMessageDialog(null, "Os números são equivalentes");}
    }
}
