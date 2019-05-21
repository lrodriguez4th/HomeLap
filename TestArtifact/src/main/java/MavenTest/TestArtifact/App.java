package MavenTest.TestArtifact;

import java.util.Scanner;

public class App 
{
	public static Scanner sc = new Scanner(System.in);
	
	public void suma (int a, int b){
		int c = a + b;
		//System.out.println("La suma de "+a+" + "+b+" es igual a: " + c);
	}
	public int multiplicacion (int a, int b){
		int c = a * b;
		//System.out.println("La multiplicacion de "+a+" + "+b+" es igual a: " + c);
		return c;
	}
	public int tabla (int limit, int num){
		int suma = 0, prom, d;
    	for(int i=0; i<=limit; i++){
    		d = num*i;
    		suma = suma+d; //(es lo mismo que lo de la izq) suma +=d;
    	}
    	System.out.println("La suma de los primeros "+limit+" multiplos de "+num+" es igual a: "+suma);
    	prom = suma/limit;
    	System.out.println("Promedio es igual: "+suma+" / "+limit+" = "+prom);
		return suma;
	}
	public int NumPares (int limit){
		System.out.println("Los numeros pares entre el 0 y el "+limit+" son: ");
		for(int i=0; i<=limit; i++){
			if(i==0){
			}
			else if(i%2 == 0){
    			System.out.println(i);
    		}
      }
		return limit; //PREGUNTAR CUAL DEBERIA SER UN RETURN CORRECTO
	}
    public static void main( String[] args )
    {
    	int size;
    	//String[] ArrayReturned;
    	//App Operaciones = new App();
    	//App2 Arreglos = new App2();
    	App3 Ejercicio1 = new App3();
    	//Operaciones.suma(5, 30);
    	//Operaciones.multiplicacion(4, 5);
    	//Operaciones.tabla(20, 4);
    	//Operaciones.NumPares(50);
    	
    	//Arreglos.arreglo1();
    	System.out.println("Ingresa el tamaño de tu arreglo: ");
    	size=sc.nextInt();
    	//ArrayReturned = Arreglos.ArrayFlor(size);
    	//Arreglos.ShowMeArrayFlor(ArrayReturned);
    	Ejercicio1.Mediana(size);
    	
    	/*ESTRUCTURA DE UN CICLO FOR
    	 * for(int i=0; i<=k; i++){ 
    	 *     	System.out.println(i);}
    	Hacer tres funciones
    	- Imprimir numeros pares del 0 al 50.
    	- Imprimir 20 primeros multiplos del numero que mandemos como parametro.
    	- Imprimir 20 primeros multiplis del numero que mandemos como parametro y sacarle el promedio.
    	*/
    }
}
