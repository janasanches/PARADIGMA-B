public class Conta{
	private int numero;
	private String nome;
	private double saldo;
	private double limite;
	
	public void setNumero(int numero){
		this.numero = numero;		
	}
	
	public int getNumero(){
		return numero;		
	}
	public void setNome(String nome){
		this.nome = nome;		
	}
	
	public String getNome(){
		return nome;		
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;		
	}
	
	public double getSaldo(){
		return saldo;		
	}
	public void setLimite(double limite){
		this.limite = limite;		
	}
	
	public double getLimite(){
		return limite;		
	}
	public void imprime(){
		System.out.printf("Numero da conta = %d\n",numero);
		System.out.printf("Nome do corentista = %s\n",nome);
		System.out.printf("Saldo = %.2f\n",saldo);
		System.out.printf("Limite = %.2f\n",limite);
	}
}