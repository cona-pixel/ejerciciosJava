package ejercicioFormativoTipoPrueba;

public class PerfilBioquimico extends ExamenLab implements AyunoVerificable {
    private boolean requiereAyuno;
    private boolean muestraEspecial;
    private boolean enAyuno;

    public PerfilBioquimico(String codigo, String nombrePaciente, double valorBase, int cantidadAnalisis,
                            boolean requiereAyuno, boolean muestraEspecial) {
        super(codigo, nombrePaciente, valorBase, cantidadAnalisis);
        setRequiereAyuno(requiereAyuno);
        setMuestraEspecial(muestraEspecial);
        this.enAyuno = false; // Comienza en false hasta llamar a registrarAyuno()
    }

    // --- Implementación de la interfaz AyunoVerificable ---

    @Override
    public boolean estaEnAyuno() {
        return this.enAyuno;
    }

    @Override
    public void registrarAyuno() {
        this.enAyuno = true;
    }

    // --- Redefinición del cálculo de valor final ---

    @Override
    public int calcularValor() {
        double total = getValorBase();

        // Si requiere muestra especial, aplica el recargo especial definido en la interfaz (20%)
        if (this.muestraEspecial) {
            total += getValorBase() * RECARGO_ESPECIAL;
        }

        // Si la cantidad de análisis es superior a 10, se agregan $3.000
        if (getCantidadAnalisis() > 10) {
            total += 3000;
        }

        return (int) Math.round(total);
    }

    // --- Getters y Setters ---

    public boolean isRequiereAyuno() {
        return this.requiereAyuno;
    }

    public void setRequiereAyuno(boolean requiereAyuno) {
        this.requiereAyuno = requiereAyuno;
    }

    public boolean isMuestraEspecial() {
        return this.muestraEspecial;
    }

    public void setMuestraEspecial(boolean muestraEspecial) {
        this.muestraEspecial = muestraEspecial;
    }

    public boolean isEnAyuno() {
        return this.enAyuno;
    }

    public void setEnAyuno(boolean enAyuno) {
        this.enAyuno = enAyuno;
    }
}
