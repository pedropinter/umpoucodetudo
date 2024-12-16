/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class AdicionarElemento {
    public static void main(String[] args){
    int[] numeros= {1,2,3};
    int novoNumero = 4;
    int[] novoArray = new int[numeros.length + 1];
    
    for(int i = 0;i<numeros.length;i++){
        novoArray[i] = numeros[i];
    }
    novoArray[3] = novoNumero;
    
    for(int i = 0; i < novoArray.length;i++){
        System.out.println(novoArray[i]);
    }
    }
}
