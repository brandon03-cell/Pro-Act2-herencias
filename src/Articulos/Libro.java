package Articulos;

public class Libro extends Articulo {
    private String autor;
    private int numPaginas;
    public enum Genero {
        MISTERIO,
        TERROR,
        ACCION,
        HISTORIA,
        FANTASIA
    }
    //Esto de "private Genero genero" me dió muchísimos problemas
    private Genero genero;
//Todos los constructores
    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numPaginas, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.genero = genero;
    }

    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.numPaginas = 100;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public boolean esLargo() {
        return this.numPaginas > 200;
    }

    @Override
    public String toString() {
        return "Libro " + this.getTitulo() + ", de " + this.getAutor() + "(" + this.getPrecioPorDia() + " €/día)";
    }
}