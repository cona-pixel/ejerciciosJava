package ejercicio1ProductoBancario;

public abstract class ProductoBancario {

        //aqui se crea los constructores para inicializar los datos que nos piden de requerimiento
        private int numeroProducto;
        private String nombreTitular;
        private double saldo;

        // aqui van los constructores
        public ProductoBancario (int numeroProducto, String nombreTitular, double saldo){
        this.numeroProducto = numeroProducto;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;

    }

        //aqui los metodos mostrar resumen
        public void mostrarResumen(){
            System.out.println("---RESUMEN DE CUENTA---");
            System.out.println("numeroProducto = " + numeroProducto);
            System.out.println("Titular: " + nombreTitular);
            System.out.println("Saldo actual: $" + saldo);

        }
        public  void  depositar (double monto){
            if (monto > 0){
                this.saldo += monto;
                System.out.println("Deposito exitoso de $" + monto);
            }else{
                System.out.println("El monto a depositar debe ser mayor a 0. ");
            }
        }
        //aqui no lleva ningun calculo porque la clase padre no puede llevar un calculo para las dos clases distintas
        public abstract boolean girar (double monto);


        //aqui se aplican los getter y setters
        public int getNumeroProducto() {
            return numeroProducto;
        }

        public void setNumeroProducto(int numeroProducto) {
            this.numeroProducto = numeroProducto;
        }

        public String getNombreTitular() {
            return nombreTitular;
        }

        public void setNombreTitular(String nombreTitular) {
            this.nombreTitular = nombreTitular;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }
        public void restarSaldo(double montoAretirar) {
            this.saldo -= montoAretirar;
        }

    }



