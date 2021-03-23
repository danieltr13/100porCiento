/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Alfon
 */

@Entity
@Table(name="detalleIngrediente")
public class DetalleIngrediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="iddetalleingrediente")
    private Long id;
    
    @ManyToOne(optional = false)
    @JoinColumn(name="idingrediente")
    @Column(name="ingredienteid",nullable = false)
    private Ingrediente ingredienteid;
    
    @ManyToOne(optional = false)
    @JoinColumn(name="idproducto")
    @Column(name="productoid")
    private Producto productoid;

    
    public DetalleIngrediente() {
    }

    public DetalleIngrediente(Ingrediente ingredienteid, Producto productoid) {
        this.ingredienteid = ingredienteid;
        this.productoid = productoid;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Ingrediente getIngredienteid() {
        return ingredienteid;
    }

    public void setIngredienteid(Ingrediente ingredienteid) {
        this.ingredienteid = ingredienteid;
    }

    public Producto getProductoid() {
        return productoid;
    }

    public void setProductoid(Producto productoid) {
        this.productoid = productoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleIngrediente)) {
            return false;
        }
        DetalleIngrediente other = (DetalleIngrediente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.detalleIngrediente[ id=" + id + " ]";
    }
    
}
