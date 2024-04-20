import java.util.Scanner;
import java.util.Locale;

public class List03_07 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre com o número inteiro: ");
    int num = scanner.nextInt();
    double resultado1, resultado2, resultado3 = 0;

    for (int i = 1; i <= num; i++) {
      resultado1 = Math.pow(i, 1);
      resultado2 = Math.pow(i, 2);
      resultado3 = Math.pow(i, 3);
      System.out.println(i + " " + resultado1 + " " + resultado2 + " " + resultado3);
    }
    scanner.close();
  }

}
