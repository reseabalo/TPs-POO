public class App {
    public static void main(String[] args) {
        AccesoDatos accesoDatos = new AccesoDatos();
        accesoDatos.crearConexion();

        // Puedes añadir más lógica aquí según sea necesario
        if (accesoDatos.getConexion() != null) {
            accesoDatos.mostrarPiezasBD();
        } else {
            System.err.println("La conexión a la base de datos falló. No se pueden mostrar las piezas.");
        }

        // Cerrar conexión al final
        accesoDatos.cerrarConexion();
    }
}
