package ex1.collections.tree;

public class Persona {
	
	private int id;
	
	private String nombre;
	
	private String apellido;

	public Persona(int id) {
		super();
		this.id = id;
	}
	
	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + "]";
	}
	
	
	
}
