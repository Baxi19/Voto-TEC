
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
public class VentanaAgregarExtranjero extends javax.swing.JFrame {
    VentanaElecciones ventanaPrincipal;
    private boolean navBar = false;
    /**
     * Creates new form VentanaLogin
     */
    public VentanaAgregarExtranjero(VentanaElecciones ventanaElecciones ) {
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
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        panelPrincipal = new javax.swing.JPanel();
        panelAgregaExtranjero = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TextFieldNombre = new javax.swing.JTextField();
        TextFieldPrimerApellido = new javax.swing.JTextField();
        TextFieldSegundoApellido = new javax.swing.JTextField();
        TextFieldEdad = new javax.swing.JTextField();
        TextFieldCedula = new javax.swing.JTextField();
        TextFieldEstadoCivil = new javax.swing.JTextField();
        TextFieldFechaNacimiento = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        ComboBoxSexo = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        TextFieldDomicilioElectoral = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TextFieldLugarNacimiento = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ComboBoxFallecido = new javax.swing.JComboBox<>();
        TextFieldNacionalidad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        labelLocalidad = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Agregar Extranjero");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(30, 290, 310, 40);

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
        jButton5.setBounds(160, 450, 50, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(250, 600, 44, 44);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Registro Civil");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 600, 190, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 350, 700);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPrincipal.setLayout(null);

        panelAgregaExtranjero.setBackground(new java.awt.Color(255, 255, 255));
        panelAgregaExtranjero.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelAgregaExtranjero.setLayout(null);

        jLabel6.setText("Nombre:");
        panelAgregaExtranjero.add(jLabel6);
        jLabel6.setBounds(20, 30, 50, 20);

        jLabel7.setText("Primer apellido:");
        panelAgregaExtranjero.add(jLabel7);
        jLabel7.setBounds(20, 90, 80, 30);

        jLabel8.setText("Segundo apellido:");
        panelAgregaExtranjero.add(jLabel8);
        jLabel8.setBounds(20, 150, 90, 30);

        jLabel9.setText("Edad:");
        panelAgregaExtranjero.add(jLabel9);
        jLabel9.setBounds(20, 220, 40, 20);

        jLabel11.setText("Cédula:");
        panelAgregaExtranjero.add(jLabel11);
        jLabel11.setBounds(20, 280, 50, 30);

        jLabel14.setText("Estado civil:");
        panelAgregaExtranjero.add(jLabel14);
        jLabel14.setBounds(10, 350, 70, 30);

        jLabel16.setText("Fecha nacimiento:");
        panelAgregaExtranjero.add(jLabel16);
        jLabel16.setBounds(300, 40, 87, 15);

        TextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombreActionPerformed(evt);
            }
        });
        panelAgregaExtranjero.add(TextFieldNombre);
        TextFieldNombre.setBounds(120, 30, 120, 28);
        panelAgregaExtranjero.add(TextFieldPrimerApellido);
        TextFieldPrimerApellido.setBounds(120, 90, 120, 28);
        panelAgregaExtranjero.add(TextFieldSegundoApellido);
        TextFieldSegundoApellido.setBounds(120, 150, 120, 26);

        TextFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEdadActionPerformed(evt);
            }
        });
        panelAgregaExtranjero.add(TextFieldEdad);
        TextFieldEdad.setBounds(120, 220, 120, 28);
        panelAgregaExtranjero.add(TextFieldCedula);
        TextFieldCedula.setBounds(120, 290, 120, 30);
        panelAgregaExtranjero.add(TextFieldEstadoCivil);
        TextFieldEstadoCivil.setBounds(120, 360, 120, 30);

        TextFieldFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldFechaNacimientoActionPerformed(evt);
            }
        });
        panelAgregaExtranjero.add(TextFieldFechaNacimiento);
        TextFieldFechaNacimiento.setBounds(400, 30, 118, 30);

        jLabel17.setText("Sexo:");
        panelAgregaExtranjero.add(jLabel17);
        jLabel17.setBounds(300, 100, 28, 15);

        ComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        panelAgregaExtranjero.add(ComboBoxSexo);
        ComboBoxSexo.setBounds(400, 100, 118, 24);

        jLabel18.setText("Lugar de nacimiento:");
        panelAgregaExtranjero.add(jLabel18);
        jLabel18.setBounds(300, 150, 110, 20);

        TextFieldDomicilioElectoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDomicilioElectoralActionPerformed(evt);
            }
        });
        panelAgregaExtranjero.add(TextFieldDomicilioElectoral);
        TextFieldDomicilioElectoral.setBounds(400, 360, 118, 31);

        jLabel19.setText("Nacionalidad:");
        panelAgregaExtranjero.add(jLabel19);
        jLabel19.setBounds(300, 220, 64, 15);

        TextFieldLugarNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldLugarNacimientoActionPerformed(evt);
            }
        });
        panelAgregaExtranjero.add(TextFieldLugarNacimiento);
        TextFieldLugarNacimiento.setBounds(400, 140, 118, 30);

        jLabel12.setText("Fallecido:");
        panelAgregaExtranjero.add(jLabel12);
        jLabel12.setBounds(300, 300, 45, 15);

        ComboBoxFallecido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        panelAgregaExtranjero.add(ComboBoxFallecido);
        ComboBoxFallecido.setBounds(400, 290, 118, 28);
        panelAgregaExtranjero.add(TextFieldNacionalidad);
        TextFieldNacionalidad.setBounds(400, 210, 120, 30);

        jLabel13.setText("Domicilio Electoral:");
        panelAgregaExtranjero.add(jLabel13);
        jLabel13.setBounds(290, 370, 90, 15);

        jButton6.setText("Agregar ");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        panelAgregaExtranjero.add(jButton6);
        jButton6.setBounds(810, 200, 100, 50);

        labelLocalidad.setText("Localidad");
        panelAgregaExtranjero.add(labelLocalidad);
        labelLocalidad.setBounds(150, 430, 60, 20);

        jButton9.setText(">");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        panelAgregaExtranjero.add(jButton9);
        jButton9.setBounds(150, 460, 40, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addList.png"))); // NOI18N
        panelAgregaExtranjero.add(jLabel1);
        jLabel1.setBounds(530, 20, 110, 110);

        jButton3.setBackground(new java.awt.Color(0, 0, 82));
        jButton3.setForeground(new java.awt.Color(0, 0, 82));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yes.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelAgregaExtranjero.add(jButton3);
        jButton3.setBounds(300, 610, 50, 50);

        panelPrincipal.add(panelAgregaExtranjero);
        panelAgregaExtranjero.setBounds(0, 0, 650, 700);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(350, 0, 650, 700);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TSE _Reg.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 10, 650, 160);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCr.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 170, 650, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if (TextFieldNombre.getText().isEmpty() | TextFieldPrimerApellido.getText().isEmpty() | TextFieldSegundoApellido.getText().isEmpty() | TextFieldEdad.getText().isEmpty() | TextFieldCedula.getText().isEmpty() | TextFieldEstadoCivil.getText().isEmpty() | TextFieldFechaNacimiento.getText().isEmpty() | TextFieldLugarNacimiento.getText().isEmpty() | TextFieldNacionalidad.getText().isEmpty() | labelLocalidad.getText().equals("Localidad")) {
            JOptionPane.showMessageDialog(rootPane, "Campo vacío");
        } 
        else if (MetodosRegistroCivil.getInstance().buscarPersonaEmpadronada(Integer.parseInt(TextFieldCedula.getText())) != null) {
            JOptionPane.showMessageDialog(rootPane, "Ya existe una persona con la cédula: " + TextFieldCedula.getText());
        } 
        else {
            String n = TextFieldNombre.getText();
            String a1 = TextFieldPrimerApellido.getText();
            String a2 = TextFieldSegundoApellido.getText();
            int e = Integer.parseInt(TextFieldEdad.getText());
            int c = Integer.parseInt(TextFieldCedula.getText());
            String ec = TextFieldEstadoCivil.getText();
            String fn = TextFieldFechaNacimiento.getText();
            String sex = ComboBoxSexo.getSelectedItem().toString();
            String ln = TextFieldLugarNacimiento.getText();
            String nc = TextFieldNacionalidad.getText();
            boolean f = false;
            if (ComboBoxFallecido.getSelectedItem().equals("Sí")) {
                f = true;
            }
            String d = TextFieldDomicilioElectoral.getText();
            Localidad localidad = MetodosRegistroCivil.getInstance().buscarLocalidad(labelLocalidad.getText());
            MetodosRegistroCivil.getInstance().agregarExtranjeroAlRegistro(n,a1,a2,e,c,ec,fn,sex,ln,nc,f,d, localidad);
            JOptionPane.showMessageDialog(rootPane, "Persona: " + n + " agregada con éxito al sistema.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (navBar == true){                //If is open
            panelPrincipal.setSize(0, 0);   //the panel for new game will change to close 
            navBar = false;                 //it change the NavBar 2 status
            } 
        else{ //if navBar is close
            panelPrincipal.setSize(650,700);//the panel for new game will change to Open
            navBar = true;                    // it change the NavBar 2 status
           
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        VentanaElecciones vElecciones =new VentanaElecciones();
        vElecciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaRegistroCivil ventanaRegistroCivil  =new VentanaRegistroCivil(this.ventanaPrincipal);
        ventanaRegistroCivil.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombreActionPerformed

    private void TextFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEdadActionPerformed

    private void TextFieldFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldFechaNacimientoActionPerformed

    private void TextFieldDomicilioElectoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDomicilioElectoralActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDomicilioElectoralActionPerformed

    private void TextFieldLugarNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldLugarNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldLugarNacimientoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(MetodosRegistroCivil.getInstance().buscarPersonaEmpadronada(Integer.parseInt(TextFieldCedula.getText())) == null){
            String n = TextFieldNombre.getText();
            String a1 = TextFieldPrimerApellido.getText();
            String a2 = TextFieldSegundoApellido.getText();
            int e = Integer.parseInt(TextFieldEdad.getText());
            int c = Integer.parseInt(TextFieldCedula.getText());
            String ec = TextFieldEstadoCivil.getText();
            String fn = TextFieldFechaNacimiento.getText();
            String sex = ComboBoxSexo.getSelectedItem().toString();
            String ln = TextFieldLugarNacimiento.getText();
            String nc = TextFieldNacionalidad.getText();
            boolean f = false;
            if(ComboBoxFallecido.getSelectedItem().equals("Sí")){
                f = true;
            }
            String d = TextFieldDomicilioElectoral.getText();
            //MetodosRegistroCivil.getInstance().agregarNacionalAlRegistro(n,a1,a2,e,c,ec,fn,sex,ln,nc,f,d);
            //nombre, primerApellido, segundoApellido, edad, cedula, estadoCivil, fechaNacimiento, sexo, lugarNacimiento, nacionalidad, fallecido, domicilioElectoral

        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Ya existe una persona con la cédula: " + TextFieldCedula.getText());
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed
    public void cerrar() {
        VentanaRegistroCivil ventanaRegistro = new VentanaRegistroCivil(this.ventanaPrincipal);
        ventanaRegistro.setVisible(true);
        this.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxFallecido;
    private javax.swing.JComboBox<String> ComboBoxSexo;
    private javax.swing.JTextField TextFieldCedula;
    private javax.swing.JTextField TextFieldDomicilioElectoral;
    private javax.swing.JTextField TextFieldEdad;
    private javax.swing.JTextField TextFieldEstadoCivil;
    private javax.swing.JTextField TextFieldFechaNacimiento;
    private javax.swing.JTextField TextFieldLugarNacimiento;
    private javax.swing.JTextField TextFieldNacionalidad;
    private javax.swing.JTextField TextFieldNombre;
    private javax.swing.JTextField TextFieldPrimerApellido;
    private javax.swing.JTextField TextFieldSegundoApellido;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelLocalidad;
    private javax.swing.JPanel panelAgregaExtranjero;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
