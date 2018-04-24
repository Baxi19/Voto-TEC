
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
public class VentanaLoginRegistro extends javax.swing.JFrame {
    VentanaElecciones ventanaPrincipal;
    private boolean navBar = false;
    /**
     * Creates new form VentanaLogin
     */
    public VentanaLoginRegistro(VentanaElecciones ventanaElecciones ) {
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
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nombreRegistroCivilTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        passwordFieldRegistroCivil = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 700));
        setMinimumSize(new java.awt.Dimension(1000, 700));
        setPreferredSize(new java.awt.Dimension(1000, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(0, 0, 82));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/login.png"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(120, 100, 130, 120);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Iniciar Sesión");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(70, 290, 220, 40);

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
        jLabel5.setText("Menu Principal");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 600, 190, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 350, 700);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPrincipal.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contraseña");
        panelPrincipal.add(jLabel12);
        jLabel12.setBounds(30, 490, 160, 40);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel13.setText("Usuario");
        panelPrincipal.add(jLabel13);
        jLabel13.setBounds(30, 320, 120, 40);
        panelPrincipal.add(nombreRegistroCivilTextField);
        nombreRegistroCivilTextField.setBounds(190, 320, 130, 40);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel15.setText("Contraseña");
        panelPrincipal.add(jLabel15);
        jLabel15.setBounds(30, 430, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/secure.png"))); // NOI18N
        panelPrincipal.add(jLabel1);
        jLabel1.setBounds(150, 170, 119, 124);

        jButton3.setBackground(new java.awt.Color(0, 0, 82));
        jButton3.setForeground(new java.awt.Color(0, 0, 82));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/yes.png"))); // NOI18N
        jButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelPrincipal.add(jButton3);
        jButton3.setBounds(180, 550, 50, 50);
        panelPrincipal.add(passwordFieldRegistroCivil);
        passwordFieldRegistroCivil.setBounds(190, 430, 130, 40);

        getContentPane().add(panelPrincipal);
        panelPrincipal.setBounds(348, 0, 520, 700);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/TSE _Reg.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 10, 650, 160);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/botonCr.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 170, 650, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(nombreRegistroCivilTextField.getText().isEmpty() | passwordFieldRegistroCivil.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Field empty.");
        }
        else {
            String nombre = nombreRegistroCivilTextField.getText();
            int cedula = Integer.parseInt(passwordFieldRegistroCivil.getText());
            Persona admin = MetodosRegistroCivil.getInstance().buscarAdministrador(nombre);
            if (admin == null) {
                JOptionPane.showMessageDialog(rootPane, "Adminstrados no encontrado");
            }
            else{
                if(admin.cedula == cedula){
                    MetodosRegistroCivil.getInstance().setAdminLogueado(admin);
                    VentanaRegistroCivil vRegistroCivil = new VentanaRegistroCivil(this.ventanaPrincipal);
                    vRegistroCivil.setVisible(true);
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (navBar == true){                //If is open
            panelPrincipal.setSize(0, 0);   //the panel for new game will change to close 
            navBar = false;                 //it change the NavBar 2 status
            } 
        else{ //if navBar is close
            panelPrincipal.setSize(350,700);//the panel for new game will change to Open
            navBar = true;                    // it change the NavBar 2 status
           
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        VentanaElecciones vElecciones =new VentanaElecciones();
        vElecciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VentanaElecciones vElecciones =new VentanaElecciones();
        vElecciones.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nombreRegistroCivilTextField;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPasswordField passwordFieldRegistroCivil;
    // End of variables declaration//GEN-END:variables
}
