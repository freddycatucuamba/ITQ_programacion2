package ec.edu.itq.programacion2.reserva.modelo;

import ec.edu.itq.programacion2.reserva.modelo.CarcacteristicaHabitacion;
import ec.edu.itq.programacion2.reserva.modelo.FechasDisponibles;
import ec.edu.itq.programacion2.reserva.modelo.Reservacion;
import ec.edu.itq.programacion2.reserva.modelo.TipoHabitacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-10T19:05:48")
@StaticMetamodel(Habitacion.class)
public class Habitacion_ { 

    public static volatile SingularAttribute<Habitacion, Boolean> estado;
    public static volatile ListAttribute<Habitacion, FechasDisponibles> fechasDisponiblesList;
    public static volatile ListAttribute<Habitacion, CarcacteristicaHabitacion> carcacteristicaHabitacionList;
    public static volatile SingularAttribute<Habitacion, Integer> idHabitacion;
    public static volatile SingularAttribute<Habitacion, String> nombre;
    public static volatile ListAttribute<Habitacion, Reservacion> reservacionList;
    public static volatile SingularAttribute<Habitacion, Short> capacidad;
    public static volatile SingularAttribute<Habitacion, TipoHabitacion> idTipoHabitacion;

}