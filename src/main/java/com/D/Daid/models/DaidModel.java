package com.D.Daid.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DatosDaid")
public class DaidModel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(unique = true, nullable = false)

   private Long id;
   private String nombre;
   private Integer alto;
   private Integer ancho;
   private Integer largo;
   private String color;
   private Integer numExtremidades;
   private boolean cuernos;
 
   @Temporal(TemporalType.TIMESTAMP)
   @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
   private Date fecha; 
 
   public Long getId() {
    return this.id;
    }

    public void setId(Long id) {
    this.id = id;
    }

    public String getNombre() {
    return this.nombre;
    }

    public void setNombre(String nombre) {
    this.nombre = nombre;
    }

    public Integer getAlto() {
    return this.alto;
    }

    public void setAlto(Integer alto) {
    this.alto = alto;
    }

    public Integer getAncho() {
    return this.ancho;
    }

    public void setAncho(Integer ancho) {
    this.ancho = ancho;
        }

    public Integer getLargo() {
    return this.largo;
    }

    public void setLargo(Integer largo) {
    this.largo = largo;
    }

    public String getColor() {
    return this.color;
    }

    public void setColor(String color) {
    this.color = color;
    }

    public Integer getNumExtremidades() {
    return this.numExtremidades;
    }

    public void setNumExtremidades(Integer numExtremidades) {
    this.numExtremidades = numExtremidades;
    }

    public boolean isCuernos() {
    return this.cuernos;
    }

    public boolean getCuernos() {
    return this.cuernos;
    }

    public void setCuernos(boolean cuernos) {
    this.cuernos = cuernos;
    }

    public Date getFecha() {
    return this.fecha;
    }

    public void setFecha(Date fecha) {
    this.fecha = fecha;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombreMonstruo='" + getNombre() + "'" +
            ", alto='" + getAlto() + "'" +
            ", ancho='" + getAncho() + "'" +
            ", largo='" + getLargo() + "'" +
            ", color='" + getColor() + "'" +
            ", numExtremidades='" + getNumExtremidades() + "'" +
            ", cuernos='" + isCuernos() + "'" +
            ", fecha='" + getFecha() + "'" +
            "}";
    }

}

