package ejercicio3InversionesFinancieras;

public class Accion extends InstrumentoFinanciero{

    private double precioCompra;
    private double precioActual;
    private double cantidadAcciones;

    public Accion(String codigo, String nombre, double montoInvertido, double precioCompra, double precioActual, double cantidadAcciones) {
        super(codigo, nombre, montoInvertido);

        this.precioCompra = precioCompra;
        this.precioActual = precioActual;
        this.cantidadAcciones = cantidadAcciones;
    }

    @Override
    public double calcularRentabilidad() {
        return 0;
    }

    @Override
    public String obtenerNivelRiesgo() {
        return "";
    }

    @Override
    public double liquidar() {
        return 0;
    }
}
