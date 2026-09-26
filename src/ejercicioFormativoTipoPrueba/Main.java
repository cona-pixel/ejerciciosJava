package ejercicioFormativoTipoPrueba;

public class Main {
    public static void main(String[] args) {
        // 1. Instanciar los exámenes según la tabla de datos
        Hemograma he1 = new Hemograma("LAB-HE01", "Ana Pérez", 15000, 8, false, true);
        Hemograma he2 = new Hemograma("LAB-HE02", "Carlos Soto", 15000, 12, true, false);

        PerfilBioquimico pb1 = new PerfilBioquimico("LAB-PB01", "María González", 25000, 14, true, true);
        PerfilBioquimico pb2 = new PerfilBioquimico("LAB-PB02", "Pedro Muñoz", 25000, 8, false, false);

        // 2. Registrar el ayuno para LAB-PB01 usando la interfaz AyunoVerificable
        pb1.registrarAyuno();

        // 3. Registrar los exámenes en el gestor
        GestorExamenes gestor = new GestorExamenes();
        gestor.registrar(he1);
        gestor.registrar(he2);
        gestor.registrar(pb1);
        gestor.registrar(pb2);

        System.out.println();

        // 4. Buscar un examen por código ("LAB-HE01") y mostrar su información
        System.out.println("=== BUSQUEDA POR CODIGO: \"LAB-HE01\" ===");
        ExamenLab examenBuscado = gestor.buscarPorCodigo("LAB-HE01");
        if (examenBuscado != null) {
            String tipo = (examenBuscado instanceof Hemograma) ? "Hemograma" : "Perfil Bioquímico";
            System.out.println("Tipo: " + tipo);
            System.out.println("Código: " + examenBuscado.getCodigo());
            System.out.println("Paciente: " + examenBuscado.getNombrePaciente());
            System.out.println("Valor final: $" + examenBuscado.calcularValor());
        }

        System.out.println();

        // 5. Calcular los valores demostrando Polimorfismo con referencias de tipo ExamenLab
        System.out.println("=== VALORES DE LOS EXAMENES ===");
        for (ExamenLab examen : gestor.getExamenes()) {
            System.out.println("Código: " + examen.getCodigo());
            System.out.println("Paciente: " + examen.getNombrePaciente());
            System.out.println("Valor final: $" + examen.calcularValor());
            System.out.println();
        }

        // 6. Listar todos los exámenes mediante su método toString()
        System.out.println("=== LISTADO DE EXAMENES ===");
        gestor.listar();
    }
}
