/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konoha;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Uchiha extends Clan{
    public Uchiha(String clan, String lider){
    super(clan,lider);
    }
    @Override
    public void habilidadeEspecial(){
    System.out.println("Habilidade: SHARINGAN" );
    }
    @Override
    public void ataqueEspecial(){
    System.out.println("AtaqueEspecial: Mangekyou Sharingan (habilidade varia dependendo da vontade do usuario)");
    }   
}

