/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author David
 */
public class datos {
    private SimpleStringProperty dni;
    private SimpleStringProperty nombre;
    private SimpleStringProperty apellidos;
    private SimpleStringProperty telefono;

    public String getDni() {
        return dni.get();
    }

    public void setDni(SimpleStringProperty dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre.get();
    }

    public void setNombre(SimpleStringProperty nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos.get();
    }

    public void setApellidos(SimpleStringProperty apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono.get();
    }

    public void setTelefono(SimpleStringProperty telefono) {
        this.telefono = telefono;
    }

    public datos(String dni, String nombre, String apellidos, String telefono) {
        this.dni = new SimpleStringProperty(dni);
        this.nombre = new SimpleStringProperty( nombre);
        this.apellidos = new SimpleStringProperty(apellidos);
        this.telefono = new SimpleStringProperty(telefono);
    }
}
