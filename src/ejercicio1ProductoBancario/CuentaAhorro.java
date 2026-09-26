package ejercicio1ProductoBancario;

public class CuentaAhorro extends ProductoBancario {

    private double tasaInteres;

    public CuentaAhorro(int numeroProducto, String nombreTitular, double saldo, double tasaInteres) {
        super(numeroProducto, nombreTitular, saldo);
        this.tasaInteres = tasaInteres;
    }

    //metodo para girar completo es (sin linea de credito)
    @Override
    public boolean girar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a girar");
            return false;
        }

        if (super.getSaldo() >= monto){
            super.setSaldo(super.getSaldo() - monto);
            System.out.println("Giro exitoso en Cuenta de Ahorro por $" + monto);
            return true;
        }else {
            System.out.println("Giro rechazado: El saldo insuficiente en Cuenta de Ahorro.");
            return false;
        }
    }

    //metodo aplicarInteres (Requerimeinto de la guia)
    public void aplicarInteres(){
        double interes = super.getSaldo() * this.tasaInteres;
        super.setSaldo(super.getSaldo() + interes);
        System.out.println("Interes aplicado con exito: $" + interes);
    }

    // getters y setters de tasainteres
    public double getTasaInteres(){
        return tasaInteres;
    }
    public void setTasaInteres(double tasaInteres){
        this.tasaInteres = tasaInteres;;
    }
}
