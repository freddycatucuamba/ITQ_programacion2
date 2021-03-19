/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.servicio;

import ec.edu.itq.programacion2.reserva.dao.EstadoCivilDao;
import ec.edu.itq.programacion2.reserva.modelo.EstadoCivil;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author fcatucuamba
 */
@Stateless
@LocalBean
public class EstadoCivilServicio {

    @EJB
    private EstadoCivilDao estadoCivilDao;
    
    public void guardar(EstadoCivil estadoCivil){
        estadoCivilDao.create(estadoCivil);
    }

    public List<EstadoCivil> buscar() {
        List<EstadoCivil> resultado = estadoCivilDao.findAll();
        return resultado;
    }
}
