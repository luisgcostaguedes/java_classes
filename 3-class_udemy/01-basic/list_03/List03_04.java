import java.util.Scanner;
import java.util.Locale;

public class List03_04 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre com o número de testes que serão realizados: ");
    int numTestes = scanner.nextInt();

    for (int i = 1; i <= numTestes; i++) {
      System.out.println("Entre com os números: ");
      double num1 = scanner.nextDouble();
      double num2 = scanner.nextDouble();

      if (num2 == 0) {
        System.out.println("Divisão por zero não é permitida.");
      } else {
        double divisao = num1 / num2;
        System.out.println("Resultado da divisão: " + divisao);
      }

    }
    scanner.close();
  }
}
