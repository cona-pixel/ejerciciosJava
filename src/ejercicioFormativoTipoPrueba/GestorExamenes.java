package ejercicioFormativoTipoPrueba;

import java.util.ArrayList;
import java.util.List;

public class GestorExamenes {
    private List<ExamenLab> examenes;

    public GestorExamenes() {
        this.examenes = new ArrayList<>();
    }

    // Registra un examen en la colección e informa por consola
    public void registrar(ExamenLab examen) {
        if (examen == null) {
            throw new IllegalArgumentException("El examen a registrar no puede ser nulo.");
        }
        this.examenes.add(examen);
        System.out.println(examen.getCodigo() + " registrado correctamente.");
    }

    // Busca un examen por su código y lo retorna
    public ExamenLab buscarPorCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            return null;
        }
        for (ExamenLab ex : this.examenes) {
            if (ex.getCodigo().equalsIgnoreCase(codigo)) {
                return ex;
            }
        }
        return null;
    }

    // Recorre y muestra todos los exámenes usando su método toString()
    public void listar() {
        for (ExamenLab ex : this.examenes) {
            System.out.println(ex.toString());
        }
    }

    // Getter para acceder a la lista completa si se requiere
    public List<ExamenLab> getExamenes() {
        return this.examenes;
    }
}
