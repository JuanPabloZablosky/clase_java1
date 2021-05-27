package ejercicio2;

public class Contador {

    private int contador;

    public Contador(){ }

    public Contador(int cuenta){
        setContador(cuenta);
    }

    public Contador(Contador cont){
        setContador(cont.contador);
    }

    public void incrementar(int valor){
        contador += valor;
    }

    public void decrementar(int valor){
        contador -= valor;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
