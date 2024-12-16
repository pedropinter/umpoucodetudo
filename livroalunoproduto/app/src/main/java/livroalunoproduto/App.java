/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livroalunoproduto;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class App {
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno("Pinter", "TI",1222);
        Livro livro = new Livro("Leo", "As Aventuras de Leo", 2);
        Produto produto = new Produto("Refri", 5,15);
        // Chamando métodos
        aluno.getAluno();
        livro.getLivro();
        produto.getProduto();
    }
}
