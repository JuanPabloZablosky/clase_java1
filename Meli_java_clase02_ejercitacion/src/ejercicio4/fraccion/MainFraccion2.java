package ejercicio4.fraccion;

public class MainFraccion2
{
	public static void main(String[] args)
	{
		Fraccion f = new Fraccion(2,3);
		Fraccion g = new Fraccion(1,2);
		Fraccion h = new Fraccion(4,5);
		Fraccion i = new Fraccion(2,7);
		
		f.sumar(g).sumar(h).sumar(i);
		f.simplificar();
		f.imprimir();
		
	}
}
