/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konoha;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Inuzuka extends Clan{
    public Inuzuka(String clan, String lider){
    super(clan,lider);
    }
    @Override
    public void habilidadeEspecial(){
    System.out.println("Habilidade: Afinidade aos Animais" );
    }
    @Override
    public void ataqueEspecial(){
    System.out.println("AtaqueEspecial: Henge no Jutsu (tranformacao animal)");
    }   
}

