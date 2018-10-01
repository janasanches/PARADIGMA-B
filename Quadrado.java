/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadrado;

/**
 *
 * @author PC
 */
public class Quadrado extends Figura{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        q.setCor("azul");
        q.lado = 3;
        System.out.println("COR = "+q.getCor()+" Perimetro = "+q.calculoPerimetro());
    }
    
    @Override
    public void setCor(String cor_){
        cor = "vermelho";
    }
    @Override
    public double calculoPerimetro(){
    perimetro = lado*4;
    return perimetro;
    }

    @Override
    public void setNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
