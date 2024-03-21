import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double consumo, tempo, velocidadeMedia;
		
        //entrada de dados
        System.out.println("Digite o tempo gasto na viagem (em horas): ");
        tempo = in.nextDouble();
        System.out.println("Digite a velocidade média durante a viagem (em km/h): ");
	    velocidadeMedia = in.nextDouble();
	    in.close();
	    
		// processamento
		consumo = tempo * velocidadeMedia / 10.5;

		//saida
		System.out.println("A quantidade de litros de combustível gasta na viagem é: " + consumo + " litros");
	
	 }
		
}



