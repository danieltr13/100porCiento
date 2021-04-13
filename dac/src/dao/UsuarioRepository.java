/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
public class UsuarioRepository extends BaseRepository<Usuario>{
    
    @Override
    public boolean guardar(Usuario entidad) {
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
    public boolean actualizar(Usuario usuarioAc) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Usuario usuario = entityManager.find(Usuario.class, usuarioAc.getId());
        if (usuario != null) {
            usuario.setNombre(usuarioAc.getNombre());
            usuario.setApellido(usuarioAc.getApellido());
            usuario.setTelefono(usuarioAc.getTelefono());
            usuario.setNombreUsuario(usuarioAc.getNombreUsuario());
            usuario.setContrasenia(usuarioAc.getContrasenia());
            entityManager.merge(usuario);
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
    public Usuario buscarporID(long id) {
        EntityManager entityManager = this.createEntityManager();
        entityManager.getTransaction().begin();
        Usuario pedido = entityManager.find(Usuario.class, id);
        entityManager.getTransaction().commit();
        return pedido;
    }

    @Override
    public ArrayList<Usuario> buscarTodas() {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Usuario.class));
        Query query = em.createQuery(cq);
        ArrayList<Usuario> usuarios = new ArrayList<>(query.getResultList());
        em.getTransaction().commit();
        em.close();
        return usuarios;
    }

    @Override
    public List<Usuario> buscarComo(String nombre) {
        EntityManager em = this.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Usuario> cq = builder.createQuery(Usuario.class);
        Root<Usuario> root = cq.from(Usuario.class);
        cq = cq.select(root).where(builder.like(root.get("nombre"), "%" + nombre + "%"));
        TypedQuery<Usuario> typedQuery = em.createQuery(cq);
        ArrayList<Usuario> pedidos = new ArrayList<>(typedQuery.getResultList());
        em.getTransaction().commit();
        em.close();
        return pedidos;
    }
    
}
