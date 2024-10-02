package com.mycompany.domain;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Perfil {
    private String nombre;
    private String carrera;
    private String foto;
    private String[] lenguajesProgramacion;
    private String[] basesDatos;
    private String[] proyectosRealizados;
    private double promedio;

    public Perfil() {
        this.nombre = "Ulises Rodriguez Solorzano";
        this.carrera = "Tecnologias de la información y comunicaciones";
        this.foto = "images/perfil_image.jpeg";
        this.lenguajesProgramacion = new String[]{"Java", "C#", "C++"};
        this.basesDatos = new String[]{"mySQL", "MariaDB"};
        this.proyectosRealizados = new String[]{"Pagina web PayKawaii"};
        this.promedio = 91.64;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String[] getLenguajesProgramacion() {
        return lenguajesProgramacion;
    }

    public void setLenguajesProgramacion(String[] lenguajesProgramacion) {
        this.lenguajesProgramacion = lenguajesProgramacion;
    }

    public String[] getBasesDatos() {
        return basesDatos;
    }

    public void setBasesDatos(String[] basesDatos) {
        this.basesDatos = basesDatos;
    }

    public String[] getProyectosRealizados() {
        return proyectosRealizados;
    }

    public void setProyectosRealizados(String[] proyectosRealizados) {
        this.proyectosRealizados = proyectosRealizados;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    
}
