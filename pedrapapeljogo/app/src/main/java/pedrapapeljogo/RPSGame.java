/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pedrapapeljogo;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
import java.util.Scanner;

public class RPSGame {
    private RPSValidator validator = new RPSValidator(); // Instancia o validador
    private Scanner scanner = new Scanner(System.in); // Para capturar a escolha do jogador

    public void start() {
        System.out.println("Bem-vindo ao Pedra, Papel e Tesoura!");
        System.out.println("Escolha 1 para Pedra, 2 para Papel, 3 para Tesoura:");

        int playerChoice = scanner.nextInt(); // Captura a escolha do jogador
        int computerChoice = (int) (Math.random() * 3) + 1; // Computador faz a escolha aleat�ria

        // Valida quem venceu
        if (validator.validateChoice(playerChoice, computerChoice)) {
            System.out.println("Voc� ganhou!");
        } else {
            System.out.println("Voc� perdeu!");
        }

        System.out.println("Computador escolheu: " + validator.choiceToString(computerChoice));
    }
}
