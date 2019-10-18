package cap04;
import javax.swing.JOptionPane;
public class Questao13 {
    public static void main(String[] args) {
        //Declaração
        double preço = 0, custoF;
        //Entrado
        custoF = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: "));
        //Processamento
        if (custoF<=50) 
            preço = custoF + (custoF * 0.05);
        if (custoF>50 && custoF<=100)
            preço = custoF + (custoF * 0.10);
        if (custoF>100) 
            preço = custoF + (custoF * 0.15);
        //Entrada
        if (preço<=80)
            JOptionPane.showMessageDialog(null, "Preço: R$"+preço+"\nCategoria: Barato");
        if (preço>80 && preço<=120)
            JOptionPane.showMessageDialog(null,"Preço: R$"+preço+"\nCategoria: Normal");
        if (preço>120 && preço<=200) 
            JOptionPane.showMessageDialog(null,"Preço: R$"+preço+"\nCategoria: Caro");
        if (preço>200)
            JOptionPane.showMessageDialog(null,"Preço: R$"+preço+"\nCategoria: Muito caro");
    }
}