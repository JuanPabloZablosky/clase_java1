package meli.ejerc;

import java.sql.SQLIntegrityConstraintViolationException;

public class StringUtil
{
	// Retorna una cadena compuesta por n caracteres c
	// Ejemplo: replicate('x',5) ==> 'xxxxx'
	public static String replicate(char c,int n)
	{
		String cadena = "";

		for (int i = 0; i < n; i++) {
			cadena += c;
		}

		return cadena;
	}

	// Retorna una cadena de longitud n, compuesta por s
	// y precedida de tantos caracteres c como sea necesario
	// para completar la longitud mencionada
	// Ejemplo lpad("5",3,'0') ==> "005"
	public static String lpad(String s, int n, char c)
	{
		String cadena = "";
		int cerosFaltantes = n - s.length();

		cadena = replicate(c, cerosFaltantes);

		return cadena + s;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static String[] toStringArray(int arr[])
	{
		String[] stringArr = new String[arr.length];

		for (int i = 0; i < arr.length; i++) {
			stringArr[i] = Integer.toString(arr[i]);
		}
		
		return stringArr;
	}

	// Retorna un String[] conteniendo los elementos de arr
	// representados como cadenas de caracteres
	public static int[] toIntArray(String arr[])
	{
		int[] intArr = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}

		return intArr;
	}

	// Retorna la longitud del elemento con mayor cantidad
	// de caracteres del array arr
	public static int maxLength(String arr[])
	{
		int mayorCantChars = 0;

		for (int i = 0; i < arr.length; i++) {
			if(arr[i].length() > mayorCantChars){
				mayorCantChars = arr[i].length();
			}
		}

		return mayorCantChars;
	}

	// Completa los elemento del arr agregando caracteres c
	// a la izquierda, dejando a todos con la longitud del mayor
	public static void lNormalize(String arr[], char c)
	{
		int maxCantChars = maxLength(arr);

		for (int i = 0; i < arr.length; i++) {
			String elem = arr[i];
			arr[i] = lpad(elem, maxCantChars, c);
		}

	}
}
