import java.util.Locale;

public class Exe07 {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    double x, y;
    System.out.println("Digite o valor de x:");
    x = scanner.nextDouble();
    System.out.println("Digite o valor de y:");
    y = scanner.nextDouble();
    if (x == 0 && y == 0) {
      System.out.println("Origem");
    } else if (x > 0 && y > 0) {
      System.out.println("Q1");
    } else if (x < 0 && y > 0) {
      System.out.println("Q2");
    } else if (x < 0 && y < 0) {
      System.out.println("Q3");
    } else {
      System.out.println("Q4");
    }
    scanner.close();
  }

}
