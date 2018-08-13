// o nome da class tem que ser igual a do arquivo.
import java.util.Scanner; // tem que ter essa biblioteca sempre que quiser ler do teclado.



public class Addition 
{	
	
	public static void main( String args[])
	{	
		Scanner input = new Scanner(System.in); 
		/* scanner=objeto
		   input= é o nome da variável = novo Scanner(System.in) 
		   Scanner = ler do teclado
		   System.in = ele pega do teclado a informação 
		
		outra forma:
		Scanner entrada; 
		entrada = new Scanner(System.in); // (System.in)= é um dado
		
		tipoDaVariavel nomeDaVariavel recebe valor;
		int				numero			= 		10;
		Scanner 		input 			= new Scanner(System.in);
		*/
		int number1;
		int number2;
		int sum;
		
		System.out.print ("Enter first integer: ");
		
		number1= input.nextInt();//chamando o método do objeto scanner
		
		System.out.print("Enter second integer: ");
		number2= input.nextInt();
		
		sum= number1 + number2;
		
		System.out.printf( " Sum is %d\n", sum);
		
		}
		
		}
		
		

