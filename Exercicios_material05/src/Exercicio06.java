import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x, y;
		
        // entrada de dados 
		System.out.println("Digite o valor de X: ");
		x = in.nextDouble();
		
		//processamento
		y = Math.sqrt(Math.cbrt(x - 0.5));
		
		//saida
		System.out.println("O valor da expressão é: " + String.format("%.3f" , y));
		
		in.close();
	}

}