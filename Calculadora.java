import javax.swing.*;

public class Calculadora {
   public static void main (String [] args){
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Primeiro Valor"));
      String operador = JOptionPane.showInputDialog("Digite a Operação");
      int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Segundo Valor"));
      if (operador.trim().equals("+")) {
          System.out.println("Calculadora" + "\nSoma" + "\nResultado: " + n1 + " + " + n2 + " = " + (n1 + n2));
          JOptionPane.showMessageDialog(null, "Calculadora" + "\nSoma" + "\nResultado: " + n1 + " + " + n2 + " = " + (n1 + n2));
       } else if (operador.trim().equals("-")) {
          System.out.println("Calculadora" + "\nSubtracao" + "\nResultado: " + n1 + " - " + n2 + " = " + (n1 - n2));
          JOptionPane.showMessageDialog(null, "Calculadora" + "\nSubtracao" + "\nResultado: " + n1 + " - " + n2 + " = " + (n1 - n2));
         
   }
}