package ejercicio2PresentacionSalud;

public class SesionKinesiologia  extends PrestacionSalud{

    //atributos prpios de kine
    private int duracionMinutos;
    private  double valorPorMinuto;

    //los constructores
    public SesionKinesiologia(String identificador,
                              String nombrePaciente,
                              double valorBase,
                              int duracionMinutos,
                              double valorPorMinuto) {
        super(identificador, nombrePaciente, valorBase);//aqui se pasan los datos a la clase padre
        this.duracionMinutos = duracionMinutos;
        this.valorPorMinuto = valorPorMinuto;
    }

    @Override
    public double calcularValorFinal(){
        return super.getValorBase() + (this.duracionMinutos * this.valorPorMinuto);
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Duracion: " + this.duracionMinutos + " minutos");
        System.out.println("Valor por minutos: $" + String.format("%,.0f",
                this.valorPorMinuto).replace(',', '.'));
        System.out.println("Valor final: $" + String.format("%,.0f",calcularValorFinal()).replace(',','.'));

    }
    //getters and setters
    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public double getValorPorMinuto() {
        return valorPorMinuto;
    }

    public void setValorPorMinuto(double valorPorMinuto) {
        this.valorPorMinuto = valorPorMinuto;
    }
}

