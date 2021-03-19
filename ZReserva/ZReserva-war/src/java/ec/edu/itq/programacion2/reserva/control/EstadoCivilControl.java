/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.control;

import ec.edu.itq.programacion2.reserva.modelo.EstadoCivil;
import ec.edu.itq.programacion2.reserva.servicio.EstadoCivilServicio;
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
public class EstadoCivilControl {

  private EstadoCivil estadoCivil;
  private List<EstadoCivil> listaEstadoCivil;
  
  @EJB
  private EstadoCivilServicio estadoCivilServicio;
  
  @PostConstruct
  public void init(){
      estadoCivil = new EstadoCivil();
      buscarEstadoCivil();
  }
  
  public void buscarEstadoCivil(){
      listaEstadoCivil = estadoCivilServicio.buscar();
  }
  public void guardar(){
      estadoCivilServicio.guardar(estadoCivil);
      init();
  }
  
  public void  seleccionarEstadoCivil(EstadoCivil estadoCivil){
      this.estadoCivil = estadoCivil;
  }     

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public List<EstadoCivil> getListaEstadoCivil() {
        return listaEstadoCivil;
    }

    public void setListaEstadoCivil(List<EstadoCivil> listaEstadoCivil) {
        this.listaEstadoCivil = listaEstadoCivil;
    }
    
    
    
}
