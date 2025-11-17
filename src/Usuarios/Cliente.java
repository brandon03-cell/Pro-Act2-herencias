package Usuarios;
//Pertenece a la carpeta Usuarios
import Articulos.Articulo;
//extends from Usuario
public class Cliente extends Usuario {
    private Articulo articulo;
    private int numSocio;
//Todos los constructores
    public Cliente(String nombreUsuario, String contrasenya, int id, int anyoNacimiento, Articulo articulo, int numSocio) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
        this.articulo = articulo;
        this.numSocio = numSocio;
    }
//Constructor vacío
    public Cliente() {
    }
//getters and setters
    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }
//Según mis cálculos así es como se calcularía el precio total de los artículos por los días usados partiendo del precio de cada artículo
    public double calcularPrecio(int numArticulos, int dias) {
        return (numArticulos * dias + this.articulo.getPrecioPorDia());
    }
//metodo toString
    @Override
    public String toString() {
        return "Cliente " + this.getNombreUsuario() + " (" + this.getId() + ")";
    }
}
