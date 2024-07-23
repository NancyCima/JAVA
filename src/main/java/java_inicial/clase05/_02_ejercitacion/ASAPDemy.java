package java_inicial.clase05._02_ejercitacion;

import java.util.ArrayList;
import java.util.List;

public class ASAPDemy {

	private List<Categoria> categorias;
	private List<Usuario> usuarios;

	public ASAPDemy() {
		this.setCategorias(new ArrayList<>());
		this.setUsuarios(new ArrayList<>());
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	private void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public void agregarUsuario(Usuario usuario) {
		this.usuarios.add(usuario);
	}

	public void agregarCategoria(Categoria categoria) {
		this.categorias.add(categoria);
	}

	private Curso buscarCurso(int idCurso) {
		int i = 0;
		Curso cursoEncontrado = null;

		while (i < this.categorias.size() && cursoEncontrado == null) {
			cursoEncontrado = this.categorias.get(i).buscarCurso(idCurso);
			i++;
		}
		return cursoEncontrado;
	}

	private Usuario buscarUsuario(int id) {
		int i = 0;
		Usuario usuarioEncontrado = null;

		while (i < this.usuarios.size() && usuarioEncontrado == null) {
			if (this.usuarios.get(i).getId() == id) {
				usuarioEncontrado = this.usuarios.get(i);
			} else {
				i++;
			}
		}
		return usuarioEncontrado;
	}

	/*
	 * El método suscribirseACurso el cual recibe un ID de usuario y un ID de curso
	 * y debe retornar alguno de los siguientes resultados: CURSO_INEX: El curso no
	 * existe. USUARIO_INEX: El usuario no existe. YA_SUSCRIPTO: El usuario ya
	 * estaba suscripto en el curso. ES_AUTOR: El usuario que intenta suscribirse es
	 * el autor del curso. MAX_BECADOS: El usuario es becado y el curso ya cuenta
	 * con el máximo de becados posible. SUSCRIPTO_OK: El usuario se suscribió
	 * exitosamente al curso. Debe guardarse en la lista de suscriptos.
	 */

	public Resultado suscribirseACurso(int usuarioId, int cursoId) {
		Curso curso = this.buscarCurso(cursoId);
		Usuario usuario = this.buscarUsuario(usuarioId);

		if (curso == null) {
			return Resultado.CURSO_INEX;
		} else if (usuario == null) {
			return Resultado.USUARIO_INEX;
		} else if (curso.estaSuscripto(usuario)) {
			return Resultado.YA_SUSCRIPTO;
		} else if (curso.getAutor() == usuario) {
			return Resultado.ES_AUTOR;
		} else if (usuario.esBecado() && curso.cupoBecadosLleno()) {
			return Resultado.MAX_BECADOS;
		} else {
			curso.suscribir(usuario);
			return Resultado.SUSCRIPTO_OK;
		}
	}
}