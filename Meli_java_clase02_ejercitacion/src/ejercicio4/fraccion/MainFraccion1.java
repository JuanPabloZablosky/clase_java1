package ejercicio4.fraccion;

public class MainFraccion1
{
	public static void main(String[] args)
	{
		Fraccion f = new Fraccion(2,3);
		Fraccion g = new Fraccion(5,0);
				
		
		f.sumar(g);
		f.simplificar();
				
		f.imprimir();
		
		Fraccion x = Fraccion.sumar(f,g);
		x.simplificar();
		x.imprimir();
		
		
	}
}
