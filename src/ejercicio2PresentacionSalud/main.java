package ejercicio2PresentacionSalud;

public class main {
    public static void main(String[] args) {
        System.out.println("==============================");
        System.out.println("SISTEMA DE PRESTACIONES DE SALUD (POLIFORMISMO)");
        System.out.println("==============================");

        //creamos las 3 prestaciones usando la referencia padre Prestacionsalud
        PrestacionSalud prestacion1 = new ConsultaMedica(
                "cm-101",
                "Constanza CASTRO",
                30000,
                "caridolodia",
                0.15);
        PrestacionSalud prestacion2 = new ExamenLaboratorio(
                "EX-202",
                "Juan Perez",
                20000,
                "Perfil Lipídico",
                true);
        PrestacionSalud prestacion3 = new SesionKinesiologia(
                "Kn-303",
                "Maria Lopez",
                25000,
                45,
                500);

        // guardamos las 3 en un arreglo para recorrerlas mas facilmente
        PrestacionSalud[] listaPrestaciones = {prestacion1,prestacion2,prestacion3};

        //Mostramos los datos y ejecutamos calcularValorFinal() de cada una:
        for (PrestacionSalud p : listaPrestaciones) {
            p.mostrarInformacion();
            System.out.println();
        }

        // 3. Probar el método coincideConPaciente:
        System.out.println("==================================================");
        System.out.println("PRUEBA DE BÚSQUEDA DE PACIENTE");
        System.out.println("==================================================");
        String busqueda = "perez";

        System.out.println("Buscando paciente: '" + busqueda + "'...");
        for (PrestacionSalud p : listaPrestaciones) {
            if (p.coincideConPaciente(busqueda)) {
                System.out.println("-> Coincidencia encontrada en ID: " + p.getIdentificador() + " (" + p.getNombrePaciente() + ")");
            }
        }
    }
}
