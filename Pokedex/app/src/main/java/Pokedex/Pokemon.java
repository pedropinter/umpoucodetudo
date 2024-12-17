/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pokedex;
import java.util.ArrayList;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */

class Pokemon {
    protected String nome;
    protected String tipo;
    protected int nivel;

    // Construtor
    public Pokemon(String nome, String tipo, int nivel) {
        this.nome = nome;
        this.tipo = tipo;
        this.nivel = nivel;
    }
}
