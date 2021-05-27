package practica.tarde.ejercicio2;

public abstract class FiguraGeometrica
{
	public abstract double area();

	public void imprimirArea()
	{
		System.out.println("El area es: "+area());
	}
}
