package cap04;
import javax.swing.JOptionPane;
public class Questao07 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double s, sF, a;
        //Entrada
        s = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário: "));
        //Processamento
        a = (s * 30)/100;
        sF = s + a;
        //Saída
        if (s<500)
            JOptionPane.showMessageDialog(null, 
                "Seu salário é de R$"+s+", com um aumento de 30% ele passará a ser R$"+sF);
        if (s>=500)
            JOptionPane.showMessageDialog(null, "Você não tem direito a um aumento");
    }  
}
