package cap04;
import javax.swing.JOptionPane;
public class Questao15 {
    public static void main(String[] args) {
        //Declaração de variáveis
        double i = 0, iF30, iF40, tipo;
        //Entrada
        i = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do investimento: "));
        tipo = Double.parseDouble(JOptionPane.showInputDialog("Informe o tipo de investimento: "
                + "\n(1) Poupança "
                + "\n(2) Fundos de renda fixa\n"));
        //Processamento
        iF30 = i + (i * 0.03);
        iF40 = i + (i * 0.04);
        //Saída
        if (tipo==1)        
        JOptionPane.showMessageDialog(null, "Ao fim do mês será atingido o valor de R$"+iF30);
        if (tipo==2)
        JOptionPane.showMessageDialog(null, "Ao fim do mês será atingido o valor de R$"+iF40);
        if (tipo>2)
        JOptionPane.showMessageDialog(null, "Opção inválida, erro na execução");
    }
}