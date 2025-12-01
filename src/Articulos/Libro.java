package Articulos;

public class Libro extends Articulo {
    private String autor;
    private int numPaginas;
    public enum Genero {
        MISTERIO,
        TERROR,
        ACCION,
        HISTORIA,
        FANTASIA,
        OTRO
    }
    //Esto de "private Genero genero" me dió muchísimos problemas
    private Genero genero;
    private boolean edicionEspecial;
//Todos los constructores

    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String descripcion, String autor, int numPaginas, boolean edicionEspecial, Genero genero) {
        super(titulo, anyoLanzamiento, precioPorDia, descripcion);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.edicionEspecial = edicionEspecial;
        this.genero = genero;
    }

    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String descripcion, int numPaginas) {
        super(titulo, anyoLanzamiento, precioPorDia, descripcion);
        this.numPaginas = numPaginas;
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

    public boolean isEdicionEspecial() {
        return edicionEspecial;
    }

    public void setEdicionEspecial(boolean edicionEspecial) {
        this.edicionEspecial = edicionEspecial;
    }

    public boolean esLargo() {
        return this.numPaginas > 200;
    }

    public void getResumen() {
        System.out.println(this.getTitulo() + ", un libro de género " + this.getGenero());
    }

    @Override
    public String toString() {
        return "Libro " + this.getTitulo() + ", de " + this.getAutor() + "(" + this.getPrecioPorDia() + " €/día)";
    }
}