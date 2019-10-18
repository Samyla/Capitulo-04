package cap04;
import javax.swing.JOptionPane;
public class Questao02 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double nota1, nota2, media;
        //Entrada
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 1º nota: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a 2º nota: "));
        //Processamwnto
        media = (nota1 + nota2)/2;
        //Saída
        if (media < 3)
            {JOptionPane.showMessageDialog(null, "O aluno foi reprovado, sua media é "+media);}
        if (media >= 3 && media < 7)
            {JOptionPane.showMessageDialog(null, "O aluno terá de passar por exame, sua media é "+media);}
        if (media >= 7 && media < 10)
            {JOptionPane.showMessageDialog(null, "O aluno foi aprovado, sua media é "+media);}
    } 
}
  