package dominio;

import dominio.Ingrediente;
import dominio.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-27T00:03:53")
@StaticMetamodel(DetalleIngrediente.class)
public class DetalleIngrediente_ { 

    public static volatile SingularAttribute<DetalleIngrediente, Long> id;
    public static volatile SingularAttribute<DetalleIngrediente, Producto> producto;
    public static volatile SingularAttribute<DetalleIngrediente, Ingrediente> ingrediente;

}