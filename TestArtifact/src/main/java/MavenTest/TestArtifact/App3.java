package MavenTest.TestArtifact;

import java.util.Arrays;
import java.util.Scanner;

public class App3 {

	public static Scanner sc = new Scanner(System.in);
	
	public String[] Mediana(int size){
		String[] ArregloFinal = new String[size];
		
		for(int i=0; i<=size-1; i++){
			System.out.println("Ingresa el numero "+(i+1)+": ");
			ArregloFinal[i] = sc.nextLine();
		}
	/*	for(int i=0; i<=ArregloFinal.length-1; i++){
			System.out.println("Posicion: "+(i+1)+" "+ArregloFinal[i]);
		}*/
		
		/*for(int i=0; i<=ArregloFinal.length-1; i++){
			if (ArregloFinal[0] <){
				
			}
		}*/
		Arrays.sort(ArregloFinal);
		System.out.println(Arrays.toString(ArregloFinal));
		
		return ArregloFinal;
	}
}
