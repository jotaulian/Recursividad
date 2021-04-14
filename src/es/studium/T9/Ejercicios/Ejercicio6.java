package es.studium.T9.Ejercicios;

import java.util.Scanner;

public class Ejercicio6
{
	
	public static void main(String[] args)
	{
		int n;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el valor de n: ");
		n = teclado.nextInt();
		mostrarSuc(n);
		teclado.close();
	}

	private static void mostrarSuc(int n)
	{
		if(n==0) {
			System.out.println(0);
		}else {
			mostrarSuc(n-1);
			System.out.println(n*(n-1));
		}
	}

}
