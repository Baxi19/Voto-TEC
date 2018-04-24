
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class MetodosRegistroCivil {
    // Variables para implementar los métodos
    public ArrayList<Persona> listaPersonasEmpadronadas;   //lista de todas las personas empadronadas en el sistema
    public ArrayList<Provincia> listaProvincias;           // lista de todas las provincias registradas en el sistema
    public ArrayList<Canton> listaCantones;                // lista de todos los cantones registrados en el sistema
    public ArrayList<Distrito> listaDistritos;             // lista de todos los distritos registrados en el sistema
    public ArrayList<Localidad> listaLocalidades;          // lista de todas las localidades registradas en el sistema
    public ArrayList<PartidoPolitico> listaPartidosPoliticos; // lista de partidos politicos registrados en el sistema
    public ArrayList<Consulado> listaConsulados;           // lista de todos los consulados registrados en el sistema
    public ArrayList<JRVNacional> listaJRVnacional;        // lista de todas las JRV nacionales registradas en el sistema
    public ArrayList<JRVExtranjera> listaJRVextranjera;        // lista de todas las JRV extranjeras registradas en el sistema
    public static MetodosRegistroCivil instance = null;    // unico objeto de la clase MetodosRegistroCivil (singleton)
    public ArrayList<Persona> listaAdministradores = new ArrayList<>(100);
    public ArrayList<CandidaturaPresidente> listaCandidaturasPresidente ;
    public ArrayList<CandidaturaDiputado> listaCandidaturasDiputado ;
    public Persona adminLogueado;
    public Persona personaLogueada;
    
    
    //constructor de la clase singleton de be ser privado para evitar nuevas instancias de este
    private MetodosRegistroCivil(){
        this.listaPersonasEmpadronadas = new ArrayList<Persona>();  // lista empadronados
        this.listaProvincias = new ArrayList<Provincia>();          // lista provincias
        this.listaCantones = new ArrayList<Canton>();               // lista cantones
        this.listaDistritos = new ArrayList<Distrito>();            // lista distritos
        this.listaLocalidades = new ArrayList<Localidad>();         // lista localidades
        this.listaConsulados = new ArrayList<Consulado>();          // lista consulados
        this.listaPartidosPoliticos = new ArrayList<PartidoPolitico>();            //lista partidos politicos
        this.listaCandidaturasDiputado = new ArrayList<CandidaturaDiputado>();     // lista cadidaturas diputado
        this.listaCandidaturasPresidente = new ArrayList<CandidaturaPresidente>(); // lista candidaturas presidente
    }

    public ArrayList<Persona> getListaAdministradores() {
        return listaAdministradores;
    }

    public void setListaAdministradores(ArrayList<Persona> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }
    
    //este metodo instancia una nueva persona por medio de los atributos recibidos por parámetros
    public String agregarNacionalAlRegistro(String nombre, String primerApellido, String segundoApellido, int edad, int cedula, String estadoCivil, String fechaNacimiento, String sexo, String lugarNacimiento, String nacionalidad, boolean fallecido, DomicilioElectoral domicilioElectoral, Distrito distrito){
        PersonaNacional nuevaPersona = new PersonaNacional(distrito, nombre, primerApellido, segundoApellido, edad, cedula, estadoCivil, fechaNacimiento, sexo, lugarNacimiento, nacionalidad, fallecido, domicilioElectoral);
        listaPersonasEmpadronadas.add(nuevaPersona);         //agrega la persona a la lista
        return "Usuario agregado a la lista de empadronado"; 
    }
    
    public String agregarExtranjeroAlRegistro(String nombre, String primerApellido, String segundoApellido, int edad, int cedula, String estadoCivil, String fechaNacimiento, String sexo, String lugarNacimiento, String nacionalidad, boolean fallecido, DomicilioElectoral domicilioElectoral, Localidad localidad){
        PersonaExtranjera nuevaPersona = new PersonaExtranjera(localidad, nombre, primerApellido, segundoApellido, edad, cedula, estadoCivil, fechaNacimiento, sexo, lugarNacimiento, nacionalidad, fallecido, domicilioElectoral);
        listaPersonasEmpadronadas.add(nuevaPersona);         //agrega la persona a la lista
        return "Usuario agregado a la lista de empadronado"; 
    }
    
    public Persona buscarPersonaEmpadronada(int cedula){
        for(int i = 0; i < listaPersonasEmpadronadas.size(); i++){  //busqueda secuencial
            if(listaPersonasEmpadronadas.get(i).cedula == cedula){
                return listaPersonasEmpadronadas.get(i);
            }
        }
        return null;
    } 
    
    //método para buscar una persona en la lista de personas empadronadas
    public Persona buscarPersonaEmpadronadaNombre(String nombre){
        for(int i = 0; i < listaPersonasEmpadronadas.size(); i++){  //busqueda secuencial
            if(listaPersonasEmpadronadas.get(i).nombre.equals(nombre)){
                return listaPersonasEmpadronadas.get(i);
            }
        }
        return null;
    } 
    
    //metodo para buscar una provincia pos su nombre en la lista de provincias del pais
    public Provincia buscarProvincia(String nombre){
       for(int i = 0; i < listaProvincias.size(); i++){     //busqueda secuencial
            if(listaProvincias.get(i).nombre.equals(nombre)){
                return listaProvincias.get(i);
            }
        }
        return null;
    }
    
    //método para buscar un cantón pos su nombre en la lista de cantones del pais
    public Distrito buscarDistrito(String nombre) {
        for (int i = 0; i < listaDistritos.size(); i++) {    //busqueda secuencial
            if(listaDistritos.get(i).nombre.equals(nombre)){
                return listaDistritos.get(i);
            }
        }
        return null;
    }
    
    //método para buscar un distrito pos su nombre en la lista de distritos del pais;
    public Canton buscarCanton(String nombre) {
        for (int i = 0; i < listaProvincias.size(); i++) {
            if (listaCantones.get(i).nombre.equals(nombre)) {   //busqueda secuencial
                return listaCantones.get(i);
            }
        }
        return null;
    }
    
    //metodo para buscar una localidad por su nombre en la lista de localidades
    public Localidad buscarLocalidad(String name){
        for (int i = 0; i < listaLocalidades.size(); i++){  //busqueda secuencial
            if(listaLocalidades.get(i).nombre.equals(name)){
                return listaLocalidades.get(i);
            }
        }
        return null;
    }
    
    //metodos para buscar un consulado por su nombre en la lista de consulados registrados
    public Consulado buscarConsulado(String nombre) {
        for (int i = 0; i < listaConsulados.size(); i++) {
            if (listaConsulados.get(i).nombre.equals(nombre)) {   //busqueda secuencial
                return listaConsulados.get(i);
            }
        }
        return null;
    }
    
    //metodo para buscar un administrador por su nombre en la lista de administradores
    public Persona buscarAdministrador(String nombre){
        for(int i = 0; i < listaAdministradores.size(); i++){
            if(listaAdministradores.get(i).nombre.equals(nombre)){
                return listaAdministradores.get(i);
            }
        }
        return null;
    }
    
    
    //metodo para eliminar una persona de la lista de empadronados
    public boolean eliminarPersonaEmpadronada(int cedula){
        for(int i = 0; i < listaPersonasEmpadronadas.size(); i++){  //busqueda secuencial
            if(listaPersonasEmpadronadas.get(i).cedula == cedula){
                Persona p = buscarPersonaEmpadronada(cedula);
                listaPersonasEmpadronadas.remove(p);
                return true;
            }
        }
        return false;
        
    }
    public CandidaturaPresidente buscarCandidaturaPresidente(String partido){
        for (int i = 0; i < listaCandidaturasPresidente.size(); i++) {
            if(listaCandidaturasPresidente.get(i).partidoPolitico.nombre.equals(partido)){
                return listaCandidaturasPresidente.get(i);
            }
        }
        
        return null;
    }
    
    //metodo para modificar los datos de un usuario y los recibe por parámetros
    public void modificarPersonaNacional(int ID , String nuevoNombre, String nuevoApellido1, String nuevoApellido2, int nuevaEdad, int nuevaCedula, String nuevoEstadoCivil, String nuevaFechaNacimiento, String nuevoSexo, String nuevoLugarNacimiento, String nuevaNacionalidad, boolean nuevoFallecido){
        Persona aux = buscarPersonaEmpadronada(ID);
        aux.setNombre(nuevoNombre);
        aux.setPrimerApellido(nuevoApellido1);
        aux.setSegundoApellido(nuevoApellido2);
        aux.setEdad(nuevaEdad);
        aux.setCedula(nuevaCedula);
        aux.setEstadoCivil(nuevoEstadoCivil);
        aux.setFechaNacimiento(nuevaFechaNacimiento);
        aux.setSexo(nuevoSexo);
        aux.setLugarNacimiento(nuevoLugarNacimiento);
        aux.setNacionalidad(nuevaNacionalidad);
        aux.setFallecido(nuevoFallecido);
    }

    public Persona getPersonaLogueada() {
        return personaLogueada;
    }

    public void setPersonaLogueada(Persona personaLogueada) {
        this.personaLogueada = personaLogueada;
    }

    public Persona getAdminLogueado() {
        return adminLogueado;
    }

    public void setAdminLogueado(Persona adminLogueado) {
        this.adminLogueado = adminLogueado;
    }
    
    public PartidoPolitico buscarPartidoPolitico(String nombre){
        for(int i = 0; i < listaPartidosPoliticos.size(); i++){  //busqueda secuencial
            if(listaPartidosPoliticos.get(i).nombre.equals(nombre)){
                return listaPartidosPoliticos.get(i);
            }
        }
        return null;
    } 
    
    //metodo para obtener la cantidad de votantes por distrito / localidad
    public int obtenerCantidadVotantesPorLocalidad(String nombre){
        int contador = 0;
        for(int i = 0; i < listaPersonasEmpadronadas.size(); i++){
            if(listaPersonasEmpadronadas.get(i).domicilioElectoral.getDistrito() != null){
                if(listaPersonasEmpadronadas.get(i).domicilioElectoral.getDistrito().nombre.equals(nombre)){
                    contador++;
                }
            }
            else if(listaPersonasEmpadronadas.get(i).domicilioElectoral.getLocalidad() != null){
                if(listaPersonasEmpadronadas.get(i).domicilioElectoral.getLocalidad().nombre.equals(nombre)){
                    contador++;
                }
            }
            
        }
        return contador;   
    }
    
    
    //metodo para crear JRV por distrito en territorio nacional
    public void generarJRVnacional() {
        for (int i = 0; i < listaDistritos.size(); i++) {
            Distrito distrito = listaDistritos.get(i);
            int cantidadElectores = obtenerCantidadVotantesPorLocalidad(distrito.nombre);
            String centroVotacion = "Centro de votación de " + distrito.nombre;
            String direccion = "Distrito: " + listaDistritos.get(i).nombre + ", Cantón: " + listaDistritos.get(i).canton.nombre + ", Provincia: " + listaDistritos.get(i).canton.provincia.nombre;
            JRVNacional n = new JRVNacional(distrito, i, cantidadElectores, centroVotacion, direccion, "Costa Rica");
            if (listaJRVnacional.contains(n)) {
                continue;
            } else {
                listaJRVnacional.add(n);
            }
        }
    }
    
    //metodo para generar las jrc necesarias por localidad
    public void generarJRVExtranjera() {
        for (int i = 0; i < listaLocalidades.size(); i++) {
            Localidad localidad = listaLocalidades.get(i);
            int cantELectore = obtenerCantidadVotantesPorLocalidad(localidad.nombre);
            String centroVotacion = "Centro de votación de " + localidad.nombre;
            String direccion = "Localidad: " + localidad.nombre + ", Consulado: " + localidad.consulado.nombre;
            JRVExtranjera e = new JRVExtranjera(localidad, i, cantELectore, centroVotacion, direccion, localidad.consulado.nombre);
            if (listaJRVextranjera.contains(e)) {
                continue;
            } else {
                listaJRVextranjera.add(e);
            }
        }       
    } 
    
    //metodo pata obtener cantidad de votantes mayores de 100 años
    public int obtenerVotantesCentenarios(){
        int contador = 0;
        for(int i = 0; i < listaPersonasEmpadronadas.size(); i++){
            if( listaPersonasEmpadronadas.get(i).edad >= 100){
                contador ++;
            }
        }
        return contador;
    }
    
    //metodo para obtener la cantidad de votantes entre 18 y 40 años
    public int obtenerVotantesAdultos(){
        int contador = 0;
        for(int i = 0; i < listaPersonasEmpadronadas.size(); i++){
            if( listaPersonasEmpadronadas.get(i).edad >= 18 && listaPersonasEmpadronadas.get(i).edad <= 40){
                contador ++;
            }
        }
        return contador;
    }
    
    
    // metodo para retornar la clase singleton y si no existe la crea
    public static MetodosRegistroCivil getInstance(){
        if(instance == null)                             
            instance = new MetodosRegistroCivil();
        return instance;
    }
    
}
