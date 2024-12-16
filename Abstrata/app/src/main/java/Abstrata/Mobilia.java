/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrata;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
abstract class Mobilia {
    protected String cor;
    protected String material;

    // Construtor
    public Mobilia(String cor, String material) {
        this.cor = cor;
        this.material = material;
    }

    // M�todo abstrato (sem implementa��o)
    public abstract void montar();

    // M�todo concreto (com implementa��o)
    public void desmontar() {
        System.out.println("Desmontando a mob�lia.");
    }
}
