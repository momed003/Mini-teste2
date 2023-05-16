/**
 * Crie uma calculadora com interface gráfica (à código) em Java que permita ao usuário realizar
 *operações básicas como adição, subtração, multiplicação e divisão.

 */
package model;

/**
 *
 * @author momed003
 */
public class Calculadora {
    private double numero1;
    private double numero2;

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public double soma(double numero1, double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
        
        return numero1+numero2;
    }
    
    public double subtracao(double numero1, double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
        
        return numero1-numero2;
    }
    
    public double multiplicacao(double numero1, double numero2){
        this.numero1=numero1;
        this.numero2=numero2;
        
        return numero1*numero2;
    }
    
    public double divsao(double numero1, double numero2){
        this.numero1=numero1;
        this.numero2=numero2;

         return numero1/numero2;
    }
    
    
}
