/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Ingrediente;
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
public class IngredienteRepository extends BaseRepository<Ingrediente> {

       @Override
    public boolean guardar(Ingrediente entidad) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(entidad);
        entityManager.getTransaction().commit();
        entityManager.close();
        return true;
    }

    @Override
    public boolean actualizar(Ingrediente ingredienteActualizado) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Ingrediente persona = entityManager.find(Ingrediente.class, ingredienteActualizado.getId());
        if (persona != null) {
            persona.setNombre(ingredienteActualizado.getNombre());
            persona.setPrecioExtra(ingredienteActualizado.getPrecioExtra());
            entityManager.merge(persona);
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
    public Ingrediente buscarporID(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Ingrediente persona = entityManager.find(Ingrediente.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return persona;
    }

    @Override
    public ArrayList<Ingrediente> buscarTodas() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Ingrediente.class));
        Query query = em.createQuery(cq);
        ArrayList<Ingrediente> ingredientes = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return ingredientes;
    }

    @Override
    public List<Ingrediente> buscarComo(String nombre) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Ingrediente> cq = builder.createQuery(Ingrediente.class);
        Root<Ingrediente> root = cq.from(Ingrediente.class);
        cq = cq.select(root).where(builder.like(root.get("nombre"), "%" + nombre + "%"));
        TypedQuery<Ingrediente> typedQuery = em.createQuery(cq);
        ArrayList<Ingrediente> ingredientes = new ArrayList<>(typedQuery.getResultList());
        em.getTransaction().commit();
        em.close();
        return ingredientes;
    }

    
}
