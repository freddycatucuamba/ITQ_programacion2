/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.dao;

import ec.edu.itq.programacion2.reserva.generico.GenericoDao;
import ec.edu.itq.programacion2.reserva.modelo.TipoHabitacion;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author fcatucuamba
 */
@Stateless
public class TipoHabitacionDao extends GenericoDao<TipoHabitacion> {

    public TipoHabitacionDao() {
        super(TipoHabitacion.class);
    }

    public List<TipoHabitacion> buscarTipoHabitacion() {
        Query query = getEntityManager().createQuery("SELECT th FROM TipoHabitacion th WHERE th.estado=true");
        List<TipoHabitacion> listaTipoHabitacion = query.getResultList();
        return listaTipoHabitacion;
    }

}
