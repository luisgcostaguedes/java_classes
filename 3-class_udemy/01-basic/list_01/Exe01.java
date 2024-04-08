import java.util.Scanner;

public class Exe01 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int a, b, soma;

    System.out.println("Digite o primeiro valor");
    a = scanner.nextInt();
    System.out.println("Digite o segundo valor");
    b = scanner.nextInt();
    soma = a + b;
    System.out.println("Resultado da soma é: " + soma);
  }
}