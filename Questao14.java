package cap04;
import javax.swing.JOptionPane;
public class Questao14 {
    public static void main(String[] args) {
        //Declaração variáveis
        double s, sF = 0;
        //Entrada
        s = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário: "));
        //Processamento
        if (s<=300)
            sF = s + (s * 0.5);
        if (s>300 && s<=500)
            sF = s + (s * 0.4);
        if (s>500 && s<=700) 
            sF = s+(s*0.3);
        if (s>700 & s<=800)
            sF = s + (s * 0.2);
        if (s>800 && s<=1000) 
            sF= s + (s * 0.1);
        if (s>1000)
            sF= s+(s*0.05);
        //Saída
        JOptionPane.showMessageDialog(null, "Levando em conta seu respectivo aumento, seu salário passará a ser R$"+sF);
    }
}