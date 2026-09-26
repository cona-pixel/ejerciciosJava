package ejercicio4GestionPolizasSeguro;

public class SeguroVehiculo extends PolizaSeguro implements Renovable{

    private String marca;
    private int anio;
    private int valorComercial;


    public SeguroVehiculo(int numeroPoliza, String nombreCliente,
                          double montoAsegurado, String fechaInicio,
                          int mesesVigencia, String marca, int anio,
                          int valorComercial) {
        super(numeroPoliza,
                nombreCliente,
                montoAsegurado,
                fechaInicio,
                mesesVigencia);
        this.marca = marca;
        this.anio = anio;
        this.valorComercial = valorComercial;
    }

    @Override
    public double calcularPrima() {
        double primaBase = this.valorComercial * 0.03;
        int antiguedad = 2026 - this.anio;
        double recargoAntiguedad = (antiguedad > 0) ? (antiguedad * 10000): 0;
        return primaBase + recargoAntiguedad;
    }

    @Override
    public String obtenerTipoCobertura() {
        return "Cobertura Automotriz Completa (Daños a terceros y Pérdida Total)";
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Vehiculo: " + this.marca + "(Año " + this.anio + ")");
        System.out.println("Valor comercial: $" + String.format("%,.0f",this.valorComercial).replace(',','.'));
        System.out.println("Cobertura: " + obtenerTipoCobertura());
        System.out.println("Prima mensual a pagar: $" + String.format("%,.0f",calcularPrima()).replace(',', '.'));

    }

    @Override
    public boolean renovar(int cantidadMeses) {
        if (cantidadMeses > 0){
            setMesesVigencia(getMesesVigencia() + cantidadMeses);
            System.out.println("Poliza renovada con éxito por " + cantidadMeses + " meses adicionales.");
            return true;
        }else{
            System.out.println("Cantidad de meses invalida para renovación.");
            return false;
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getValorComercial() {
        return valorComercial;
    }

    public void setValorComercial(int valorComercial) {
        this.valorComercial = valorComercial;
    }
}
