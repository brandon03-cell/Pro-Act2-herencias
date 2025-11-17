package Articulos;

public class Videojuego extends Articulo {
    private String director;
    private String plataformas;
    private int pegi;
//Todos los constructores
    public Videojuego(String titulo, int anyoLanzamiento, double precioPorDia, String director, String plataformas, int pegi) {
        super(titulo, anyoLanzamiento, precioPorDia);
        this.director = director;
        this.plataformas = plataformas;
        this.pegi = pegi;
    }
//Constructor vacío
    public Videojuego() {
    }
//getters and setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getPlataformas() {
        return plataformas;
    }

    public void setPlataformas(String plataformas) {
        this.plataformas = plataformas;
    }

    public int getPegi() {
        return pegi;
    }

    public void setPegi(int pegi) {
        this.pegi = pegi;
    }
//Formula para que devuelva TRUE si el PEGI es igual o mayor que 18
    public boolean paraAdultos() {
        return this.pegi >=18;
    }
//Formula para que devuelva TRUE si la edad es igual o mayor que el PEGI
    public boolean esApto(int edad) {
        return edad>=this.pegi;
    }
//metodo toString
    @Override
    public String toString() {
        return "[Videojuego]" + this.getTitulo() + ", de " + this.getDirector() + " (" + this.getPrecioPorDia() + " €/día)";
    }
}
