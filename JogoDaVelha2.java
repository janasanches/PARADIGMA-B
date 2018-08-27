import java.util.Scanner;

public class JogoDaVelha2{
	public static void main(String args[]){	
		boolean ganhou = false, posOcupada = false;
		int posicao, qualJogador = 0;
		
		Scanner entrada =  new Scanner(System.in);
		Tabuleiro tab = new Tabuleiro();
		tab.iniciaMatriz();
		
		tab.imprimeTabuleiro();
		
		while(ganhou == false){
			System.out.printf("Escolha uma posicao jogador %d:\n", qualJogador);
			posicao = entrada.nextInt();
			
			posOcupada = tab.preencheTabuleiro(posicao, qualJogador);
			
			tab.imprimeTabuleiro();
			
			ganhou = tab.ganha(qualJogador);
			if(posOcupada == false){
				if(qualJogador == 0){
					qualJogador++;
				}else{
					qualJogador = 0;
				}
			}else{
				posOcupada = false;
			}
			ganhou = tab.velha();
		}
		
		

		
	}
	
}