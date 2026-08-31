package ejercicioProductoBancario;

public class CuentaCorriente extends ProductoBancario {

    //atributo de linea de credito
    private double lineaCredito;


    //aqui va la herencia de constructor de la clase padre  y la nueva de linea de credito
    public CuentaCorriente(int numeroProducto, String nombreTitular, double saldo, double lineaCredito) {
        super(numeroProducto, nombreTitular, saldo);
        this.lineaCredito =lineaCredito;
    }

    //sobreescribir el metodo de girar la logica de la linea de credito
    @Override
    public boolean girar(double monto) {
        if (super.getSaldo()>= monto){
            super.restarSaldo(monto);
            System.out.println("Giro exitoso por $" + monto + "(descontado del saldo).");
            return true;
        }else if (super.getSaldo() < monto){
            this.lineaCredito -= monto;
            System.out.println("Giro exitoso por la linea de credito $" + monto);
            return  true;
        }
        System.out.println("Saldo insuficiente");
        return false;

    }
}
