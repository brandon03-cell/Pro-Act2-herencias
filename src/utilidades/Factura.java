package utilidades;

import Articulos.Articulo;
import Usuarios.Cliente;

public class Factura {
    private Articulo articulo;
    private Cliente cliente;
    private int numArticulos;
    private int dias;

    public Factura(Articulo articulo, Cliente cliente, int numArticulos, int dias) {
        this.articulo = articulo;
        this.cliente = cliente;
        this.numArticulos = numArticulos;
        this.dias = 7;
    }

    public Factura() {
    }

    public double getPrecioTotal() {
        return this.articulo.getPrecioPorDia() * this.numArticulos * this.dias;
    }

    @Override
    public String toString() {
        return "Factura para " + this.cliente.getNombreUsuario() + ", total:  " + this.getPrecioTotal() + " €";
    }
}
