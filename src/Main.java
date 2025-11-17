import Articulos.Articulo;
import Articulos.Libro;
import Articulos.Pelicula;
import Articulos.Videojuego;
import Usuarios.Administrador;
import Usuarios.Cliente;

public class Main {
    public static void main(String[] args) {
        Articulo articulo1 = new Libro ("Harry Potter", 2001, 15.50, "J.K. Rowling", 300, Libro.Genero.FANTASIA);
        Articulo articulo2 = new Libro("El Quijote", 1605, 20.00, "Ceervantes", 1000, Libro.Genero.HISTORIA);

        Pelicula peli1 = new Pelicula("Avatar", 2009, 12.0, "James Cameron", 160);
        Pelicula peli2 = new Pelicula("Titanic", 1997, 10.0, "James Cameron", 195);

        Videojuego juego1 = new Videojuego("Mario bros", 2020, 40.0, "Nintendo", "Switch", 3);
        Videojuego juego2 = new Videojuego("GTA V", 2013, 30.0, "Rockstar", "PC", 18);

        Cliente Rodolfo = new Cliente("Rodolfo", "Nuggets_1329", 321, 1991, articulo1, 23);
        Cliente Hermenegildo = new Cliente("Hermenegildo", "Hamburguesaso3121", 320, 1984, peli1, 69);

        Administrador Capitan_Chavez = new Administrador("Capi", "capicapicapicapicapi", 6969, 1969);
    }
}