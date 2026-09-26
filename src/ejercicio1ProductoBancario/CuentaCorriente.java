package ejercicio1ProductoBancario;

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

        if (super.getSaldo() >= monto){
            super.setSaldo(super.getSaldo() - monto);
            System.out.println("Giro exitoso por $" + monto + "(descontado del saldo).");
            return true;
            // El saldo no alcanza solo, pero saldo + linea de credito si cubren el monto
        }else if ((super.getSaldo() + this.lineaCredito) >= monto){
            double faltante = monto - super.getSaldo();
            super.setSaldo(0);
            this.lineaCredito -= faltante;
            // calculamos lo que falta pagar
            // agotam
            // descontamos la linea de credito solo lo que falta
            System.out.println("Giro exitoso por $ " + monto + "(usando saldo y $" + faltante + "de linea de credito.)");
            return  true;
        }else {
            System.out.println("Saldo insuficiente: No alcanza el saldo ni la linea de credito para girar $" + monto);
            return false;
        }
    }
}

