package cap04;
import javax.swing.JOptionPane;
public class Questao09 {
    public static void main (String[] args){
        double sM, c30, c25, c20, c10;
        //Entrada
        sM = Double.parseDouble(JOptionPane.showInputDialog("Informe seu saldo médio: "));
        //Processamento
        c30 = (sM * 30)/100;
        c25 = (sM * 25)/100;
        c20 = (sM * 20)/100;
        c10 = (sM * 10)/100;
        //Saída
        if (sM>400)
            JOptionPane.showMessageDialog(null, "Seu saldo médio é de R$"+sM+" e seu crédito é de R$"+c30);
        if (sM>300 && sM<=400)
            JOptionPane.showMessageDialog(null, "Seu saldo médio é de R$"+sM+" e seu crédito é de R$"+c25);
        if (sM>200 && sM<=300)
            JOptionPane.showMessageDialog(null, "Seu saldo médio é de R$"+sM+" e seu crédito é de R$"+c20);
        if (sM<=200)
            JOptionPane.showMessageDialog(null, "Seu saldo médio é de R$"+sM+" e seu crédito é de R$"+c10);
    }
}