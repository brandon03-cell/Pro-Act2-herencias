package Articulos;
//Perteneciente a la carpeta de Articulos
public class AlbumMusica extends Articulo {
    private String Autor;
    private int numCanciones;
    private boolean single;
//Todos los constructores
    public AlbumMusica(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numCanciones, boolean single) {
        super(titulo, anyoLanzamiento, precioPorDia);
        Autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }
//Constructor vacío
    public AlbumMusica() {
    }
//getters and setters
    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getNumCanciones() {
        return numCanciones;
    }

    public void setNumCanciones(int numCanciones) {
        this.numCanciones = numCanciones;
    }

    public boolean isSingle() {
        return single;
    }

    public void setSingle(boolean single) {
        this.single = single;
    }
//multiplicación para calcular la media
    public int getDuracionTotal(int duracionMedia) {
        return this.numCanciones * duracionMedia;
    }
//metodo toString
    @Override
    public String toString() {
        return "[Álbum] " + this.getTitulo() + ", de " + this.getAutor() + " (" + this.getPrecioPorDia() + " €/día)";
    }
}