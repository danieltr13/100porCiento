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
@DiscriminatorValue(value="productopreparado")
public class ProductoPreparado extends Producto implements Serializable {

    private static final long serialVersionUID = 1L;
 
    private String tamanio;

    public ProductoPreparado() {
    }

    public ProductoPreparado(String tamanio, Long idproducto, String nombre, Float precio, Integer cantidad) {
        super(idproducto, nombre, precio, cantidad);
        this.tamanio = tamanio;
    }

    
    
    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
        this.idproducto = idproducto;
    }

    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (super.idproducto != null ? super.idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProductoPreparado)) {
            return false;
        }
        ProductoPreparado other = (ProductoPreparado) object;
        if ((super.idproducto== null && super.idproducto != null) || (super.idproducto != null && !super.idproducto.equals(super.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.ProductoPreparado[ id=" + super.idproducto + " ]";
    }
    
}
