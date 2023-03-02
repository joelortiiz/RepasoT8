package escribirFichero;

import java.io.File;
import java.util.Scanner;

public class pruebaLectura {

		public static void main(String[] args) {
			File fichero=new File("numerosLinea.txt");
			
			try {
				Scanner entrada=new Scanner(fichero);
				String cadena="";
				
				
				while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				System.out.println(cadena);
				}
				
				entrada.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
}
