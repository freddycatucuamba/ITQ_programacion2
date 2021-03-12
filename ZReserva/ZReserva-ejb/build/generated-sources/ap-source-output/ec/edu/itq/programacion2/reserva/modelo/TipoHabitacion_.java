package ec.edu.itq.programacion2.reserva.modelo;

import ec.edu.itq.programacion2.reserva.modelo.Habitacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-10T19:05:48")
@StaticMetamodel(TipoHabitacion.class)
public class TipoHabitacion_ { 

    public static volatile SingularAttribute<TipoHabitacion, String> descripcion;
    public static volatile SingularAttribute<TipoHabitacion, Boolean> estado;
    public static volatile ListAttribute<TipoHabitacion, Habitacion> habitacionList;
    public static volatile SingularAttribute<TipoHabitacion, String> nombre;
    public static volatile SingularAttribute<TipoHabitacion, Integer> idTipoHabitacion;

}