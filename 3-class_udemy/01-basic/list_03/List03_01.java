

public class List03_01 {
  public static void main(String[] args) {

    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.println("Digite um número inteiro: ");
    int numero = scanner.nextInt();

    for (int i = 1; i <= numero; i++) {
      if (i % 2 != 0) {
        System.out.println(i);
      }
    }

    scanner.close();

  }
}
