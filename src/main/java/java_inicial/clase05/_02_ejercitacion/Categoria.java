package java_inicial.clase05._02_ejercitacion;

public class Categoria {
	private int id;
	private String nombre;

	public Categoria(int id, String nombre) {
	        this.setId(id);
	        this.setNombre(nombre);
	}
    
	// Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
}