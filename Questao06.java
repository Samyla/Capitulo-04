package cap04;
import javax.swing.JOptionPane;
public class Questao06 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double op, n1, n2, e, rn1, rn2, r3n1, r3n2;
        //Entrada
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º número: "));
        JOptionPane.showMessageDialog(null, 
                "Você deseja: \n(1) O primeiro número elevado ao segundo "
                        + "\n(2) Raiz quadrada de ambos os números "
                        + "\n(3) Raiz cúbica de ambos os números ");
        op = Double.parseDouble(JOptionPane.showInputDialog("A opção que deseja é: "));
        //Processamento
        e = Math.pow(n1, n2);
        rn1 = n1 * n1;
        rn2 = n2 * n2;
        r3n1 = n1 * n1 * n1;
        r3n2 = n2 * n2 * n2;
        //Saída
        if (op == 1)        
            JOptionPane.showMessageDialog(null, "O primeiro número elevado ao segundo é "+e);
        if (op == 2)
            JOptionPane.showMessageDialog(null, 
                "As raizes quadradas dos números informados, são respectivamente, "+rn1+" e "+rn2);
        if (op == 3)
            JOptionPane.showMessageDialog(null, 
                "As raizes cúbicas dos números informados, são respectivamente, "+r3n1+" e "+r3n2);
        if (op > 3)
            JOptionPane.showMessageDialog(null, "Opção inválida, erro na execução");        
    }
}
