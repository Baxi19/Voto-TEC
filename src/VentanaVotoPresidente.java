
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
public class VentanaVotoPresidente extends javax.swing.JFrame {
    public int punteroCandidaturas = 0;
    public boolean votoEmitido = false;

    VentanaElecciones ventanaElecciones;
    /**
     * Creates new form VentanaVoto
     */
    public VentanaVotoPresidente() {
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
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        labelPresidente = new javax.swing.JLabel();
        labelVicepresidente = new javax.swing.JLabel();
        labelPartidoPolitico = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 82));
        setMaximumSize(new java.awt.Dimension(1000, 700));
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
        jLabel5.setText("Papeleta para Presidente");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(120, 10, 140, 20);

        jButton6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton6.setText("Votar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);
        jButton6.setBounds(180, 215, 160, 40);

        jButton4.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jButton4.setText("Siguiente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(20, 215, 160, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel6.setText("Presidente:");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(100, 60, 70, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel7.setText("Vicepresidente:");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(100, 110, 80, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel8.setText("Partido Politico:");
        jPanel4.add(jLabel8);
        jLabel8.setBounds(100, 160, 90, 30);

        labelPresidente.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        labelPresidente.setText("Nulo");
        jPanel4.add(labelPresidente);
        labelPresidente.setBounds(200, 60, 80, 30);

        labelVicepresidente.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        labelVicepresidente.setText("Nulo");
        jPanel4.add(labelVicepresidente);
        labelVicepresidente.setBounds(200, 110, 70, 30);

        labelPartidoPolitico.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        labelPartidoPolitico.setText("Nulo");
        jPanel4.add(labelPartidoPolitico);
        labelPartidoPolitico.setBounds(200, 160, 90, 30);

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
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 0));
        jLabel3.setText("Menu Principal");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 610, 180, 44);

        jLabel4.setBackground(new java.awt.Color(0, 0, 82));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 0));
        jLabel4.setText("Papeleta Diputado");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(770, 610, 200, 44);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nex.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(710, 610, 44, 44);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 82));
        jLabel1.setText("Selecione un Presidente");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(240, 0, 449, 56);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 50, 1000, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cerrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VentanaVotoDiputado ventanaVotoDiputado = new VentanaVotoDiputado();
        ventanaVotoDiputado.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        VentanaElecciones vElecciones =new VentanaElecciones();
        vElecciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String presi = MetodosRegistroCivil.getInstance().listaCandidaturasPresidente.get(punteroCandidaturas).Presidente.nombre;
        String vicePresi = MetodosRegistroCivil.getInstance().listaCandidaturasPresidente.get(punteroCandidaturas).vicepresidentePrincipal.nombre;
        String pp = MetodosRegistroCivil.getInstance().listaCandidaturasPresidente.get(punteroCandidaturas).partidoPolitico.nombre;
        labelPresidente.setText(presi);
        labelVicepresidente.setText(vicePresi);
        labelPartidoPolitico.setText(pp);
        if (punteroCandidaturas + 1 > (MetodosRegistroCivil.getInstance().listaPartidosPoliticos.size() - 1)) {
            punteroCandidaturas = 0;
        } else {
            punteroCandidaturas++;
        }  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        if(labelPresidente.getText().equals("Nulo")){
            JOptionPane.showMessageDialog(rootPane, "Seleccione una opción");
        }
        else{
            if(votoEmitido == false){
                Persona votante = MetodosRegistroCivil.getInstance().personaLogueada;
                MetodosRegistroCivil.getInstance().votarPresidente(labelPresidente.getText());
                CandidaturaPresidente cp = MetodosRegistroCivil.getInstance().buscarCandidaturaPresidente(labelPresidente.getText());
                VotoPresidente nuevoVoto = new VotoPresidente(votante, cp);
                MetodosRegistroCivil.getInstance().listaVotosPresidente.add(nuevoVoto);
                votoEmitido = true;
                JOptionPane.showMessageDialog(rootPane, "Ud a votado exitosamente por el candidato: " + labelPresidente.getText());
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Ud ya ha emitido un voto por presidente, proceda a la siguiente papeleta porfavor.");
            }
            
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    
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
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel labelPartidoPolitico;
    private javax.swing.JLabel labelPresidente;
    private javax.swing.JLabel labelVicepresidente;
    // End of variables declaration//GEN-END:variables
}
