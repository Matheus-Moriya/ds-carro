/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetocarro;

/**
 *
 * @author pc
 */
public class ProjetoCarro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // instanciando a classe carro;
        
        Carro c1 = new Carro();
        c1.nome = "UNO";
        c1.marca = "FIAT";
        c1.ano = 2015;
        c1.vel = 120;
        
        c1.acelerar(20);
        System.out.println("Velocidade: "+c1.vel+" KM");
        c1.freiar(45);
        System.out.println("Velocidade Apos Freio: "+c1.vel+" km");
        
        c1.buzinar();
        
        
        
        System.out.println("\n"+"\n"+"\n");
        
        
        
        Carro c2 = new Carro();
        c2.nome = "Chevrolet";
        c2.marca = "Corsa";
        c2.ano = 2012;
        c2.vel = 110;
        c2.acelerar(20);
        c2.freiar(40);
        c2.farol(true);
        c2.gasolina(3);
        c2.kmRodado(110000);
        c2.ligado(false);
        
        c2.info();
        
    }
    
       
    
}
