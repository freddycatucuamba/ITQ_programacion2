/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.dao;

import ec.edu.itq.programacion2.reserva.generico.GenericoDao;
import ec.edu.itq.programacion2.reserva.modelo.Habitacion;
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
public class HabitacionDao extends GenericoDao<Habitacion> {
    @PersistenceContext(unitName = "ZReserva-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public HabitacionDao() {
        super(Habitacion.class);
    }

    public List<Habitacion> buscarHabitacion() {
        Query query = getEntityManager().createQuery("SELECT h FROM Habitacion h WHERE h.estado = true");
        List<Habitacion> listaHabitacion = query.getResultList();
        return listaHabitacion;
    }
    
}
