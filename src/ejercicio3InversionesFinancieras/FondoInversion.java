package ejercicio3InversionesFinancieras;

public class FondoInversion extends InstrumentoFinanciero{

    private double variacionPorcentual;
    private double comisionAdministracion;

    public FondoInversion(String codigo, String nombre, double montoInvertido, double variacionPorcentual, double comisionAdministracion){
        super(codigo, nombre, montoInvertido);
        this.variacionPorcentual = variacionPorcentual;
        this.comisionAdministracion = comisionAdministracion;
    }

    @Override
    public double calcularRentabilidad(){
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
