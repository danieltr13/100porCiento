/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


/**
 *
 * @author Alfon
 */
@Entity
@DiscriminatorValue(value="productolisto")
public class ProductoListo extends Producto implements Serializable {
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (super.idproducto != null ? super.idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoListo)) {
            return false;
        }
        ProductoListo other = (ProductoListo) object;
        if ((super.idproducto == null && super.idproducto != null) || (super.idproducto != null && !super.idproducto.equals(super.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.ProductoListo[ id=" + super.idproducto + " ]";
    }
    
}
