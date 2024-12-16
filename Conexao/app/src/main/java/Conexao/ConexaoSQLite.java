/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class ConexaoSQLite {
    public Connection conectar() {
    Connection conexao = null;
    String url = "jdbc:sqlite:usuarios.db";
    
    try{
            conexao = DriverManager.getConnection(url);
            System.out.println("Conexao deu Certo");
    }
    catch (SQLException e){
        System.out.println("Conexao deu Errado"+ e.getMessage());
    }
    return conexao;
    }
    public void desconectar(Connection conexao){
    try{
        if(conexao != null){
        conexao.close();
        System.out.println("FECHADA");
        }
    } catch(SQLException e){
        System.out.println("ERRO AO FECHAR CONEXAO"+ e.getMessage());
    }
   }
}
