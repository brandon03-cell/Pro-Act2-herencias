import Articulos.Articulo;
import Articulos.AlbumMusica;
import Articulos.Libro;
import Articulos.Pelicula;
import Articulos.Videojuego;
import Usuarios.Administrador;
import Usuarios.Cliente;

public class Main {
    public static void main(String[] args) {
        Libro Libro1 = new Libro ("Harry Potter", 2001, 15.50, "J.K. Rowling", 300, Libro.Genero.FANTASIA);
        Libro Libro2 = new Libro("El Quijote", 1605, 20.00, "Ceervantes", 1000, Libro.Genero.HISTORIA);
        System.out.println(Libro1);
        System.out.println(Libro2);

        AlbumMusica albumMusica1 = new AlbumMusica("Un verano sin ti", 2022, 69.69, "Bad Bunny", 23, false);
        AlbumMusica albumMusica2 = new AlbumMusica("Unorthodox Jukebox", 2012, 100.69, "Bruno Mars", 10, false);
        System.out.println(albumMusica1);
        System.out.println(albumMusica2);


        Pelicula peli1 = new Pelicula("Avatar", 2009, 12.0, "James Cameron", 160);
        Pelicula peli2 = new Pelicula("Titanic", 1997, 10.0, "James Cameron", 195);
        System.out.println(peli1);
        System.out.println(peli2);

        Videojuego juego1 = new Videojuego("Mario bros", 2020, 40.0, "Nintendo", "Switch", 3);
        Videojuego juego2 = new Videojuego("GTA V", 2013, 30.0, "Rockstar", "PC", 18);
        System.out.println(juego1);
        System.out.println(juego2);

        Cliente Rodolfo = new Cliente("Rodolfo", "Nuggets_1329", 321, 1991, Libro1, 23);
        Cliente Jose = new Cliente("Hermenegildo", "Hamburguesaso3121", 320, 1984, peli1, 69);
        System.out.println(Rodolfo);
        System.out.println(Jose);

        Administrador Capitan_Chavez = new Administrador("Capi", "capicapicapicapicapi", 6969, 1969);
        System.out.println(Capitan_Chavez);
    }
}