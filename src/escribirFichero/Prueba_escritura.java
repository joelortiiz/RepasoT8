package escribirFichero;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Prueba_escritura {
	
	public static void main(String[] args) {
		
		File fichero=new File("numeros.txt");
		try {
			PrintWriter salida=new PrintWriter(fichero);
		
		int numero;
		Scanner sc=new Scanner(System.in);
		 
		do {
			System.out.println("Dame un numero");
			numero=sc.nextInt();
			salida.print(numero+" ");
		
		} while (numero!=0);
		
		salida.flush();
		salida.close();
		
		} catch (FileNotFoundException e) {

		}

	}
		

}
