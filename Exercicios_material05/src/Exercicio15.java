import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double l1, l2, l3;

		System.out.print("Digite o valor do primeiro lado: ");
		l1 = in.nextDouble();
		System.out.print("Digite o valor do segundo lado: ");
		l2 = in.nextDouble();
		System.out.print("Digite o valor do terceiro lado: ");
		l3 = in.nextDouble();
		in.close();

		if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
			if (l1 == l2 && l2 == l3) {
				System.out.println("triangulo equilatero.");
			} else {
				if (l1 == l2 || l1 == l3 || l2 == l3) {
					System.out.println("triangulo isosceles");
				} else {
					System.out.println("triangulo escaleno");
				}
			}

		} else {
			System.out.println("Os valores nao forma um triangulo");
		}
	}
}
