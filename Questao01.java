package cap04;
import javax.swing.JOptionPane;
public class Questao01 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double nota1, nota2, nota3, nota4, media;
        //Entrada
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1º nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2º nota: "));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 3º nota: "));
        nota4 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 4º nota: "));
        //Processamento
        media = (nota1 + nota2 + nota3 + nota4)/4;
        //Saída
        if (media < 7)
            JOptionPane.showMessageDialog(null, "O aluno foi reprovado, sua media é "+media);
         else  
            JOptionPane.showMessageDialog(null, "O aluno foi aprovado, sua media é "+media);   
    }
}
