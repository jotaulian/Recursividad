package es.studium.Factorial;

import java.util.Scanner;

public class Sucesion
{
	public static void main(String[] args)
	{
		int a;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el número n para calcular su factorial:");
		a = teclado.nextInt();
		suc(a);
		teclado.close();
	}

	public static void suc(int a)
	{
		if (a == 0)
		{
			System.out.println((float)((float)3/(float)2));
			System.out.println("Caso BASE");
		} else
		{
			System.out.println((float)(a+3)/(float)2);
			suc(a - 1);
		}
	}
}