package Articulos;

public class Pelicula extends Articulo {
    private String director;
    private int duracion;
    public enum Idioma {
        ESPAÑOL,
        INGLES,
        FRANCES,
        ALEMAN,
        ITALIANO
    }
    private Idioma idiomaAudio;
    private Idioma idiomasSubtitulos;
//Una vez más todos los constructores


    public Pelicula(String titulo, int anyoLanzamiento, double precioPorDia, String descripcion, String director, int duracion, Idioma idiomaAudio, Idioma idiomasSubtitulos) {
        super(titulo, anyoLanzamiento, precioPorDia, descripcion);
        this.director = director;
        this.duracion = duracion;
        this.idiomaAudio = idiomaAudio;
        this.idiomasSubtitulos = idiomasSubtitulos;
    }

    //consttructor vacío
    public Pelicula() {
    }
//getters and setters

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public Idioma getIdiomaAudio() {
        return idiomaAudio;
    }

    public void setIdiomaAudio(Idioma idiomaAudio) {
        this.idiomaAudio = idiomaAudio;
    }

    public Idioma getIdiomasSubtitulos() {
        return idiomasSubtitulos;
    }

    public void setIdiomasSubtitulos(Idioma idiomasSubtitulos) {
        this.idiomasSubtitulos = idiomasSubtitulos;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
//formula para que muestre las horas y minutos partiendo de los minutos totales
    public void getDuracionHorasYMinutos() {
        int minutosTotales= this.getDuracion();
        int horas = minutosTotales/60;
        int minutos = minutosTotales%60;
        System.out.println(horas + " horas y " + minutos + " minutos");
    }
//Lo mismo pero en segundos
    public int getDuracionSegundos() {
        final int minutosASegundos = 60;
        return this.getDuracion() * minutosASegundos;
    }
//metodo toString
    @Override
    public String toString() {
        return "[Película] " + this.getTitulo() + ", de " + this.getDirector() + " (" + this.getPrecioPorDia() + " €/día)";
    }
}
