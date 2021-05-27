package practica.tarde.ejercicio2;

public class FigurasUtil
{
	public static double areaPromedio(FiguraGeometrica[] arr)
	{
		double sum=0;
		for(FiguraGeometrica fg:arr)
		{
			sum = sum+fg.area();
		}
		
		return sum/arr.length;
	}
}
