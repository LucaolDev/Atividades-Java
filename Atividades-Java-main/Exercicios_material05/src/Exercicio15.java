import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double l1, l2, l3;
		
		System.out.println("Digite o valor do primeiro lado: ");
		l1 = in.nextDouble();
		System.out.println("Digite o valor do segundo lado: ");
		l2 = in.nextDouble();
		System.out.println("Digite o valor do terceiro lado: ");
		l3 = in.nextDouble();
		in.close();
		
        if (l1 < l2 + l3 && l2 < l1 + l3 && l3 < l1 + l2) {
        	System.out.println("Os valores representam os lados de um triângulo.");
        	}
        else {
        	System.out.println("Os valores não representam os lados de um triângulo.");
        }
	}

}
