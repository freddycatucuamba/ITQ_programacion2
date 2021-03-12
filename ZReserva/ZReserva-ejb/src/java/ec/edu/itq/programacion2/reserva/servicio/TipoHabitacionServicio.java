/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.servicio;

import ec.edu.itq.programacion2.reserva.dao.TipoHabitacionDao;
import ec.edu.itq.programacion2.reserva.modelo.TipoHabitacion;
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
public class TipoHabitacionServicio {

    @EJB
    private TipoHabitacionDao tipoHabitacionDao;
    
    public void guardar(TipoHabitacion tipoHabitacion){
        tipoHabitacionDao.create(tipoHabitacion);
    }
    
    public List<TipoHabitacion> buscarTipoHabitacion(){
        
        List<TipoHabitacion> listaTipoHabitacion = tipoHabitacionDao.buscarTipoHabitacion();
        
        return listaTipoHabitacion;
    }
}
