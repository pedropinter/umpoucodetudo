/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class InserirUsuario {
    public static void inserirUsuario(Connection conexao,String nome,String email){
    String sql = "INSERT INTO usuarios (nome, email) VALUES (?,?)";
    
    try (PreparedStatement pstmt = conexao.prepareStatement(sql)){
        pstmt.setString(1,nome);
        pstmt.setString(2,email);
        pstmt.executeUpdate();
    } catch(Exception e){
        System.out.println("Erro ao inserir usuario"+e.getMessage());
    }
    }
}
