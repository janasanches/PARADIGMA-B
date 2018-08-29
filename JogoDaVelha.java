import java.util.Scanner;
public class JogoDaVelha
{	
	public static void main(String[] args){
		
		Scanner entrada= new Scanner(System.in);
		boolean ganhou=false, velha=false, posocupada=false;
		int posicao,ponto=0;
		int tabuleiro[][]={{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
		for(int i=0; i<3; i++){
			System.out.printf("\n");
			for(int j=0; j<3; j++){
				System.out.printf(" %d ",tabuleiro[i][j]);
			 
			}
		}
		System.out.printf("\nDigite uma posicao: \n");
		posicao = entrada.nextInt();
		if(posicao<3){
			tabuleiro[0][posicao]=0;
	
		}else{ 
			if(posicao<6){
			tabuleiro[1][posicao-3]=0;
			
			}else{
				tabuleiro[2][posicao-6]=0;
						
			} 
		}
		for(int i=0; i<3; i++){
			System.out.printf("\n");
			for(int j=0; j<3; j++){
				System.out.printf(" %d ",tabuleiro[i][j]);
			 
			}
		}
		
		for( int linha=0; linha<3;linha++){
			for( int coluna=0; coluna<3;coluna++){
				if(tabuleiro[linha][coluna]==0){
					ponto++;
				}
			}
			if(ponto==3){
				System.out.printf("O jogador %d ganhou",0);
				ganhou=true;
			}else{
				ponto=0;
			
			}		}
		
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					if(i==j){
						if(tabuleiro[i][j] == 0){
						ponto++;	
					}
				}
			}	
		}


		if(ponto==3){
				System.out.printf(" %d ganhou diagonal p",ganhou);
				ganhou=false;
		}	
		ponto = 0;
		
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(i+j==2){
					if(tabuleiro[i][j] ==0){
						ponto++;		
					}
				}
			}	
		}
		if(ponto==3){
		System.out.printf(" %d Ganhou diagonal s",ganhou);
			ganhou=false;
		}	
		imprimeTabuleiro(tabuleiro);
		while((ganhou==false)&&(velha==false)){
			System.out.printf("Escolha uma posicao do jogador %d", ponto);
			posicao = entrada.nextInt();
			
			if((posicao>=0)&&(posicao<3)){
				if(tabuleiro[0][posicao]==-1){
					tabuleiro[0][posicao]= ponto;
				}else{
					System.out.println("Essa posicao ja esta ocupada! tente de novo.");
					posocupada = true;
				}
			}else{
								if ((posicao>=3)&&((posicao<6)){
									if(tabuleiro[1][posicao-3]==-1){
										tabuleiro[1][posicao-3] = ponto;
									}else{
										System.out.println("Essa posicao ja esta ocupada! tente de novo.");
										posocupada=true;
									}

								}else{
									if((posicao>=6)&&(posicao<9)){
						if(tabuleiro[2][posicao-6]==-1)
							tabuleiro[2][posicao-6] = ponto;
									}else{
							System.out.println("Esta posicao ja esta ocupada! Tente novamente.");
							posocupada = true;
									}
								}
						}	}

			public static boolean velha(int tabuleiro[][]){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(tabuleiro[i][j] == -1){
					return false;
				}
			}
		}
		System.out.println("Deu Velha!");
		return true;
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
		}	}
			if(i!=2){ //se não for ultima linha
					System.out.println("-------------");
				}
			}
	
		public static boolean ganha(int ponto, int tabuleiro[][]){
			int soma[]={0,0,0};
			int ponto = 0;
			//linha
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(tabuleiro[i][j] == ponto){
					ponto++;	
				}
			}}
			}			if(ponto==3){
				System.out.printf("Jogador %d Ganhou linha",ponto);
					return true;
				}
				ponto = 0;
	}	}
	
		

	