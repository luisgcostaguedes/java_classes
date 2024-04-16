import java.util.Locale;
import java.util.Scanner;

public class List01_05 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
    final double PI = 3.14159;

    a = b = c = areaTriangulo = areaCirculo = areaTrapezio = areaQuadrado = areaRetangulo = 0;

    System.out.println("Digite os valor de A, B, C :");
    a = scanner.nextDouble();

    b = scanner.nextDouble();

    c = scanner.nextDouble();

    areaTriangulo = a * c / 2;
    areaCirculo = PI * Math.pow(c, 2);
    areaTrapezio = (a + b) * c / 2;
    areaQuadrado = Math.pow(b, 2);
    areaRetangulo = a * b;

    System.out.printf("TRIANGULO: %.2f%n", areaTriangulo);
    System.out.printf("CIRCULO: %.2f%n", areaCirculo);
    System.out.printf("TRAPEZIO: %.2f%n", areaTrapezio);
    System.out.printf("QUADRADO: %.2f%n", areaQuadrado);
    System.out.printf("RETANGULO: %.2f%n", areaRetangulo);
    scanner.close();
  }
}
