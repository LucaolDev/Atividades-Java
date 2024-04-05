import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double vtc, dc = 0;

		System.out.print("Digite o valor da compra ");
		vtc = in.nextDouble();
		in.close();

		if (vtc >= 1000) {
			dc = vtc * 0.15;
			vtc = vtc - dc;
			System.out.print("Valor da compra com 15% de desconto: " + vtc + " e seu desconto " + dc);
		} else {
			dc = vtc * 0.08;
			vtc = vtc - dc;
			System.out.print("Valor da compra com 8% de desconto: " + vtc + " e seu desconto " + dc);
		}

	}

}
