
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 * Classe grafica per la classe Motore
 * @author ricca
 */
public class Slot extends javax.swing.JFrame {

    /**
     * Creo una nuova variabile Motore
     */
    private static Motore m = new Motore();

    /**
     * Costruttore per la classe Slot
     */
    public Slot() {
        initComponents();
        sfondo.setIcon(new ImageIcon(getClass().getResource("sfondo.png")));
        rullo1.setIcon(new ImageIcon(getClass().getResource("Anguriar.png")));
        rullo2.setIcon(new ImageIcon(getClass().getResource("Setter.png")));
        rullo3.setIcon(new ImageIcon(getClass().getResource("Ferror.png")));
        spinButton.setIcon(new ImageIcon(getClass().getResource("bottone.png")));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        spinButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        rullo1 = new javax.swing.JLabel();
        rullo2 = new javax.swing.JLabel();
        rullo3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Soldi = new javax.swing.JLabel();
        Soldi1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        sfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(492, 492));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jLayeredPane1.setLayout(new javax.swing.OverlayLayout(jLayeredPane1));

        jPanel1.setOpaque(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(448, 475));

        spinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        spinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spinButtonActionPerformed(evt);
            }
        });

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new java.awt.GridLayout(1, 3, 25, 1));

        rullo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rullo1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(rullo1);

        rullo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rullo2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(rullo2);

        rullo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rullo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(rullo3);

        Soldi.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Soldi.setForeground(new java.awt.Color(255, 255, 255));
        Soldi.setText("Somma: 50€");

        Soldi1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        Soldi1.setForeground(new java.awt.Color(255, 255, 255));
        Soldi1.setText("Jackpot: 100€");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(spinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 86, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Soldi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Soldi1)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spinButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Soldi)
                    .addComponent(Soldi1))
                .addContainerGap())
        );

        spinButton.setVisible(true);

        jLayeredPane1.add(jPanel1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(sfondo, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sfondo, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        jLayeredPane1.add(jPanel3);

        getContentPane().add(jLayeredPane1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metodo per cambiare l'immagine nell'interfaccia in base al numero estratto nella classe Motore
     * @param rullo posizione dell'immagine da settare
     * @param i immagine da mettere
     */
    private void cambiaImm(JLabel rullo, int i) {
        switch (m.getComb(i)) {
            case 0:
                rullo.setIcon(new ImageIcon(getClass().getResource("Anguriar.png")));
                break;
            case 1:
                rullo.setIcon(new ImageIcon(getClass().getResource("Campanar.png")));
                break;
            case 2:
                rullo.setIcon(new ImageIcon(getClass().getResource("Ciliegiar.png")));
                break;
            case 3:
                rullo.setIcon(new ImageIcon(getClass().getResource("Ferror.png")));
                break;
            case 4:
                rullo.setIcon(new ImageIcon(getClass().getResource("Quadrir.png")));
                break;
            case 5:
                rullo.setIcon(new ImageIcon(getClass().getResource("Setter.png")));
                break;
            default:
                throw new AssertionError();
        }
    }

    /**
     * Metodo per aggiornare la grafica alla pressione del tasto spin
     * @param evt evento di pressione del tasto
     */
    private void spinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spinButtonActionPerformed
        m.estrai();
        cambiaImm(rullo1, 0);
        cambiaImm(rullo2, 1);
        cambiaImm(rullo3, 2);

        Soldi.setText("Somma: " + m.getSomma() + "€");
        Soldi1.setText("Jackpot: " + m.getJackpot() + "€");
        
        if(m.vintoComb()==true && m.vintoJackpot()==false){
            JOptionPane.showMessageDialog(rootPane, "Hai vinto 10€","Piccola vincita", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("Vincitar.png")));
        }
        if(m.vintoJackpot()==true){
            JOptionPane.showMessageDialog(rootPane, "Hai vinto " +m.getJackpot()+"€","Jackpot", JOptionPane.INFORMATION_MESSAGE,new ImageIcon(getClass().getResource("Jackpotr.png")));
            m.resetJackpot();
        }
        
        if(m.getSomma()==0){
            int sel = JOptionPane.showConfirmDialog(rootPane, "Soldi finiti, Ricaricare?","Bancarotta",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,new ImageIcon(getClass().getResource("Perditar.png")));
            if(sel==JOptionPane.YES_OPTION){
                m.setSomma(50);
                Soldi.setText("Somma: " + m.getSomma() + "€");
            }else{
                dispose();
            }
        }
    }//GEN-LAST:event_spinButtonActionPerformed

    /**
     * Metodo per mostrare un avviso alla chiusura della finestra
     * @param evt evento di chiusura della finestra
     */
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        JOptionPane.showMessageDialog(rootPane, "Cashout: "+m.getSomma()+"€","Cashout", JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        System.setProperty("sun.java2d.uiScale", "1.2");
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
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Slot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Slot().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Soldi;
    private javax.swing.JLabel Soldi1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel rullo1;
    private javax.swing.JLabel rullo2;
    private javax.swing.JLabel rullo3;
    private javax.swing.JLabel sfondo;
    private javax.swing.JButton spinButton;
    // End of variables declaration//GEN-END:variables

}
