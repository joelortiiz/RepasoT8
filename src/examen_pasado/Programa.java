package examen_pasado;

import java.util.ArrayList;

public class Programa {
	
	ArrayList<Alumno> dam;
	ArrayList<Alumno> daw;
	
	
	public Programa(ArrayList<Alumno> dam, ArrayList<Alumno> daw) {
		
		this.dam = dam;
		this.daw = daw;
	}


	public ArrayList<Alumno> getDam() {
		return dam;
	}


	public void setDam(ArrayList<Alumno> dam) {
		this.dam = dam;
	}


	public ArrayList<Alumno> getDaw() {
		return daw;
	}


	public void setDaw(ArrayList<Alumno> daw) {
		this.daw = daw;
	}


	@Override
	public String toString() {
		return "Programa [dam=" + dam + ", daw=" + daw + "]";
	}
	public void leerFicheroCSV(String alumnos) {
		 
	}
	
	
	
	
}
