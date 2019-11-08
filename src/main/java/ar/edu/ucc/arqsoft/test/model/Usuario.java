package ar.edu.ucc.arqsoft.test.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="USUARIO")
public class Usuario extends ObjetoGenerico{
	
	@Column(name="NOMBRE", length=300, nullable= false)
	private String nombre;
	
	@Column(name="APELLIDO", length=200, nullable= false)
	private String apellido;
    
    @Column(name="DNI", length=200, nullable= false)
    private String dni;
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy="USUARIO")
	private Set<Tarjeta> tarjetas;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
    }
    
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Set<Tarjeta> getTarjetas() {
		return tarjetas;
	}

	public void setTarjetas(Set<Tarjeta> tarjetas){
		this.tarjetas = tarjetas;
	}
}
