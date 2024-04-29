import java.util.Scanner;

public class Exercicio17 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite os valores dos coeficientes da equação de segundo grau (ax^2 + bx + c): ");

		System.out.println(" Valor de a: ");
		double a = in.nextDouble();
		if (a == 0) {
			System.out.println("Não é uma equação de segundo grau");
		} else {
			System.out.println("Valor de b: ");
			double b = in.nextDouble();
			System.out.println("Valor de c: ");
			double c = in.nextDouble();
			in.close();
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("A equação não tem raiz real");
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = " + x1);
				System.out.println("x2 = " + x2);
			}

		}

	}

}
