/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Banco;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class CartaoCredito implements Pagamento{
    String numeroCartao;
    int codigoSeguranca;

    public CartaoCredito(String Numero,int codigo){
    this.codigoSeguranca=codigo;
     this.numeroCartao=Numero;
            }
    @Override
    public void processarPagamento(double valor){
        System.out.println("Pagamento de R$"+valor+"valor processado via Cartão de Crédito");
    }
    @Override
    public String obterDetalhes(){
    return numeroCartao.substring(numeroCartao.length() - 4) ;
        }
}
