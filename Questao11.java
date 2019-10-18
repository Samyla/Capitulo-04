package cap04;
import javax.swing.JOptionPane;
public class Questao11 {
    public static void main (String[] args){
        double s, s15, s10, s5, a15, a10, a5;
        //Entrada
        s = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário: "));
        //Processamento
        a15 = (s * 15)/100;
        a10 = (s * 10)/100;
        a5 = (s * 5)/100;
        s15 = ((s * 15)/100) + s;
        s10 = ((s * 10)/100) + s;
        s5 = ((s * 5)/100) + s;
        //Saída
        if (s<=300)
            JOptionPane.showMessageDialog(null, 
                    "Seu aumento é de R$"+a15+" e seu salário passará a ser R$"+s15);
        if (s>300 && s<=600)
            JOptionPane.showMessageDialog(null, 
                    "Seu aumento é de R$"+a10+" e seu salário passará a ser R$"+s10);
        if (s>600 && s<=900)
            JOptionPane.showMessageDialog(null, 
                    "Seu aumento é de R$"+a5+" e seu salário passará a ser R$"+s5);
        if (s>900)
            JOptionPane.showMessageDialog(null, 
                    "Você não receberá aumento e seu salário continuará a ser R$"+s);
    }
}