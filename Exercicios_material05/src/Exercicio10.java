import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um valor binário de 4 bits: ");
        String binaryString = in.nextLine();
        in.close();
        
        // Verifica se a entrada tem exatamente 4 bits
        if (binaryString.length() != 4) {
            System.out.println("Por favor, insira um valor binário de 4 bits.");
            return;
        }

        // Converte o valor binário para decimal
        int decimalValue = Integer.parseInt(binaryString, 2);

        // Imprime o valor decimal
        System.out.println("O valor decimal é: " + decimalValue);

        
    }
}
