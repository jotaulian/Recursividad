package es.studium.Factorial;

import java.util.Scanner;

public class Factorial
{
	public static void main(String[] args)
	{
		int a, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el número n para calcular su factorial:");
		a = teclado.nextInt();
		resultado = fac(a);
		System.out.println("El factorial de " + a + " es:" + resultado);
		teclado.close();
	}

	public static int fac(int a)
	{
		int r;
		if (a == 0)
		{
			r = 1;
			System.out.println("Caso BASE");
		} else
		{
			System.out.println("Caso recursivo para a = " + a);
			r = a * fac(a - 1);
			System.out.println("Resultado para a = " + a + " con valor parcial " + r);
		}
		return r;
	}
}