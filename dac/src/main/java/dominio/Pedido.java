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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author MSI GF63
 */
@Entity
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpedido")
    private Long id;
    
    @Column(name="total")
    private Float total;
    
    @Column(name = "estado", length = 15)
    @Enumerated(EnumType.STRING)
    private Estado estado; 
     
    @ManyToOne(optional=false)
    @JoinColumn(name="idcliente")
    private Cliente cliente;
    
    @ManyToOne(optional = false)
    @JoinColumn(name="idusuario")
    private Usuario usuario;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
    private List<DetallePedido> detallePedido;

    public Pedido() {
        this.detallePedido= new ArrayList<>();
    }

    public Pedido(Long id, Float total, Estado estado, Cliente cliente, Usuario usuario, List<DetallePedido> detallePedido) {
        this.id = id;
        this.total = total;
        this.estado = estado;
        this.cliente = cliente;
        this.usuario = usuario;
        this.detallePedido = detallePedido;
    }

    public Pedido(Float total, Estado estado, Cliente cliente, Usuario usuario) {
        this();
        this.total = total;
        this.estado = estado;
        this.cliente = cliente;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getTotal() {
        return total;
    }

    public void setTotal(Float total) {
        this.total = total;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(List<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }
    
    public void addDetalle(DetallePedido detallePedido) {
        this.detallePedido.add(detallePedido);
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
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", total=" + total + ", estado=" + estado  + ", detallePedido=" + detallePedido + '}';
    }
}