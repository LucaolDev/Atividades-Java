import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);
			double vtc, dc;
			
			System.out.print("Digite o valor da compra ");
			vtc = in.nextDouble();
	        in.close();
	        
	        if (vtc >= 1000) {
	        	vtc = vtc * 0.15;
	        	System.out.print("Valor da compra com 15% de desconto: " + vtc);
	        }else {
	        	vtc = vtc * 0.8;
	        	System.out.print("Valor da compra com 8% de desconto: " + vtc);
	        }
	        	
	           			
	        
	        
	        
	        

	}

}
