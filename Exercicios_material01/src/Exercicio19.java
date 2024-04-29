import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		int n1, n2, n3, temp;
		Scanner in = new Scanner(System.in);

		System.out.println("Digite os tres valores separados: ");
		n1 = in.nextInt();
		n2 = in.nextInt();
		n3 = in.nextInt();
		in.close();

		if (n1 > n2) {
			temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if (n2 > n3) {
			temp = n2;
			n2 = n3;
			n3 = temp;
		}
		if (n1 > n2) {
			temp = n1;
			n1 = n2;
			n2 = temp;
		}

		System.out.println(n1 + ", " + n2 + ", " + n3);

	}

}
