import java.util.Scanner;

public class Exe02 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de números a serem analisados: ");
    int numero = scanner.nextInt();

    int in = 0;
    int out = 0;

    for (int i = 0; i < numero; i++) {
      int x = scanner.nextInt();
      if (x >= 10 && x <= 20) {
        in += +1;

      } else {
        out += +1;
      }
    }

    System.out.println(in + " in");
    System.out.println(out + " out");
    scanner.close();
  }
}
