package es.studium.T9.Ejercicios;

import java.util.Scanner;

// Realizar un programa en Pseudocódigo y en JAVA que  calcule  la suma
// de  los  n  primeros  cuadrados de  forma recursiva.
 
public class Ejercicio2
{
	
	
	public static void main(String[] args)
	{
		int n, resultado;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Indica la cantidad de cuadrados que quieras sumar: ");
		n = teclado.nextInt();
		resultado = sumaCuadradosRec(n);
		System.out.println("La suma de los "+ n +" primeros cuadrados equivale a " + resultado);
		teclado.close();
	}

	private static int sumaCuadradosRec(int a)
	{
		int resultado;
		if(a==1) {
			resultado = 1;
		}else {
			resultado = a*a + sumaCuadradosRec(a-1);
			System.out.println(resultado);
		}
		return resultado;
	}

}
