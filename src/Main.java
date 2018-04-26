
import java.awt.Image;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //-----------------Provincias--------------------//
        Provincia sanJose = new Provincia(01, "San José");                       // provincia San José
        Provincia alajuela = new Provincia(02, "Alajuela");                      // provincia Alajuela
        Provincia cartago = new Provincia(03, "Cartago");                        // provincia Cartago

        //agregar a la lista
        MetodosRegistroCivil.getInstance().listaProvincias.add(sanJose);
        MetodosRegistroCivil.getInstance().listaProvincias.add(alajuela);
        MetodosRegistroCivil.getInstance().listaProvincias.add(cartago);
        
        
        //------------------Cantones----------------------//}
        Canton sanCarlos = new Canton(021, "San Carlos", alajuela);
        Canton upala = new Canton(022, "Upala", alajuela);                       // cantones Alajuela
        Canton guatuso = new Canton(023, "Guatuso", alajuela);
        
        Canton perezZeledon = new Canton(011, "Perez Zeledon", sanJose);
        Canton ezcazu = new Canton(012, "Ezcazú", sanJose);                      // cantones  San josé
        Canton montesDeOca = new Canton(013, "Montes de Oca", sanJose); 
        
        Canton laUnion = new Canton(031, "La Unión", cartago);
        Canton paraiso = new Canton(032, "Paraíso", cartago);                    // cantones Cartago
        Canton oreamundo = new Canton(033, "Oreamundo", cartago);
        
        
        //agregar cantones a la lista de cantones 
        MetodosRegistroCivil.getInstance().listaCantones.add(sanCarlos);
        MetodosRegistroCivil.getInstance().listaCantones.add(upala);
        MetodosRegistroCivil.getInstance().listaCantones.add(guatuso);
        MetodosRegistroCivil.getInstance().listaCantones.add(perezZeledon);
        MetodosRegistroCivil.getInstance().listaCantones.add(ezcazu);
        MetodosRegistroCivil.getInstance().listaCantones.add(montesDeOca);
        MetodosRegistroCivil.getInstance().listaCantones.add(laUnion);
        MetodosRegistroCivil.getInstance().listaCantones.add(paraiso);
        MetodosRegistroCivil.getInstance().listaCantones.add(oreamundo);
        
        
        //******************************Distritos******************************//
        Distrito laTigra = new Distrito(0211, "La Tigra", sanCarlos);
        Distrito quesada = new Distrito(0212, "Qeesada", sanCarlos);             // distritos san carlos
        //-------------------------------------------------------------------------------------------------//
        Distrito canalete = new Distrito(0221, "Canalete", upala);              
        Distrito bijagua = new Distrito(0222, "Bijagua", upala);                 // distritos upala
        //-------------------------------------------------------------------------------------------------//
        Distrito katira = new Distrito(0231, "Katira", guatuso);
        Distrito sanRafael = new Distrito(0232, "sanRafael", guatuso);           // distritos Guatuso
        //-------------------------------------------------------------------------------------------------//
        Distrito rivas = new Distrito(0111, "Rivas", perezZeledon);
        Distrito elGeneral = new Distrito(0112, "El General", perezZeledon);     // distritos perez z.
        //-------------------------------------------------------------------------------------------------//
        Distrito sanAntonio = new Distrito(0121, "San Antonio", ezcazu);         
        Distrito ezcazuD = new Distrito(0122, "Escazú", ezcazu);                 // distritos ezcazu
        //-------------------------------------------------------------------------------------------------//
        Distrito sanPedro = new Distrito(0131, "San Pedro", montesDeOca);        
        Distrito sabanilla = new Distrito(0132, "Sabanilla", montesDeOca);       // distritos montes de oca
        //-------------------------------------------------------------------------------------------------//
        Distrito tresRios = new Distrito(0311, "Tres Ríos", laUnion);            
        Distrito concepcion = new Distrito(0312, "Concepción", sanCarlos);       // distritos La Union
        //-------------------------------------------------------------------------------------------------//
        Distrito orosi = new Distrito(0321, "Orosí", paraiso);                   
        Distrito cachi = new Distrito(0322, "Cachí", paraiso);                   // distritos Paraiso
        //-------------------------------------------------------------------------------------------------//
        Distrito cipres = new Distrito(0331, "Cipres", oreamundo);               
        Distrito santaRosa = new Distrito(0332, "Santa Rosa", oreamundo);        // distritos Oreamundo 
        //-------------------------------------------------------------------------------------------------//

        //agregar distritos a la lista de distritos
        MetodosRegistroCivil.getInstance().listaDistritos.add(laTigra);
        MetodosRegistroCivil.getInstance().listaDistritos.add(quesada);
        MetodosRegistroCivil.getInstance().listaDistritos.add(canalete);
        MetodosRegistroCivil.getInstance().listaDistritos.add(bijagua);
        MetodosRegistroCivil.getInstance().listaDistritos.add(katira);
        MetodosRegistroCivil.getInstance().listaDistritos.add(sanRafael);
        MetodosRegistroCivil.getInstance().listaDistritos.add(rivas);
        MetodosRegistroCivil.getInstance().listaDistritos.add(elGeneral);
        MetodosRegistroCivil.getInstance().listaDistritos.add(sanAntonio);
        MetodosRegistroCivil.getInstance().listaDistritos.add(ezcazuD);
        MetodosRegistroCivil.getInstance().listaDistritos.add(sanPedro);
        MetodosRegistroCivil.getInstance().listaDistritos.add(sabanilla);
        MetodosRegistroCivil.getInstance().listaDistritos.add(tresRios);
        MetodosRegistroCivil.getInstance().listaDistritos.add(concepcion);
        MetodosRegistroCivil.getInstance().listaDistritos.add(orosi);
        MetodosRegistroCivil.getInstance().listaDistritos.add(cachi);
        MetodosRegistroCivil.getInstance().listaDistritos.add(cipres);
        MetodosRegistroCivil.getInstance().listaDistritos.add(santaRosa);
        
        
        //*********************************Consulados***********************************//  
        Consulado c1 = new Consulado("España", 666);
        Consulado c2 = new Consulado("Francia", 777);
        Consulado c3 = new Consulado("Argentina", 888);
        
        //agregar consualdos a la lista  de consulados
        MetodosRegistroCivil.getInstance().listaConsulados.add(c1);
        MetodosRegistroCivil.getInstance().listaConsulados.add(c2);
        MetodosRegistroCivil.getInstance().listaConsulados.add(c3);
   
        
        //*********************************Localidades********************************//
        Localidad l1 = new Localidad(6661, "Madrid", c1);
        Localidad l2 = new Localidad(6662, "Barcelona", c1);       
        Localidad l3 = new Localidad(7771, "Paris", c2);
        Localidad l4 = new Localidad(7771, "Mónaco", c2);      
        Localidad l5 = new Localidad(8881, "Buenos Aires", c3);
        Localidad l6 = new Localidad(8882, "Córdoba", c3);
        
        //agregar localidades a la lista de localidades
        MetodosRegistroCivil.getInstance().listaLocalidades.add(l1);
        MetodosRegistroCivil.getInstance().listaLocalidades.add(l2);
        MetodosRegistroCivil.getInstance().listaLocalidades.add(l3);
        MetodosRegistroCivil.getInstance().listaLocalidades.add(l4);
        MetodosRegistroCivil.getInstance().listaLocalidades.add(l5);
        MetodosRegistroCivil.getInstance().listaLocalidades.add(l6);
        
        DomicilioElectoral d1 = new DomicilioElectoral("");
        DomicilioElectoral d2 = new DomicilioElectoral("Escuela San Pedro");
        d2.setDistrito(laTigra);
        DomicilioElectoral d3 = new DomicilioElectoral("Escuela San Jose la Tigra");
        d3.setDistrito(laTigra);
        DomicilioElectoral d4 = new DomicilioElectoral("Escuela San jose");
        d4.setDistrito(sabanilla);
        DomicilioElectoral d5 = new DomicilioElectoral("Escuela tres rios");
        d5.setLocalidad(l6);
        
        //************************Administradores**************************//
        Persona admin1 = new Persona("admin1", "", "", 0, 123, "Soltero", "", "m", "", "Costarricense", true, d1);
        Persona admin2 = new Persona("admin2", "", "", 0, 1234, "Soltero", "", "m", "", "Costarricense", true, d1);
        Persona admin3 = new Persona("admin3", "", "", 0, 12345, "Soltero", "", "m", "", "Costarricense", true, d1);

        //agregar administradores a la lista de administradores
        MetodosRegistroCivil.getInstance().listaAdministradores.add(admin1);
        MetodosRegistroCivil.getInstance().listaAdministradores.add(admin2);
        MetodosRegistroCivil.getInstance().listaAdministradores.add(admin3);
        
        //****************************************Personas***********************************************//
        PersonaNacional p1 = new PersonaNacional(laTigra, "Fabián", "Zamora", "Rivera", 20, 504170227, "Soltero", "10/7/97", "Masculino", "Tilarán", "Costarricense", false, d2);
        PersonaNacional p2 = new PersonaNacional(laTigra, "Randald", "Villegas", "Brenes", 26, 206910550, "Soltero", "19/9/91", "Masculino", "San Carlos", "Costarricense", false, d3);
        PersonaNacional p3 = new PersonaNacional(sanPedro, "Mario", "Mora", "Mendez", 35, 78210227, "Casado", "10/7/75", "Masculino", "MOntes de Oca", "Costarricense", false, d4);
        PersonaNacional p4 = new PersonaNacional(tresRios, "Carlos", "Alvarado", "Rivera", 40, 504170677, "Casado", "6/6/66", "Masculino", "San Jose", "Costarricense", false, d5);
        PersonaNacional p5 = new PersonaNacional(tresRios, "Maria", "Alvarado", "Quesada", 55, 50496477, "Casada", "8/6/99", "Femenino", "San Jose", "Costarricense", false, d5);
        
        
        // agregar personas a la lista de empadronados
        MetodosRegistroCivil.getInstance().listaPersonasEmpadronadas.add(p1);
        MetodosRegistroCivil.getInstance().listaPersonasEmpadronadas.add(p2);
        MetodosRegistroCivil.getInstance().listaPersonasEmpadronadas.add(p3);
        MetodosRegistroCivil.getInstance().listaPersonasEmpadronadas.add(p4);
        MetodosRegistroCivil.getInstance().listaPersonasEmpadronadas.add(p5);
       
        //********************************* Partidos Politicos ****************************//
        PartidoPolitico pp1 = new PartidoPolitico("PAC", 0, "Nacional", "14/2/1960", 1234567, "San José, Costa Rica", "\\Imagenes\\bandera.png");
        PartidoPolitico pp2 = new PartidoPolitico("PLN", 0, "Nacional", "24/6/1989", 7654321, "Heredia, Costa Rica", "\\Imagenes\\bandera.png");
        PartidoPolitico pp3 = new PartidoPolitico("PUSC", 0, "Nacional", "6/6/2006", 2617354, "Alajuela, Costa Rica", "\\Imagenes\\bandera.png");
        //agregar partidos a la lista de partidos politicos registrados en el registro civil
        MetodosRegistroCivil.getInstance().listaPartidosPoliticos.add(pp1);
        MetodosRegistroCivil.getInstance().listaPartidosPoliticos.add(pp2);
        MetodosRegistroCivil.getInstance().listaPartidosPoliticos.add(pp3);
        
        VentanaElecciones vEleciones = new VentanaElecciones();
        vEleciones.setVisible(true);
        
    }
    
}
