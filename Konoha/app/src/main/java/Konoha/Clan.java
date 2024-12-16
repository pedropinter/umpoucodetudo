/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konoha;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
abstract class Clan {
    String nomeCla;
    String lider;
    
    public Clan(String nomeCla, String lider) {
        this.nomeCla = nomeCla;
        this.lider = lider;
    }
    public abstract void habilidadeEspecial();
    public abstract void ataqueEspecial();

    public void exibirDetalhes(){
        System.out.println("Cla:  "+nomeCla);
        System.out.println("Lider:  "+lider);
    }
}
