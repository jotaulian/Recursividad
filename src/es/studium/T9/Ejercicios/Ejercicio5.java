package es.studium.T9.Ejercicios;

import java.util.Scanner;

//Realizar un programa en Pseudoc�digo y en JAVA que lea un n�mero par, 
// compruebe que es par y calcule la suma de los pares desde dicho n�mero hasta el 2 de forma recursiva.

public class Ejercicio5
{

	public static void main(String[] args) {
		int n, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa un n�mero par:");
		n = teclado.nextInt();
		teclado.close();
		if(n%2==0) {
			resultado = sumaPares(n);
			System.out.println("La suma de los pares desde "+ n +" hasta el 2 es igual a: " + resultado);
		}else {
			System.out.println("El n�mero que has introducido no es par.");
		}
	}

	private static int sumaPares(int n)
	{
		int resultado;
		if(n==2) {
			resultado = 2;
		}else {
			resultado = n + sumaPares(n-2);
		}
		return resultado;
	}
}
