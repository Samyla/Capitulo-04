package cap04;
import javax.swing.JOptionPane;
public class Questao08 {
    public static void main (String[] args){
        double s, s35, s15;
        //Entrada
        s = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário: "));
        //Processamento
        s35 = ((s * 35)/100) + s;
        s15 = ((s * 15)/100) + s;
        //Saída
        if (s<=300)
            JOptionPane.showMessageDialog(null, 
                    "Seu salário é de R$"+s+", com um aumento de 35% ele passará a ser R$"+s35);
        if (s>300)
            JOptionPane.showMessageDialog(null, 
                    "Seu salário é de R$"+s+", com um aumento de 15% ele passará a ser R$"+s15);
    }
}
