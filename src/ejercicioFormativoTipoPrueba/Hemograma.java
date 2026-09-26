package ejercicioFormativoTipoPrueba;

public class Hemograma extends ExamenLab {
    private boolean urgente;
    private boolean incluyePlaquetas;

    public Hemograma(String codigo, String nombrePaciente, double valorBase, int cantidadAnalisis,
                     boolean urgente, boolean incluyePlaquetas) {
        super(codigo, nombrePaciente, valorBase, cantidadAnalisis);
        setUrgente(urgente);
        setIncluyePlaquetas(incluyePlaquetas);
    }

    @Override
    public int calcularValor() {
        double total = getValorBase();

        // Si es urgente, tiene un recargo del 30% sobre el valor base
        if (this.urgente) {
            total += getValorBase() * 0.30;
        }

        // Si incluye análisis de plaquetas, se agregan $2.000
        if (this.incluyePlaquetas) {
            total += 2000;
        }

        return (int) Math.round(total);
    }

    public boolean isUrgente() {
        return this.urgente;
    }

    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }

    public boolean isIncluyePlaquetas() {
        return this.incluyePlaquetas;
    }

    public void setIncluyePlaquetas(boolean incluyePlaquetas) {
        this.incluyePlaquetas = incluyePlaquetas;
    }
}
