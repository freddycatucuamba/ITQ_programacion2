/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author fcatucuamba
 */
@Entity
@Table(name = "carcacteristica_habitacion")
@NamedQueries({
    @NamedQuery(name = "CarcacteristicaHabitacion.findAll", query = "SELECT c FROM CarcacteristicaHabitacion c")})
public class CarcacteristicaHabitacion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_caracteristica_habitacion")
    private Long idCaracteristicaHabitacion;
    @JoinColumn(name = "id_caracteristica", referencedColumnName = "id_caracteristica")
    @ManyToOne(fetch = FetchType.LAZY)
    private Caracteristica idCaracteristica;
    @JoinColumn(name = "id_habitacion", referencedColumnName = "id_habitacion")
    @ManyToOne(fetch = FetchType.LAZY)
    private Habitacion idHabitacion;

    public CarcacteristicaHabitacion() {
    }

    public CarcacteristicaHabitacion(Long idCaracteristicaHabitacion) {
        this.idCaracteristicaHabitacion = idCaracteristicaHabitacion;
    }

    public Long getIdCaracteristicaHabitacion() {
        return idCaracteristicaHabitacion;
    }

    public void setIdCaracteristicaHabitacion(Long idCaracteristicaHabitacion) {
        this.idCaracteristicaHabitacion = idCaracteristicaHabitacion;
    }

    public Caracteristica getIdCaracteristica() {
        return idCaracteristica;
    }

    public void setIdCaracteristica(Caracteristica idCaracteristica) {
        this.idCaracteristica = idCaracteristica;
    }

    public Habitacion getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Habitacion idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCaracteristicaHabitacion != null ? idCaracteristicaHabitacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CarcacteristicaHabitacion)) {
            return false;
        }
        CarcacteristicaHabitacion other = (CarcacteristicaHabitacion) object;
        if ((this.idCaracteristicaHabitacion == null && other.idCaracteristicaHabitacion != null) || (this.idCaracteristicaHabitacion != null && !this.idCaracteristicaHabitacion.equals(other.idCaracteristicaHabitacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.reserva.modelo.CarcacteristicaHabitacion[ idCaracteristicaHabitacion=" + idCaracteristicaHabitacion + " ]";
    }
    
}
