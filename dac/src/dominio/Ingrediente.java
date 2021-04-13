/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import java.util.ArrayList;
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
 * @author MSI GF63
 */
@Entity
@Table(name="ingrediente")
public class Ingrediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name="idingrediente", length = 11)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="nombre",nullable = false,length = 100)
    private String nombre;
    @Column(name="precioExtra",nullable = true,length = 11)
    private Float precioExtra;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "ingrediente")
    protected List<DetalleIngrediente> productos;

    public Ingrediente() {
        this.productos= new ArrayList<>();
    }

    public Ingrediente(Long id, String nombre, Float precioExtra, List<DetalleIngrediente> productos) {
        this.id = id;
        this.nombre = nombre;
        this.precioExtra = precioExtra;
        this.productos = productos;
    }

    public Ingrediente(String nombre, Float precioExtra) {
        this();
        this.nombre = nombre;
        this.precioExtra = precioExtra;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getPrecioExtra() {
        return precioExtra;
    }

    public void setPrecioExtra(Float precioExtra) {
        this.precioExtra = precioExtra;
    }

    public List<DetalleIngrediente> getProductos() {
        return productos;
    }

    public void setProductos(List<DetalleIngrediente> productos) {
        this.productos = productos;
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
        if (!(object instanceof Ingrediente)) {
            return false;
        }
        Ingrediente other = (Ingrediente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ingrediente{" + "id=" + id + ", nombre=" + nombre + ", precioExtra=" + precioExtra + ", productos=" + productos + '}';
    }
    
}
