package dominio;

import dominio.DetalleIngrediente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2021-04-19T00:33:55")
@StaticMetamodel(Ingrediente.class)
public class Ingrediente_ { 

    public static volatile SingularAttribute<Ingrediente, Float> precioExtra;
    public static volatile SingularAttribute<Ingrediente, Long> id;
    public static volatile SingularAttribute<Ingrediente, String> nombre;
    public static volatile ListAttribute<Ingrediente, DetalleIngrediente> productos;

}