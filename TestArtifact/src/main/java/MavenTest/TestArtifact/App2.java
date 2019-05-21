package MavenTest.TestArtifact;
import java.util.*;

public class App2 {
	
	/*crear un arreglo dinamico, inicializado con un tamaño de 4 espacios,
	insertando valores en tiempo de ejecucion y despues desplegarlos en pantalla*/
	public static Scanner input; 
	public static Scanner sc = new Scanner(System.in);
	
	public void arreglo1 (){
		int[] nums=new int[3]; //arreglo dinamico
		int[] nums2 = {1,3,5};
		int result = 0;
		input = new Scanner(System.in); 
		for(int i=0; i<=nums.length-1; i++){
			System.out.println("Ingresa el numero: "+i+" ");
			nums[i]= input.nextInt();
		}
		for(int i=0; i<=nums.length-1; i++){
			//System.out.println(nums[i]);
			//System.out.println(nums2[i]);
			for(int j=0; j<=nums2.length-1; j++){
				if(nums[i]>nums2[j]){
					result = nums[i];
				}
				else{result = nums2[j];
				}
			}
		}
	System.out.println(result);
	}
	
public String[] ArrayFlor(int size){
	String[] ArregloFinal = new String[size];
	
	for(int i=0; i<=size-1; i++){
		System.out.println("Ingresa el numero "+(i+1)+": ");
		ArregloFinal[i] = sc.nextLine();
	}
	
	return ArregloFinal;
}

public void ShowMeArrayFlor(String[] ArrayReturned){
	for(int i=0; i<=ArrayReturned.length-1; i++){
		System.out.println("Posicion: "+(i+1)+" "+ArrayReturned[i]);
	}
}

//CREA 
	
}
