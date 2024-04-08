import java.util.Scanner;

public class Exe03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a, b;
    System.out.println("Digite o primeiro valor");
    a = scanner.nextInt();
    System.out.println("Digite o segundo valor");
    b = scanner.nextInt();

    if (a % b == 0 || b % a == 0) {
      System.out.println("São múltiplos");
    } else {
      System.out.println("Não são múltiplos");
    }
  }
}
