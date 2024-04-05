import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		double quilowatts, salario, valorTotal, valorPorquilowatts, desconto;
		DecimalFormat mascara = new DecimalFormat("#.00");

		// entrada de dados
		System.out.println("Digite o valor do salario: ");
		salario = in.nextDouble();
		System.out.println("Digite a quantidade de quilowatts gasta: ");
		quilowatts = in.nextDouble();
		in.close();

		// processamento de dados
		valorPorquilowatts = salario / 7 / 100;
		valorTotal = valorPorquilowatts * quilowatts;
		desconto = valorTotal * 0.9;

		// saida
		System.out.println("Valor em reais de cada quilowatt  " + mascara.format(valorPorquilowatts));
		System.out.println("Valor em reais a ser pago pela residência  " + mascara.format(valorTotal));
		System.out.println(
				"valor a ser pago pela residência considerando um desconto de 10%  " + mascara.format(desconto));

	}

}