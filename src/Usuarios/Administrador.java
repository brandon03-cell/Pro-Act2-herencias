package Usuarios;
import Articulos.Articulo;
//Importacion
public class Administrador extends Usuario {
    public enum Rol{
        JEFE,
        VENDEDOR
    }
    //Anteriormente olvide poner esto de "private Rol rol" y me dio problemas
    private Rol rol;
//Todos los constructores
    public Administrador(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        super(nombreUsuario, contrasenya, id, anyoNacimiento);
    }
//Constructor vacío
    public Administrador() {
    }
//Getter and setter
    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
//Asignar artículo
    public void asignarArticulo(Cliente cliente, Articulo articulo) {
        cliente.setArticulo(articulo);
    }
//Retirar artículo
    public void retirarArticulo(Cliente cliente) {
        cliente.setArticulo(null);
    }
//Metodo toString
    @Override
    public String toString() {
        return "Administrador " + this.getNombreUsuario() + " (" + this.getId() + ")";
    }
}
