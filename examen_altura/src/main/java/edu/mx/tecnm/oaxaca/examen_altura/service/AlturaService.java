/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.examen_altura.service;

import edu.mx.tecnm.oaxaca.examen_altura.model.AlturaModel;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author aleja
 */
@Service
public interface AlturaService {

    public void registrarAltura(AlturaModel altura);

    public List getAlturas();

    public AlturaModel getAltura(int no_control);

    public void updateAltura(AlturaModel alturaModel, Integer no_control);

    public void deleteAltura(Integer no_control);

}
