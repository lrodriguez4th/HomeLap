package MavenTest.TestArtifact;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {

	public static Scanner sc = new Scanner(System.in);
	
	public Integer[] Nums(int size){
	
		Integer[] ArrFib = new Integer[size];
		
		for(int i=0; i<=size-1; i++){
			
			if(i==0){
				System.out.println(i);
				ArrFib[i] = i;
			}else if(i == 1){
				ArrFib[i] = i;
			}else if(i > 1){
				ArrFib[i] = ArrFib[i-2] + ArrFib[i-1];
			}
		}
		
		System.out.println(Arrays.toString(ArrFib));
		
		return ArrFib;
	}
	
	
}
