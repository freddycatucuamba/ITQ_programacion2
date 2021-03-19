/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.control;

import ec.edu.itq.programacion2.reserva.modelo.Cliente;
import ec.edu.itq.programacion2.reserva.servicio.ClienteServicio;
import java.util.ArrayList;
import java.util.Date;
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
public class ReservacionControl {
    private List<SelectItem> listeItemsClientes;
    private Map<Long, Cliente> mapaClientes;
    private Date fechaMaxima;
    
    @EJB
    private ClienteServicio clienteServicio;

    @PostConstruct
    public void init(){
        llenarItemsClientes();
        fechaMaxima = new Date("2021/04/15");
    }
    
    private void llenarItemsClientes(){
        List<Cliente> listaCliente = clienteServicio.buscarCliente();
        listeItemsClientes = new ArrayList<>();
        mapaClientes = new HashMap<>();
        for (Cliente cliente : listaCliente) {
            SelectItem item = new SelectItem(cliente.getIdCliente(), cliente.getApellido()+" "+cliente.getNombre());
            listeItemsClientes.add(item);
            mapaClientes.put(cliente.getIdCliente(), cliente);
        }
    }

    public List<SelectItem> getListeItemsClientes() {
        return listeItemsClientes;
    }

    public void setListeItemsClientes(List<SelectItem> listeItemsClientes) {
        this.listeItemsClientes = listeItemsClientes;
    }

    public Date getFechaMaxima() {
        return fechaMaxima;
    }

    public void setFechaMaxima(Date fechaMaxima) {
        this.fechaMaxima = fechaMaxima;
    }
    
    
    
}
