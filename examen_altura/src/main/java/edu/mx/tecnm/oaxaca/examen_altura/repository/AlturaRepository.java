/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.mx.tecnm.oaxaca.examen_altura.repository;

import edu.mx.tecnm.oaxaca.examen_altura.model.AlturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author aleja
 */
@Repository
public interface AlturaRepository extends JpaRepository<AlturaModel, Integer> {

    public AlturaModel findByNoControl(int no_control);

}
