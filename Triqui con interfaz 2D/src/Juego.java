/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael Daniel Murillo López Id 534830 Corporación Universitaria
 * Minuto de Dios
 */
public class Juego extends javax.swing.JFrame {

    Tablero miTablero = new Tablero();
    int x = 0;
    int o = 0;
    int turno;
    int jugadas = 0;

    /**
     * Creates new form Juego
     */
    public Juego() {
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

        label1 = new java.awt.Label();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jFrame1 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        boton00 = new javax.swing.JButton();
        boton01 = new javax.swing.JButton();
        boton02 = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        boton2 = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        Reiniciar = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        label1.setText("label1");

        jScrollPane1.setViewportView(jTextPane1);

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        boton00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton00MouseClicked(evt);
            }
        });

        boton01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton01MouseClicked(evt);
            }
        });

        boton02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton02MouseClicked(evt);
            }
        });

        boton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton1MouseClicked(evt);
            }
        });

        boton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton2MouseClicked(evt);
            }
        });

        boton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton3MouseClicked(evt);
            }
        });

        boton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton4MouseClicked(evt);
            }
        });

        boton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton5MouseClicked(evt);
            }
        });

        boton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                boton6MouseClicked(evt);
            }
        });

        jMenu2.setText("Opciones");

        Reiniciar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        jMenu2.add(Reiniciar);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Informacion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Salir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Infromacion");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Autor");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(boton00, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(boton01, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(boton02, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton02, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton00, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton01, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton00MouseClicked
        this.jugar(boton00, 0, 0);
    }//GEN-LAST:event_boton00MouseClicked

    private void boton01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton01MouseClicked
        this.jugar(boton01, 0, 1);
    }//GEN-LAST:event_boton01MouseClicked

    private void boton02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton02MouseClicked
        this.jugar(boton02, 0, 2);
    }//GEN-LAST:event_boton02MouseClicked

    private void boton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton1MouseClicked
        this.jugar(boton1, 1, 0);
    }//GEN-LAST:event_boton1MouseClicked

    private void boton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton2MouseClicked
        this.jugar(boton2, 1, 1);
    }//GEN-LAST:event_boton2MouseClicked

    private void boton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton3MouseClicked
        this.jugar(boton3, 1, 2);
    }//GEN-LAST:event_boton3MouseClicked

    private void boton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton4MouseClicked
        this.jugar(boton4, 2, 0);
    }//GEN-LAST:event_boton4MouseClicked

    private void boton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton5MouseClicked
        this.jugar(boton5, 2, 1);
    }//GEN-LAST:event_boton5MouseClicked

    private void boton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_boton6MouseClicked
        this.jugar(boton6, 2, 2);
    }//GEN-LAST:event_boton6MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        JOptionPane.showMessageDialog(null, "Gracias por Usar Nuestro Programa ");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Informacion informacion = new Informacion();
        informacion.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Autor autor = new Autor(this, rootPaneCheckingEnabled);
        autor.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed
        boton00.setText("");
        boton01.setText("");
        boton02.setText("");
        boton1.setText("");
        boton2.setText("");
        boton3.setText("");
        boton4.setText("");
        boton5.setText("");
        boton6.setText("");
    }//GEN-LAST:event_ReiniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Reiniciar;
    private javax.swing.JButton boton00;
    private javax.swing.JButton boton01;
    private javax.swing.JButton boton02;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    void limpiarTableroGrafico() {

        boton00.setText("");
        boton01.setText("");
        boton02.setText("");
        boton1.setText("");
        boton2.setText("");
        boton3.setText("");
        boton4.setText("");
        boton5.setText("");
        boton6.setText("");

    }

    private void jugar(JButton boton, int fila, int columna) {

        char simbolo = 'a';

        if (boton.getText().equals("")) {
            if (turno == 0) {
                simbolo = 'X';
                boton.setText("X");
                turno = 1;
            } else {
                simbolo = '0';
                boton.setText("O");
                turno = 0;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta lleno!!!");
        }

        this.miTablero.fichas[fila][columna] = simbolo;

        int resultado = miTablero.calcularTriqui();

        if (resultado == 1) {
            if (simbolo == 'X') {

                x++;
            } else {
                o++;
            }

            JOptionPane.showMessageDialog(null, "Hubo triqui!!! Ganaron las: " + simbolo + " y han ganado:" + x + " " + o);

            miTablero.limpiarTablero();
            this.limpiarTableroGrafico();
            turno = 0;
            jugadas = 0;
        }

        if (jugadas == 9) {

            JOptionPane.showMessageDialog(null, "Hubo empate");
            miTablero.limpiarTablero();
            this.limpiarTableroGrafico();
            turno = 0;
            jugadas = 0;
        }

        this.jugadas++;

    }

}
