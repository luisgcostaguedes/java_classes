
import java.util.Locale;

public class List02_06 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    double num;
    System.out.println("Digite um número");
    num = scanner.nextDouble();

    if (num >= 0 && num <= 25) {
      System.out.println("Intervalo [0,25]");
    } else if (num > 25 && num <= 50) {
      System.out.println("Intervalo [25,50]");
    } else if (num > 50 && num <= 75) {
      System.out.println("Intervalo [50,75]");
    } else if (num > 75 && num <= 100) {
      System.out.println("Intervalo [75,100]");
    } else {
      System.out.println("Fora de intervalo");

    }
    scanner.close();
  }

}
