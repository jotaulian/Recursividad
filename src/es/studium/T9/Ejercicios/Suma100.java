package es.studium.T9.Ejercicios;

// Realizar  un  programa  en  Pseudoc�digo  y  en JAVA  que  calcule  de  forma  recursiva  la suma 
// de  los  100 primeros   n�meros   enteros.   Calcular   tambi�n   en   forma iterativa y comparar resultados.

public class Suma100
{

	public static void main(String[] args)
	{
		int n;
		n = sumaRec(100);
		System.out.println("La suma de los 100 primeros n�meros vale " + n);
		
	}
	
	public static int sumaRec(int a) {
		int resultado;
		if(a==1) {
			resultado = 1;
		}else {
			resultado = a + sumaRec(a-1);
		}
		return resultado;
	}

}
