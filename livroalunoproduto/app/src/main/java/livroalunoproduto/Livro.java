/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livroalunoproduto;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Livro {
    private String autor;
    private String titulo;
    private int paginas;
    // Construtor
    public Livro(String autor,String titulo, int paginas) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
    }
    // Métodos
    public void getLivro() {
           System.out.println("Autor: "+autor+" Titulo: "+titulo+" Paginas: "+paginas);
    }
}
