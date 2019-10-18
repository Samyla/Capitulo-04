package cap04;
import javax.swing.JOptionPane;
public class Questao21 {
    public static void main(String[] args) {
        //Declaração de variáveis
        double preço, codigo;
        //Entrada
        preço = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto: "));
        codigo = Double.parseDouble(JOptionPane.showInputDialog("Informe o código do produto: "));
        //Processamento e saída
        if (codigo==1)
            JOptionPane.showMessageDialog(null, "Sua precedência é do Sul");
        if(codigo==2)
            JOptionPane.showMessageDialog(null, "Sua precedência é do Norte");
        if (codigo==3)    
            JOptionPane.showMessageDialog(null, "Sua precedência é do Leste");
        if (codigo==4)
            JOptionPane.showMessageDialog(null, "Sua precedência é do Oeste");
          if (codigo==5 && codigo==6)
            JOptionPane.showMessageDialog(null, "Sua precedência é do Nordeste");
        if (codigo>=7 && codigo <=9)
            JOptionPane.showMessageDialog(null, "Sua precedência é do Sudeste");
        if (codigo>=10 && codigo<=20)
            JOptionPane.showMessageDialog(null, "Sua precedência é do Centro-oeste");
        if (codigo>=21 && codigo<=30)
            JOptionPane.showMessageDialog(null, "Sua precedência é do Nordeste");
    }
}