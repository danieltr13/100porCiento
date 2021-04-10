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
 * @author MSI GF63
 */
@Entity
@Table(name = "detallepedido")
public class DetallePedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddetallepedido")
    private Long id;
    @Column(name = "linea", nullable = false)
    private Integer linea;
    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;
    @Column(name = "total", nullable = false)
    private Float total;
    
    @ManyToOne(optional = false)
    @JoinColumn(name="idpedido")
    private Pedido pedido;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "idproducto")
    private Producto producto;

    public DetallePedido(Long id, Integer linea, Integer cantidad, Float total, Pedido pedido, Producto producto) {
        this.id = id;
        this.linea = linea;
        this.cantidad = cantidad;
        this.total = total;
        this.pedido = pedido;
        this.producto = producto;
    }
    
    public DetallePedido(Integer linea, Integer cantidad, Float total, Pedido pedido, Producto producto) {
        this.linea = linea;
        this.cantidad = cantidad;
        this.total = total;
        this.pedido = pedido;
        this.producto = producto;
    }

    public DetallePedido() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getLinea() {
        return linea;
    }

    public void setLinea(Integer linea) {
        this.linea = linea;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
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
        if (!(object instanceof DetallePedido)) {
            return false;
        }
        DetallePedido other = (DetallePedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DetallePedido{" + "id=" + id + ", linea=" + linea + ", cantidad=" + cantidad + ", total=" + total + ", pedido=" + pedido.getId() + ", producto=" + producto.getId() + '}';
    }
    
}
