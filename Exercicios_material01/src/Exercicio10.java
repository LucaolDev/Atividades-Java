import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int binario, decimal;
		int d1, d2, d3, d4;

		// entrada de dandos
		System.out.println("Informe um valor em binário (4 bit): ");
		binario = in.nextInt();
		in.close();

		// processamento
		d1 = (int) (binario / 1000 * Math.pow(2, 3));
		d2 = (int) (binario / 100 % 10 * Math.pow(2, 2));
		d3 = (int) (binario % 100 / 10 * Math.pow(2, 1));
		d4 = (int) (binario % 10 * Math.pow(2, 0));
		decimal = d1 + d2 + d3 + d4;

		// saida
		System.out.println(binario + " = " + decimal);
	}
}
