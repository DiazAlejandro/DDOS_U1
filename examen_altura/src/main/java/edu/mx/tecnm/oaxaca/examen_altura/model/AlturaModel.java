/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.examen_altura.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author aleja
 */
@Entity
@Table(name = "altura")
public class AlturaModel {

    @Id
    @Column
    private Integer noControl;
    private char genero;
    private double cintura;
    private double altura;
    private String nivel;
    private double ica;

    public Integer getNoControl() {
        return noControl;
    }

    public void setNoControl(Integer noControl) {
        this.noControl = noControl;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public double getCintura() {
        return cintura;
    }

    public void setCintura(double cintura) {
        this.cintura = cintura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getIca() {
        return ica;
    }

    public void setIca(double ica) {
        this.ica = ica;
    }

}
