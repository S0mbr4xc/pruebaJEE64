package ec.edu.ups.ppw.pruebaJEE.DAO;

import java.util.List;

import ec.edu.ups.ppw.pruebaJEE.model.cliente;
import ec.edu.ups.ppw.pruebaJEE.model.deuda;
import jakarta.ejb.Stateless;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

@Stateless
public class deudaDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(deuda de) {
		em.persist(de);
	}
	
	public void update(deuda de) {
		em.merge(de);
	}
	
	public deuda read(int ci) {
		deuda de = em.find(deuda.class, ci);
		return de;
	}
	
	public List<deuda> getAll(){
		String jpql = "SELECT c FROM deuda c";//Nombre de la entidad asi se haya cambiado el nombre
		Query query = em.createQuery(jpql, cliente.class);
		return query.getResultList();
	}
	
	public List<deuda> getDeudas(String cliente){
		TypedQuery<deuda> query = em.createQuery("SELECT l FROM deuda l WHERE l.cliente = :cliente", deuda.class);
        query.setParameter("cliente", cliente);
        try {
            return query.getResultList();
        } catch (Exception e) {
            return null;
        }
	}
}
