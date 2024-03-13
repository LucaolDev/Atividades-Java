import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double base, altura, area, perimetro;
		
		//entrada de dados 
		System.out.println("Digite a base");
		base = teclado.nextDouble();
		System.out.println("Digite a altura");
		altura = teclado.nextDouble();
		
		//processamento
		area = base * altura;
		perimetro = 2 * (base + altura);
		
	    //saida
		System.out.println("Area = " + area );
		System.out.println("Perimetro = " + perimetro );
	}

}