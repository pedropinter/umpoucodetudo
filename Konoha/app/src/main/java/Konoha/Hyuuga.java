/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konoha;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Hyuuga extends Clan{
    public Hyuuga(String clan, String lider){
    super(clan,lider);
    }
    @Override
    public void habilidadeEspecial(){
    System.out.println("Habilidade: BYAKUGAN" );
    }
    @Override
    public void ataqueEspecial(){
    System.out.println("AtaqueEspecial: Juken (ataque nos pontos de chakra)");
    }   
}

