/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.examen_altura.utils;

import org.springframework.stereotype.Component;

/**
 *
 * @author aleja
 */
@Component
public class Calculo {

    private double ica;
    private String nivel;

    public double getIca() {
        return ica;
    }

    public void setIca(double ica) {
        this.ica = ica;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double ica(double altura, double cintura) {
        return cintura / altura;
    }

    public String nivel(double ica, char genero) {
        if (ica < 0.34 && genero == 'H' || ica < 0.34 && genero == 'F') {
            return "Delgadez severa";
        }
        if (ica > 0.34 && ica < 0.43 && genero == 'H'
                || ica > 0.34 && ica < 0.42 && genero == 'F') {
            return "Delgadez leve";
        }
        if (ica > 0.42 && ica < 0.53 && genero == 'H'
                || ica > 0.41 && ica < 0.49 && genero == 'F') {
            return "Peso normal";
        }
        if (ica > 0.52 && ica < 0.58 && genero == 'H'
                || ica > 0.48 && ica < 0.54 && genero == 'F') {
            return "Sobre peso";
        }
        if (ica > 0.57 && ica < 0.63 && genero == 'H'
                || ica > 0.53 && ica < 0.58 && genero == 'F') {
            return "Sobre peso elevado";
        }
        if (ica > 0.62 && genero == 'H'
                || ica > 0.57 && genero == 'F') {
            return "Obesidad mórbida";
        }
        return "";
    }
}
