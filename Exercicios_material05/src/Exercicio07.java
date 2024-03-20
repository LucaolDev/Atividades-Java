import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double x, y;
		
		 // entrada de dados 
		System.out.println("Digite o valor de X: ");
		x = in.nextDouble();
		
		//processamento
		y = Math.sqrt(1 + Math.pow((Math.pow(x, 4) - 1)/( 2* Math.pow(x, 2)) , 2)) - Math.pow(x, 2) / 2;
		
		//saida
	    System.out.println("O valor da expressão é: " + String.format("%.3f" , y));
	    
	    in.close();    
	}

}
