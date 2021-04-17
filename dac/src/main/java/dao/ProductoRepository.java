/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Ingrediente;
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
 * @author Alfon
 */
public class ProductoRepository extends BaseRepository<Producto> {

    public ProductoRepository() {
    }
   
    
    @Override
    public boolean guardar(Producto entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public boolean actualizar(Producto productoActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Producto producto = entityManager.find(Producto.class, productoActualizado.getId());
        if (producto != null) {
            producto.setNombre(productoActualizado.getNombre());
            producto.setCantidad(productoActualizado.getCantidad());
            producto.setPrecio(producto.getPrecio());
            entityManager.merge(producto);
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
    public Producto buscarporID(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Producto producto = entityManager.find(Producto.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return producto;
    }

    @Override
    public ArrayList<Producto> buscarTodas() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Ingrediente.class));
        Query query = em.createQuery(cq);
        ArrayList<Producto> productos = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return productos;
    }

    @Override
    public List<Producto> buscarComo(String nombre) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Producto> cq = builder.createQuery(Producto.class);
        Root<Producto> root = cq.from(Producto.class);
        cq = cq.select(root).where(builder.like(root.get("nombre"), "%" + nombre + "%"));
        TypedQuery<Producto> typedQuery = em.createQuery(cq);
        ArrayList<Producto> productos = new ArrayList<>(typedQuery.getResultList());
        em.getTransaction().commit();
        em.close();
        return productos;
    }
    
    public ArrayList<Producto> buscarCategoria(String categoria) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Producto> cq = builder.createQuery(Producto.class);
        Root<Producto> root = cq.from(Producto.class);
        cq = cq.select(root).where(builder.like(root.get("categoria"), "%" + categoria + "%"));
        TypedQuery<Producto> typedQuery = em.createQuery(cq);
        ArrayList<Producto> productos = new ArrayList<>(typedQuery.getResultList());
        em.getTransaction().commit();
        em.close();
        return productos;
    }


}

