package MavenTest.TestArtifact;

import java.util.Arrays;
import java.util.Scanner;

public class App4 {

	public static Scanner sc = new Scanner(System.in);
	
	public Integer[] ComparaArreglos(int size){
		Integer[] Arreglo1 = new Integer[size];
		Integer[] Arreglo2 = new Integer[size];
		
		System.out.println("Ingresa los valores del ARREGLO1");
		//Guarda los valores del ARREGLO1
		for(int i=0; i<= size-1; i++){
			System.out.println("Ingresa el numero "+(i+1));
			Arreglo1[i] = Integer.valueOf(sc.nextLine());
		}
		System.out.println("Ingresa los valores del ARREGLO2");
		//Guarda los valores del ARREGLO2
				for(int i=0; i<= size-1; i++){
					System.out.println("Ingresa el numero "+(i+1));
					Arreglo2[i] = Integer.valueOf(sc.nextLine());
				}
				
		System.out.println(Arrays.toString(Arreglo1));
		System.out.println(Arrays.toString(Arreglo2));
		
		for(int i=0; i<=Arreglo1.length-1; i++){
			for(int j=0; j<=Arreglo2.length-1; j++){
				if(Arreglo1[i] == Arreglo2[j]){
					System.out.println("El numero "+Arreglo1[i]+" existe en ambos arreglos");
				}
			}
		}
		
		return Arreglo1;
	}
	
}
