package ejercicio3InversionesFinancieras;

public class DepositoPlazo extends InstrumentoFinanciero {

    private double tasaInteres;
    private int plazoMeses;

    public DepositoPlazo(String codigo,String nombre, double montoInvertido, double tasaInteres, int plazoMeses){
    super(codigo, nombre, montoInvertido);
    this.tasaInteres= tasaInteres;
    this.plazoMeses = plazoMeses;
    }

    @Override
    public double calcularRentabilidad(){
       return  this.montoInvertido * this.plazoMeses;
    }

    @Override
    public String obtenerNivelRiesgo(){
        return "Bajo";
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }


    @Override
    public double liquidar() {
        return 0;
    }
}
