package dominio;

import dominio.Pedido;
import dominio.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-19T00:33:55")
@StaticMetamodel(DetallePedido.class)
public class DetallePedido_ { 

    public static volatile SingularAttribute<DetallePedido, Float> total;
    public static volatile SingularAttribute<DetallePedido, Pedido> pedido;
    public static volatile SingularAttribute<DetallePedido, Long> id;
    public static volatile SingularAttribute<DetallePedido, Integer> cantidad;
    public static volatile SingularAttribute<DetallePedido, Producto> producto;
    public static volatile SingularAttribute<DetallePedido, String> nota;
    public static volatile SingularAttribute<DetallePedido, Integer> linea;

}