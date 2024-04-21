package com.master.naxer.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Usuario {
    private @Id
    @GeneratedValue Long id;
    private String nombre;

    Usuario() {}

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Long getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("Usuario {id=%s, nombre='%s'}", this.id, this.nombre);
    }
}