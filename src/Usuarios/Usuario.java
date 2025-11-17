package Usuarios;
//Está en la carpeta de Usuarios
public class Usuario {
    private String nombreUsuario;
    private String contrasenya;
    private int id;
    private int anyoNacimiento;
//Todos los constructores
    public Usuario(String nombreUsuario, String contrasenya, int id, int anyoNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasenya = contrasenya;
        this.id = id;
        this.anyoNacimiento = anyoNacimiento;
    }
//Constructor vacío
    public Usuario() {
    }
//getters and setters
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnyoNacimiento() {
        return anyoNacimiento;
    }

    public void setAnyoNacimiento(int anyoNacimiento) {
        this.anyoNacimiento = anyoNacimiento;
    }
//resta para calcular la edad y comparar el resultado si es mayor o igual que 18
    public boolean esAdulto() {
        return (2025 - this.anyoNacimiento) >=18;
    }
//Simplemente comprobando si el número de caracteres es superior a 10
    public boolean contrasenyaSegura() {
        return this.contrasenya.length() >10;
    }
//Metodo toString
    @Override
    public String toString() {
        return this.nombreUsuario + " (" + this.getId() + ")";
    }
}
