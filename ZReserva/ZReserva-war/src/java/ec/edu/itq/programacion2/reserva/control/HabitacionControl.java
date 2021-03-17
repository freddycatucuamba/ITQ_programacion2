/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.control;

import ec.edu.itq.programacion2.reserva.modelo.Habitacion;
import ec.edu.itq.programacion2.reserva.modelo.TipoHabitacion;
import ec.edu.itq.programacion2.reserva.servicio.HabitacionServicio;
import ec.edu.itq.programacion2.reserva.servicio.TipoHabitacionServicio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.model.SelectItem;

/**
 *
 * @author fcatucuamba
 */
@ManagedBean
@ViewScoped
public class HabitacionControl {

    private Habitacion habitacion;
    private List<Habitacion> listaHabitacion;
    private List<SelectItem> selectItemTipoHabitacion;
    private Integer idTipoHabitacion;
    private Map<Integer, TipoHabitacion> mapaTipoHabitacion;
    private TipoHabitacion tipoHabitacion;
    
    @EJB
    private TipoHabitacionServicio tipoHabitacionServicio;
    @EJB
    private HabitacionServicio habitacionServicio;
    
    @PostConstruct
    public void init(){
        habitacion = new Habitacion();
        crearSelectItemTipoHabitacion(buscarTipoHabitacion());
        buscarHabitacion();
    }
    
    private void buscarHabitacion(){
        listaHabitacion = habitacionServicio.buscarHabitacion();
    }
    
    public void buscarTipoHabitacionPorId(){
        
        tipoHabitacion = tipoHabitacionServicio.buscarTipoHabitacionPorId(idTipoHabitacion.longValue());
        System.out.println("tipo Habitación " + tipoHabitacion.getNombre());
    }
    
    private List<TipoHabitacion> buscarTipoHabitacion(){
        List<TipoHabitacion> listaTipoHabitacion = tipoHabitacionServicio.buscarTipoHabitacion();
        mapaTipoHabitacion = new HashMap<>();
        for (TipoHabitacion tipoHabitacion : listaTipoHabitacion) {
            mapaTipoHabitacion.put(tipoHabitacion.getIdTipoHabitacion(), tipoHabitacion);
        }
        return listaTipoHabitacion;
    }
    
    private void crearSelectItemTipoHabitacion(List<TipoHabitacion> listaTipoHabitacion){
        selectItemTipoHabitacion = new ArrayList<>();
        for (TipoHabitacion tipoHabitacion : listaTipoHabitacion) {
            SelectItem itemHabitacion = new SelectItem(tipoHabitacion.getIdTipoHabitacion(), tipoHabitacion.getNombre());
            selectItemTipoHabitacion.add(itemHabitacion);
        }
    }
    
    public void guardar(){
        TipoHabitacion tipoHabitacion = mapaTipoHabitacion.get(idTipoHabitacion);
        habitacion.setIdTipoHabitacion(tipoHabitacion);
        habitacionServicio.guardar(habitacion);
        limpiar();
        buscarHabitacion();
    }
    
    public void limpiar(){
        this.habitacion = new Habitacion();
        idTipoHabitacion = null;
    }
    
    public void actualizar(Habitacion habitacion){
        this.habitacion = habitacion;
        this.idTipoHabitacion = habitacion.getIdTipoHabitacion().getIdTipoHabitacion();
    }
    
    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public List<Habitacion> getListaHabitacion() {
        return listaHabitacion;
    }

    public void setListaHabitacion(List<Habitacion> listaHabitacion) {
        this.listaHabitacion = listaHabitacion;
    }

    public List<SelectItem> getSelectItemTipoHabitacion() {
        return selectItemTipoHabitacion;
    }

    public void setSelectItemTipoHabitacion(List<SelectItem> selectItemTipoHabitacion) {
        this.selectItemTipoHabitacion = selectItemTipoHabitacion;
    }

    public Integer getIdTipoHabitacion() {
        return idTipoHabitacion;
    }

    public void setIdTipoHabitacion(Integer idTipoHabitacion) {
        this.idTipoHabitacion = idTipoHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
    
   
}
