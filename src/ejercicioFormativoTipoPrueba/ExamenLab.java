package ejercicioFormativoTipoPrueba;

public class ExamenLab {
    private String codigo;
    private String nombrePaciente;
    private double valorBase;
    private int cantidadAnalisis;

    public ExamenLab(String codigo, String nombrePaciente, double valorBase, int cantidadAnalisis) {
        // Los constructores delegan a los setters para aplicar las validaciones
        setCodigo(codigo);
        setNombrePaciente(nombrePaciente);
        setValorBase(valorBase);
        setCantidadAnalisis(cantidadAnalisis);
    }

    public int calcularValor() {
        return (int) Math.round(this.valorBase);
    }

    // --- Getters y Setters con Validaciones ---

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede ser nulo ni estar vacío.");
        }
        this.codigo = codigo;
    }

    public String getNombrePaciente() {
        return this.nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        if (nombrePaciente == null || nombrePaciente.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del paciente no puede ser nulo ni estar vacío.");
        }
        this.nombrePaciente = nombrePaciente;
    }

    public double getValorBase() {
        return this.valorBase;
    }

    public void setValorBase(double valorBase) {
        if (valorBase <= 0) {
            throw new IllegalArgumentException("El valor base debe ser mayor que cero.");
        }
        this.valorBase = valorBase;
    }

    public int getCantidadAnalisis() {
        return this.cantidadAnalisis;
    }

    public void setCantidadAnalisis(int cantidadAnalisis) {
        if (cantidadAnalisis <= 0) {
            throw new IllegalArgumentException("La cantidad de análisis debe ser mayor que cero.");
        }
        this.cantidadAnalisis = cantidadAnalisis;
    }

    @Override
    public String toString() {
        return "Código: " + this.codigo + " | Paciente: " + this.nombrePaciente;
    }
}
