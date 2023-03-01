/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula5;

/**
 *
 * @author Jhonney
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Algusto");
        p1.abrirConta("CC");
        
        ContaBanco p2= new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Larissa");
        p2.abrirConta("CP");
        
        p1.depositar(100);
        p2.depositar(260);
        
        p1.estadoAtual();
        p2.estadoAtual();
                
     
    }
    
}
