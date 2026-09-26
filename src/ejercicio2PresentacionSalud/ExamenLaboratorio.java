package ejercicio2PresentacionSalud;

public class ExamenLaboratorio extends  PrestacionSalud{

    //atributos propios para esta clase hija
    private String tipoExamen;
    private boolean condicionUrgencia;


    //constructor
    public ExamenLaboratorio(String identificador,
                             String nombrePaciente,
                             double valorBase,
                             String tipoExamen,
                             boolean condicionUrgencia) {

        super(identificador, nombrePaciente, valorBase);//pasa los datos en base a la clase padre
        this.tipoExamen = tipoExamen;
        this.condicionUrgencia = condicionUrgencia;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }

    public boolean isCondicionUrgencia() {
        return condicionUrgencia;
    }

    public void setCondicionUrgencia(boolean condicionUrgencia) {
        this.condicionUrgencia = condicionUrgencia;
    }

    @Override
    public double calcularValorFinal() {
        if (this.condicionUrgencia) {
            return super.getValorBase() * 1.25;// 25% de recargo si es urgente
        } else {
            return super.getValorBase(); // Valor normal si no es urgente
        }

    }

        @Override
        public void mostrarInformacion () {
            super.mostrarInformacion();
            System.out.println("Tipo de examen: " + this.tipoExamen);
            System.out.println("¿Es urgente?: " + (this.condicionUrgencia ? "Si (aplica 25% recargo)" : "No"));
            System.out.println("Valor final: $" + String.format("%,.0f", calcularValorFinal()).replace(',', '.'));
        }
    }
