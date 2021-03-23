# 100porCiento

    @Override
    public ArrayList<Producto> searchByName(String nombre) {
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
