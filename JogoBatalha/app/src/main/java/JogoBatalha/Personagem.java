/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoBatalha;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Personagem {

    private String nome;
    private int vida;
    private int ataque;

    // Construtor
    public Personagem(String nome, int vida, int ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
    }

    // Métodos
    public void atacar (Personagem oponente){
        oponente.vida -= ataque;
    }
}
