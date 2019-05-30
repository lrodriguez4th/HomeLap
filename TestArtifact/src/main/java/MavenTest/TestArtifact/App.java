package MavenTest.TestArtifact;

import java.util.Scanner;

public class App {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//int size;
		//System.out.println("Ingresa el tamaño de tu arreglo: ");
		//size=sc.nextInt();

		// Instancias
		Ejercicios Ejer = new Ejercicios();
		Areas CalculoAreas = new Areas();

		// Llamadas
		//Ejer.suma(5, 5);
		//Ejer.multiplicacion(6, 3);
		//Ejer.tabla(10, 4);
		//Ejer.NumPares(10);
		//Ejer.Mediana(size);
		//Ejer.ComparaArreglos(size);
		//Ejer.Fibonacci(size);
		//CalculoAreas.Operacion();
		Ejer.IncrementoWhile();
	}
}
