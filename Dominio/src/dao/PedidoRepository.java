/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Ingrediente;
import dominio.Pedido;
import dominio.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author MSI GF63
 */
public class PedidoRepository extends BaseRepository<Pedido> {

   @Override
    public boolean guardar(Pedido entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
        return true;
    }
    
    /**
     * Agregar logica de actualizar cuando y como
     */
    @Override
    public boolean actualizar(Pedido pedidoAc) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Pedido pedido = entityManager.find(Pedido.class, pedidoAc.getId());
        if (pedido != null) {
            pedido.setTotal(pedidoAc.getTotal());
            pedido.setEstado(pedidoAc.getEstado());
            entityManager.merge(pedido);
            entityManager.getTransaction().commit();
            entityManager.close();
            return true;
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return false;
    }

    @Override
    public boolean eliminar(long id) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        Ingrediente ingrediente = em.find(Ingrediente.class, id);
        if (ingrediente != null) {
            em.remove(ingrediente);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        em.getTransaction().commit();
        em.close();
        return false;
    }

    @Override
    public Pedido buscarporID(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Pedido pedido = entityManager.find(Pedido.class, id);
        entityManager.getTransaction().commit();
        return pedido;
    }

    @Override
    public ArrayList<Pedido> buscarTodas() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Pedido.class));
        Query query = em.createQuery(cq);
        ArrayList<Pedido> pedidos = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return pedidos;
    }

    @Override
    public List<Pedido> buscarComo(String nombre) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Pedido> cq = builder.createQuery(Pedido.class);
        Root<Pedido> root = cq.from(Pedido.class);
        cq = cq.select(root).where(builder.like(root.get("nombre"), "%" + nombre + "%"));
        TypedQuery<Pedido> typedQuery = em.createQuery(cq);
        ArrayList<Pedido> pedidos = new ArrayList<>(typedQuery.getResultList());
        em.getTransaction().commit();
        em.close();
        return pedidos;
    }
    
    
}
