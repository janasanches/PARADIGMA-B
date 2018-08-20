import java.util.Scanner;
public class AlunoTest{
	public static void main(String args[]){
		Aluno[] alunos = new Aluno[10]; //array de alunos
		double[] notas = new double[10]; //array de notas
		double nota,
			   media,		
			   menor = 10, 
			   maior = 0, 
			   soma = 0;
		
		Scanner entrada =  new Scanner(System.in);
		
		for(int i = 0; i < 10; i++){
			System.out.println("Digite uma nota:");
			nota = entrada.nextDouble();
			notas[i] = nota;
			
			if(nota < menor){
					menor = nota;
			}else{
				if(nota > maior){
					maior = nota;
				}
			}
			
			soma += nota;
		}
		
		media = soma/10;
		
		System.out.printf("Menor nota = %.2f\n",menor);
		System.out.printf("Maior nota = %.2f\n",maior);
		System.out.printf("Media = %.2f\n",media);
	}
}