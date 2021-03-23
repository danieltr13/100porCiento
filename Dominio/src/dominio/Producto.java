/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Alfon
 */
@Entity
@Table(name="producto")
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="idproducto", length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idproducto;
    @Column(name="nombre",nullable = false, length = 45)
    protected String nombre;
    @Column(name="precio", nullable = false,length = 15)
    protected Float precio;
    @Column(name="cantidad", length = 12)
    protected Integer cantidad;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "productoid")
    protected List<DetalleIngrediente> ingredientes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productoid")
    protected List<DetallePedido> pedidos;
    
    public Producto() {
    }

    public Producto(Long idproducto, String nombre,Float precio, Integer cantidad) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public Long getId() {
        return idproducto;
    }

    public void setId(Long idproducto){
        this.idproducto = idproducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
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
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Producto[ id=" + idproducto + " ]";
    }
    
}
