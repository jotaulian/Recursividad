package es.studium.T9.Ejercicios;

import java.util.Scanner;

// Secuencia de Fibonacci

public class Ejercicio4
{

	public static void main(String[] args)
	{
		int n, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa el valor de n: ");
		n = teclado.nextInt();
		resultado = fibonacci(n);
		System.out.println("El valor de la secuencia de Fibonacci para "+ n +" equivale a " + resultado);
		teclado.close();
	}

	private static int fibonacci(int x)
	{
		int resultado;
		if(x==0) {
			resultado = 0;
		}else if(x==1) {
			resultado = 1;
		}else {
			resultado = fibonacci(x-1) + fibonacci(x-2);
		}
		return resultado;
	}

}
