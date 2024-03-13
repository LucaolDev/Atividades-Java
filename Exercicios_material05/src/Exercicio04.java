import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double quilowatts, salario, valorTotal, valorPorquilowatts, desconto;
		
		//entrada de dados
		System.out.println("Digite o valor do salario ");
		salario = scanner.nextDouble();
		
		System.out.println("Digite a quantidade de quilowatts gasta ");
		quilowatts = scanner.nextDouble();
		valorPorquilowatts = salario / 7 / 100;
		valorTotal =  valorPorquilowatts * quilowatts;
		desconto = valorTotal / 0.9;
		
		System.out.println("Valor em reais de cada quilowatt  " + String.format("%.2f" , valorPorquilowatts));
	    System.out.println("Valor em reais a ser pago pela residência  " + String.format("%.2f" , valorTotal));
	    System.out.println("valor a ser pago pela residência considerando um desconto de 10%  " + String.format("%.2f" , desconto));
		
		
				
		
		
		
		
		
	}

}
