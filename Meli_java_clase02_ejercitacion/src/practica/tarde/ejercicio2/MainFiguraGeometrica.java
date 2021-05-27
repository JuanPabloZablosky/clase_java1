
package practica.tarde.ejercicio2;

public class MainFiguraGeometrica
{
	public static void main(String[] args)
	{
		Circulo c = new Circulo(100);
		Rectangulo r = new Rectangulo(7,4);
		Triangulo t = new Triangulo(4,3);

		FiguraGeometrica[] arr={c,r,t};
		
		double x = FigurasUtil.areaPromedio(arr);
		System.out.println(x);
	}
}
