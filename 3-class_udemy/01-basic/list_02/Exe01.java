import java.util.Scanner;

public class Exe01 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n;
    System.out.println("Digite um número inteiro");
    n = scanner.nextInt();

    if (n < 0) {
      System.out.println("NEGATIVO");
    } else {
      System.out.println("NÃO NEGATIVO");
    }

  }
}