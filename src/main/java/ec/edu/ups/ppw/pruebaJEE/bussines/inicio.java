package ec.edu.ups.ppw.pruebaJEE.bussines;

import java.util.List;

import ec.edu.ups.ppw.pruebaJEE.model.cliente;
import ec.edu.ups.ppw.pruebaJEE.model.deuda;
import jakarta.annotation.PostConstruct;
import jakarta.ejb.Singleton;
import jakarta.ejb.Startup;
import jakarta.inject.Inject;

@Singleton
@Startup
public class inicio {
	
	@Inject
	private gestionCientes gc;
	
	@Inject
	private gestionDeudas gd;
	
	@PostConstruct
	public void init() {
		cliente cli = new cliente();
		cli.setCedula("0106785678");
		cli.setNombre("Esteban Cordova");
		System.out.println(cli.toString());
		gc.create(cli);
		
		cli = new cliente();
		
		cli.setCedula("0123456789");
		cli.setNombre("Samira Lasso");
		System.out.println(cli.toString());
		gc.create(cli);
		
		
		deuda de = new deuda();
		de.setCosto(20.0);
		de.setCliente(cli);
		gd.create(de);
		
		
		de = new deuda();
		de.setCosto(35.0);
		de.setCliente(cli);
		gd.create(de);
		
	}
}
