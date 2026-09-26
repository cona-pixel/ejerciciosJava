package ejercicio1ProductoBancario;

public class Main {
    public static void main(String[] args) {

        System.out.println("==================================================");
        System.out.println("1.CREACION DE CUENTAS CON POLIMORFISMO");
        System.out.println("==================================================");

        ProductoBancario producto1= new CuentaCorriente(101,"Juan Perez",50000,100000);
        ProductoBancario producto2= new CuentaAhorro(202,"Maria Lopez",200000, 0.05);

        System.out.println(" =====Resumen inicial de cuentas===== ");
        producto1.mostrarResumen();
        System.out.println();
        producto2.mostrarResumen();

        System.out.println("==================================================");
        System.out.println("2. REALIZAR DEPOSITOS");
        System.out.println("==================================================");
        producto1.depositar(20000); // Saldo de CuentaCorriente sube a 70.000
        producto2.depositar(50000); // Saldo de CuentaAhorro sube a 250.000

        System.out.println("==================================================");
        System.out.println("3. PROBAR GIROS VALIDOS E INVALIDOS");
        System.out.println("==================================================");

        System.out.println("-> Pruebas en Cuenta de Ahorro:");
        producto2.girar(50000);  // Giro válido (tiene 250.000)
        producto2.girar(900000); // Giro inválido (no tiene línea de crédito)
        System.out.println("-> Pruebas en Cuenta Corriente:");
        producto1.girar(120000); // Giro válido (usa 70.000 de saldo + 50.000 de línea de crédito)
        producto1.girar(500000); // Giro inválido (supera saldo y línea de crédito)
        System.out.println("==================================================");
        System.out.println("4. APLICAR INTERESES A LA CUENTA DE AHORRO");
        System.out.println("==================================================");

        // Usamos casteo para llamar a aplicarInteres() desde la referencia polimórfica:
        if (producto2 instanceof CuentaAhorro) {
            ((CuentaAhorro) producto2).aplicarInteres();
        }
        System.out.println("==================================================");
        System.out.println("5. RESUMEN FINAL");
        System.out.println("==================================================");
        System.out.println("Estado final Cuenta Corriente:");
        producto1.mostrarResumen();
        System.out.println("Estado final Cuenta de Ahorro:");
        producto2.mostrarResumen();


    }
}



