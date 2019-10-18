package cap04;
import javax.swing.JOptionPane;
public class Questao17 {
    public static void main(String[] args) {
        //Declaração de variáveis
        double s = 4531, su;
        //Entrada
        su = Double.parseDouble(JOptionPane.showInputDialog("Informe a senha: "));
        //Processamento e saída
        if (su == s)
            JOptionPane.showMessageDialog(null, "Acesso permitido");
        if (su!=s)
            JOptionPane.showMessageDialog(null, "Acesso negado");
    }
}