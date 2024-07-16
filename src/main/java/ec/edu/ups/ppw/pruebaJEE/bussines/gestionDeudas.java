package ec.edu.ups.ppw.pruebaJEE.bussines;

import java.util.List;

import ec.edu.ups.ppw.pruebaJEE.DAO.deudaDAO;
import ec.edu.ups.ppw.pruebaJEE.model.deuda;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class gestionDeudas {
	@Inject
	private deudaDAO dao;
	
	public void create(deuda de) {
		dao.insert(de);
	}
	
	public void update (deuda de) {
		dao.update(de);
	}
	
	public deuda read(int ci) {
		deuda de = dao.read(ci);
		if(de==null) {
			return null;
		}
		return de;
	}
	
	public List<deuda> getAll(String cliente) {
		return dao.getDeudas(cliente);
	}
	
	public List<deuda> getAlll() {
		return dao.getAll();
	}
}
