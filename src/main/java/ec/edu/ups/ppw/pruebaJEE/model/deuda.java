package ec.edu.ups.ppw.pruebaJEE.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class deuda {
	
	@Id
	@GeneratedValue
	private int codigo;
	
	private double costo;
	
	@ManyToOne
	@JoinColumn(name = "cliente")
	private cliente cliente;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public cliente getCliente() {
		return cliente;
	}

	public void setCliente(cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "deuda [codigo=" + codigo + ", costo=" + costo + ", cliente=" + cliente + "]";
	}
	
	
}
