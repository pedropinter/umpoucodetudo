/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livroalunoproduto;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Aluno {
    private String nome;
    private int matricula;
    private String curso;
    // Construtor
    public Aluno(String nome,String curso, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }
    // Métodos
    public void getAluno() {
        System.out.println("Nome: "+nome+" Matricula: "+matricula+" Curso: "+curso);
    }
}
