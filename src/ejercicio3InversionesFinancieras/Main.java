package ejercicio3InversionesFinancieras;

public class Main {
    public static void main(String[] args) {
        InstrumentoFinanciero depositoPlazo = new DepositoPlazo("codigo", "inversion", 10000, 0.24 , 12 );
        InstrumentoFinanciero fondoInversion = new FondoInversion("Constnaza", "indjksdjfks", 1222, 10, 3);
        InstrumentoFinanciero accion = new Accion("CODIGO", "CONSTANZA", 10000,29000, 33333, 10);

        //mostrar resumen de cada isntrumento
        depositoPlazo.mostrarMenu();
        fondoInversion.mostrarMenu();
        accion.mostrarMenu();
        //calcular rentabildiad
        depositoPlazo.calcularRentabilidad();
        fondoInversion.calcularRentabilidad();
        accion.calcularRentabilidad();
        //obtener nivel reisgo
        depositoPlazo.obtenerNivelRiesgo();
        fondoInversion.obtenerNivelRiesgo();
        accion.obtenerNivelRiesgo();
        //probar liquidacion
        depositoPlazo.liquidar();
        fondoInversion.liquidar();
        accion.liquidar();

    }

}
