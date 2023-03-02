package escribirFichero;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList <Coche> coches=new ArrayList<>();
		File fichero=new File("BDCoches.csv");
		
		try {
			String cadena=""; //Toda la linea del fichero
			String linea[];
			Scanner entrada=new Scanner(fichero);
			//Saltamos la linea de la cabecera
			cadena=entrada.nextLine();
			while(entrada.hasNext()) {
				cadena=entrada.nextLine();
				System.out.println(cadena);
				linea=cadena.split(";");
				coches.add(new Coche(linea[0], linea[1], linea[2], Double.parseDouble(linea[3])));
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
