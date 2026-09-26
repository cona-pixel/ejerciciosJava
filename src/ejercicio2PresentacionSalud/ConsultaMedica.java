package ejercicio2PresentacionSalud;

public class ConsultaMedica extends PrestacionSalud {

    private String especialidad;
    private double porcentajeAdicional;

    public ConsultaMedica(String identificador,
                          String nombrePaciente,
                          double valorBase,
                          String especialidad,
                          double porcentajeAdicional) {

        super(identificador, nombrePaciente, valorBase);
        this.especialidad = especialidad;
        this.porcentajeAdicional =porcentajeAdicional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(double porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + this.especialidad);
        System.out.println("Porcentaje adicional: " + (this.porcentajeAdicional * 100) + "%");
        System.out.println("Valor final: $" + String.format("%,.0f", calcularValorFinal()).replace(',','.'));

    }

    @Override
    public double calcularValorFinal() {
        return super.getValorBase() * (1 + this.porcentajeAdicional);
    }
}
