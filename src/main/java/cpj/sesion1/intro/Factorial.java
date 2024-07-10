package cpj.sesion1.intro;

import java.util.Scanner;

public class Factorial {
	public static long factorial(int n) {
		if( n<0 || n>=21 ) {
			throw new RuntimeException("Se excede al limite maximo");
		}
		long result=1;
		for(int i=0; i<n; i++) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un valor: ");
		int num = scan.nextInt();
		long fact = factorial(num);
		System.out.printf("El factorial de %d es %d.", num, fact);
		scan.close();	
	}
}
