
package ejercicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class FrmMonedas extends javax.swing.JFrame
{
    int inicio=0;
    int aleatorio;
    int aleatorio1;
    int aleatorio2;
    int contador=0;
    int superman=1;
    int batman=2;
    int hulk=3;
    int spider=4;
    int cap=5;
    int robin=6;
    int thor=7;
    int ironman=8;
    int linterna=9;
    int flash=10;
    int saldo=100;
    int apuesta;
    Timer temporizador;
    
    public FrmMonedas() 
    {
        this.temporizador = new Timer(100, new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (saldo!=0)
                { 
                
                contador +=1;

                if (contador <= 40)
                {
                if (contador%5==0)
                {
                aleatorio = (int)(Math.random()*10+1);
                switch(aleatorio)
                {
                    case 1: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("batman.png")));
                            break;
                    case 2: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("cap.png")));
                            break;
                    case 3: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("flash.png")));
                            break;
                    case 4: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("hulk.png")));
                            break;
                    case 5: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("ironman.png")));
                            break;
                    case 6: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("linterna.png")));
                            break;
                    case 7: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("robin.png")));
                            break;
                    case 8: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("spider.png")));
                            break;
                    case 9: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("superman.png")));
                            break;
                    case 10: lblImagen1.setIcon(new ImageIcon(this.getClass().getResource("thor.png")));
                            break;
                        
                }
                }
                }
                
                
                if (contador <= 20)
                {
                if (contador%3==0)
                {
                aleatorio1 =(int)(Math.random()*10+1);
                
                switch(aleatorio1)
                {
                    case 1: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("batman.png")));
                            break;
                    case 2: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("cap.png")));
                            break;
                    case 3: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("flash.png")));
                            break;
                    case 4: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("hulk.png")));
                            break;
                    case 5: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("ironman.png")));
                            break;
                    case 6: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("linterna.png")));
                            break;
                    case 7: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("robin.png")));
                            break;
                    case 8: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("spider.png")));
                            break;
                    case 9: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("superman.png")));
                            break;
                    case 10: lblImagen2.setIcon(new ImageIcon(this.getClass().getResource("thor.png")));
                            break;
                        
                }
                }
                }
                
                
                if (contador <= 10)
        {   
                if(contador%2==0)
                {
                aleatorio2 =(int)(Math.random()*10+1);
                
                switch(aleatorio2)
                {
                    case 1: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("batman.png")));
                            break;
                    case 2: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("cap.png")));
                            break;
                    case 3: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("flash.png")));
                            break;
                    case 4: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("hulk.png")));
                            break;
                    case 5: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("ironman.png")));
                            break;
                    case 6: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("linterna.png")));
                            break;
                    case 7: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("robin.png")));
                            break;
                    case 8: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("spider.png")));
                            break;
                    case 9: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("superman.png")));
                            break;
                    case 10: lblImagen3.setIcon(new ImageIcon(this.getClass().getResource("thor.png")));
                            break;
                        
                }
                }
        }
                
                if (contador == 40)
                    {
                        temporizador.stop();
                        contador=0;
                        
                        if (aleatorio != aleatorio1 || aleatorio != aleatorio2)
                            {
                                saldo=saldo-apuesta;
                                txtSaldo.setText(String.valueOf(saldo));
                                
                            }
                        
                        if (aleatorio == aleatorio1 || aleatorio2 == superman)
                            {
                                saldo=saldo+(apuesta);
                                txtSaldo.setText(String.valueOf(saldo));
                            }
                        
                        if (aleatorio1 == aleatorio2 || aleatorio == superman )
                            {
                                saldo=saldo+(apuesta);
                                txtSaldo.setText(String.valueOf(saldo));
                            }
                        
                        if (aleatorio == aleatorio1 || aleatorio == aleatorio2)
                            {
                                saldo=saldo+(apuesta*2);
                                txtSaldo.setText(String.valueOf(saldo));
                            }
                        if (aleatorio == aleatorio1 || aleatorio == aleatorio2 || aleatorio == superman)
                            {
                                saldo=saldo+(apuesta*3);
                                txtSaldo.setText(String.valueOf(saldo));
                            }
                        
                    }
                    
                
                
            }
            }
        });
        
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

        btnJugar = new javax.swing.JButton();
        lblImagen1 = new javax.swing.JLabel();
        lblImagen2 = new javax.swing.JLabel();
        lblImagen3 = new javax.swing.JLabel();
        cbxApuesta = new javax.swing.JComboBox<>();
        txtSaldo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        cbxApuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20", "50", "100" }));

        txtSaldo.setText("   100");
        txtSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSaldoActionPerformed(evt);
            }
        });

        jLabel4.setText("    Apuesta");

        jLabel5.setText("     Saldo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbxApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblImagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImagen3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxApuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        temporizador.start();
        apuesta=Integer.parseInt(cbxApuesta.getSelectedItem().toString());
        
        //if (contador=)
    }//GEN-LAST:event_btnJugarActionPerformed

    private void txtSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSaldoActionPerformed
       
    }//GEN-LAST:event_txtSaldoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        aleatorio=(int)(Math.random()*10+1);
        System.out.print(aleatorio);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(FrmMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JComboBox<String> cbxApuesta;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblImagen1;
    private javax.swing.JLabel lblImagen2;
    private javax.swing.JLabel lblImagen3;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
