/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loja;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Produto> compras = new ArrayList<>();
        double carrinho = 0.0;
        Scanner scanner = new Scanner(System.in);

        Bala bala = new Bala("Bala Fini Dentaduras", 4.99);
        Chocolate chocolate = new Chocolate("Chocolate Laka", 6.99);
        Refrigerante refrigerante = new Refrigerante("Coca Cola 2Litros", 11.99);
        Energetico energetico = new Energetico("RedBull Lata", 5.99);
        Bolacha bolacha = new Bolacha("Pacote Oreo", 3.99);

        System.out.println("Bem-vindo ao mercado");

        boolean terminar = false;

        while (!terminar) {
            System.out.println("O que voce deseja fazer?");
            System.out.println("1 - Comprar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Ver Carrinho");
            System.out.println("4 - Finalizar Compra");
            int guess = scanner.nextInt(); // Lê a entrada do usuário em cada loop

            switch (guess) {
                case 1:
                    Produto[] listaProdutos = {bala, chocolate, refrigerante, energetico, bolacha};
                    for (Produto produto : listaProdutos) {
                        produto.exibirDetalhes();
                    }
                    System.out.println("O que voce deseja Adicionar ao Carrinho?\n");
                    int produto = scanner.nextInt();
                    switch (produto) {
                        case 1:
                            compras.add(bala);
                            break;
                        case 2:
                            compras.add(chocolate);
                            break;
                        case 3:
                            compras.add(refrigerante);
                            break;
                        case 4:
                            compras.add(energetico);
                            break;
                        case 5:
                            compras.add(bolacha);
                            break;
                    }
                    /*System.out.println("Qual a quantidade?\n");
                    int quantidade = scanner.nextInt();
                    quantidade*(compras[produto].valor);*/
                    break;
                case 2:
                    System.out.println("O que voce deseja Remover do Carrinho?\n");
                    int removendo = scanner.nextInt();
                    switch (removendo) {
                        case 1:
                            if (compras.contains(bala)) {
                                compras.remove(bala);
                                System.out.println("Removido com Sucesso\n");
                            } else {
                                System.out.println("Voce nao possui o item no carrinho\n");
                            }
                            break;
                        case 2:
                            if (compras.contains(chocolate)) {
                                compras.remove(chocolate);
                                System.out.println("Removido com Sucesso\n");
                            } else {
                                System.out.println("Voce nao possui o item no carrinho\n");
                            }
                            break;
                        case 3:
                            if (compras.contains(refrigerante)) {
                                compras.remove(refrigerante);
                                System.out.println("Removido com Sucesso\n");
                            } else {
                                System.out.println("Voce nao possui o item no carrinho\n");
                            }
                            break;
                        case 4:
                            if (compras.contains(energetico)) {
                                compras.remove(energetico);
                                System.out.println("Removido com Sucesso\n");
                            } else {
                                System.out.println("Voce nao possui o item no carrinho\n");
                            }
                            break;
                        case 5:
                            if (compras.contains(bolacha)) {
                                compras.remove(bolacha);
                                System.out.println("Removido com Sucesso\n");
                            } else {
                                System.out.println("Voce nao possui o item no carrinho\n");
                            }
                            break;
                    }
                    break;
                case 3:
                     for(int i = 0; i < compras.size(); i++){
                         System.out.println(compras.get(i).nome+"\n" + compras.get( i).valor);
                     }
                    System.out.println("Este e seu Carrinho\n");
                    break;
                case 4:
                    terminar = true;
                    for(int i = 0; i < compras.size(); i++){
                         System.out.println(compras.get( i).valor);
                     }
                    System.out.println("Obrigado por visitar nosso mercado!");
                    break;
                default:
                    System.out.println("Opção invalida, tente novamente.");
            }
        }
    }
}
