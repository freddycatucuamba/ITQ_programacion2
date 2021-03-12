/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.control;

import ec.edu.itq.programacion2.reserva.modelo.TipoHabitacion;
import ec.edu.itq.programacion2.reserva.servicio.TipoHabitacionServicio;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author fcatucuamba
 */
@ManagedBean
@ViewScoped
public class TipoHabitacionControl implements Serializable{
    
    @EJB
    private TipoHabitacionServicio tipoHabitacionServicio;

    private TipoHabitacion tipoHabitacion;
    private List<TipoHabitacion> listTipoHabitacion;
    
    @PostConstruct
    public void init(){
        buscarTipoHabitacion();
        tipoHabitacion = new TipoHabitacion();
    }
    
    public void buscarTipoHabitacion(){
       listTipoHabitacion = tipoHabitacionServicio.buscarTipoHabitacion();
    }
    
    public void seleccionarTipoHabitacion(TipoHabitacion tipoHabitacion){
        this.tipoHabitacion = tipoHabitacion;
        System.out.println(this.tipoHabitacion.toString());
    }
    
    public void guardar(){
        System.out.println("Si llega al boton");
        tipoHabitacionServicio.guardar(tipoHabitacion);
        limpiar();
        buscarTipoHabitacion();
    }
    
    private void limpiar(){
       tipoHabitacion = new TipoHabitacion();
    }

    public List<TipoHabitacion> getListTipoHabitacion() {
        return listTipoHabitacion;
    }   

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    
    
    
    

}
