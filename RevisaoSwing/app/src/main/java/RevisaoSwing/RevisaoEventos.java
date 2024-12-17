/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RevisaoSwing;

import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class RevisaoEventos extends javax.swing.JFrame{
    public RevisaoEventos(){
    JFrame frame = new JFrame("Minha Janela");
    frame.setSize(1000,300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    JPanel panel = new JPanel();
    frame.add(panel);
    
    JButton botao1 = new JButton("clica porra");
    panel.add(botao1);
    
    JLabel texto1 = new JLabel("fodase");
    
    //Icon icon = new ImageIcon(getClass().getResource("heartless.png"));
    //texto1.setIcon(icon);
    //panel.add(texto1);
    
    TextField campo = new TextField("bola");
    panel.add(campo);
    if(campo.getText() != "bolabola"){
    campo.setEditable(true);
    }
    else{
        campo.setEditable(false);
    }
    JTextArea comentario = new JTextArea("porra");
    comentario.append("blabla");
    comentario.setLineWrap(true);
    comentario.setWrapStyleWord(true);
    panel.add(comentario);
    }
    public static void main(String[] args){
    RevisaoEventos frame = new RevisaoEventos();
    frame.setVisible(true);
    }
}
