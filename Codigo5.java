/*Este programa analiza un número ingresado por el usuario para determinar si es "afortunado". 
 * Se considera afortunado si contiene más dígitos 3, 7, 8 o 9 que cualquier otro dígito. 
 * El proceso implica contar la ocurrencia de dígitos afortunados y no afortunados, 
 * comparar los contadores y finalmente imprimir un mensaje que indica si el número es afortunado o no.
*/

package revisonDeOtros; // falta el paquete

import java.util.Scanner;//se importa scaner 

public class Codigo5 {
	public static void main(String[] args) { // se agrega public static void
//se cambia los nombres de las variables para que sean más descriptivos
		Scanner scanner = new Scanner(System.in);// se agrega system.in para la entrada del teclado
		System.out.print("Introduzca un número: "); // se cambia la comilla simple por cmilla doble
		String numEnt = scanner.nextLine();// se cambia ni por num para legibilidad
		int num = Integer.parseInt(numEnt);// se agrega Integer.parseInt combierte la cadena a un entero

		int afortunado = 0;// se cambia nombre variablo afo por afortunado
		int noAfortunado = 0;// se cambia nombre variable noAfo por no Afortunado

		while (num > 0) { // se cambia ni por c
			int digito = num % 10;// se cambia ni por c y se quita (int)
			if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
				afortunado++;
			} else {
				noAfortunado++;
			}
			num /= 10; //saque el num del if else
		}

		if (afortunado > noAfortunado) {
			System.out.println("El " + numEnt + " es un número afortunado.");// falta una t en println se cambia c por numEnt
		} else {
			System.out.println("El " + numEnt + " no es un número afortunado.");
		}
		scanner.close();
	}

}
