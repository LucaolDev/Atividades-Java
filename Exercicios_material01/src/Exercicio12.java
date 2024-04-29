import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double p1, p2, t1, t2, t3, mp, mt, mf;
		double tolerancia = 0.01;

		System.out.print("Prova 1 --> ");
		p1 = in.nextDouble();
		System.out.print("Prova 2 --> ");
		p2 = in.nextDouble();
		System.out.print("Trabalho 1 --> ");
		t1 = in.nextDouble();
		System.out.print("Trabalho 2 --> ");
		t2 = in.nextDouble();
		System.out.print("Trabalho 3 --> ");
		t3 = in.nextDouble();
		in.close();

		mp = (p1 + p2) / 2;
		mt = (t1 + t2 + t3) / 3;
		mf = (mp * 0.7) + (mt * 0.3);

		if (mf >= 6 - tolerancia) {
			System.out.print("Aprovado: " + String.format("%.2f", mf));
		} else {
			System.err.print("Reprovado " + String.format("%.2f", mf));
		}

	}

}
