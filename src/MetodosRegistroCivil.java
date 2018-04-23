
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
    public ArrayList<Consulado> listaConsulados;           // lista de todos los consulados registrados en el sistema
    public static MetodosRegistroCivil instance = null;    // unico objeto de la clase MetodosRegistroCivil (singleton)
    public ArrayList<Persona> listaAdministradores = new ArrayList<>(100);
    public Persona adminLogueado;
    
    
    //constructor de la clase singleton de be ser privado para evitar nuevas instancias de este
    private MetodosRegistroCivil(){
        this.listaPersonasEmpadronadas = new ArrayList<Persona>();  // lista empadronados
        this.listaProvincias = new ArrayList<Provincia>();          // lista provincias
        this.listaCantones = new ArrayList<Canton>();               // lista cantones
        this.listaDistritos = new ArrayList<Distrito>();            // lista distritos
        this.listaLocalidades = new ArrayList<Localidad>();         // lista localidades
        this.listaConsulados = new ArrayList<Consulado>();          // lista consulados
    }

    public ArrayList<Persona> getListaAdministradores() {
        return listaAdministradores;
    }

    public void setListaAdministradores(ArrayList<Persona> listaAdministradores) {
        this.listaAdministradores = listaAdministradores;
    }
    
    //este metodo instancia una nueva persona por medio de los atributos recibidos por parámetros
    public String agregarNacionalAlRegistro(String nombre, String primerApellido, String segundoApellido, int edad, int cedula, String estadoCivil, String fechaNacimiento, String sexo, String lugarNacimiento, String nacionalidad, boolean fallecido, String domicilioElectoral, Distrito distrito){
        PersonaNacional nuevaPersona = new PersonaNacional(distrito, nombre, primerApellido, segundoApellido, edad, cedula, estadoCivil, fechaNacimiento, sexo, lugarNacimiento, nacionalidad, fallecido, domicilioElectoral);
        listaPersonasEmpadronadas.add(nuevaPersona);         //agrega la persona a la lista
        return "Usuario agregado a la lista de empadronado"; 
    }
    
    public String agregarExtranjeroAlRegistro(String nombre, String primerApellido, String segundoApellido, int edad, int cedula, String estadoCivil, String fechaNacimiento, String sexo, String lugarNacimiento, String nacionalidad, boolean fallecido, String domicilioElectoral, Localidad localidad){
        PersonaExtranjera nuevaPersona = new PersonaExtranjera(localidad, nombre, primerApellido, segundoApellido, edad, cedula, estadoCivil, fechaNacimiento, sexo, lugarNacimiento, nacionalidad, fallecido, domicilioElectoral);
        listaPersonasEmpadronadas.add(nuevaPersona);         //agrega la persona a la lista
        return "Usuario agregado a la lista de empadronado"; 
    }
    
    //método para buscar una persona en la lista de personas empadronadas
    public Persona buscarPersonaEmpadronada(int cedula){
        for(int i = 0; i < listaPersonasEmpadronadas.size(); i++){  //busqueda secuencial
            if(listaPersonasEmpadronadas.get(i).cedula == cedula){
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
    
    public Localidad buscarLocalidad(String name){
        for (int i = 0; i < listaLocalidades.size(); i++){
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
    public Persona buscarAdministrador(String nombre){
        for(int i = 0; i < listaAdministradores.size(); i++){
            if(listaAdministradores.get(i).nombre.equals(nombre)){
                return listaAdministradores.get(i);
            }
        }
        return null;
    }
    
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


    
    // set y get de admin logueado

    public Persona getAdminLogueado() {
        return adminLogueado;
    }

    public void setAdminLogueado(Persona adminLogueado) {
        this.adminLogueado = adminLogueado;
    }
    
    //metodo para retornar la clase singleton y si no existe la crea
    public static MetodosRegistroCivil getInstance(){
        if(instance == null)                             
            instance = new MetodosRegistroCivil();
        return instance;
    }

    
    
    
}
