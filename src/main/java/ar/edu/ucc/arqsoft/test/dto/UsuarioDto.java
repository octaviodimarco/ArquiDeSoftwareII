package ar.edu.ucc.arqsoft.test.dto;

public class UsuarioDto{
    private Long id;

    private String nombre; 

    private String apellido;

    private String dni;

    public UsuarioDto(){}

    public UsuarioDto(Long id, String nombre, String apellido, String dni) {
        super();
        
        this.id = id;

        this.apellido = apellido;

        this.nombre = nombre;

        this.dni = dni;
    }

    public UsuarioDto (Long id){
        super();
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public String getDni(){
        return dni;
    }

    public void setDni (String dni){
        this.dni = dni;
    }
}
