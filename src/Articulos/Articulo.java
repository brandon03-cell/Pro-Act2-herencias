package Articulos;
//Tambien dentro de la carpeta de Articulo
public class Articulo {
    private String titulo;
    private int anyoLanzamiento;
    private double precioPorDia;
    private String descripcion;
//Todos los constructores

    public Articulo(String titulo, int anyoLanzamiento, double precioPorDia, String descripcion) {
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precioPorDia = precioPorDia;
        this.descripcion = descripcion;
    }

    public Articulo(String titulo, int anyoLanzamiento) {
        this.titulo = titulo;
        this.anyoLanzamiento = anyoLanzamiento;
        this.precioPorDia = 9.99;
    }

    //Constructor vacío
    public Articulo() {
    }
//getters and setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnyoLanzamiento() {
        return anyoLanzamiento;
    }

    public void setAnyoLanzamiento(int anyoLanzamiento) {
        this.anyoLanzamiento = anyoLanzamiento;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //formula para calcular el precio total dependiendo de el número artículos por un número de días
    public double calcularPrecio(int numArticulos, int dias) {
        return (this.precioPorDia * numArticulos * dias);
    }

    public void getInfo() {
        System.out.println(this.titulo + ", lanzado en " + this.anyoLanzamiento);
    }

    public double getPrecioConDescuento(double descuento) {
        return this.precioPorDia * descuento / 100;
    }

//metodo toString
    @Override
    public String toString() {
        return "[Articulo] " + this.titulo + " (" +  this.precioPorDia + " €/día";
    }
}
