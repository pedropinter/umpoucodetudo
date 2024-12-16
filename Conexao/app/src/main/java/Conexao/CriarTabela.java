/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class CriarTabela {
    public static void criarTabelaUsuarios(Connection conexao){
    String sql = "CREATE TABLE IF NOT EXISTS usuarios ("
            + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "nome TEXT NOT NULL,"
            + "email TEXT NOT NULL)";
            
            try (Statement stmt = conexao.createStatement()){
            stmt.execute(sql);
            System.out.println("Tabela 'usuarios' criada ou ja existe");
            } catch (Exception e){
                System.out.println("Erro ao criar tabela"+ e.getMessage());
            }
    }
}
