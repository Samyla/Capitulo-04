package cap04;
import javax.swing.JOptionPane;
public class Questao10 {
    public static void main (String[] args){
        double cF, p5, p25, p35;
        //Entrada
        cF = Double.parseDouble(JOptionPane.showInputDialog("Informe o custo de fábrica de seu carro: "));
        //Processamento
        p5 = (cF * 0.05) + cF;
        p25 = (cF * 0.1) + (cF * 0.15) + cF;
        p35 = (cF * 0.15) + (cF * 0.2) + cF;
        //Saída
        if (cF<=12000)
            JOptionPane.showMessageDialog(null, "O custo total do carro será de R$"+p5);
        if (cF>12000 && cF<25000)
            JOptionPane.showMessageDialog(null, "O custo total do carro será de R$"+p25);
        if (cF>25000)
            JOptionPane.showMessageDialog(null, "O custo total do carro será de R$"+p35);
    }
}