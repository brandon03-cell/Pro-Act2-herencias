public class Libro extends Articulo {
    private String autor;
    private int numPaginas;
    private enum Genero {
        MISTERIO,
        TERROR,
        ACCION,
        HISTORIA,
        FANTASIA
    }

    public Libro(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numPaginas) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.autor = autor;
        this.numPaginas = 100;
    }

    public Libro() {
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

    public boolean esLargo() {
        return numPaginas > 200;
    }

    @Override
    public String toString() {
        return "Libro " + this.getTitulo() + ", de " + this.getAutor() + "(" + this.getPrecioPorDia() + " €/día)";
    }
}