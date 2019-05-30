package MavenTest.TestArtifact;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {

	public static Scanner sc = new Scanner(System.in);

	public String[] Mediana(int size) {
		String[] ArregloFinal = new String[size];
		Integer[] ArregloFinal2 = new Integer[size];
		for (int i = 0; i <= size - 1; i++) {
			System.out.println("Ingresa el numero " + (i + 1) + ": ");
			// ArregloFinal[i] = sc.nextLine();
			ArregloFinal2[i] = Integer.valueOf(sc.nextLine());
		}
		/*
		 * for(int i=0; i<=ArregloFinal.length-1; i++){
		 * System.out.println("Posicion: "+(i+1)+" "+ArregloFinal[i]); }
		 */

		Arrays.sort(ArregloFinal2);
		System.out.println(Arrays.toString(ArregloFinal2));

		if (ArregloFinal2.length % 2 == 0) {
			System.out.println("La cantidad de numeros del arreglo es PAR");
			int Pos1 = (ArregloFinal2.length / 2) - 1;
			int Pos2 = ArregloFinal2.length / 2;
			// System.out.println(ArregloFinal2[Pos1]);
			// System.out.println(ArregloFinal2[Pos2]);
			float suma = ArregloFinal2[Pos1] + ArregloFinal2[Pos2];
			float Mediana = suma / 2;
			System.out.println("La mediana es: " + Mediana);
		} else {
			System.out.println("La cantidad de numeros del arreglo es IMPAR");
			int Pos1 = ArregloFinal2.length / 2;
			System.out.println("La Mediana es: " + ArregloFinal2[Pos1]);
		}

		return ArregloFinal;
	}

	public Integer[] ComparaArreglos(int size) {
		Integer[] Arreglo1 = new Integer[size];
		Integer[] Arreglo2 = new Integer[size];

		System.out.println("Ingresa los valores del ARREGLO1");
		// Guarda los valores del ARREGLO1
		for (int i = 0; i <= size - 1; i++) {
			System.out.println("Ingresa el numero " + (i + 1));
			Arreglo1[i] = Integer.valueOf(sc.nextLine());
		}
		System.out.println("Ingresa los valores del ARREGLO2");
		// Guarda los valores del ARREGLO2
		for (int i = 0; i <= size - 1; i++) {
			System.out.println("Ingresa el numero " + (i + 1));
			Arreglo2[i] = Integer.valueOf(sc.nextLine());
		}

		System.out.println(Arrays.toString(Arreglo1));
		System.out.println(Arrays.toString(Arreglo2));

		for (int i = 0; i <= Arreglo1.length - 1; i++) {
			for (int j = 0; j <= Arreglo2.length - 1; j++) {
				if (Arreglo1[i] == Arreglo2[j]) {
					System.out.println("El numero " + Arreglo1[i]
							+ " existe en ambos arreglos");
				}
			}
		}

		return Arreglo1;
	}

	public Integer[] Fibonacci(int size) {

		Integer[] ArrFib = new Integer[size];

		for (int i = 0; i <= size - 1; i++) {

			if (i == 0) {
				System.out.println(i);
				ArrFib[i] = i;
			} else if (i == 1) {
				ArrFib[i] = i;
			} else if (i > 1) {
				ArrFib[i] = ArrFib[i - 2] + ArrFib[i - 1];
			}
		}

		System.out.println(Arrays.toString(ArrFib));

		return ArrFib;
	}

	public void suma(int a, int b) {
		int c = a + b;
		System.out.println("La suma de " + a + " + " + b + " es igual a: " + c);
	}

	public int multiplicacion(int a, int b) {
		int c = a * b;
		System.out.println("La multiplicacion de " + a + " + " + b
				+ " es igual a: " + c);
		return c;
	}

	public int tabla(int limit, int num) {
		int suma = 0, prom, d;
		for (int i = 0; i <= limit; i++) {
			d = num * i;
			suma = suma + d; // (es lo mismo que lo de la izq) suma +=d;
		}
		System.out.println("La suma de los primeros " + limit
				+ " multiplos de " + num + " es igual a: " + suma);
		prom = suma / limit;
		System.out.println("Promedio es igual: " + suma + " / " + limit + " = "
				+ prom);
		return suma;
	}

	public int NumPares(int limit) {
		System.out.println("Los numeros pares entre el 0 y el " + limit
				+ " son: ");
		for (int i = 0; i <= limit; i++) {
			if (i == 0) {
			} else if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		return limit; // PREGUNTAR CUAL DEBERIA SER UN RETURN CORRECTO
	}

	public void IncrementoWhile() {
		int v1, v2;

		System.out.println("Ingresa un valor inicial que sea entero ");
		v1 = sc.nextInt();
		System.out.println("Ingresa un valor final que sea entero ");
		v2 = sc.nextInt();

		if (v2 < v1) {
			System.out
					.println("El valor final es menor que el inicial, ingresa los valores de nuevo ");
			IncrementoWhile();
		}
		while (v1 <= v2) {
			System.out.println(v1);
			v1++;
		}
	}

}
