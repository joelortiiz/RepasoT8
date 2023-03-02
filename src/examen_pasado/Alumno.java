 package examen_pasado;

public class Alumno {
	
	private int codigo;
	private String nombre;
	private String apellido;
	private double notaMedia;
	private String curso;
	
	public Alumno(int codigo, String nombre, String apellido, double notaMedia, String curso) {

		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.notaMedia = notaMedia;
		this.curso = curso;
	}
	
	public Alumno() {

		this.codigo = 0;
		this.nombre = "";
		this.apellido = "";
		this.notaMedia = 0;
		this.curso = "";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

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

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Alumno [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", notaMedia=" + notaMedia
				+ ", curso=" + curso + "]";
	}
	
	
	
}
