/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NarutoQuiz;
import javax.swing.ImageIcon;

/**
 *
 * @author PEDROHENRIQUECAUSSIP
 */
public class Naruto extends javax.swing.JFrame {
        boolean clan;
        boolean sexo;
        boolean idade;
        boolean estado;
        ImageIcon imagem;
    /**
     * Creates new form Naruto
     */
    public Naruto() {

        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelcla = new javax.swing.JLabel();
        botaouzumaki = new javax.swing.JButton();
        botaouchiha = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelcla1 = new javax.swing.JLabel();
        labelcla2 = new javax.swing.JLabel();
        botaouzumaki1 = new javax.swing.JButton();
        botaouchiha1 = new javax.swing.JButton();
        botaouchiha3 = new javax.swing.JButton();
        botaouzumaki2 = new javax.swing.JButton();
        labelcla3 = new javax.swing.JLabel();
        botaouzumaki3 = new javax.swing.JButton();
        botaouchiha4 = new javax.swing.JButton();
        botaouzumaki4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelcla.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        labelcla.setText("QUAL SEU SEXO?");

        botaouzumaki.setText("UZUMAKI");
        botaouzumaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaouzumakiActionPerformed(evt);
            }
        });

        botaouchiha.setText("UCHIHA");
        botaouchiha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaouchihaActionPerformed(evt);
            }
        });

        labelcla1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        labelcla1.setText("QUAL SUA IDADE?");

        labelcla2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        labelcla2.setText("QUAL SEU CLA?");

        botaouzumaki1.setText("FEMININO");
        botaouzumaki1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaouzumaki1ActionPerformed(evt);
            }
        });

        botaouchiha1.setText("MASCULINO");
        botaouchiha1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaouchiha1ActionPerformed(evt);
            }
        });

        botaouchiha3.setText("NOVO");
        botaouchiha3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaouchiha3ActionPerformed(evt);
            }
        });

        botaouzumaki2.setText("VELHO");
        botaouzumaki2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaouzumaki2ActionPerformed(evt);
            }
        });

        labelcla3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        labelcla3.setText("VOCE TA VIVO?");

        botaouzumaki3.setText("NAO");
        botaouzumaki3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaouzumaki3ActionPerformed(evt);
            }
        });

        botaouchiha4.setText("SIM");
        botaouchiha4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaouchiha4ActionPerformed(evt);
            }
        });

        botaouzumaki4.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 24)); // NOI18N
        botaouzumaki4.setText("ENVIAR");
        botaouzumaki4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaouzumaki4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaouchiha4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaouzumaki3))
                    .addComponent(labelcla2)
                    .addComponent(labelcla3)
                    .addComponent(labelcla)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaouchiha3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaouzumaki2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaouchiha1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaouzumaki1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(botaouchiha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaouzumaki))
                    .addComponent(labelcla1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(botaouzumaki4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelcla2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaouchiha)
                    .addComponent(botaouzumaki))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelcla)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaouzumaki1)
                    .addComponent(botaouchiha1))
                .addGap(1, 1, 1)
                .addComponent(labelcla1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaouchiha3)
                    .addComponent(botaouzumaki2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelcla3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaouchiha4)
                    .addComponent(botaouzumaki3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaouzumaki4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaouzumakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaouzumakiActionPerformed
        clan = true;
    }//GEN-LAST:event_botaouzumakiActionPerformed

    private void botaouchihaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaouchihaActionPerformed
        clan = false;
    }//GEN-LAST:event_botaouchihaActionPerformed

    private void botaouzumaki1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaouzumaki1ActionPerformed
        sexo = true;
    }//GEN-LAST:event_botaouzumaki1ActionPerformed

    private void botaouchiha1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaouchiha1ActionPerformed
        sexo = false;
    }//GEN-LAST:event_botaouchiha1ActionPerformed

    private void botaouchiha3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaouchiha3ActionPerformed
        idade = false;
    }//GEN-LAST:event_botaouchiha3ActionPerformed

    private void botaouzumaki2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaouzumaki2ActionPerformed
        idade = true;
    }//GEN-LAST:event_botaouzumaki2ActionPerformed

    private void botaouzumaki3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaouzumaki3ActionPerformed
        estado = true;
    }//GEN-LAST:event_botaouzumaki3ActionPerformed

    private void botaouchiha4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaouchiha4ActionPerformed
        estado = false;
    }//GEN-LAST:event_botaouchiha4ActionPerformed

    private void botaouzumaki4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaouzumaki4ActionPerformed
        if(clan == false && sexo == false && idade == false && estado == false){
        imagem = new ImageIcon(getClass().getResource("borutopretao.jpg"));
        }
        else if(clan == false && sexo == false && idade == false && estado == true){
        imagem = new ImageIcon(getClass().getResource("obito.jpg"));
        }
        else if(clan == true && sexo == false && idade == false && estado == false){
        imagem = new ImageIcon(getClass().getResource("boruto normal.jpg"));
        }
        else if(clan == true && sexo == false && idade == false && estado == true){
        imagem = new ImageIcon(getClass().getResource("nagato.jpg"));
        }
        else if(clan == true && sexo == false && idade == true && estado == false){
        imagem = new ImageIcon(getClass().getResource("narutovelho.jpg"));
        }
        else if(clan == true && sexo == false && idade == true && estado == true){
        imagem = new ImageIcon(getClass().getResource("chefeuzumaki.png"));
        }
         else if(clan == false && sexo == false && idade == true && estado == false){
        imagem = new ImageIcon(getClass().getResource("sasuke_1.jpg"));
        }
        else if(clan == false && sexo == false && idade == true && estado == true){
        imagem = new ImageIcon(getClass().getResource("madara.jpg"));
        }
        
        
        else if(clan == false && sexo == true && idade == false && estado == false){
        imagem = new ImageIcon(getClass().getResource("sarada.jpg"));
        }
        else if(clan == false && sexo == true && idade == false && estado == true){
        imagem = new ImageIcon(getClass().getResource("izumiuchia.jpg"));
        }
        else if(clan == true && sexo == true && idade == false && estado == false){
        imagem = new ImageIcon(getClass().getResource("himawari1.jpg"));
        }
        else if(clan == true && sexo == true && idade == false && estado == true){
        imagem = new ImageIcon(getClass().getResource("kushina.png"));
        }
        else if(clan == true && sexo == true && idade == true && estado == false){
        imagem = new ImageIcon(getClass().getResource("hinata velha.jpg"));
        }
        else if(clan == true && sexo == true && idade == true && estado == true){
        imagem = new ImageIcon(getClass().getResource("mitouzumaki.jpg"));
        }
         else if(clan == false && sexo == true && idade == true && estado == false){
        imagem = new ImageIcon(getClass().getResource("sakura velha.jpg"));
        }
        else if(clan == false && sexo == true && idade == true && estado == true){
        imagem = new ImageIcon(getClass().getResource("naoriuchiha.jpg"));
        }
        else{
            imagem = new ImageIcon(getClass().getResource("error.png"));
        }
        jLabel1.setIcon(imagem);
    }//GEN-LAST:event_botaouzumaki4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Naruto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Naruto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Naruto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Naruto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Naruto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaouchiha;
    private javax.swing.JButton botaouchiha1;
    private javax.swing.JButton botaouchiha3;
    private javax.swing.JButton botaouchiha4;
    private javax.swing.JButton botaouzumaki;
    private javax.swing.JButton botaouzumaki1;
    private javax.swing.JButton botaouzumaki2;
    private javax.swing.JButton botaouzumaki3;
    private javax.swing.JButton botaouzumaki4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelcla;
    private javax.swing.JLabel labelcla1;
    private javax.swing.JLabel labelcla2;
    private javax.swing.JLabel labelcla3;
    // End of variables declaration//GEN-END:variables
}
