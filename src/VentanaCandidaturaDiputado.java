
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
public class VentanaCandidaturaDiputado extends javax.swing.JFrame {
    VentanaElecciones ventanaPrincipal;
    private boolean navBar = false;
     public static int punteroNombrePartido = 0;
    /**
     * Creates new form VentanaLogin
     */
    public VentanaCandidaturaDiputado(VentanaElecciones ventanaElecciones ) {
        this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        panelPrincipal.setSize(0,0);
        
    }   

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldProvincia = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabelPosicion = new javax.swing.JLabel();
        bDone = new javax.swing.JButton();
        partidoNombre = new javax.swing.JLabel();
        bSiguiente = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 82));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addUser.png"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(120, 100, 110, 120);

        jButton5.setBackground(new java.awt.Color(0, 0, 82));
        jButton5.setForeground(new java.awt.Color(0, 0, 82));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yes.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(150, 430, 50, 50);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Diputado");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(70, 270, 210, 40);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(250, 600, 44, 44);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Menu Principal");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(40, 600, 190, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 350, 700);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bandera.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(-140, 0, 790, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, 0, 650, 700);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPrincipal.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/user.png"))); // NOI18N
        panelPrincipal.add(jLabel3);
        jLabel3.setBounds(500, 30, 110, 110);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel15.setText("Número de Cedula");
        panelPrincipal.add(jLabel15);
        jLabel15.setBounds(20, 280, 210, 40);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel26.setText("Provincia");
        panelPrincipal.add(jLabel26);
        jLabel26.setBounds(20, 190, 250, 30);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel28.setText("Tipo");
        panelPrincipal.add(jLabel28);
        jLabel28.setBounds(30, 380, 140, 40);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel30.setText("Posición");
        panelPrincipal.add(jLabel30);
        jLabel30.setBounds(20, 500, 130, 40);
        panelPrincipal.add(jTextFieldCedula);
        jTextFieldCedula.setBounds(290, 280, 120, 30);
        panelPrincipal.add(jTextFieldProvincia);
        jTextFieldProvincia.setBounds(290, 190, 120, 30);

        jComboBoxTipo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Propietario", "Suplente" }));
        panelPrincipal.add(jComboBoxTipo);
        jComboBoxTipo.setBounds(290, 380, 120, 30);

        jLabelPosicion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabelPosicion.setText("#");
        panelPrincipal.add(jLabelPosicion);
        jLabelPosicion.setBounds(300, 490, 120, 40);

        bDone.setBackground(new java.awt.Color(255, 255, 255));
        bDone.setForeground(new java.awt.Color(0, 0, 82));
        bDone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ok.png"))); // NOI18N
        bDone.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDoneActionPerformed(evt);
            }
        });
        panelPrincipal.add(bDone);
        bDone.setBounds(570, 620, 55, 55);

        partidoNombre.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        partidoNombre.setText("Nombre Partido");
        panelPrincipal.add(partidoNombre);
        partidoNombre.setBounds(190, 10, 173, 29);

        bSiguiente.setBackground(new java.awt.Color(255, 255, 255));
        bSiguiente.setForeground(new java.awt.Color(0, 0, 82));
        bSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/right.png"))); // NOI18N
        bSiguiente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        bSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSiguienteActionPerformed(evt);
            }
        });
        panelPrincipal.add(bSiguiente);
        bSiguiente.setBounds(290, 80, 55, 55);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel19.setText("Partido Politico");
        panelPrincipal.add(jLabel19);
        jLabel19.setBounds(20, 100, 166, 29);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(350, 0, 650, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (navBar == true){                //If is open
            panelPrincipal.setSize(0, 0);   //the panel for new game will change to close 
            navBar = false;                 //it change the NavBar 2 status
            } 
        else{ //if navBar is close
            panelPrincipal.setSize(500,700);//the panel for new game will change to Open
            navBar = true;                    // it change the NavBar 2 status
           
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cerrar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        VentanaElecciones vElecciones =new VentanaElecciones();
        vElecciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void bDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDoneActionPerformed
        if(jTextFieldProvincia.getText().isEmpty() | jTextFieldCedula.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campo Vacio");
        }
        else{
            
            /*Persona presidente = MetodosRegistroCivil.getInstance().buscarPersonaEmpadronadaNombre(jTextFieldNombrePresidente.getText());
            Persona vicePresidente1 = MetodosRegistroCivil.getInstance().buscarPersonaEmpadronadaNombre(jTextFieldNombreVisepresidente1.getText());
            Persona vicePresidente2 = MetodosRegistroCivil.getInstance().buscarPersonaEmpadronadaNombre(jTextFieldNombreVisepresidente2.getText());
            
            if(presidente != null && vicePresidente1 != null && vicePresidente2 != null){
                PartidoPolitico partidoPolitico = MetodosRegistroCivil.getInstance().buscarPartidoPolitico(partidoNombre.getText());
                CandidaturaPresidente cPresidente = new CandidaturaPresidente(presidente, vicePresidente1, vicePresidente2, partidoPolitico, foto, plan, curriculum);
                MetodosRegistroCivil.getInstance().listaCandidaturasPresidente.add(cPresidente);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Alguno o varios de los nombres digitados no existe en el sistema. ");
            }

        */
        }
    }//GEN-LAST:event_bDoneActionPerformed

    private void bSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSiguienteActionPerformed
        // TODO add your handling code here:
        String nombreConsulado = MetodosRegistroCivil.getInstance().listaPartidosPoliticos.get(punteroNombrePartido).nombre;
        partidoNombre.setText(nombreConsulado);
        if (punteroNombrePartido + 1 > (MetodosRegistroCivil.getInstance().listaPartidosPoliticos.size() - 1)) {
            punteroNombrePartido = 0;
        } else {
            punteroNombrePartido++;
        }
    }//GEN-LAST:event_bSiguienteActionPerformed
    public void cerrar() {
        VentanaElecciones ventanaElecciones = new VentanaElecciones();
        ventanaElecciones.setVisible(true);
        this.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDone;
    private javax.swing.JButton bSiguiente;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelPosicion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldProvincia;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JLabel partidoNombre;
    // End of variables declaration//GEN-END:variables
}
