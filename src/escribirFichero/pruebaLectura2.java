package escribirFichero;

import java.io.File;
import java.util.Scanner;

public class pruebaLectura2 {

		public static void main(String[] args) {
			File fichero=new File("numeros.txt");
			
			try {
				Scanner entrada=new Scanner(fichero);
				String cadena="";
				int suma=0;
				
				while(entrada.hasNext()) {
				cadena=entrada.next();
				System.out.print(cadena);
				suma+=Integer.parseInt(cadena);
				
				}
				System.out.println("\nLa suma total es: "+suma);
				entrada.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
}
