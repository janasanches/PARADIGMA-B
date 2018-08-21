import java.util.Scanner;

	public class CalcularMedia{
	
		public static void main (String[] args)
		{
			//0) declarar variáveis
			double[] notas = new double[10]; // declaração do array de notas
			double menor = 10, maior = 0 ,soma = 0,media=0;
			
			Scanner input = new Scanner(System.in); // ler do teclado
			

			//1) ler do teclado - for
			for( int i=0; i< 10; i++){ // percorrendo o vetor 
				System.out.printf("Digite uma nota\n"); // imprime na tela
				//2) guardar em um vetor o valor que eu li do teclado - for
				notas[i] = input.nextDouble();	 // Chamando o método objeto Scanner 
				soma= notas[i]+ soma;
			}
			//3) calcula media 
			media= soma/10;
			System.out.printf("soma da media e %f", media);
			
			//4) fazer comparações - for e if
			for( int i=0; i<10; i++){
				
				if( notas[i] < menor){
					menor = notas[i];
				}else{
					if ( notas[i] > maior)	{
						
					maior= notas[i];
					}
				}					
			}

			System.out.printf("\nmenor = %f\n",menor);
			
			System.out.printf("\nmaior = %f\n",maior);
			
		}
				
	}			
	
		
		
// como fazer o projeto;

//0) declarar variáveis

//1) ler do teclado - for

//2) guardar em um vetor o valor que eu li do teclado - for

//3) calcula media 

//4) fazer comparações - for e if

//5) imprime na tela o media, nota maior, nota menor

	

