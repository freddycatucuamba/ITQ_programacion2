/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.dao;

import ec.edu.itq.programacion2.reserva.generico.GenericoDao;
import ec.edu.itq.programacion2.reserva.modelo.Empleado;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author fcatucuamba
 */
@Stateless
public class EmpleadoDao extends GenericoDao<Empleado> {
    @PersistenceContext(unitName = "ZReserva-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmpleadoDao() {
        super(Empleado.class);
    }
    
}