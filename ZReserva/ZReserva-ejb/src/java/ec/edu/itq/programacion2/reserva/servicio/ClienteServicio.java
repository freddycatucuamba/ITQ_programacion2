/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.servicio;

import ec.edu.itq.programacion2.reserva.dao.ClienteDao;
import ec.edu.itq.programacion2.reserva.modelo.Cliente;
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
public class ClienteServicio {

  @EJB
  private ClienteDao clienteDao;
  
  public List<Cliente> buscarCliente(){
      List<Cliente> resultado = clienteDao.buscarCliente();
      return resultado;
  }
    
}
