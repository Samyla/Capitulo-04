package cap04;
import javax.swing.JOptionPane;
public class Questao20 {
    public static void main(String[] args) {
        //Declaração de variáveis
        int i;
        String r = null;
        //Entrada
        i = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade: "));
        //Processamento
        if (i>30) 
            {r = "é um Nadador Sênior";}
        if (i>=16 && i<=30) 
            {r = "é um Nadador Adulto";}
        if (i>=11 && i<=15) 
            {r = "é um Nadador Adolescente";}
        if (i>=8 && i<=10) 
            {r = "é um Nadador Juvenil";}
        if (i>=5 && i<=7) 
            {r = "é um Nadador Infantil";}
        if (i<5)
            {r = "não é um nadador";}
        //Saída
        JOptionPane.showMessageDialog(null, "Você "+r);
    }
}