/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rettanelpiano_morlacco;

/**
 *
 * @author studente1
 */
public class WinRetta extends javax.swing.JFrame {

    /**
     * Creates new form Inizio
     */
    public WinRetta() {
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

        Retta_nel_piano = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        var_a = new javax.swing.JTextField();
        più1 = new javax.swing.JLabel();
        y = new javax.swing.JLabel();
        più2 = new javax.swing.JLabel();
        uguale = new javax.swing.JLabel();
        risultato_0 = new javax.swing.JLabel();
        var_b = new javax.swing.JTextField();
        var_c = new javax.swing.JTextField();
        a_testo = new javax.swing.JLabel();
        b_testo = new javax.swing.JLabel();
        c_testo = new javax.swing.JLabel();
        Imposta = new javax.swing.JButton();
        P = new javax.swing.JLabel();
        parentesi_aperta = new javax.swing.JLabel();
        parentesi_chiusa = new javax.swing.JLabel();
        virgola = new javax.swing.JLabel();
        Verifica_punto = new javax.swing.JButton();
        x_punto = new javax.swing.JTextField();
        y_punto = new javax.swing.JTextField();
        tipo_retta = new javax.swing.JLabel();
        retta_stampata = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Retta_nel_piano.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Retta_nel_piano.setText("Retta nel piano");

        x.setText(" x");

        più1.setText("+");

        y.setText("  y");

        più2.setText(" + ");

        uguale.setText("=");

        risultato_0.setText("   0");

        a_testo.setText("a");

        b_testo.setText("b");

        c_testo.setText("c");

        Imposta.setText("Imposta");
        Imposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImpostaActionPerformed(evt);
            }
        });

        P.setText("P");

        parentesi_aperta.setText("(");

        parentesi_chiusa.setText(")");

        virgola.setText(",");

        Verifica_punto.setText("Verifica punto");
        Verifica_punto.setEnabled(false);
        Verifica_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Verifica_puntoActionPerformed(evt);
            }
        });

        tipo_retta.setText("????");

        retta_stampata.setText("???");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(P)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(var_a, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(a_testo)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(più1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(var_c, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(uguale)
                                .addGap(18, 18, 18)
                                .addComponent(risultato_0, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(retta_stampata, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Verifica_punto)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tipo_retta)
                                .addComponent(Imposta)))
                        .addContainerGap(87, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(parentesi_aperta, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(x_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(virgola)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Retta_nel_piano)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(c_testo))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(y_punto, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(parentesi_chiusa))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(var_b, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(b_testo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(più2)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Retta_nel_piano)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x)
                    .addComponent(var_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(più1)
                    .addComponent(y)
                    .addComponent(più2)
                    .addComponent(uguale)
                    .addComponent(risultato_0)
                    .addComponent(var_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(var_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imposta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_testo)
                    .addComponent(b_testo)
                    .addComponent(c_testo))
                .addGap(53, 53, 53)
                .addComponent(tipo_retta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(retta_stampata)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P)
                    .addComponent(parentesi_aperta)
                    .addComponent(parentesi_chiusa)
                    .addComponent(Verifica_punto)
                    .addComponent(x_punto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(virgola, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y_punto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImpostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImpostaActionPerformed
        // TODO add your handling code here:
        this.Verifica_punto.setEnabled(true);
        String la = this.var_a.getText();
        String lb = this.var_b.getText();
        String lc = this.var_c.getText();
        
        Retta r;
        
        double a = Double.parseDouble(la);
        double b = Double.parseDouble(lb);
        double c = Double.parseDouble(lc);
        
        
        r = new Retta (a,b,c);
        
        this.tipo_retta.setText(""+r.getTipo());
        this.retta_stampata.setText(""+r.stampa());
       
        
    }//GEN-LAST:event_ImpostaActionPerformed

    private void Verifica_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Verifica_puntoActionPerformed
        // TODO add your handling code here:
        WinMessaggio w = new WinMessaggio();
        w.setVisible(true);
        w.setTitle("Verifica punto");
        
        String la = this.var_a.getText();
        String lb = this.var_b.getText();
        String lc = this.var_c.getText();
        
        
        double a = Double.parseDouble(la);
        double b = Double.parseDouble(lb);
        double c = Double.parseDouble(lc);
        
        Retta t = new Retta(a,b,c);
        
        String lx = this.x_punto.getText();
        String ly = this.y_punto.getText();
        
        double x = Double.parseDouble(lx);
        double y = Double.parseDouble(ly);
        
        if(t.appartiene(x,y) == true){
            w.Mex.setText("Il punto appartiene alla retta");
        }
        else{
            w.Mex.setText("Il punto non appartiene alla retta");
        }
       
        
        w.setTitle("Verifica punto");
        
    }//GEN-LAST:event_Verifica_puntoActionPerformed

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
            java.util.logging.Logger.getLogger(WinRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinRetta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinRetta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Imposta;
    private javax.swing.JLabel P;
    private javax.swing.JLabel Retta_nel_piano;
    private javax.swing.JButton Verifica_punto;
    private javax.swing.JLabel a_testo;
    private javax.swing.JLabel b_testo;
    private javax.swing.JLabel c_testo;
    private javax.swing.JLabel parentesi_aperta;
    private javax.swing.JLabel parentesi_chiusa;
    private javax.swing.JLabel più1;
    private javax.swing.JLabel più2;
    private javax.swing.JLabel retta_stampata;
    private javax.swing.JLabel risultato_0;
    private javax.swing.JLabel tipo_retta;
    private javax.swing.JLabel uguale;
    private javax.swing.JTextField var_a;
    private javax.swing.JTextField var_b;
    private javax.swing.JTextField var_c;
    private javax.swing.JLabel virgola;
    private javax.swing.JLabel x;
    private javax.swing.JTextField x_punto;
    private javax.swing.JLabel y;
    private javax.swing.JTextField y_punto;
    // End of variables declaration//GEN-END:variables
}
