package ejercicio2PresentacionSalud;

public abstract class PrestacionSalud {


    //definir los atributos  para q lo hereden las 3 hijas
    private String identificador;
    private String nombrePaciente;
    private double valorBase;

    //contructor
    public PrestacionSalud(String identificador, String nombrePaciente, double valorBase){
        this.identificador = identificador;
        this.nombrePaciente = nombrePaciente;
        this.valorBase = valorBase;

    }

    //el metodo para mostrar la informacion general
    public  void mostrarInformacion(){
        System.out.println("------------------------ ");
        System.out.println("ID Presentacion: "+ this.identificador);
        System.out.println("Nombre del paciente: " + this.nombrePaciente);
        System.out.println("Valor base: $" + String.format("%,.0f",this.valorBase).replace(',','.'));
    }

    //usar metodo abstracto q piden en el ejercicio(las c.hijas estan obligadas a calcular su valor final)
    public abstract double calcularValorFinal();

    public boolean coincideConPaciente (String texto){
        if (this.nombrePaciente ==  null || texto == null){
            return false;
        }
        return this.nombrePaciente.toLowerCase().contains(texto.toLowerCase());

    }

    //aqui van los setters y getters
    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public double getValorBase() {
        return valorBase;
    }

    public void setValorBase(double valorBase) {
        this.valorBase = valorBase;
    }
}

