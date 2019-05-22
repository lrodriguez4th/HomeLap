package MavenTest.TestArtifact;

import java.util.Arrays;
import java.util.Scanner;

public class App3 {

	public static Scanner sc = new Scanner(System.in);
	
	public String[] Mediana(int size){
		String[] ArregloFinal = new String[size];
		Integer[] ArregloFinal2 = new Integer[size];
		for(int i=0; i<=size-1; i++){
			System.out.println("Ingresa el numero "+(i+1)+": ");
			//ArregloFinal[i] = sc.nextLine();
			ArregloFinal2[i] = Integer.valueOf(sc.nextLine());
		}
	/*	for(int i=0; i<=ArregloFinal.length-1; i++){
			System.out.println("Posicion: "+(i+1)+" "+ArregloFinal[i]);
		}*/
	
		Arrays.sort(ArregloFinal2);
		System.out.println(Arrays.toString(ArregloFinal2));
		
		if(ArregloFinal2.length % 2 == 0){
			System.out.println("La cantidad de numeros del arreglo es PAR");	
			int Pos1 = (ArregloFinal2.length/2)-1;
			int Pos2 = ArregloFinal2.length/2;
			//System.out.println(ArregloFinal2[Pos1]);
			//System.out.println(ArregloFinal2[Pos2]);
			int suma = ArregloFinal2[Pos1] + ArregloFinal2[Pos2];
			float Mediana = suma/2;
			System.out.println("La mediana es: "+Mediana);
		}else {
		 System.out.println("La cantidad de numeros del arreglo es IMPAR");
		 	int Pos1 = ArregloFinal2.length/2;
		 	System.out.println("La Mediana es: "+ArregloFinal2[Pos1]);
		}
		
		return ArregloFinal;
	}
}
