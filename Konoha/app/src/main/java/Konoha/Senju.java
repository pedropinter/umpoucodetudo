/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konoha;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Senju extends Clan{
    public Senju(String clan, String lider){
    super(clan,lider);
    }
    @Override
    public void habilidadeEspecial(){
    System.out.println("Habilidade: +CHAKRA" );
    }
    @Override
    public void ataqueEspecial(){
    System.out.println("AtaqueEspecial: Mokuton (manipular e tranformar madeira)");
    }   
}

