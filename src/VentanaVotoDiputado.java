
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toshib
 */
public class VentanaVotoDiputado extends javax.swing.JFrame {
    public int punteroCandidaturas = 0;
    public boolean votoEmitido = false;
    VentanaElecciones ventanaElecciones;
    /**
     * Creates new form VentanaVoto
     */
    public VentanaVotoDiputado() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        labelPartidoPolitico = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 82));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1000, 50);

        jPanel2.setBackground(new java.awt.Color(0, 0, 82));
        jPanel2.setMaximumSize(new java.awt.Dimension(1000, 600));
        jPanel2.setMinimumSize(new java.awt.Dimension(1000, 600));
        jPanel2.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel5.setText("Seleccione los diputados de un partido político");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(80, 30, 220, 30);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton4.setText("Siguiente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(20, 210, 160, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel8.setText("Partido Politico:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(100, 110, 90, 30);

        labelPartidoPolitico.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        labelPartidoPolitico.setText("Nulo");
        jPanel4.add(labelPartidoPolitico);
        labelPartidoPolitico.setBounds(190, 110, 120, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/done.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(240, 210, 44, 44);

        jLabel2.setBackground(new java.awt.Color(0, 0, 82));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 0));
        jLabel2.setText("Votar");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(230, 160, 80, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel6.setText("Papeleta para Diputados");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(120, 10, 140, 20);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(340, 70, 360, 270);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 100, 1000, 440);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(190, 610, 44, 44);

        jLabel3.setBackground(new java.awt.Color(0, 0, 82));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Menu Principal");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 610, 180, 44);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 82));
        jLabel1.setText("Selecione los diputados de un partido");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(150, 0, 720, 56);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 50, 1000, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(labelPartidoPolitico.getText().equals("Nulo")){
            JOptionPane.showMessageDialog(rootPane, "Seleccione una opción");
        }
        else{
            if(votoEmitido == false){
                MetodosRegistroCivil.getInstance().votarDiputados(labelPartidoPolitico.getText());
                votoEmitido = true;
                Persona votante = MetodosRegistroCivil.getInstance().personaLogueada;
                CandidaturaDiputado cd= MetodosRegistroCivil.getInstance().buscarCandidaturaDiputado(labelPartidoPolitico.getText());
                VotoDiputados nuevoVotoDiputados = new VotoDiputados(cd, votante);
                MetodosRegistroCivil.getInstance().listaVotoDiputados.add(nuevoVotoDiputados);
                JOptionPane.showMessageDialog(rootPane, "Ud a votado exitosamente por los diputados del partido: " + labelPartidoPolitico.getText());
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Ud ya ha emitido un voto por por lo disputados, proceda al inicio.");
            }

        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cerrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        VentanaElecciones vElecciones =new VentanaElecciones();
        vElecciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String pp = MetodosRegistroCivil.getInstance().listaCandidaturasPresidente.get(punteroCandidaturas).partidoPolitico.nombre;
        labelPartidoPolitico.setText(pp);
        if (punteroCandidaturas + 1 > (MetodosRegistroCivil.getInstance().listaCandidaturasDiputado.size() - 1)) {
            punteroCandidaturas = 0;
        } else {
            punteroCandidaturas++;
        }
    }//GEN-LAST:event_jButton4ActionPerformed
    
    public void cerrar() {
        VentanaElecciones ventanaElecciones = new VentanaElecciones();
        ventanaElecciones.setVisible(true);
        this.dispose();
    }
    
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
            java.util.logging.Logger.getLogger(VentanaVotoPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVotoPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVotoPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVotoPresidente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVotoPresidente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelPartidoPolitico;
    // End of variables declaration//GEN-END:variables
}
