import java.util.Scanner;
public class Matriz{
	int mat[][];
	/*public static void main(String args[]){
		int mat[][] = {{0,1,2},{3,4,5},{6,7,8}};
		linha(mat);
		coluna(mat);
		diagonalPrincipal(mat);
		diagonalSecundaria(mat);
	}
	*/
	public void Matriz(int mat[][]){
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				this.mat[i][j]= mat[i][j];	
			}
		}
		
	}
	public static void linha(int mat[][]){
		//linha [0][0], [0][1], [0][2]
		int soma = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				soma += mat[i][j];	
			}
			System.out.printf("Soma da linha %d = %d \n",i,soma);
			soma = 0;
		}
		
	}
	
	public static void coluna(int mat[][]){
		//[0][0], [0][1], [0][2]
		//[1][0], [1][1], [1][2]
		//[2][0], [2][1], [2][2]
		int soma[] = {0,0,0};
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				soma[i] += mat[j][i];	
				//System.out.printf("[%d][%d] = %d \n",i,j,mat[j][i]);
			}	
			System.out.printf("soma coluna = %d \n",soma[i]);
		}
		
	}
	
	public static void diagonalPrincipal(int mat[][]){
		//diagonal [0][0], [1][1], [2][2]
		int soma = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(i==j){
					soma += mat[i][j];	
				}
			}	
		}
		System.out.printf("soma diagonal principal = %d \n",soma);
		
	}	
	
	public static void diagonalSecundaria(int mat[][]){
		//diagonal [0][2], [1][1], [2][0]
		int soma = 0;
		for(int i = 0; i < 3; i++){
			for(int j = 0; j < 3; j++){
				if(i+j==2){
				soma += mat[i][j];	
				}
			}	
		}
		System.out.printf("soma diagonal secundaria = %d \n",soma);
		
	}	
		
}