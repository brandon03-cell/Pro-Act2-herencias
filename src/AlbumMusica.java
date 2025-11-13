public class AlbumMusica extends Articulo {
    private String Autor;
    private int numCanciones;
    private boolean single;

    public AlbumMusica(String titulo, int anyoLanzamiento, double precioPorDia, String autor, int numCanciones, boolean single) {
        super(titulo, anyoLanzamiento, precioPorDia);
        Autor = autor;
        this.numCanciones = numCanciones;
        this.single = single;
    }

    public AlbumMusica() {
    }

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

}
