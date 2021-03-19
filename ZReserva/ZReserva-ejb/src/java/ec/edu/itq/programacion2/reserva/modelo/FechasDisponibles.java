/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.itq.programacion2.reserva.modelo;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author fcatucuamba
 */
@Entity
@Table(name = "fechas_disponibles")
@NamedQueries({
    @NamedQuery(name = "FechasDisponibles.findAll", query = "SELECT f FROM FechasDisponibles f")})
public class FechasDisponibles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_fechas")
    private Long idFechas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estado")
    private boolean estado;
    @JoinColumn(name = "id_habitacion", referencedColumnName = "id_habitacion")
    @ManyToOne(fetch = FetchType.LAZY)
    private Habitacion idHabitacion;

    public FechasDisponibles() {
    }

    public FechasDisponibles(Long idFechas) {
        this.idFechas = idFechas;
    }

    public FechasDisponibles(Long idFechas, Date fecha, boolean estado) {
        this.idFechas = idFechas;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Long getIdFechas() {
        return idFechas;
    }

    public void setIdFechas(Long idFechas) {
        this.idFechas = idFechas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
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
        hash += (idFechas != null ? idFechas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FechasDisponibles)) {
            return false;
        }
        FechasDisponibles other = (FechasDisponibles) object;
        if ((this.idFechas == null && other.idFechas != null) || (this.idFechas != null && !this.idFechas.equals(other.idFechas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.itq.programacion2.reserva.modelo.FechasDisponibles[ idFechas=" + idFechas + " ]";
    }
    
}
