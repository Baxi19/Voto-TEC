
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
public class VentanaAgregarNacional extends javax.swing.JFrame {
    VentanaElecciones ventanaPrincipal;
    public static int punteroDistrito = 0;
    private boolean navBar = false;
    /**
     * Creates new form VentanaLogin
     */
    public VentanaAgregarNacional(VentanaElecciones ventanaElecciones ) {
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
        panelPrincipal1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TextFieldNombre1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        TextFieldPrimerApellido1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TextFieldSegundoApellido1 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        TextFieldEdad1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        TextFieldCedula1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        TextFieldEstadoCivil1 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        TextFieldFechaNacimiento1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        ComboBoxSexo1 = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        TextFieldLugarNacimiento1 = new javax.swing.JTextField();
        TextFieldNacionalidad1 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        ComboBoxFallecido1 = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        TextFieldDomicilioElectoral1 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        labelDistrito = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        jLabel10.setText("Agregar Nacional");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(50, 290, 270, 40);

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

        panelPrincipal1.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPrincipal1.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addList.png"))); // NOI18N
        panelPrincipal1.add(jLabel6);
        jLabel6.setBounds(520, 10, 110, 110);

        jLabel17.setText("Nombre:");
        panelPrincipal1.add(jLabel17);
        jLabel17.setBounds(30, 30, 50, 20);

        TextFieldNombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldNombre1ActionPerformed(evt);
            }
        });
        panelPrincipal1.add(TextFieldNombre1);
        TextFieldNombre1.setBounds(140, 20, 120, 28);

        jLabel18.setText("Primer apellido:");
        panelPrincipal1.add(jLabel18);
        jLabel18.setBounds(30, 100, 80, 30);
        panelPrincipal1.add(TextFieldPrimerApellido1);
        TextFieldPrimerApellido1.setBounds(140, 100, 120, 28);

        jLabel19.setText("Segundo apellido:");
        panelPrincipal1.add(jLabel19);
        jLabel19.setBounds(30, 180, 90, 30);
        panelPrincipal1.add(TextFieldSegundoApellido1);
        TextFieldSegundoApellido1.setBounds(140, 180, 120, 26);

        jLabel20.setText("Edad:");
        panelPrincipal1.add(jLabel20);
        jLabel20.setBounds(30, 260, 40, 20);

        TextFieldEdad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEdad1ActionPerformed(evt);
            }
        });
        panelPrincipal1.add(TextFieldEdad1);
        TextFieldEdad1.setBounds(140, 250, 120, 28);

        jLabel21.setText("Cédula:");
        panelPrincipal1.add(jLabel21);
        jLabel21.setBounds(30, 310, 50, 30);
        panelPrincipal1.add(TextFieldCedula1);
        TextFieldCedula1.setBounds(140, 310, 120, 30);

        jLabel22.setText("Estado civil:");
        panelPrincipal1.add(jLabel22);
        jLabel22.setBounds(30, 380, 70, 30);
        panelPrincipal1.add(TextFieldEstadoCivil1);
        TextFieldEstadoCivil1.setBounds(140, 380, 120, 30);

        jLabel23.setText("Fecha nacimiento:");
        panelPrincipal1.add(jLabel23);
        jLabel23.setBounds(290, 30, 87, 15);

        TextFieldFechaNacimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldFechaNacimiento1ActionPerformed(evt);
            }
        });
        panelPrincipal1.add(TextFieldFechaNacimiento1);
        TextFieldFechaNacimiento1.setBounds(400, 20, 118, 30);

        jLabel24.setText("Sexo:");
        panelPrincipal1.add(jLabel24);
        jLabel24.setBounds(290, 90, 28, 15);

        ComboBoxSexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        panelPrincipal1.add(ComboBoxSexo1);
        ComboBoxSexo1.setBounds(400, 90, 118, 24);

        jLabel25.setText("Lugar de nacimiento:");
        panelPrincipal1.add(jLabel25);
        jLabel25.setBounds(290, 170, 110, 20);

        TextFieldLugarNacimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldLugarNacimiento1ActionPerformed(evt);
            }
        });
        panelPrincipal1.add(TextFieldLugarNacimiento1);
        TextFieldLugarNacimiento1.setBounds(400, 160, 118, 30);
        panelPrincipal1.add(TextFieldNacionalidad1);
        TextFieldNacionalidad1.setBounds(400, 240, 120, 30);

        jLabel26.setText("Nacionalidad:");
        panelPrincipal1.add(jLabel26);
        jLabel26.setBounds(290, 250, 64, 15);

        ComboBoxFallecido1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        panelPrincipal1.add(ComboBoxFallecido1);
        ComboBoxFallecido1.setBounds(400, 310, 118, 28);

        jLabel27.setText("Fallecido:");
        panelPrincipal1.add(jLabel27);
        jLabel27.setBounds(290, 320, 45, 15);

        jLabel28.setText("Domicilio Electoral:");
        panelPrincipal1.add(jLabel28);
        jLabel28.setBounds(290, 390, 90, 15);

        TextFieldDomicilioElectoral1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDomicilioElectoral1ActionPerformed(evt);
            }
        });
        panelPrincipal1.add(TextFieldDomicilioElectoral1);
        TextFieldDomicilioElectoral1.setBounds(400, 380, 118, 31);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel30.setText("Dirección");
        panelPrincipal1.add(jLabel30);
        jLabel30.setBounds(150, 440, 120, 30);

        jButton3.setBackground(new java.awt.Color(0, 0, 82));
        jButton3.setForeground(new java.awt.Color(0, 0, 82));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yes.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelPrincipal1.add(jButton3);
        jButton3.setBounds(340, 590, 50, 50);

        labelDistrito.setText("Distrito");
        panelPrincipal1.add(labelDistrito);
        labelDistrito.setBounds(170, 470, 50, 30);

        jButton1.setText(">>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelPrincipal1.add(jButton1);
        jButton1.setBounds(150, 510, 46, 25);

        panelPrincipal.add(panelPrincipal1);
        panelPrincipal1.setBounds(0, 0, 1000, 700);

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

    private void TextFieldDomicilioElectoral1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDomicilioElectoral1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDomicilioElectoral1ActionPerformed

    private void TextFieldLugarNacimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldLugarNacimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldLugarNacimiento1ActionPerformed

    private void TextFieldFechaNacimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldFechaNacimiento1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldFechaNacimiento1ActionPerformed

    private void TextFieldEdad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEdad1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEdad1ActionPerformed

    private void TextFieldNombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldNombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldNombre1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (TextFieldNombre1.getText().isEmpty() | TextFieldPrimerApellido1.getText().isEmpty() | TextFieldSegundoApellido1.getText().isEmpty() | TextFieldEdad1.getText().isEmpty() | TextFieldCedula1.getText().isEmpty() | TextFieldEstadoCivil1.getText().isEmpty() | TextFieldFechaNacimiento1.getText().isEmpty() | TextFieldLugarNacimiento1.getText().isEmpty() | TextFieldNacionalidad1.getText().isEmpty() | labelDistrito.getText().equals("Distrito")) {
            JOptionPane.showMessageDialog(rootPane, "Campo vacío");
        } 
        else if (MetodosRegistroCivil.getInstance().buscarPersonaEmpadronada(Integer.parseInt(TextFieldCedula1.getText())) != null) {
            JOptionPane.showMessageDialog(rootPane, "Ya existe una persona con la cédula: " + TextFieldCedula1.getText());
        } 
        else {
            String n = TextFieldNombre1.getText();
            String a1 = TextFieldPrimerApellido1.getText();
            String a2 = TextFieldSegundoApellido1.getText();
            int e = Integer.parseInt(TextFieldEdad1.getText());
            int c = Integer.parseInt(TextFieldCedula1.getText());
            String ec = TextFieldEstadoCivil1.getText();
            String fn = TextFieldFechaNacimiento1.getText();
            String sex = ComboBoxSexo1.getSelectedItem().toString();
            String ln = TextFieldLugarNacimiento1.getText();
            String nc = TextFieldNacionalidad1.getText();
            boolean f = false;
            if (ComboBoxFallecido1.getSelectedItem().equals("Sí")) {
                f = true;
            }
            String d = TextFieldDomicilioElectoral1.getText();
            Distrito distrito = MetodosRegistroCivil.getInstance().buscarDistrito(labelDistrito.getText());
            MetodosRegistroCivil.getInstance().agregarNacionalAlRegistro(n,a1,a2,e,c,ec,fn,sex,ln,nc,f,d, distrito);
            JOptionPane.showMessageDialog(rootPane, "Persona: " + n + " agregada con éxito al sistema.");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        String nombreDistrito = MetodosRegistroCivil.getInstance().listaDistritos.get(punteroDistrito).nombre;
        labelDistrito.setText(nombreDistrito);
        if (punteroDistrito + 1 > (MetodosRegistroCivil.getInstance().listaDistritos.size() - 1)) {
            punteroDistrito = 0;
        } else {
            punteroDistrito++;
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public void cerrar() {
        VentanaRegistroCivil ventanaRegistro = new VentanaRegistroCivil(this.ventanaPrincipal);
        ventanaRegistro.setVisible(true);
        this.dispose();
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxFallecido1;
    private javax.swing.JComboBox<String> ComboBoxSexo1;
    private javax.swing.JTextField TextFieldCedula1;
    private javax.swing.JTextField TextFieldDomicilioElectoral1;
    private javax.swing.JTextField TextFieldEdad1;
    private javax.swing.JTextField TextFieldEstadoCivil1;
    private javax.swing.JTextField TextFieldFechaNacimiento1;
    private javax.swing.JTextField TextFieldLugarNacimiento1;
    private javax.swing.JTextField TextFieldNacionalidad1;
    private javax.swing.JTextField TextFieldNombre1;
    private javax.swing.JTextField TextFieldPrimerApellido1;
    private javax.swing.JTextField TextFieldSegundoApellido1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelDistrito;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelPrincipal1;
    // End of variables declaration//GEN-END:variables
}