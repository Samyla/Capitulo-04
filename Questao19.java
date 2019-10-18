package cap04;
import javax.swing.JOptionPane;
public class Questao19 {
    public static void main(String[] args) {
        //Declaração de variáveis
        double genero, altura, pIF, pIM;
        //Entrada
        genero = Double.parseDouble(JOptionPane.showInputDialog("Informe seu gênero: "
                + "\n(1) Feminino "
                + "\n(2) Masculino \n\n"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));
        //Processamento
        pIM = (72.7 * altura) - 58;
        pIF = (62.1 * altura) - 44.7;
        //Saída
        if (genero==1)
            JOptionPane.showMessageDialog(null, "Seu peso ideal é "+pIF+"kg");
        if (genero==2)
            JOptionPane.showMessageDialog(null, "Seu peso ideal é "+pIM+"kg");
    }
}