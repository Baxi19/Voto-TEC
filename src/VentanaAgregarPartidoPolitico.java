
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toshib
 */
public class VentanaAgregarPartidoPolitico extends javax.swing.JFrame {
    VentanaElecciones ventanaPrincipal;
    private boolean navBar = false;
    /**
     * Creates new form VentanaLogin
     */
    public VentanaAgregarPartidoPolitico(VentanaElecciones ventanaElecciones ) {
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
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        imagenIcono = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
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

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deleteUser.png"))); // NOI18N
        jPanel3.add(jLabel4);
        jLabel4.setBounds(120, 100, 110, 120);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("+ Partido Político");
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
        jButton5.setBounds(150, 400, 50, 50);

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

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 25)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contraseña");
        panelPrincipal.add(jLabel12);
        jLabel12.setBounds(30, 490, 160, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/deleteDocument.png"))); // NOI18N
        panelPrincipal.add(jLabel1);
        jLabel1.setBounds(520, 10, 110, 110);

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
        jButton3.setBounds(370, 600, 50, 50);

        jLabel6.setText("Nombre del Partido Político:");
        panelPrincipal.add(jLabel6);
        jLabel6.setBounds(80, 120, 140, 20);
        panelPrincipal.add(jTextField1);
        jTextField1.setBounds(240, 120, 140, 30);

        jLabel7.setText("Código:");
        panelPrincipal.add(jLabel7);
        jLabel7.setBounds(130, 170, 50, 15);
        panelPrincipal.add(jTextField2);
        jTextField2.setBounds(240, 160, 140, 30);

        jLabel8.setText("Escala: ");
        panelPrincipal.add(jLabel8);
        jLabel8.setBounds(130, 210, 60, 15);

        jLabel9.setText("Fecha de fundación:");
        panelPrincipal.add(jLabel9);
        jLabel9.setBounds(90, 250, 100, 15);
        panelPrincipal.add(jTextField4);
        jTextField4.setBounds(240, 240, 140, 30);

        jLabel11.setText("Teléfono:");
        panelPrincipal.add(jLabel11);
        jLabel11.setBounds(120, 290, 60, 15);
        panelPrincipal.add(jTextField5);
        jTextField5.setBounds(240, 280, 140, 30);

        jLabel14.setText("Bandera");
        panelPrincipal.add(jLabel14);
        jLabel14.setBounds(120, 420, 70, 15);
        panelPrincipal.add(jTextField6);
        jTextField6.setBounds(240, 320, 140, 30);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 51, 51));
        jLabel15.setText("Agregar Partido Político");
        panelPrincipal.add(jLabel15);
        jLabel15.setBounds(90, 50, 410, 40);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelPrincipal.add(jButton1);
        jButton1.setBounds(240, 520, 140, 30);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nacional", "Cantonal", "Provincial" }));
        panelPrincipal.add(jComboBox1);
        jComboBox1.setBounds(240, 200, 140, 30);

        imagenIcono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagenIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/band.png"))); // NOI18N
        imagenIcono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelPrincipal.add(imagenIcono);
        imagenIcono.setBounds(240, 360, 140, 130);

        jLabel16.setText("Dirección:");
        panelPrincipal.add(jLabel16);
        jLabel16.setBounds(120, 330, 70, 15);

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTextField1.getText().isEmpty() | jTextField2.getText().isEmpty() | jTextField4.getText().isEmpty() | jTextField5.getText().isEmpty() | jTextField6.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Campo vacío");
        }
        else{
            String nombreP = jTextField1.getText();
            int codigoP = Integer.parseInt(jTextField2.getText());
            String escalaP = jComboBox1.getSelectedItem().toString();
            String fechaFundacionP = jTextField4.getText();
            int telefonoP = Integer.parseInt(jTextField5.getText());
            String direccionP = jTextField4.getText();
            File fichero = null;
            ImageIcon bandera = (ImageIcon) selecionarImagen(fichero);
            PartidoPolitico nuevoPartidoPolitico = new PartidoPolitico(nombreP, codigoP, escalaP, fechaFundacionP, telefonoP, direccionP);
            MetodosRegistroCivil.getInstance().listaPartidosPoliticos.add(nuevoPartidoPolitico);
            JOptionPane.showMessageDialog(rootPane, "Partido agregado exitosamente");
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public Icon selecionarImagen(File fichero){
        int resultado ;
        VentanaCargarArchivos ventana = new VentanaCargarArchivos();
        FileNameExtensionFilter filtro1 = new FileNameExtensionFilter("Fotos, JPG y PNG", "jpn","png");
        ventana.jFileCargarFoto.setFileFilter(filtro1);
        resultado = ventana.jFileCargarFoto.showOpenDialog(null);
        if(JFileChooser.APPROVE_OPTION == resultado){
            //guardar el archivo selecionado
            fichero = ventana.jFileCargarFoto.getSelectedFile();
            try {
                ImageIcon icon = new ImageIcon(fichero.toString());
                //ajustar el tamaño de la imagen que se ha cargado
                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(imagenIcono.getWidth(), imagenIcono.getHeight(), Image.SCALE_DEFAULT));
                //borrar TEXTO en label
                imagenIcono.setText(null);
                //mostrar imagen en label
                imagenIcono.setIcon(icono);
                return icono;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Error al abrir la imagen " + ex);
            }
        }
        return null;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imagenIcono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
