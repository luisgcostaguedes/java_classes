import java.util.Scanner;

public class Exe05 {
  public static void main(String[] args) {
    int codProduto, quantProduto;
    double totalPedido;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o código do produto");
    codProduto = scanner.nextInt();
    System.out.println("Digite a quantidade do produto");
    quantProduto = scanner.nextInt();
    switch (codProduto) {
      case 1:
        totalPedido = quantProduto * 4.00;
        System.out.println("Total: R$ " + totalPedido);

        break;
      case 2:
        totalPedido = quantProduto * 4.50;
        System.out.println("Total: R$ " + totalPedido);

        break;
      case 3:
        totalPedido = quantProduto * 5.00;
        System.out.println("Total: R$ " + totalPedido);

        break;
      case 4:
        totalPedido = quantProduto * 2.00;
        System.out.println("Total: R$ " + totalPedido);

        break;
      case 5:
        totalPedido = quantProduto * 1.50;
        System.out.println("Total: R$ " + totalPedido);

        break;

      default:
        System.out.println("Código inválido");
        break;
    }
    scanner.close();
  }

}

// Neste exemplo o arquivo feito pelo altor usou if e else if, eu usei switch
// case, o resultado é o mesmo, mas acho mais eficiente usar switch case.
