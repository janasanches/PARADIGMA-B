import java.util.Scanner;
public class JogoDaVelha
{	
	public static void main(String[] args){
		
		Scanner entrada= new Scanner(System.in);
		boolean ganhouLinha=false,ganhouColuna=false,ganhouDiaP=false,ganhouDiaS=false, posOcupada=false, velha=false;
		int fim = 0;
		int posicao,ponto=0, vazio =0; //quantidade de espaço vazios
		int jogador = 0;
		int vet[] = {0,0,0}; // são os pontos da coluna 
		int tabuleiro[][]={{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
		
		//prenchimento do tabuleiro
		for(int i=0; i<3; i++){
			System.out.printf("\n");
			for(int j=0; j<3; j++){
				System.out.printf(" %d ",tabuleiro[i][j]);
			 
			}
		}
		//while repetiçao das jogadas
			while(fim == 0) {
				
			//lendo e guardando o numero na posição
			System.out.printf("\nDigite uma posicao jogador %d: \n", jogador );
			posicao = entrada.nextInt();
			
			//verificando se a posicao que o jogador escolheu esta ocupada
				if(tabuleiro[posicao/3][posicao%3]==-1){	
					
				
						
					//ACHANDO [I][J] A PARTIR DA POSIÇÃO;	
					// coloca o valor do jogador na posicao que o jogador escolheu 
					tabuleiro[posicao/3][posicao%3]= jogador;
				
					//imprimir o tabuleiro
					for(int i=0; i<3; i++){
						System.out.printf("\n");
						for(int j=0; j<3; j++){
							System.out.printf(" %d ",tabuleiro[i][j]);
						}
					}
					
					//verificando se a linha ganhou 
					for( int linha=0; linha<3;linha++){
						for( int coluna=0; coluna<3;coluna++){
							if(tabuleiro[linha][coluna]==0){
								ponto++;
							}
						}
						if(ponto==3){
							System.out.printf("O jogador %d ganhou",jogador);
							ganhouLinha=true;
							fim = 1;
						}else{
							ponto=0;
						}		
					}
				
					//percorre a diagonal principal e ve se ganhou
					for(int i = 0; i < 3; i++){
						for(int j = 0; j < 3; j++){
							if(i==j){
								if(tabuleiro[i][j] == jogador){
									ponto++;	
								}
							}
						}		
					}

					if(ponto==3){
							System.out.printf(" %d ganhou diagonal p",jogador);
							ganhouDiaP=true;
							fim = 1;
					}	
				
					//percorre o tabuleiro e ve se ganhou pela diagonal secundaria;
					ponto = 0;// resetando se não ganhou a diagonal principal 
					for(int i = 0; i < 3; i++){
						for(int j = 0; j < 3; j++){
							if(i+j==2){
								if(tabuleiro[i][j] ==jogador){
									ponto++;		
								}
							}
						}	
					}
					if(ponto==3){
						System.out.printf(" %d ganhou diagonal s",jogador);
						ganhouDiaS=true;
						fim = 1;
					}
				
					//percorrendo o tabuleiro e ver se a coluna ganhou;
					ponto = 0;
					for(int i= 0; i<3; i++){
						for(int j = 0; j<3; j++){
							if(tabuleiro[i][j]==jogador){
								vet[j] +=1; 
							}
						}	 
					}
					for(int i=0;i<3;i++){
						if(vet[i]==3){
							System.out.printf("%d ganhou a coluna",jogador);			
							ganhouColuna=true;					
							fim = 1;
						}		
					}
				
					//percorrer o tabuleiro e ver se existe posicao vazia
					//saber se o jogo deu empate
					for(int i=0;i<3;i++){
						for(int j=0; j<3; j++){			
							if(tabuleiro[i][j]== -1){		
								vazio++;
							}
						}
					}
					
					
					
					if(vazio==0){
						velha=true;
						fim = 1;
					}
				}else{
					posOcupada=true;
					
							
				}
				//HA TROCA QUANDO A POSICÇAO NAO ESTA  OCUPADA
				if(posOcupada == false){
					if(jogador == 0){
					jogador++;// TROCA PARA O JOGADOR 1
					}else{
						jogador = 0;// VOLTA PARA O JOGADOR 0;
					}
				}else{
						posOcupada = false;
				}
				
			}
			
			
			
		
		}
}
	