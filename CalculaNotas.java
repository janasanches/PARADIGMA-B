import java.util.Scanner;
public class CalculaNotas{
	public static void main(String args[]){
		//0 - declaração das variaveis
		Aluno[] alunos = new Aluno[10]; //array de alunos
		double[] notas = new double[10]; //array de notas
		double media,		
			   menor = 10, 
			   maior = 0, 
			   soma = 0;
			   
		Scanner entrada =  new Scanner(System.in);
		
		//1 - ler do teclado (usando for e scanner)

		for(int i = 0; i < 10; i++){
			System.out.println("Digite uma nota:");
			notas[i] = entrada.nextDouble(); //2 - colocar na vetor de notas (usando for)
			
			//3 - fazer soma das notas (usando for)
			soma += nota;
		}
		
		//4 - calcular media
		media = soma/10;
		
		//5 - comparar notas (usando if e for para descobrir a maior e a menor nota)
		for(i = 0; i < 10; i++){
			if(notas[i] < menor){
					menor = notas[i];
			}else{
				if(notas[i] > maior){
					maior = notas[i];
				}
			}
		}
		
		//7 - printar media, maior e menor nota (usando printf)
		System.out.printf("Menor nota = %.2f\n",menor);
		System.out.printf("Maior nota = %.2f\n",maior);
		System.out.printf("Media = %.2f\n",media);
	}
}