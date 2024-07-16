package ec.edu.ups.ppw.pruebaJEE.bussines;

import java.util.List;

import ec.edu.ups.ppw.pruebaJEE.DAO.clienteDAO;
import ec.edu.ups.ppw.pruebaJEE.model.cliente;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;

@Stateless
public class gestionCientes {
	
	@Inject
	private clienteDAO dao;
	
	public void create(cliente cli) {
		dao.insert(cli);
	}
	
	public void update(cliente cli) {
		dao.update(cli);
	}
	
	public cliente read(String ci) {
		if(ci.length()<10) {
			return null;
		}
		cliente cli = dao.read(ci);
		if(cli==null) {
			return null;
		}
		return cli;
	}
	
	public List<cliente> getAll(){
		return dao.getAll();
	}
}
