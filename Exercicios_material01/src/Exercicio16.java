import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double vt;
		int dias;

		System.out.println("Digite quantos dias ficou no hotel: ");
		dias = in.nextInt();
		in.close();

		if (dias > 0) {
			if (dias >= 16) {
				vt = dias * (250 + 15.50);
			} else if (dias == 15) {
				vt = dias * (250 + 36);
			} else {
				vt = dias * (250 + 58);
			}
			System.out.println("Valor da conta: " + String.format("%.2f", vt));
		} else {
			System.err.println("Digite novamente");
		}

	}

}
// ctrl shift f 