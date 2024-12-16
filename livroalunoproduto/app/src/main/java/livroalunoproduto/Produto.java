/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livroalunoproduto;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Produto {
    private String nome;
    private int preco;
    private int quantidade;
    // Construtor
    public Produto(String nome,int preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    // Métodos
    public void getProduto() {
        System.out.println("Nome: "+nome+" Preco:  "+preco+" Quantidade: "+quantidade);
    }
}
