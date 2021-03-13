/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.servicio;

import ec.edu.itq.programacion2.reserva.dao.HabitacionDao;
import ec.edu.itq.programacion2.reserva.modelo.Habitacion;
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
public class HabitacionServicio {

@EJB
private HabitacionDao habitacionDao;

public void guardar(Habitacion  habitacion){
    habitacionDao.create(habitacion);
}

    public List<Habitacion> buscarHabitacion() {
        List<Habitacion> listaHabitacion = habitacionDao.buscarHabitacion();
        return listaHabitacion;
    }
   


}
