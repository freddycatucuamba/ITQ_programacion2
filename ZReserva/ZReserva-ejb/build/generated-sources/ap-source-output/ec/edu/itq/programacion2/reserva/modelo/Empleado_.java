package ec.edu.itq.programacion2.reserva.modelo;

import ec.edu.itq.programacion2.reserva.modelo.Facturacion;
import ec.edu.itq.programacion2.reserva.modelo.Puesto;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-12T19:14:15")
@StaticMetamodel(Empleado.class)
public class Empleado_ { 

    public static volatile SingularAttribute<Empleado, Integer> idEmpleado;
    public static volatile SingularAttribute<Empleado, String> apellido;
    public static volatile SingularAttribute<Empleado, String> correo;
    public static volatile SingularAttribute<Empleado, Puesto> idPuesto;
    public static volatile SingularAttribute<Empleado, String> direccion;
    public static volatile SingularAttribute<Empleado, Integer> telefono;
    public static volatile ListAttribute<Empleado, Facturacion> facturacionList;
    public static volatile SingularAttribute<Empleado, String> nombre;

}