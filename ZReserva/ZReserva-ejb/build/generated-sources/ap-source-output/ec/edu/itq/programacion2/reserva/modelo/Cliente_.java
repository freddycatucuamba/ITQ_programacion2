package ec.edu.itq.programacion2.reserva.modelo;

import ec.edu.itq.programacion2.reserva.modelo.EstadoCivil;
import ec.edu.itq.programacion2.reserva.modelo.Facturacion;
import ec.edu.itq.programacion2.reserva.modelo.Genero;
import ec.edu.itq.programacion2.reserva.modelo.Nacionalidad;
import ec.edu.itq.programacion2.reserva.modelo.Reservacion;
import ec.edu.itq.programacion2.reserva.modelo.TipoCliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-12T19:14:15")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Nacionalidad> idNacionalidad;
    public static volatile SingularAttribute<Cliente, String> direccion;
    public static volatile SingularAttribute<Cliente, TipoCliente> idTipoCliente;
    public static volatile SingularAttribute<Cliente, String> nombre;
    public static volatile SingularAttribute<Cliente, EstadoCivil> idEstado;
    public static volatile SingularAttribute<Cliente, Integer> idCliente;
    public static volatile SingularAttribute<Cliente, String> apellido;
    public static volatile SingularAttribute<Cliente, String> correo;
    public static volatile ListAttribute<Cliente, Genero> generoList;
    public static volatile SingularAttribute<Cliente, Integer> telefono;
    public static volatile SingularAttribute<Cliente, String> empresa;
    public static volatile SingularAttribute<Cliente, Short> numeroVisitas;
    public static volatile ListAttribute<Cliente, Facturacion> facturacionList;
    public static volatile ListAttribute<Cliente, Reservacion> reservacionList;

}