package ec.edu.itq.programacion2.reserva.modelo;

import ec.edu.itq.programacion2.reserva.modelo.Cliente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-03-10T19:05:48")
@StaticMetamodel(EstadoCivil.class)
public class EstadoCivil_ { 

    public static volatile ListAttribute<EstadoCivil, Cliente> clienteList;
    public static volatile SingularAttribute<EstadoCivil, Integer> idEstado;
    public static volatile SingularAttribute<EstadoCivil, String> nombre;

}