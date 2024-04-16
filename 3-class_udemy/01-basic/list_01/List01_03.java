
import java.util.Scanner;

public class List01_03 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a, b, c, d, diferenca;

    System.out.println("Entre com quatro valores inteiros:");
    a = scanner.nextInt();
    b = scanner.nextInt();
    c = scanner.nextInt();
    d = scanner.nextInt();
    diferenca = (a * b - c * d);
    System.out.println("Diferença dos produtos é: " + diferenca);
    scanner.close();
  }
}

