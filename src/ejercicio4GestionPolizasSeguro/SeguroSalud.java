package ejercicio4GestionPolizasSeguro;

public class SeguroSalud extends PolizaSeguro {

    private int edadAsegurado;
    private double porcentajeCobertura;


    public SeguroSalud(int numeroPoliza, String nombreCliente,
                       double montoAsegurado, String fechaInicio,
                       int mesesVigencia, int edadAsegurado,
                       double porcentajeCobertura) {
        super(numeroPoliza, nombreCliente, montoAsegurado, fechaInicio, mesesVigencia);
        this.edadAsegurado = edadAsegurado;
        this.porcentajeCobertura = porcentajeCobertura;
    }

    @Override
    public double calcularPrima() {
        double primaBase = super.getMontoAsegurado() * 0.02;
        double recargoPorEdad = this.edadAsegurado * 500;
        return primaBase + recargoPorEdad;
    }

    @Override
    public String obtenerTipoCobertura() {
        return "Cobertura Medica y Hospitalaria (" + (this.porcentajeCobertura * 100) + "% de cobertura)";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Edad del asegurado: " + this.edadAsegurado + " años");
        System.out.println("Prima mensual a pagar: $" + String.format("%,.0f",calcularPrima()).replace(',','.'));
    }


    public int getEdadAsegurado() {
        return edadAsegurado;
    }

    public void setEdadAsegurado(int edadAsegurado) {
        this.edadAsegurado = edadAsegurado;
    }

    public double getPorcentajeCobertura() {
        return porcentajeCobertura;
    }

    public void setPorcentajeCobertura(double porcentajeCobertura) {
        this.porcentajeCobertura = porcentajeCobertura;
    }

}
