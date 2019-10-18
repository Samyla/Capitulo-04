package cap04;
import javax.swing.JOptionPane;
public class Questao05 {
    public static void main (String[] args) {
        //Declaração de variáveis
        double op, n1, n2, media, diferença = 0, produto, divisao;
        //Entrada
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1º número: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2º número: "));
        op = Double.parseDouble(JOptionPane.showInputDialog(
                "Você deseja: \n(1) Média entre os números informados "
                        + "\n(2) Diferença do maior pelo menor "
                        + "\n(3) Produto entre os números informados "
                        + "\n(4) Divisão do primeiro pelo segundo"
                        + "\n\nA opção que deseja é: "));
        //Processamento
        media=(n1+n2)/2;
        if (n1>n2)
            diferença = n1 - n2;
        if (n1<n2)
            diferença = n2 - n1;
        produto = n1 * n2;
        divisao = n1/n2;
        //Saída
        if (op == 1)        
            JOptionPane.showMessageDialog(null, "A média entre "+n1+" e "+n2+" é "+media);
        if (op == 2)
            JOptionPane.showMessageDialog(null, "A diferença do maior pelo menor é "+diferença);
        if (op == 3)
            JOptionPane.showMessageDialog(null, "O produto dos números informados é "+produto);
        if (op == 4) 
            if (n2 == 0)
                JOptionPane.showMessageDialog(null, "Operação inválida, atribua outro valor ao 2º número");
            else 
                JOptionPane.showMessageDialog(null, "A divisão do primeiro pelo segundo é "+divisao);
        if (op > 4)
            JOptionPane.showMessageDialog(null, "Opção inválida, erro na execução");        
    }
}
