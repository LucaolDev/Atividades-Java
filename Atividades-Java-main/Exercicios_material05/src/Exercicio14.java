import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double x, y;
		
		System.out.println("Digite o valor X: ");
		x = in.nextDouble();
		in.close();
		
		if (x >= -5 || x <= 5) {System.err.println("Insira um numero menor que -5 e maior que 5 ");
		}
		else {
		y = 8 / Math.sqrt(Math.pow(x, 2) - 25);
		System.out.println("Valor de Y: " + String.format("%.2f" , y));
		}
	}

}
