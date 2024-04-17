import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String cargo;
		int anos;
		double salario, novosalario = 0, porcentagem = 0;
		
		System.out.println("Digite seu salário: ");
		salario = in.nextDouble();
		
		System.out.println("Digite seu cargo: ");
		cargo = in.next();
		
		System.out.println("Digite seu tempo de serviço em anos: ");
		anos = in.nextInt();
		in.close();
		
		if(cargo.equalsIgnoreCase("gerente"))
		{
			if (anos >= 5)
			{
				porcentagem = 10;
			}
			else if (anos >= 3 && anos < 5)
			{
				porcentagem = 9;
			}
			else
			{
				porcentagem = 8;
			}
		}
		
		else if(cargo.equalsIgnoreCase("engenheiro"))
		{
			if (anos >= 5)
			{
				porcentagem = 11;
			}
			else if (anos >= 3 && anos < 5)
			{
				porcentagem = 10;
			}
			else
			{
				porcentagem = 9;
			}
		}
		
		else if(cargo.equalsIgnoreCase("técnico"))
		{
			if (anos >= 5)
			{
				porcentagem = 12;
			}
			if (anos >= 3 && anos < 5)
			{
				porcentagem = 11;
			}
			if (anos < 3)
			{
				porcentagem = 10;
			}
		}else {
			porcentagem = 5;
		}
		
		novosalario = salario + salario * porcentagem/100;
		
		System.out.println("Seu novo salário é: " + novosalario);
		System.out.println("Seu salário antigo: " + salario);
		System.out.println("Diferença de salário: " + (novosalario - salario));
		
	}

}
