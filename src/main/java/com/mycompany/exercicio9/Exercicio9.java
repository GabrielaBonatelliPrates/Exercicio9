
package com.mycompany.exercicio9;

/**
 *
 * @author rafae
 */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exercicio9 {

    public static void main(String[] args) {

        int massa;
        double IMC, altura;
        massa = Integer.parseInt(JOptionPane.showInputDialog("Digite seu peso: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));

        IMC = massa / (altura * altura);

        DecimalFormat aproximador = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "Seu IMC é: " + aproximador.format(IMC));

    }
}
