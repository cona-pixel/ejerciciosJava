package ejercicio4GestionPolizasSeguro;

public abstract class PolizaSeguro {

    private int numeroPoliza;
    private String nombreCliente;
    private double montoAsegurado;
    private String fechaInicio;
    private int mesesVigencia;

    public PolizaSeguro(int numeroPoliza, String nombreCliente, double montoAsegurado, String fechaInicio, int mesesVigencia) {
        this.numeroPoliza = numeroPoliza;
        this.nombreCliente = nombreCliente;
        this.montoAsegurado = montoAsegurado;
        this.fechaInicio = fechaInicio;
        this.mesesVigencia = mesesVigencia;
    }
    public void mostrarInformacion() {
        System.out.println("----------------------------------------");
        System.out.println("Número de Póliza: " + this.numeroPoliza);
        System.out.println("Cliente: " + this.nombreCliente);
        System.out.println("Monto Asegurado: $" + String.format("%,.0f", this.montoAsegurado).replace(',', '.'));
        System.out.println("Fecha Inicio: " + this.fechaInicio);
        System.out.println("Meses de Vigencia: " + this.mesesVigencia + " meses");
    }

    public abstract double calcularPrima();
    public abstract String obtenerTipoCobertura();

    public boolean coincideConCliente(String texto) {
        if (this.nombreCliente == null || texto == null) {
            return false;
        }
        return this.nombreCliente.toLowerCase().contains(texto.toLowerCase());
    }


    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public int getMesesVigencia() {
        return mesesVigencia;
    }

    public void setMesesVigencia(int mesesVigencia) {
        this.mesesVigencia = mesesVigencia;
    }

}
