/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fabián
 */
public class Persona {
    public String nombre;
    public String primerApellido;
    public String segundoApellido;
    public int edad;
    public int cedula;
    public String estadoCivil;
    public String fechaNacimiento;
    public String sexo;
    public String lugarNacimiento;
    public String nacionalidad;
    public boolean fallecido;
    public DomicilioElectoral domicilioElectoral;

    public Persona(String nombre, String primerApellido, String segundoApellido, int edad, int cedula, String estadoCivil, String fechaNacimiento, String sexo, String lugarNacimiento, String nacionalidad, boolean fallecido, DomicilioElectoral domicilioElectoral) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.cedula = cedula;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.lugarNacimiento = lugarNacimiento;
        this.nacionalidad = nacionalidad;
        this.fallecido = fallecido;
        this.domicilioElectoral = domicilioElectoral;        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public boolean isFallecido() {
        return fallecido;
    }

    public void setFallecido(boolean fallecido) {
        this.fallecido = fallecido;
    }

    public DomicilioElectoral getDomicilioElectoral() {
        return domicilioElectoral;
    }

    public void setDomicilioElectoral(DomicilioElectoral domicilioElectoral) {
        this.domicilioElectoral = domicilioElectoral;
    }
    
}
