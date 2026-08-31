package ejercicioProductoBancario;

public class CuentaAhorro extends ProductoBancario{

    private double tasaInteres;

    public CuentaAhorro(int numeroProducto, String nombreTitular, double saldo,double tasaInteres) {
        super(numeroProducto, nombreTitular, saldo);
        this.tasaInteres =tasaInteres;
    }

    @Override
    public boolean girar(double monto) {
        if (monto <= 0) {
            System.out.println("El monto a girar");
            return false;
        }


