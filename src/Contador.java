import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub

		Scanner leitor = new Scanner (System.in); 
		String senhadigitada;
		senhadigitada = leitor.next();
		System.out.println("Qual é a resposta para a vida, o universo e tudo mais?");
		
		while(senhadigitada != "42") {
			
			leitor.close();
			
		}
	}

}










/*Imagine que uma ONG precise saber a média de idades dos alunos de uma escola.
 * Sabendo de antemão quantos alunos existem e sem a necessidade de armazenar permanentemente a idade de cada um desses alunos, qual é a melhor forma de calcular essa média?

Scanner leitor = new Scanner (System.in);
int idade;
int quantidade;
int contador=0;
int total_idades = 0;
double media;
System.out.println("Quantos alunos existem na escola?");
quantidade = leitor.nextInt();

while(contador<quantidade) {
	System.out.println("Por favor, digite a idade do aluno");
	
	idade = leitor.nextInt();
	contador = contador +1;
	total_idades = total_idades + idade;
}
media = total_idades / (double)quantidade;

System.out.println("Para as idades digitadas, a média encontrada foi de  " + media);
leitor.close();
}
	*/