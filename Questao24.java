package cap04;
import javax.swing.JOptionPane;
public class Questao24 {
    public static void main(String[] args) {
        //Declaração
        String[] options = {"", "1", "2", "3"};
        String[] op = {"", "1", "2"};
        double preco, npreco = 0, newSalImp;
        int categoria;
        int situacao;
        //Entrada
        preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do produto:"));
        JOptionPane.showMessageDialog(null, "Categoria: \n (1) Limpeza: \n (2) Alimentação: \n (3) Vestuario:");
        categoria = (JOptionPane.showOptionDialog(null, "Qual procedimento você deseja seguir? ",
                "Escolha ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[1]));
        situacao = (JOptionPane.showOptionDialog(null, "Situacao: \nNescessita de refrigeração? \n(1)Sim\n(2)Não",
                "Escolha ",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, op, op[1]));
        //Processamento e´saída
        if (preco <= 25) {
            switch (categoria) {
                case 1:
                    npreco = ((preco * 5) / 100) + preco;
                    break;
                case 2:
                    npreco = ((preco * 8) / 100) + preco;
                    break;
                case 3:
                    npreco = ((preco * 10) / 100) + preco;
                    break;
            }
        } else {
            switch (categoria) {
                case 1:
                    npreco = ((preco * 12) / 100) + preco;
                    break;
                case 2:
                    npreco = ((preco * 15) / 100) + preco;
                    break;
                case 3:
                    npreco = ((preco * 18) / 100) + preco;
                    break;
            }
        }
        if (situacao == 1 || categoria == 2) {

            newSalImp = (((preco * 5) / 100) + npreco);
            JOptionPane.showMessageDialog(null, "Preço final: R$" + newSalImp);
        } else {
            newSalImp = (((preco * 8) / 100) + npreco);
            JOptionPane.showMessageDialog(null, "Preço final: R$" + newSalImp);
        }
    }
}