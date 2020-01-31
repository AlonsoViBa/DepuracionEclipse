package estructurasdecontrol;

//Importamos la clase Scanner
import java.util.Scanner;

class SumaNumero
{
	/*este programa introduce por teclado dos numeros y visualiza en pantalla la suma*/

	public static void main(String args[])
	{
		//Creamos un objeto de tipo escaner
		Scanner entrada = new Scanner(System.in);

		//Introducimos por teclado los numeros
		System.out.println("Introduce num 1");
		int num1 = entrada.nextInt();
		System.out.println("Introduce num 2");
		int num2 = entrada.nextInt();

		//Calculamos la suma
		int suma = num1 + num2;

		//enviamos a pantalla el resultado
		System.out.println("La suma es " + suma);

	}

}
