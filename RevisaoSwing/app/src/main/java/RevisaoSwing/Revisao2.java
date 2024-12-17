/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RevisaoSwing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Revisao2 extends javax.swing.JFrame {
    public Revisao2(){
        JFrame frame = new JFrame("Minha Janela");
        frame.setSize(1000,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        JPanel panel = new JPanel();
        frame.add(panel);
        JButton botao1 = new JButton();
        panel.add(botao1);
        JLabel titulo = new JLabel("titulo");
        panel.add(titulo);
         JTextField texto = new JTextField(20);
        panel.add(texto);
         JTextArea textomaior = new JTextArea(5,20);
        panel.add(textomaior);
        JCheckBox checkbox = new JCheckBox("marca");
        panel.add(checkbox);
        JRadioButton radio1 = new JRadioButton("OPCAO 1");
        JRadioButton radio2 = new JRadioButton("bostabotas");
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        panel.add(radio1);
        panel.add(radio2);
    }
    public static void main(String[] args){
        Revisao2 frame = new Revisao2();
        frame.setVisible(true);
    
    }
}
