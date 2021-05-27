package ejercicio4.fraccion;

public class Fraccion
{	
	private int numerador;
	private int denominador;
	
	public Fraccion(int n,int d)
	{
		setDenominador(n);
		setDenominador(d);
	}
	
	public Fraccion multiplicar(Fraccion f)
	{
		setNumerador(numerador * f.getNumerador());
		setDenominador(denominador * f.getDenominador());
		return this;
	}
	
	public Fraccion multiplicar(int x)
	{
		setNumerador(numerador * x);
		return this;
	}

	public Fraccion dividir(Fraccion f)
	{
		setNumerador(numerador * f.getDenominador());
		setDenominador(denominador * f.getNumerador());
		return this;
	}

	public Fraccion dividir(int x)
	{
		setNumerador(getDenominador() * x);
		return this;
	}

	public void simplificar()
	{
		int i=2;
		while( i<=numerador && i<=denominador )
		{
			if( numerador%i==0 && denominador%i==0 )
			{
				numerador = numerador/i;
				denominador = denominador/i;
			}
			else
			{
				i++;
			}
		}		
	}
	
	public static Fraccion sumar(Fraccion a,Fraccion b)
	{
		return a.sumar(b);
	}

	public static Fraccion restar(Fraccion a,Fraccion b)
	{
		return a.restar(b);
	}
	
	public Fraccion sumar(Fraccion x)
	{
		int nd = getDenominador()*x.getDenominador();
		int nn = getNumerador()*x.getDenominador()+x.getNumerador()*getDenominador();
		
		setNumerador(nn);
		setDenominador(nd);
		return this;
	}

	public Fraccion restar(Fraccion x)
	{
		int nd = getDenominador()*x.getDenominador();
		int nn = getNumerador()*x.getDenominador()-x.getNumerador()*getDenominador();

		setNumerador(nn);
		setDenominador(nd);
		return this;
	}

	public Fraccion sumar(int a){
		setNumerador(getDenominador() * a + getNumerador());
		return this;
	}

	public Fraccion restar(int a){
		setNumerador(getDenominador() * a - getNumerador());
		return this;
	}
	
	public void imprimir()
	{
		System.out.println(getNumerador()+"/"+getDenominador());
	}

	public int getNumerador()
	{
		return numerador;
	}

	public void setNumerador(int x)
	{
		numerador=x;
	}

	public int getDenominador()
	{
		return denominador;
	}

	public void setDenominador(int d)
	{
		if(d==0)
		{
			throw new RuntimeException("El denominador no puede ser cero");
		}
		
		this.denominador=d;
	}
	
	
	
}
