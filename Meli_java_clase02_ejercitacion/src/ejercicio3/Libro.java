package ejercicio3;

public class Libro {

    private String titulo;

    private String estado;
    private String isbn;
    private String autor;

    public Libro(){}

    public Libro(String titulo, String estado, String isbn, String autor){
        setTitulo(titulo);
        setEstado(estado);
        setIsbn(isbn);
        setAutor(autor);
    }

    public void prestamo(){
        setEstado("Prestado");
    }

    public void devolucion(){
        setEstado("Disponible");
    }

    @Override
    public String toString(){
        return getTitulo() + ", " + getIsbn() + ", " + getAutor();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
