/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Abstrata;

public class App {

    public static void main(String[] args) {
        Mobilia sofa = new Sofa("azul", "tecido");
        Mobilia mesa = new Mesa("azul", "tecido");
        
        sofa.montar();
        mesa.montar();
        sofa.desmontar();
    }
}
