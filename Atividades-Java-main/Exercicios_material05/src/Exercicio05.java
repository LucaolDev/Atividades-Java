import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
 
		Scanner in = new Scanner(System.in);
		double ValorDaHora, HorasTrabalhadasNoMês, DescontoDoINSS, SB;
		
        // entrada de dados
		System.out.println("Digite o Valor da hora aula"); 
		ValorDaHora = in.nextDouble();
		System.out.println("número de horas trabalhadas");
		HorasTrabalhadasNoMês = in.nextDouble();
		
		//processamento
		SB = ValorDaHora * HorasTrabalhadasNoMês;
		
		
		
	}

}
