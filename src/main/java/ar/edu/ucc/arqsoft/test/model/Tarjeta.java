package ar.edu.ucc.arqsoft.test.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TARJETA")
public class Tarjeta extends ObjetoGenerico{
	
	@Column(name="NUMERO", length=300, nullable= false)
	private String numero;
	
	@Column(name="SALDO", length=200, nullable= false)
	private Double saldo;
	
	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Usuario.class)
	@JoinColumn(name="USUARIO", nullable = true)
	private Usuario USUARIO;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "TARJETA")
	private Set<Transaccion> transacciones;
    
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Usuario getUsuario(){
		return USUARIO;
	}

	public void setUsuario(Usuario USUARIO){
		this.USUARIO = USUARIO;
	}

	public Set<Transaccion> getTransacciones(){
		return transacciones;
	}

	public void setTransaccione(Set<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}
    
}
