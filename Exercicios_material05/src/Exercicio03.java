import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double consumo, tempo, velocidadeMedia;
		
        //entrada de dados
        System.out.println("Digite o tempo gasto na viagem (em horas):");
        tempo = scanner.nextDouble();
        System.out.println("Digite a velocidade média durante a viagem (em km/h):");
	    velocidadeMedia = scanner.nextDouble();

		// processamento
		consumo = tempo * velocidadeMedia / 10.5;

		System.out.println("A quantidade de litros de combustível gasta na viagem é: " + consumo + " litros");
	
		    }
		
    }

