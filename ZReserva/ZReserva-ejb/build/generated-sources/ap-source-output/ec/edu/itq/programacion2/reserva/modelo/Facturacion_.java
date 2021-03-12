package ec.edu.itq.programacion2.reserva.modelo;

import ec.edu.itq.programacion2.reserva.modelo.Cliente;
import ec.edu.itq.programacion2.reserva.modelo.Empleado;
import ec.edu.itq.programacion2.reserva.modelo.Reservacion;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-10T19:05:48")
@StaticMetamodel(Facturacion.class)
public class Facturacion_ { 

    public static volatile SingularAttribute<Facturacion, Integer> precio;
    public static volatile SingularAttribute<Facturacion, Integer> total;
    public static volatile SingularAttribute<Facturacion, Integer> servicio;
    public static volatile SingularAttribute<Facturacion, Cliente> idCliente;
    public static volatile SingularAttribute<Facturacion, Integer> iva;
    public static volatile SingularAttribute<Facturacion, Empleado> idEmpleado;
    public static volatile SingularAttribute<Facturacion, Integer> subtotal;
    public static volatile SingularAttribute<Facturacion, Integer> idFacturacion;
    public static volatile SingularAttribute<Facturacion, Reservacion> idReservacion;

}