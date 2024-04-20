import java.util.Scanner;
import java.util.Locale;

public class List03_06 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com o número para ver seus divisores: ");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}
		scanner.close();
	}

}
