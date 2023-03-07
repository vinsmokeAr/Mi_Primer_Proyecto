package dev;

import java.util.Scanner;

public class Media_A {
	static double numero;
	static double media;
	static int n; //cantidad de números
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de numeros a calcular");
		n = sc.nextInt();
		//crear un arreglo para almacenar los valores
		
		double numeros [] = new double [n]; //guardar datos en el arreglo
			for (int i=0; i<n; i++)
					{
				System.out.println("Ingrese el número:");
				numeros[i]=sc.nextDouble();
					}
					
		//calcular la media aritmética
		double suma = 0;
			for (double i: numeros)
			{
				suma = suma+i; //suma más el siguiente elemento
				
			}
			media = suma / n;
			System.out.println("La media es. "+ media);

	}
	
	
	
	
	
	
}
