package meli.ejerc;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RadixSortEjerc
{
	public static int[] radixSort(int[] arr)
	{
		// Creo el HashMap donde se van a guardar los ArrayList con los valores correspondientes a los digitos
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

			// Creo un arraylist auxiliar
			ArrayList<String> arrStrAux = new ArrayList<>();

			// Recorro las listas del HashMap para extraer los string
			// y formar el nuevo array que se utilizará en la próxima iteración
			for (Map.Entry<Character, ArrayList<String>> entry: hashMap.entrySet()) {
				for(String n:entry.getValue()){
					arrStrAux.add(n);
				}
				entry.getValue().clear();
			}

			cadenasArray = arrStrAux.toArray(new String[cadenasArray.length]);
		}

		arr = StringUtil.toIntArray(cadenasArray);
		return arr;
	}

	public static void main(String[] args)
	{
		int arr[]={16223,898,13,906,235,23,9,1532,6388,2511,8};
		arr = radixSort(arr);
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.print(arr[i]+(i<arr.length-1?",":""));
		}
	}
}
