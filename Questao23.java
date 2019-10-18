package cap04;

import javax.swing.JOptionPane;

public class Questao23 {

    public static void main(String[] args) {
        int c, q;
        double vd = 0, pf, pu = 0, pt;
        c = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Informe o código do produto: "));
        q = Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Informe a quantidade comprada do produto: "));
        if (c <= 10) {
            pu = 10;
        } else {
            if (c > 11 && c <= 20) {
                pu = 15;
            } else {
                if (c > 20 && c <= 30) {
                    pu = 20;
                } else {
                    if (c > 30 && c <= 40) {
                        pu = 30;
                    }
                }
            }
        }
        pt = pu * q;
        if (pt > 500) {
            vd = 0.15;
        } else {
            if (pt > 250) {
                vd = 0.10;
            } else {
                if (pt <= 250) {
                    vd = 0.05;
                }
            }
        }
        pf = pt + (pt*vd);
        JOptionPane.showMessageDialog(null, 
                "O valor unitario é de: R$"+pu+
                        "\nO valor total é de: R$"+pt+
                        "\nO valor do desconto é de: R$"+vd+
                        "\nO valor final é de: R$"+pf);
    }
}