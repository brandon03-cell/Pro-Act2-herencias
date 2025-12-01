import Articulos.Articulo;
import Articulos.AlbumMusica;
import Articulos.Libro;
import Articulos.Pelicula;
import Articulos.Videojuego;
import Usuarios.Administrador;
import Usuarios.Cliente;
import utilidades.Factura;

public class Main {
    public static void main(String[] args) {
        Libro Libro1 = new Libro ("Harry Potter", 2001, 15.50, "Es un buen libro, muy recomendado", "J.K. Rowling", 300, true, Libro.Genero.OTRO);
        Libro Libro2 = new Libro("El Quijote", 1605, 20.00, "Importante libro de la historia española", "Ceervantes", 1000, false, Libro.Genero.HISTORIA);
        System.out.println(Libro1);
        System.out.println(Libro2);

        AlbumMusica albumMusica1 = new AlbumMusica("Un verano sin ti", 2022, 69.69, "Album veraniego", "Bad Bunny", 23, false);
        AlbumMusica albumMusica2 = new AlbumMusica("Unorthodox Jukebox", 2012, 100.69, "Album clasico","Bruno Mars", 10, false);
        System.out.println(albumMusica1);
        System.out.println(albumMusica2);

        Pelicula peli1 = new Pelicula("Avatar", 2009, 12.0, "Película ", "James Cameron", 160, Pelicula.Idioma.ESPAÑOL, Pelicula.Idioma.INGLES);
        Pelicula peli2 = new Pelicula("Titanic", 1997, 10.0, "Pelicula", "James Cameron", 195, Pelicula.Idioma.ITALIANO, Pelicula.Idioma.INGLES);
        System.out.println(peli1);
        System.out.println(peli2);

        Videojuego juego1 = new Videojuego("Mario bros", 2020, 40.0, "Juego divertido", "Nintendo", "Switch", 3, "v1.0");
        Videojuego juego2 = new Videojuego("GTA V", 2013, 30.0, "juego de mundo abierto", "Rockstar", "PC", 18, "v1.0");
        System.out.println(juego1);
        System.out.println(juego2);

        Cliente Rodolfo = new Cliente("Rodolfo", "Nuggets_1329", 321, 1991, Libro1, 23);
        Cliente Jose = new Cliente("Hermenegildo", "Hamburguesaso3121", 320, 1984, juego2, 69);
        System.out.println(Rodolfo);
        System.out.println(Jose);

        Rodolfo.saludo();
        Jose.saludo();

        Administrador Capitan_Chavez = new Administrador("Capi", "capicapicapicapicapi", 6969, 1969);
        System.out.println(Capitan_Chavez);

        Factura f1 = new Factura(juego1, Rodolfo, 5, 3);
        System.out.println(f1);
        Factura f2 = new Factura(Libro2, Jose, 7, 7);
        System.out.println(f2);
    }
}