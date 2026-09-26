package ejercicio4GestionPolizasSeguro;

public class SeguroVida extends PolizaSeguro{

    private int edad;
    private int duracionContrato;

    public SeguroVida(int numeroPoliza,
                      String nombreCliente,
                      double montoAsegurado,
                      String fechaInicio,
                      int mesesVigencia,
                      int edad,
                      int duracionContrato) {
        super(numeroPoliza, nombreCliente, montoAsegurado, fechaInicio, mesesVigencia);
        this.edad = edad;
        this.duracionContrato = duracionContrato;
    }

    @Override
    public double calcularPrima() {
        double primaBase = super.getMontoAsegurado() * 0.01;
        double recargoEdad = this.edad * 1000;
        return primaBase + recargoEdad;
    }
    @Override
    public String obtenerTipoCobertura() {
        return "Cobertura Total por Fallecimiento a Invalidez (Contrato a " + this.duracionContrato + "años)";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Edad del titular: " + this.edad + "años");
        System.out.println("Duración del contrato: " + this.duracionContrato + "años");
        System.out.println("Cobertura: " + obtenerTipoCobertura());
        System.out.println("Prima mensual a pagar: $" + String.format("%,.0f", calcularPrima()).replace(',','.'));

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDuracionContrato() {
        return duracionContrato;
    }

    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }
}

