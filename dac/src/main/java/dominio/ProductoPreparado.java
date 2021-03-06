/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/**
 *
 * @author MSI GF63
 */
@Entity
@DiscriminatorValue(value = "productopreparado")
public class ProductoPreparado extends Producto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "tamanio", length = 25)
    private String tamanio;

    public ProductoPreparado() {
    }

    public ProductoPreparado(String tamanio, String nombre, Float precio, Integer cantidad, Categoria categoria) {
        super(nombre, precio, cantidad, categoria);
        this.tamanio = tamanio;
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
        if (!(object instanceof ProductoPreparado)) {
            return false;
        }
        ProductoPreparado other = (ProductoPreparado) object;
        return !((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto)));
    }

    @Override
    public String toString() {
        return "ProductoPreparado{" + "tamanio=" + tamanio + '}';
    }
}
