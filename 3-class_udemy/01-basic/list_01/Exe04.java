import java.util.Locale;
import java.util.Scanner;

public class Exe04 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);
    int numero_Funcionario;
    double horas_Trabalhadas, valor_Hora, salario;
    salario = horas_Trabalhadas = valor_Hora = numero_Funcionario = 0;

    System.out.println("Digite o número do funcionário:");
    numero_Funcionario = scanner.nextInt();
    System.out.println("Digite o número de horas trabalhadas:");
    horas_Trabalhadas = scanner.nextDouble();
    System.out.println("Digite o valor da hora trabalhada:");
    valor_Hora = scanner.nextDouble();
    salario = horas_Trabalhadas * valor_Hora;
    System.out.printf("O funcionário: " + numero_Funcionario + " deve receber: %.2f%n ", salario);

  }
}