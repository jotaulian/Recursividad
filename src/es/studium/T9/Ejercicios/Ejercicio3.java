package es.studium.T9.Ejercicios;

import java.util.Scanner;

// Realizar un programa en Pseudocódigo y en JAVA que calcule la potencia x de un número n dado por teclado de forma recursiva.

public class Ejercicio3
{
	public static void main(String[] args)
	{
		int n, x, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresa un número: ");
		n = teclado.nextInt();
		System.out.println("Ingresa la potencia: ");
		x = teclado.nextInt();
		resultado = potencia(n,x);
		System.out.println("El valor de " + n + " elevado a " + x + " es igual a: " + resultado );
		teclado.close();
	}

	private static int potencia(int a, int x)
	{
		int resultado;
		if(x==1) {
			resultado = a;
		}else {
			resultado = a * potencia(a,x-1);
		}
		return resultado;
	}

}
