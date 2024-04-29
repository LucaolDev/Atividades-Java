import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double vt, dc;

		System.out.print("Digite o valor da compra ");
		vt = in.nextDouble();
		in.close();

		if (vt >= 1000) {
			dc = vt * 0.15;
			vt = vt - dc;
			System.out.println("Valor da compra com 15% de desconto: " + vt + "  \ne seu desconto: " + dc);
		} else {
			dc = vt * 0.08;
			vt = vt - dc;
			System.out.println("Valor da compra com 8% de desconto: " + vt + "  \ne seu desconto: " + dc);
		}

	}

}
