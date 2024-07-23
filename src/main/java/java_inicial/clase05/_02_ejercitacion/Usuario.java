package java_inicial.clase05._02_ejercitacion;

public class Usuario {
    private int id;
    private String nombre;
    private String mail;
    private boolean becado;

    public Usuario(int id, String nombre, String mail, boolean becado) {
        this.setId(id);
        this.setNombre(nombre);
        this.setMail(mail);
        this.setBecado(becado);
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public boolean esBecado() {
		return becado;
	}

	public void setBecado(boolean becado) {
		this.becado = becado;
	}
}