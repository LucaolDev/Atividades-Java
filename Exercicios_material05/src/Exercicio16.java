import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double vd, dias;
        
		System.out.println("Digite quantos dias ficou no hotel: ");
		dias = in.nextDouble();
		in.close();
		
		if (dias >= 16 ) {
			vd = (250 * dias) + (15.50 * dias); 
			System.out.println("Valor da conta: " + vd );
		} else if (dias == 15) {
			vd = (250 * dias) + (36 * dias); 
			System.out.println("Valor da conta: " + vd );
		}	else {
				vd = (250 * dias) + (58 * dias); 
				System.out.println("Valor da conta: " + vd );
			}
				
		
		
	}

}
