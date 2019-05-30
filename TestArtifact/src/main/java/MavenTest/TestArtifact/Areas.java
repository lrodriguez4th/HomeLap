package MavenTest.TestArtifact;

import java.util.Scanner;

public class Areas {

	public static Scanner sc = new Scanner(System.in);
	static final double pi = 3.1416;

	public void Operacion() {
		int seleccion;
		System.out
				.println("Elige el numero de la figura de la cual deseas calcular el area: ");
		System.out.println("1. Cuadrado");
		System.out.println("2. Triangulo");
		System.out.println("3. Circulo");
		seleccion = sc.nextInt();
		CalculoAreas(seleccion);
	}

	public static void CalculoAreas(int seleccion) {

		if (seleccion == 1) {

			double b, h, arCuadrado;

			System.out.println("Ingresa el valor de la base: ");
			b = sc.nextFloat();
			System.out.println("Ingresa el valor de la altura: ");
			h = sc.nextFloat();

			arCuadrado = b * h;
			System.out.println("El area del cuadrado con base " + b
					+ " y altura " + h + " es igual a: " + arCuadrado);
		} else if (seleccion == 2) {

			double b, h, arTriangulo;

			System.out.println("Ingresa el valor de la base: ");
			b = sc.nextFloat();
			System.out.println("Ingresa el valor de la altura: ");
			h = sc.nextFloat();

			arTriangulo = (b * h) / 2;
			System.out.println("El area del triangulo con base " + b
					+ " y altura " + h + " es igual a: " + arTriangulo);
		} else if (seleccion == 3) {

			double r, arCirculo;

			System.out.println("Ingresa el valor del radio: ");
			r = sc.nextFloat();

			arCirculo = (pi * (r * r)) / 2;
			System.out.println("El area del circulo con radio " + r
					+ " es igual a: " + arCirculo);
		} else if (seleccion != 1 && seleccion != 2 && seleccion != 3) {
			System.out.println("Porfavor inserta un valor correcto ");
			seleccion = sc.nextInt();
			CalculoAreas(seleccion);
		}
	}
}
