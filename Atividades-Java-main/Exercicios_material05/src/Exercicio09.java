import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		//entrada de dados
		System.out.println("Digite um número de três digitos: ");
		int numero = in.nextInt();
		in.close();
		
		//processamento
		if (numero >= 100 && numero <= 999) {
	    int DigitoCentena = numero / 100; 
	    int DigitoDezena = (numero / 10) % 10;
		int DigitoUnidade = numero % 10;
		int numeroInvertido = (DigitoUnidade *100) + (DigitoDezena *10) + DigitoCentena;
		
		//saida
		System.out.println("Número Invertido: " + numeroInvertido);}
		else {
			System.out.println("O número digitado não possui três dígitos.");
		}

	}

}
