import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, dezena;
        
		 // entrada de dados 
         System.out.print("Digite um número de três dígitos: ");
         numero = in.nextInt();
        
        // processamento
        if (numero >= 100 && numero <= 999) {
             dezena = (numero / 10) % 10;
            
        // saida
            System.out.println("A dezena do número é: " + dezena);
        } else {
            System.out.println("O número digitado não possui três dígitos.");
        }
        
        in.close();
    }
}
