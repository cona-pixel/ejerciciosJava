package ejercicioInversionesFinancieras;

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

    @Override
    public void mostrarResumen(){
        super.mostrarMenu();
        System.out.println("Tipo: Depósito a Plazo Fijo");
        System.out.println("plazoMeses = " + plazoMeses);
        System.out.println("tasaInteres = " + tasaInteres);
        System.out.println("Riesgo: " + obtenerNivelRiesgo());
        System.out.println("Rentabilidad Estimada: $" + String.format("%,.0f", calcularRentabilidad()).replace(',','.'));
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
}
