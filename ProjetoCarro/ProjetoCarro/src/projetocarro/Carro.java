/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetocarro;

/**
 *
 * @author pc
 */
public class Carro {
    
    // atributos
    String  nome;
    String  marca;
    int ano;
    int vel;
    boolean farol;
    int gasolina;
    int kmRodado;
    boolean ligado;
    
    //métodos
    void acelerar(int aceleracao){
        vel+=aceleracao;
    }
    
    void freiar(int reduzir){
        vel-=reduzir;
    }
    
    void buzinar(){
        System.out.println("Carro Buzinando");
    }
    
    void farol(boolean boolfarol){
        farol = boolfarol;
    }
    
    void gasolina(int intGasolina){
        gasolina = intGasolina;
    }
    
    void kmRodado(int intKmRodado){
        kmRodado = intKmRodado;
    }
    
    void ligado(boolean boolLigado){
        ligado = boolLigado;
    }
    
    void info(){
        System.out.println(nome + "\n" + marca + "\n" + "ano: " + ano + "\n" + "velocidade: " + vel + "\n" + "farol ligado: " + farol + "\n" + "gasolina: " + gasolina + "\n" + "km rodado: " + kmRodado + "\n" + "carro ligado: " + ligado);
    }
    
    
    
    
    
}
