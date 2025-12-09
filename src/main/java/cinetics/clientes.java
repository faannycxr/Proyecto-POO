package cinetics;

public class clientes extends datosPersonas {

    private boolean inscritoLealtad;

    public clientes(String nombre, String apellidoPaterno, String apellidoMaterno,
                    String direccion, String telefono, String correo,
                    String numeroCuenta, String contrasena,
                    boolean inscritoLealtad) {

        try {
            this.nombre = nombre;
            this.apellidoPaterno = apellidoPaterno;
            this.apellidoMaterno = apellidoMaterno;
            this.direccion = direccion;
            this.celular = telefono;
            this.correo = correo;
            this.id = numeroCuenta;
            this.contrasenia = contrasena;
            this.inscritoLealtad = inscritoLealtad;
        } catch (Exception e) {
            System.out.println("Error en constructor de clientes");
        }
    }

    public boolean getInscritoLealtad() {
        return inscritoLealtad;
    }

    public void setInscritoLealtad(boolean inscritoLealtad) {
        try {
            this.inscritoLealtad = inscritoLealtad;
        } catch (Exception e) {
            System.out.println("No se pudo modificar el estado de lealtad");
        }
    }

    public String getNumeroCuenta() {
        return id;
    }

    public String getContrasena() {
        return contrasenia;
    }

    public boolean isSocioLealtad() {
        return inscritoLealtad;
    }

    public void activarLealtad() {
        this.inscritoLealtad = true;
    }

    public String getProgramaLealtad() {
        return "Programa de lealtad activo";
    }

    public String verificarPrograma() {
        return getProgramaLealtad();
    }
}
