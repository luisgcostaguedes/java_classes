import java.util.Scanner;

public class Exe02 {

  public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      int n;
      System.out.println("Digite um número inteiro");
      n = scanner.nextInt();
  
      if (n % 2 == 0) {
        System.out.println("PAR");
      } else {
        System.out.println("IMPAR");
      }
  }
}
