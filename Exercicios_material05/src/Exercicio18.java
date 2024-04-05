import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {

		int menor, n1, n2, n3;
		Scanner in = new Scanner(System.in);

		System.out.println("Digite os tres valores separados: ");
		n1 = in.nextInt();
		n2 = in.nextInt();
		n3 = in.nextInt();
		in.close();

		if (n1 != n2 && n1 != n3 && n2 != n3) {
			menor = n1;
			if (n2 < menor) {
				menor = n2;
			}
			if (n3 < menor) {
				menor = n3;
			}
			System.out.println("O menor valor é:  " + menor);
		} else {
			System.out.println("Os valores são iguais");
		}

	}

} 