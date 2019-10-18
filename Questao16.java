package cap04;

import javax.swing.JOptionPane;

public class Questao16 {
    public static void main(String[] args) {
        //Declaração de variáveis
        double p, d10, d15, pF10, pF15;
        //Entrada
        p = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: "));
        //Processamento
        d10 = p * 0.1;
        d15 = p * 0.15;
        pF10 = p - d10;
        pF15 = p - d15;
        //Saída
        if (p<=30)
            JOptionPane.showMessageDialog(null, 
                    "Não haverá desconto, portanto o produto continuará com seu preço inicial de R$"+p);
        if (p>30 && p<=100)
            JOptionPane.showMessageDialog(null, 
                    "O desconto será de R$"+d10+" e seu preço passará a ser R$"+pF10);
        if (p>100)
            JOptionPane.showMessageDialog(null, 
                    "O desconto será de R$"+d15+" e seu preço passará a ser R$"+pF15);
    }
}