/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Paypal implements Pagamento{
    String email;
    
    public Paypal(String palavra){
    this.email=palavra;
    }
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$ "+valor+" processado via PayPal");
    }
    @Override
    public String obterDetalhes(){
    return email;
        }
}
