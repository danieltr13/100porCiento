/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author MSI GF63
 */
@Entity
@DiscriminatorValue(value="productolisto")
public class ProductoListo extends Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    public ProductoListo(String nombre, Float precio, Integer cantidad) {
        super(nombre, precio, cantidad);
    }

    public ProductoListo() {
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoListo)) {
            return false;
        }
        ProductoListo other = (ProductoListo) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.ProductoListo[ id=" + idproducto + " ]";
    }
    
}
