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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import static javax.persistence.InheritanceType.SINGLE_TABLE;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Alfon
 */
@Entity
@Table(name="producto")
@Inheritance(strategy=SINGLE_TABLE)
//@DiscriminatorColumn(name="DISC", discriminatorType=STRING,length=20)
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
    //quitar
    @Column(name="cantidad", length = 12)
    protected Integer cantidad;
    @Column(name = "categoria", length = 15)
    @Enumerated(EnumType.STRING)
    protected Categoria categoria;
    /*@Column (name="descripcion")
    protected String descripcion;*/
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "producto")
    protected List<DetalleIngrediente> detalleIngredientes;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producto")
    protected List<DetallePedido> detallePedidos;

    public Producto(Long idproducto, String nombre, Float precio, Integer cantidad) {
        this();
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Producto() {
        this.detalleIngredientes= new ArrayList<>();
        this.detallePedidos= new ArrayList<>();
    }

    public Producto(String nombre, Float precio, Integer cantidad, Categoria categoria) {
        this();
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria= categoria;
    }

    public Producto(Long idproducto, String nombre, Float precio, Integer cantidad, Categoria categoria, List<DetalleIngrediente> detalleIngredientes, List<DetallePedido> detallePedidos) {
        this.idproducto = idproducto;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.detalleIngredientes = detalleIngredientes;
        this.detallePedidos = detallePedidos;
    }
    
    public Long getId() {
        return idproducto;
    }

    public void setId(Long id) {
        this.idproducto = id;
    }

    public Long getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Long idproducto) {
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

    public List<DetalleIngrediente> getDetalleIngredientes() {
        return detalleIngredientes;
    }

    public void setDetalleIngredientes(List<DetalleIngrediente> detalleIngredientes) {
        this.detalleIngredientes = detalleIngredientes;
    }
    
    public void setDetalleIngrediente(DetalleIngrediente dIngrediente) {
        this.detalleIngredientes.add(dIngrediente);
    }

    public List<DetallePedido> getDetallePedidos() {
        return detallePedidos;
    }

    public void setDetallePedidos(List<DetallePedido> detallePedidos) {
        this.detallePedidos = detallePedidos;
    }

    public Categoria getEstado() {
        return categoria;
    }

    public void setEstado(Categoria estado) {
        this.categoria = estado;
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
        return "Producto{" + "idproducto=" + idproducto + ", nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + ", detalleIngredientes=" + detalleIngredientes + ", detallePedidos=" + detallePedidos + '}';
    }
    
}
