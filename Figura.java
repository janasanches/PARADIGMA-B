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
public abstract class Figura {
    protected String cor;
    protected double perimetro;
    protected double lado;
    public String getCor(){
        return cor;
    }
    public void setCor(String cor_){
        cor = cor_;
    }
    public abstract double calculoPerimetro();
    
    public abstract void setNome(String nome);
}
