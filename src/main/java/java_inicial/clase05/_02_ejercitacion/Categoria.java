package java_inicial.clase05._02_ejercitacion;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	private int id;
	private String nombre;
	private List<Curso> cursos;

	public Categoria(int id, String nombre) {
	        this.setId(id);
	        this.setNombre(nombre);
	        this.setCursos(new ArrayList<>());
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

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public Curso buscarCurso(int id) {
		int i = 0;
		Curso cursoEncontrado = null;

		while (i < this.cursos.size() && cursoEncontrado == null) {
			if (this.cursos.get(i).getId() == id) {
				cursoEncontrado = this.cursos.get(i);
			} else {
				i++;
			}
		}
		return cursoEncontrado;
	}
	
	public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
	}
    
}