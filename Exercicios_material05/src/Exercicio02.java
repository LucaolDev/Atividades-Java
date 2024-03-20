import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double Celsius, Fahrenheit;
		
		//entrada de dados
		System.out.println("Digite a temperatura em graus Celsius: ");
		Celsius = in.nextDouble();
		
		//processamento
		Fahrenheit = (Celsius * 9) / 5 + 32;
        
		//saida
		System.out.println("Temperatura em Fahrenheit = " + String.format("%.2f" , Fahrenheit));
		
	  in.close();
	}

}