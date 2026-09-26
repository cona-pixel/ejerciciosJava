package ejercicio4GestionPolizasSeguro;

public class main {
    public static void main(String[] args) {
        System.out.println("========================================");
        System.out.println("SISTEMA DE GESTION DE POLIZAS DE SEGUROS");
        System.out.println("========================================");


        PolizaSeguro poliza1 = new SeguroSalud(
                101, "Juan Carlos Perez", 15000000,
                "01/03/2026", 12, 35, 0.80
        );
        PolizaSeguro poliza2 = new SeguroVehiculo(
                202, "Maria Lopez", 8000000,
                "15/05/2026", 12, "Toyota", 2022, 9000000
        );

        PolizaSeguro poliza3 = new SeguroVida(303, "Carlos Santana", 25000000, "10/01/2026", 24, 42, 10);
        // Guardamos las pólizas en un arreglo polimórfico:
        PolizaSeguro[] listaPolizas = {poliza1, poliza2, poliza3};

        System.out.println("\n--- 1. INFORMACIÓN, COBERTURA Y PRIMAS ---");
        for (PolizaSeguro p : listaPolizas) {
            p.mostrarInformacion();
            System.out.println("-> Tipo de cobertura: " + p.obtenerTipoCobertura());
            System.out.println("-> Prima calculada: $" + String.format("%,.0f", p.calcularPrima()).replace(',', '.'));
            System.out.println();
        }

        System.out.println("==================================================");
        System.out.println("--- 2. PRUEBA DE BÚSQUEDA DE CLIENTE ---");
        System.out.println("==================================================");

        String busqueda1 = "juan";
        System.out.println("Buscando: '" + busqueda1 + "'...");
        for (PolizaSeguro p : listaPolizas) {
            if (p.coincideConCliente(busqueda1)) {
                System.out.println("✅ Coincidencia encontrada en Póliza N° " + p.getNumeroPoliza() + " (Titular: " + p.getNombreCliente() + ")");
            }
        }
        String busqueda2 = "Maria";
        System.out.println("\nBuscando: '" + busqueda2 + "'...");
        for (PolizaSeguro p : listaPolizas) {
            if (p.coincideConCliente(busqueda2)) {
                System.out.println("✅ Coincidencia encontrada en Póliza N° " + p.getNumeroPoliza() + " (Titular: " + p.getNombreCliente() + ")");
            }
        }

        System.out.println("\n==================================================");
        System.out.println("--- 3. PRUEBA DE RENOVACIÓN DE PÓLIZAS ---");
        System.out.println("==================================================");
        for (PolizaSeguro p : listaPolizas) {

            if (p instanceof Renovable) {
                System.out.println("La póliza N° " + p.getNumeroPoliza() + " (" + p.getNombreCliente() + ") es RENOVABLE.");
                System.out.println("Vigencia antes: " + p.getMesesVigencia() + " meses.");

                ((Renovable) p).renovar(6);

                System.out.println("Vigencia después: " + p.getMesesVigencia() + " meses.\n");
            } else {
                System.out.println("La póliza N° " + p.getNumeroPoliza() + " (" + p.getNombreCliente() + ") NO admite renovación automática.\n");
            }
        }
    }
}
