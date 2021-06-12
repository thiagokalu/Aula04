import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner (System.in;)
		int n, res;
		int contador = 1;
		System.out.println("você quer calcular a tabuada de qual número?");
		n = leitor.nextInt();
	
		while(contador <= 10) {
			res = n * contador;
			System.out.println(n + " x" + contador + " = " + res);
			contador = contador + 1;
		}
	
	}

}
