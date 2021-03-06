/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class PersonaNacional extends Persona{
    public Distrito distrito;

    public PersonaNacional(Distrito distrito, String nombre, String primerApellido, String segundoApellido, int edad, int cedula, String estadoCivil, String fechaNacimiento, String sexo, String lugarNacimiento, String nacionalidad, boolean fallecido, DomicilioElectoral domicilioElectoral) {
        super(nombre, primerApellido, segundoApellido, edad, cedula, estadoCivil, fechaNacimiento, sexo, lugarNacimiento, nacionalidad, fallecido, domicilioElectoral);
        this.distrito = distrito;
    }

   

    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getPrimerApellido() {
        return primerApellido;
    }

    @Override
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Override
    public String getSegundoApellido() {
        return segundoApellido;
    }

    @Override
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Override
    public int getEdad() {
        return edad;
    }
    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int getCedula() {
        return cedula;
    }

    @Override
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    @Override
    public String getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String getSexo() {
        return sexo;
    }

    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    @Override
    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public boolean isFallecido() {
        return fallecido;
    }

    @Override
    public void setFallecido(boolean fallecido) {
        this.fallecido = fallecido;
    }

    @Override
    public DomicilioElectoral getDomicilioElectoral() {
        return domicilioElectoral;
    }

    @Override
    public void setDomicilioElectoral(DomicilioElectoral domicilioElectoral) {
        this.domicilioElectoral = domicilioElectoral;
    }   
    
 
    
}
