
import java.util.Scanner;

public class List01_02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    final double PI = 3.14159;
    double raio, area;

    System.out.println("Digite o raio do círculo");
    raio = scanner.nextDouble();
    area = PI * raio * raio;
    System.out.println("Área do círculo é: " + area);
    scanner.close();

  }
}
