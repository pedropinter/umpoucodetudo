/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoBatalha;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
import java.util.Scanner;
        
public class Jogo {
    Scanner scanner = new Scanner(System.in);
    public void criando(){
    System.out.println("Qual o nome do mago:  ");
    String nomeMago = scanner.nextLine();
    Mago nome1 = new Mago(nomeMago);
    
    System.out.println("/nQual o nome do arqueiro:  ");
    String nomeArqueiro = scanner.nextLine();
    Arqueiro nome2 = new Arqueiro(nomeArqueiro);
    
    System.out.println("/nQual o nome do guerreiro:  ");
    String nomeGuerreiro = scanner.nextLine();
    Guerreiro nome3 = new Guerreiro(nomeGuerreiro);
     
    
    System.out.println("/nQuem voce usar para Atacar:  ");
    int numeroAtaque = scanner.nextInt();
    Personagem atacante;
    Personagem oponente;
    
    switch(numeroAtaque){
        case 1:
            atacante = nome3;
            break;          
        case 2:
            atacante = nome2;
            break;
        case 3:
            atacante = nome1;
            break;
    }
    atacante.atacar(oponente);
    
}
}
