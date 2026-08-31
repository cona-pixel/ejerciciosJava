package ejercicioInversionesFinancieras;

public  abstract class InstrumentoFinanciero {
    protected String codigo;
    protected String nombre;
    protected double montoInvertido;

    public InstrumentoFinanciero(String codigo, String nombre, double montoInvertido){
        this.codigo = codigo;
        this.nombre = nombre;
        this.montoInvertido = montoInvertido;
    }

    public void mostrarMenu(){
        System.out.println("-----------------------------");
        System.out.println("Codigo:" + this.codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Monto invertido: $ "+ String.format("%,.0f", this.montoInvertido).replace(',', '.') );
    }

    public abstract double calcularRentabilidad();

    public abstract String obtenerNivelRiesgo();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMontoInvertido() {
        return montoInvertido;
    }

    public void setMontoInvertido(double montoInvertido) {
        this.montoInvertido = montoInvertido;
    }

}

