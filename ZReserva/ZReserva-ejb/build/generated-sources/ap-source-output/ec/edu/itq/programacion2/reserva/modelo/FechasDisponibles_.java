package ec.edu.itq.programacion2.reserva.modelo;

import ec.edu.itq.programacion2.reserva.modelo.Habitacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-10T19:05:48")
@StaticMetamodel(FechasDisponibles.class)
public class FechasDisponibles_ { 

    public static volatile SingularAttribute<FechasDisponibles, Date> fecha;
    public static volatile SingularAttribute<FechasDisponibles, Boolean> estado;
    public static volatile SingularAttribute<FechasDisponibles, Integer> idFechas;
    public static volatile SingularAttribute<FechasDisponibles, Habitacion> idHabitacion;

}