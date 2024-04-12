import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite o sálario atual: ");
		double salarioAtual = in.nextDouble();

		System.out.println("Digite o cargo (Gerente, Engenheiro, Técnico): ");
		String cargo = in.next();

		System.out.println("Digite o tempo de serviço (anos):");
		int tempoServico = in.nextInt();
		in.close();

		double aumento = calcularAumento(cargo, tempoServico);
		double novoSalario = salarioAtual * (1 + aumento / 100);

		System.out.println("Novo salário: " + novoSalario);
		System.out.println("Salário antigo: " + salarioAtual);
		System.out.println("Diferença: " + (novoSalario - salarioAtual));
	}

	public static double calcularAumento(String cargo, int tempoServico) {
		double aumento;

		switch (cargo) {
		case "Gerente":
			if (tempoServico >= 5)
				aumento = 10;
			else if (tempoServico >= 3)
				aumento = 9;
			else
				aumento = 8;
			break;
		case "Engenheiro":
			if (tempoServico >= 5)
				aumento = 12;
			else if (tempoServico >= 3)
				aumento = 10;
			else
				aumento = 9;
			break;
		case "Técnico":
			if (tempoServico >= 5)
				aumento = 11;
			else if (tempoServico >= 3)
				aumento = 10;
			else
				aumento = 9;
			break;
		default:
			aumento = 5;
		}

		return aumento;
	}

}
