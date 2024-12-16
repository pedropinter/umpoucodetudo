/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konoha;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Main {

    public static void main(String[] args) {
        Uchiha uchiha = new Uchiha("Uchiha", "Sasuke");
        Hyuuga hyuuga = new Hyuuga("Hyuuga", "Hinata");
        Senju senju = new Senju("Senju", "Tsunade");
        Nara nara = new Nara("Nara","Shikamaru");
        Inuzuka inuzuka = new Inuzuka("Inuzuka","Kiba");
        
        uchiha.habilidadeEspecial();
        uchiha.exibirDetalhes();
        uchiha.ataqueEspecial();

        hyuuga.habilidadeEspecial();
        hyuuga.exibirDetalhes();
        hyuuga.ataqueEspecial();

        senju.habilidadeEspecial();
        senju.exibirDetalhes();
        senju.ataqueEspecial();

        nara.habilidadeEspecial();
        nara.exibirDetalhes();
        nara.ataqueEspecial();

        inuzuka.habilidadeEspecial();
        inuzuka.exibirDetalhes();
        inuzuka.ataqueEspecial();
    }
}