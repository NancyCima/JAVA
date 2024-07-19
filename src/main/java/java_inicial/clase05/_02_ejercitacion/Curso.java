package java_inicial.clase05._02_ejercitacion;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private int id;
    private String titulo;
    private double precio;
    private int valoracion;
    private Usuario autor;
    private List<Usuario> suscriptos = new ArrayList<>();
    private List<Leccion> lecciones  = new ArrayList<>();

    public Curso(int id, String titulo, double precio, int valoracion, Usuario autor) {
        this.setId(id);
        this.setTitulo(titulo);
        this.setPrecio(precio);
        this.setValoracion(valoracion);
        this.setAutor(autor);
        this.setSuscriptos(new ArrayList<>());
        this.setLecciones(new ArrayList<>());
    }

    // Getters y Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getValoracion() {
		return valoracion;
	}

	public void setValoracion(int valoracion) {
		this.valoracion = valoracion;
	}

	public Usuario getAutor() {
		return autor;
	}

	public void setAutor(Usuario autor) {
		this.autor = autor;
	}

	public List<Usuario> getSuscriptos() {
		return suscriptos;
	}

	public void setSuscriptos(List<Usuario> suscriptos) {
		this.suscriptos = suscriptos;
	}

	public List<Leccion> getLecciones() {
		return lecciones;
	}

	public void setLecciones(List<Leccion> lecciones) {
		this.lecciones = lecciones;
	}
}