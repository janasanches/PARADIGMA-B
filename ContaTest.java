import java.util.Scanner;
public class ContaTest{
	public static void main(String args[]){
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();
		Conta conta3 = new Conta();
		Scanner entrada =  new Scanner(System.in);
		
		conta1.setNumero(1345);
		conta1.setNome("ANA");
		conta1.setSaldo(20.00);
		conta1.setLimite(4.5);
		conta1.imprime();
		
		conta2.setNumero(16253);
		conta2.setNome("Paula");
		conta2.setSaldo(5000.00);
		conta2.setLimite(400.00);
		conta2.imprime();
		
		
		System.out.printf("Digite o numero da conta.\n");
		conta3.setNumero(entrada.nextInt());
		entrada.nextLine();//fiz um nextLine novamente pois se não ele pula ????
		System.out.printf("Digite o nome do(a) correntista.\n");
		conta3.setNome(entrada.nextLine());
		System.out.printf("Digite o valor o saldo.\n");
		conta3.setSaldo(entrada.nextDouble());
		System.out.printf("Digite o valor do limite.\n");
		conta3.setLimite(entrada.nextDouble());
		conta3.imprime();
		
	}
}