package cap04;
import javax.swing.JOptionPane;
public class Questao12 {
    public static void main(String[] args) {
        //Declaração de variáveis
        double s, sF;
        //Entrada
        s = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário: "));
        //Processamento
        if (s<=350)
            s = s + 100; 
            sF = s - (s * 0.07);
        if (s>350 && s<=600)
            s = s + 75; 
            sF = s - (s * 0.07);
        if (s>600 && s<= 900) 
            s = s + 50; 
            sF = s - (s * 0.07);
        if (s>900)
            s = s + 35;
            sF = s - (s * 0.07);
        //Saída
        JOptionPane.showMessageDialog(null, "Seu salário passará a ser R$"+sF);
    }
}
