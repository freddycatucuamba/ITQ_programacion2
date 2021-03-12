package ec.edu.itq.programacion2.reserva.modelo;

import ec.edu.itq.programacion2.reserva.modelo.CarcacteristicaHabitacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-10T19:05:48")
@StaticMetamodel(Caracteristica.class)
public class Caracteristica_ { 

    public static volatile SingularAttribute<Caracteristica, String> descripcion;
    public static volatile SingularAttribute<Caracteristica, Integer> idCaracteristica;
    public static volatile ListAttribute<Caracteristica, CarcacteristicaHabitacion> carcacteristicaHabitacionList;
    public static volatile SingularAttribute<Caracteristica, Short> cantidad;
    public static volatile SingularAttribute<Caracteristica, String> nombre;

}