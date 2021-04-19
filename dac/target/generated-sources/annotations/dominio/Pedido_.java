package dominio;

import dominio.Cliente;
import dominio.DetallePedido;
import dominio.Estado;
import dominio.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-19T00:33:55")
@StaticMetamodel(Pedido.class)
public class Pedido_ { 

    public static volatile SingularAttribute<Pedido, Cliente> cliente;
    public static volatile SingularAttribute<Pedido, Float> total;
    public static volatile SingularAttribute<Pedido, Estado> estado;
    public static volatile ListAttribute<Pedido, DetallePedido> detallePedido;
    public static volatile SingularAttribute<Pedido, Usuario> usuario;
    public static volatile SingularAttribute<Pedido, Long> id;

}