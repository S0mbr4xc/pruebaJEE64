package ec.edu.ups.ppw.pruebaJEE.DAO;

import java.util.List;

import ec.edu.ups.ppw.pruebaJEE.model.cliente;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Stateless
public class clienteDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void insert(cliente cli) {
		em.persist(cli);
	}
	
	public void update(cliente cli) {
		em.merge(cli);
	}
	
	public cliente read(String ci) {
		cliente cli = em.find(cliente.class, ci);
		return cli;
	}
	
	public List<cliente> getAll(){
		String jpql = "SELECT c FROM cliente c";//Nombre de la entidad asi se haya cambiado el nombre
		Query query = em.createQuery(jpql, cliente.class);
		return query.getResultList();
	}
}
