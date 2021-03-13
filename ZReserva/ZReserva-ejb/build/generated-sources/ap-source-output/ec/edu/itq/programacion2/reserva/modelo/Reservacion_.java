package ec.edu.itq.programacion2.reserva.modelo;

import ec.edu.itq.programacion2.reserva.modelo.Cliente;
import ec.edu.itq.programacion2.reserva.modelo.Facturacion;
import ec.edu.itq.programacion2.reserva.modelo.Habitacion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-12T19:14:15")
@StaticMetamodel(Reservacion.class)
public class Reservacion_ { 

    public static volatile SingularAttribute<Reservacion, Boolean> estado;
    public static volatile SingularAttribute<Reservacion, Integer> precio;
    public static volatile SingularAttribute<Reservacion, Cliente> idCliente;
    public static volatile SingularAttribute<Reservacion, Date> fechaInicio;
    public static volatile SingularAttribute<Reservacion, Short> cantidadPersonas;
    public static volatile SingularAttribute<Reservacion, Integer> idReservacion;
    public static volatile ListAttribute<Reservacion, Facturacion> facturacionList;
    public static volatile SingularAttribute<Reservacion, Habitacion> idHabitacion;
    public static volatile SingularAttribute<Reservacion, Date> fechaFin;

}