/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.examen_altura.implement.service;

import edu.mx.tecnm.oaxaca.examen_altura.model.AlturaModel;
import edu.mx.tecnm.oaxaca.examen_altura.repository.AlturaRepository;
import edu.mx.tecnm.oaxaca.examen_altura.service.AlturaService;
import edu.mx.tecnm.oaxaca.examen_altura.utils.Calculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author aleja
 */
@Service
public class AlturaServiceImplements implements AlturaService {

    @Autowired
    private AlturaRepository alturaRepository;

    @Autowired
    private Calculo calculo;

    @Override
    public void registrarAltura(AlturaModel altura) {
        altura.setIca(Math.round((calculo.ica(altura.getAltura(), altura.getCintura()))*100.00)/100.0);
        altura.setNivel(calculo.nivel(
            calculo.ica(altura.getAltura(), altura.getCintura()), 
            altura.getGenero())
            );
        alturaRepository.save(altura);
    }

    @Override
    public List getAlturas() {
        return alturaRepository.findAll();
    }

    @Override
    public AlturaModel getAltura(int no_control) {
        return alturaRepository.findByNoControl(no_control);
    }

    @Override
    public void updateAltura(AlturaModel alturaModel, Integer no_control) {
        alturaModel.setNoControl(no_control);
        alturaRepository.save(alturaModel);
    }

    @Override
    public void deleteAltura(Integer no_control) {
        alturaRepository.deleteById(no_control);
    }
}
