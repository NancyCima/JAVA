package java_inicial.clase05._02_ejercitacion;

import java.util.ArrayList;
import java.util.List;

public class ASAPDemy {
	
	private List<Curso> cursos;
	private List<Usuario> usuarios;
	
	public ASAPDemy() {
		this.setCursos(new ArrayList<>());
	}

	public List<Curso> getCursos() {
		return cursos;
	}
	
	public Curso getCursoByID(List <Curso> curso, int cursoID){
		for (int i = 0; i < curso.length; i++ ) {
			if (curso[i].ID == cursoID) {
				return curso[i];
			}else {
				return null;
			}
		}
	}


	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	/*
	 * El método suscribirseACurso el cual recibe un ID de usuario y un ID de curso
	 * y debe retornar alguno de los siguientes resultados: 
	 * CURSO_INEX: El curso no
	 * existe. 
	 * USUARIO_INEX: El usuario no existe. 
	 * YA_SUSCRIPTO: El usuario ya
	 * estaba suscripto en el curso. 
	 * ES_AUTOR: El usuario que intenta suscribirse es
	 * el autor del curso. 
	 * MAX_BECADOS: El usuario es becado y el curso ya cuenta
	 * con el máximo de becados posible. 
	 * SUSCRIPTO_OK: El usuario se suscribió
	 * exitosamente al curso. Debe guardarse en la lista de suscriptos.
	 */

	public String suscribirseACurso(int usuarioId, int cursoId) {
        Curso curso = cursos.get(cursoId);
        if (curso == null) {
            return CURSO_INEX;
        }

        Usuario usuario = usuarios.get(usuarioId);
        if (usuario == null) {
            return USUARIO_INEX;
        }


	}

}