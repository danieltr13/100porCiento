package dominio;

import dominio.Categoria;
import dominio.DetalleIngrediente;
import dominio.DetallePedido;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-05-12T01:51:17")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile ListAttribute<Producto, DetalleIngrediente> detalleIngredientes;
    public static volatile SingularAttribute<Producto, Float> precio;
    public static volatile SingularAttribute<Producto, Categoria> categoria;
    public static volatile SingularAttribute<Producto, Integer> cantidad;
    public static volatile SingularAttribute<Producto, Long> idproducto;
    public static volatile SingularAttribute<Producto, String> nombre;
    public static volatile ListAttribute<Producto, DetallePedido> detallePedidos;

}