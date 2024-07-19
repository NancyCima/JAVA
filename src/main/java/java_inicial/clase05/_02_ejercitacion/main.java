package java_inicial.clase05._02_ejercitacion;

public static void main(String[] args) {
    ASAPDemy plataforma = new ASAPDemy();

    Usuario autor = new Usuario(1, "Autor", "autor@mail.com", false);
    Usuario usuario1 = new Usuario(2, "Usuario1", "usuario1@mail.com", true);
    Usuario usuario2 = new Usuario(3, "Usuario2", "usuario2@mail.com", false);

    plataforma.agregarUsuario(autor);
    plataforma.agregarUsuario(usuario1);
    plataforma.agregarUsuario(usuario2);

    Curso curso = new Curso(1, "Curso de Java", 100.0, 5, autor);
    plataforma.agregarCurso(curso);

    System.out.println(plataforma.suscribirseACurso(2, 1)); // SUSCRIPTO_OK
    System.out.println(plataforma.suscribirseACurso(2, 1)); // YA_SUSCRIPTO
    System.out.println(plataforma.suscribirseACurso(1, 1)); // ES_AUTOR
    System.out.println(plataforma.suscribirseACurso(3, 2)); // CURSO_INEX
}