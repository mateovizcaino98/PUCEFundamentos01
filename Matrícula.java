import static java.lang.IO.*;

void main() {
    println("""
        ===========================================
        |   SISTEMA DE MATRÍCULA - PUCE TEC       |
        |      Carrera de Desarrollo de Software  |
        ===========================================
        """);

    String nombreEstudiante = "";
    String materiaPrerequisito = "Fundamentos de Programación";
    double nota = 0.0;
    
    nombreEstudiante = readln("Ingrese el nombre del estudiante: ");
    String reingreso = readln("¿Es estudiante de reingreso o arrastre? (S/N): ");

    String[] historial_materias = null; 

    if (reingreso.equalsIgnoreCase("S")) {
        historial_materias = new String[]{ materiaPrerequisito };
        String inputNota = readln("Ingrese la nota final obtenida en '" + materiaPrerequisito + "' (0-10): ");
        nota = Double.parseDouble(inputNota);
    } else {
        historial_materias = new String[]{""};    	
        println("-> Registrando como estudiante de Primer Semestre...");
    }

    println("\n--- MATERIA A SOLICITAR ---");
    println("Materia destino: [ Estructuras de Datos ] (Requisito: Haber aprobado Fundamentos con >= 7.0)");
    String reqCupo = readln("¿Desea solicitar el cupo para esta materia? (S/N): ");

    if (reqCupo.equalsIgnoreCase("S")) {
        boolean cumple_requisito = false;

        for (int i = 0; i < historial_materias.length; i++) {
            if (historial_materias[i].equals(materiaPrerequisito)) {
                cumple_requisito = true;
            }
        }

        String resultadoMatricula = switch (String.valueOf(cumple_requisito)) {
            case "true" -> {
                if (nota >= 7.0) {
                    yield "MATRÍCULA APROBADA: Cumple con el prerrequisito.";
                } else {
                    yield "MATRÍCULA RECHAZADA: Reprobó el prerrequisito con " + nota;
                }
            }
            case "false" -> "MATRÍCULA RECHAZADA: No cuenta con el prerrequisito en su historial.";
            default -> "Error del sistema.";
        };

        println("\n[RESULTADO]: " + resultadoMatricula);

    } else {
        println("\nProceso finalizado. No se solicitaron materias de segundo nivel.");
    }
}
