/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.tecnm.oaxaca.examen_altura.controller;

import edu.mx.tecnm.oaxaca.examen_altura.model.AlturaModel;
import edu.mx.tecnm.oaxaca.examen_altura.service.AlturaService;
import edu.mx.tecnm.oaxaca.examen_altura.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author aleja
 */
@RestController
@RequestMapping("/api/v1/altura")

public class AlturaController {
    
    @Autowired
    private AlturaService alturaService;
    
    @PostMapping("/")
    public CustomResponse registrarAltura(@RequestBody AlturaModel altura) {
        CustomResponse customResponse = new CustomResponse();
        alturaService.registrarAltura(altura);
        return customResponse;
    }
    
    @GetMapping("/")
    public CustomResponse getAlturas() {
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(alturaService.getAlturas());
        return customResponse;
    }
    
    @GetMapping("/{noControl}")
    public CustomResponse getAltura(@PathVariable int noControl) {
        CustomResponse customResponse = new CustomResponse();
        customResponse.setData(alturaService.getAltura(noControl));
        return customResponse;
    }
    
    @PutMapping("/{noControl}")
    public CustomResponse updateAltura(@RequestBody AlturaModel alturaModel, @PathVariable Integer noControl) {
        CustomResponse customResponse = new CustomResponse();
        alturaService.updateAltura(alturaModel, noControl);
        return customResponse;
    }
    
    @DeleteMapping("/{noControl}")
    public CustomResponse deleteAltura(@PathVariable Integer noControl) {
        CustomResponse customResponse = new CustomResponse();
        alturaService.deleteAltura(noControl);
        return customResponse;
    }
}
