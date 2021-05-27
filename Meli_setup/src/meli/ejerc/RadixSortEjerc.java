package meli.ejerc;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.HashMap;

public class RadixSortEjerc
{
	public static void radixSort(int []arr)
	{
		// Creo la HashMap donde se van a guardar las listas con los valores correspondientes a los digitos
		HashMap<Character, ArrayList<String>> hashMap = new HashMap<>(10);

		// Inincializo las listas vacías del HashMap
		for (int i = 0; i < 10; i++) {
			hashMap.put( Integer.toString(i).charAt(0), new ArrayList<String>());
		}

		// Pasamos a String[] el int[]
		String[] cadenasArray = StringUtil.toStringArray(arr);

		// Normalizamos los elementos del array, agregando 0 a la izquierda donde corresponda
		StringUtil.lNormalize(cadenasArray, '0');

		// Tomo la longitud del numero de mayor digitos
		int cantIteraciones = cadenasArray[1].length();


		// Pasos a realizar para completar el algoritmo
		for (int i = 0; i < cantIteraciones; i++) {

			// En cada paso del algoritmo itero sobre los elementos del array
			// para obtener el digito de la lista del hashMap al cual seran agregados
			for (String elem:cadenasArray) {

				// Recupero el digito del número que me permitira
				// meterlo en la lista correspondiente a ese digito
				char digitoAEnlistar = elem.charAt(cantIteraciones - i - 1);

				// Agrego el string al arrayList del HashMap
				hashMap.get(digitoAEnlistar).add(elem);
			}

			for (int j = 0; j < ; j++) {
				
			}
		}

	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
