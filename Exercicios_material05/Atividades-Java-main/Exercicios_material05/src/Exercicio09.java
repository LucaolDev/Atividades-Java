import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.err.println("Digite um número de três digitos: ");
		int numero = in.nextInt();
		
	    int DigitoCentena = numero / 100; 
	    int DigitoDezena = (numero / 10) % 10;
		int DigitoUnidade = numero % 10;
		
		int numeroInvertido = (DigitoUnidade *100) + (DigitoDezena *10) + DigitoCentena;
		System.out.println("Número Invertido:" + numeroInvertido);
		
		in.close();
		

	}

}
