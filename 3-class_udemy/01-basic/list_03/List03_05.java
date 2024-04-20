import java.util.Scanner;
import java.util.Locale;

public class List03_05 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    System.out.println("Entre com um número inteiro: ");
    int num = scanner.nextInt();
    if (num != 0) {
      for (int i = num - 1; i > 1; i--) {
        num *= i;
      }
    } else {
      num = 1;
    }
    System.out.println("Fatorial é " + num);

    scanner.close();
  }

}
