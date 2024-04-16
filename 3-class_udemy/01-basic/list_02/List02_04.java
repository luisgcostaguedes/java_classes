
import java.util.Scanner;

public class List02_04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int horaInicial, horaFinal, duracao;

    System.out.println("Digite a hora inicial do jogo");
    horaInicial = scanner.nextInt();
    System.out.println("Digite a hora final do jogo");
    horaFinal = scanner.nextInt();

    if (horaInicial < horaFinal) {
      duracao = horaFinal - horaInicial;
    } else {
      duracao = 24 - horaInicial + horaFinal;
    }

    System.out.println("O jogo durou " + duracao + " horas");
    scanner.close();
  }

}
