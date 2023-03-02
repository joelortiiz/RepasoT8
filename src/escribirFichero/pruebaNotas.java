package escribirFichero;

import java.io.File;
import java.util.Scanner;

public class pruebaNotas{

		public static void main(String[] args) {
			//Leemos archivo
			
			
			try {
				File fichero=new File("notas.txt");
				Scanner entrada=new Scanner(fichero);
				String cadena="";
				double suma=0;
				String linea[];
				while(entrada.hasNext()) {
				cadena=entrada.nextLine();
			
				linea=cadena.split(";");
				suma=0;
				for(int i=1; i<linea.length; i++) {
					
					suma+=Double.parseDouble(linea[i]);
					
				 
				}
				System.out.println("El alumno "+linea[0]+" Tiene una nota media de "+suma/4);
				}
		
				entrada.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
}
