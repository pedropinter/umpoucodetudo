/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loja;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
abstract class Produto {
    String nome;
    double valor;
    
    public Produto(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }
    public void exibirDetalhes(){
        System.out.println("Nome:  "+nome);
        System.out.println("Valor:  "+valor);
    }
}
