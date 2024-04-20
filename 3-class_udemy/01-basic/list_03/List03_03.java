import java.util.Scanner;
import java.util.Locale;

public class List03_03 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre com o número de testes que serão realizados: ");
    int numTestes = scanner.nextInt();

    System.out.println("Digite os números a serem analisados: ");
    for (int i = 1; i <= numTestes; i++) {
      System.out.println("Entre com os números: ");
      double num1 = scanner.nextDouble();
      double num2 = scanner.nextDouble();
      double num3 = scanner.nextDouble();

      double media = (num1 * 2 + num2 * 3 + num3 * 5) / 10;
      System.out.println("Média ponderada de número " + i + "tem como resultado: " + media);

    }

    scanner.close();
  }
}
