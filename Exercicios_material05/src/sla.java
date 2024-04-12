import java.util.Scanner;

public class sla {
	public static void main(String[] args) {
		
		double x, y;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digitite o valor de x e y: ");
		x = in.nextDouble();
		y = in.nextDouble();
		in.close();
		
		y = Math.pow(2 * Math.sqrt(x + y * Math.pow( Math.pow(x, 3) / 2, 1.0 / 25.0)), 1.0 / 13.0);
		
		System.out.println("O valor da Expressão é: " + y);
		
	}
}
