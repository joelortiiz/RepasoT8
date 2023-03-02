package archivosBinarios;
import java.io.*;
public class prueba {

	
	private void escribirBinario() {
		
		try {
			FileOutputStream archivo=new FileOutputStream("personas.bin");
			ObjectOutputStream escritura=new ObjectOutputStream(archivo);
			
			escritura.writeObject(new Persona(15, "Christian Ramirez"));
			System.out.println("Objeto añadido con exito");
			escritura.close();
		} catch (IOException e) {
			e.printStackTrace(System.out);
		}
	
	}
	
	//Escribir en un archivo binario
	private void leerBinario() throws ClassNotFoundException  {
		
		Persona persona;
		try {
			
			FileInputStream archivo =new FileInputStream("peronas.bin");
			ObjectInputStream lectura=new ObjectInputStream(archivo);
			while(true) {
				persona = (Persona) lectura.readObject();
				persona.mostrarDatos();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		public static void main(String[] args) {
			prueba test =new prueba();
			test.escribirBinario();
		}
}
