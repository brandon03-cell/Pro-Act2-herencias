public class Pelicula extends Articulo {
    private String director;
    private int duracion;

    public Pelicula(String titulo, int anyoLanzamiento, double precioPorDia, String director, int duracion) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

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

    public void getDuracionHorasYMinutos() {
        int minutosTotales= this.getDuracion();
        int horas = minutosTotales/60;
        int minutos = minutosTotales%60;
        System.out.println(horas + " horas y " + minutos + " minutos");
    }

    public int getDuracionSegundos() {
        final int minutosASegundos = 60;
        return this.getDuracion() * minutosASegundos;
    }

    @Override
    public String toString() {
        return "[Película] " + this.getTitulo() + ", de " + this.getDirector() + " (" + this.getPrecioPorDia() + " €/día)";
    }
}
