package practica.tarde.ejercicio2;

public class Circulo extends FiguraGeometrica
{
	private int radio;
	
	public Circulo(int r)
	{
		radio = r;
	}

	@Override
	public double area()
	{
		return Math.PI*Math.pow(radio,2);
	}
}
