/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Cliente;
import dominio.Pedido;
import dominio.Usuario;
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
public class ClienteRepository extends BaseRepository<Cliente>{

    public ClienteRepository() {
    }
    
    
    @Override
    public boolean guardar(Cliente entidad) {
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
    public boolean actualizar(Cliente clienteAc) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cliente = entityManager.find(Cliente.class, clienteAc.getId());
        if (cliente != null) {
            cliente.setNombre(clienteAc.getNombre());
            cliente.setApellido(clienteAc.getApellido());
            cliente.setTelefono(clienteAc.getTelefono());
            cliente.setDomicilio(clienteAc.getDomicilio());
            entityManager.merge(cliente);
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
        Usuario usuario = em.find(Usuario.class, id);
        if (usuario != null) {
            em.remove(usuario);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        em.getTransaction().commit();
        em.close();
        return false;
    }

    @Override
    public Cliente buscarporID(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Cliente cliente = entityManager.find(Cliente.class, id);
        entityManager.getTransaction().commit();
        return cliente;
    }

    @Override
    public ArrayList<Cliente> buscarTodas() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Cliente.class));
        Query query = em.createQuery(cq);
        ArrayList<Cliente> cliente = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return cliente;
    }

    @Override
    public List<Cliente> buscarComo(String nombre) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Cliente> cq = builder.createQuery(Cliente.class);
        Root<Cliente> root = cq.from(Cliente.class);
        cq = cq.select(root).where(builder.like(root.get("nombre"), "%" + nombre + "%"));
        TypedQuery<Cliente> typedQuery = em.createQuery(cq);
        ArrayList<Cliente> clientes = new ArrayList<>(typedQuery.getResultList());
        em.getTransaction().commit();
        em.close();
        return clientes;
    }
    
}
