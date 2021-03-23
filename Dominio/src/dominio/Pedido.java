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
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Alfon
 */
@Entity
@Table(name="pedido")
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
    @Column(name="clienteid")
    private Cliente clienteid;
    
    @ManyToOne(optional = false)
    @JoinColumn(name="idusuario")
    @Column(name="usuarioid")
    private Usuario usuarioid;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pedidoid")
    private List<DetallePedido> pedidos;
   
    public Long getId() { 
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "dominio.Pedido[ id=" + id + " ]";
    }
    
}
