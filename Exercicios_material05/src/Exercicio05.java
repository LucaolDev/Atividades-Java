import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		double ValorDaHora, DescontoDoINSS, SB, SL, percentualINSS;
		int HorasTrabalhadas;
		
        // entrada de dados
		System.out.println("Informe o Valor da hora aula: "); 
		ValorDaHora = in.nextDouble();
		System.out.println("Informe o número de horas trabalhadas: ");
		HorasTrabalhadas = in.nextInt();
		System.out.println("Informe o a porcentagem de desconto do INSS: ");
		percentualINSS = in.nextDouble();
		
		//processamento
		SB = ValorDaHora * HorasTrabalhadas;
		DescontoDoINSS = (SB * percentualINSS) / 100;
		SL = SB - DescontoDoINSS;
		
		System.out.println("O salário líquido mensal é: " + String.format("%.2f" , SL));
		
        in.close();
		
	}

}