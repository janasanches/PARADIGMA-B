
import java.util.Scanner;

public class Circulo
{
	public static void main(String args[])
	{
	
	double area,diametro,circulo;
	int raio;
	
	Scanner entrada= new Scanner(System.in);  // estou lendo do teclado
	
	System.out.println("digite o valor do raio:");// ler do teclado
	  raio = entrada.nextInt();
	  
	  area = 3.14*raio*raio;
	 System.out.printf("Area da circunferencia= %.2f\n", area); // imprimindo o valor do teclado
	 
	 circulo= 2*3.14*raio;
	 System.out.printf("Comprimento da circunfercia:%.2f\n",circulo); // imprime o valor
	 
	 diametro = 2*raio;
	 System.out.printf("Diametro do raio:%.2f\n",diametro); // imprime o valor 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	
	
	}
}