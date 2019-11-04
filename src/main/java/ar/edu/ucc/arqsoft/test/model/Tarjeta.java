package ar.edu.ucc.arqsoft.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="TARJETA")
public class Tarjeta extends ObjetoGenerico{
	
	@Column(name="NUMERO", length=300, nullable= false)
	private String numero;
	
	@Column(name="SALDO", length=200, nullable= false)
	private Double saldo;
    
    
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
    
}
