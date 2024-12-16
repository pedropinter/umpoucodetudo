/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Main {
    public static void main(String[] args){
    CartaoCredito meuCartao = new CartaoCredito("31232131313213",1231);
    Paypal meuPaypal = new Paypal( "pedro@gmail");
    
    meuCartao.processarPagamento(222313);
    System.out.println(meuCartao.obterDetalhes());

    meuPaypal.processarPagamento(31231321.1);
    System.out.println(meuPaypal.obterDetalhes());
    
    }
}

