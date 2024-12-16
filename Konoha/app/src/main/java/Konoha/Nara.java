/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konoha;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Nara extends Clan{
    public Nara(String clan, String lider){
    super(clan,lider);
    }
    @Override
    public void habilidadeEspecial(){
    System.out.println("Habilidade: JUTSU DAS SOMBRAS" );
    }
    @Override
    public void ataqueEspecial(){
    System.out.println("AtaqueEspecial: Kage Mane no Jutsu (manipular sombras)");
    }   
}