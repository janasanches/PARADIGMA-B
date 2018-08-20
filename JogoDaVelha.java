import java.util.Scanner;

public class JogoDaVelha{
	public static void main(String args[]){
		int tabuleiro[][] = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}}; //array de alunos		
		boolean ganhou = false, posOcupada = false;
		int posicao, qualJogador = 0;
		Scanner entrada =  new Scanner(System.in);
		
		imprimeTabuleiro(tabuleiro);
		
		while((ganhou == false)&&(posOcupada == false)){
			System.out.printf("Escolha uma posição jogador %d\n:", qualJogador);
			posicao = entrada.nextInt();
			
			if ((posicao>=0)&&(posicao<3)){
				if(tabuleiro[0][posicao]==-1){
					tabuleiro[0][posicao] = qualJogador;
				}else{
					System.out.println("Esta posicao ja esta ocupada! Tente novamente.");
					posOcupada = true;
				}
			}else{
				if ((posicao>=3)&&(posicao<6)){
					if(tabuleiro[0][posicao]==-1){
						tabuleiro[1][posicao-3] = qualJogador;
					}else{
						System.out.println("Esta posicao ja esta ocupada! Tente novamente.");
						posOcupada = true;
					}
				}else{
					if ((posicao>=6)&&(posicao<9)){
						if(tabuleiro[0][posicao]==-1){
							tabuleiro[2][posicao-6] = qualJogador;
						}else{
							System.out.println("Esta posicao ja esta ocupada! Tente novamente.");
							posOcupada = true;
						}
					}
				
				}
				
			}
			
		}

		
	}
	
	public static void imprimeTabuleiro(int tabuleiro[][]){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				System.out.printf(" %d ",tabuleiro[i][j]);
				if(j!=2){ //se não for ultima coluna
					System.out.printf("|");
				}else{
					System.out.printf("\n");
				}
			}
			if(i!=2){ //se não for ultima linha
					System.out.println("-------------");
				}
		}
	}
	
	public static void ganha(int jogador, int tabuleiro[][]){
		//ganha 012,345,678,036,147,258,048,246
		//ganha [0][0]
		int linha=0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(tabuleiro[i][j] == jogador){
					ponto++;
				}
			}
		}
	}

}