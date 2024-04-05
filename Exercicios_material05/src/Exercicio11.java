import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n1, n2, n3, m;

		System.out.print("Nota 1 --> ");
		n1 = in.nextDouble();
		System.out.print("Nota 2 --> ");
		n2 = in.nextDouble();
		System.out.print("Nota 3 --> ");
		n3 = in.nextDouble();
		in.close();

		m = (n1 + n2 + n3) / 3;
		System.out.println("Média = " + String.format("%.2f", m));

		if (m >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

	}

}
