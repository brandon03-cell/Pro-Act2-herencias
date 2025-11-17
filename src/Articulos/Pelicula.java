package Articulos;

public class Pelicula extends Articulo {
    private String director;
    private int duracion;
//Una vez más todos los constructores
    public Pelicula(String titulo, int anyoLanzamiento, double precioPorDia, String director, int duracion) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.duracion = duracion;
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
