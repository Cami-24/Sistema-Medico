import java.util.Scanner;

public class Vista {
    private Scanner sc = new Scanner(System.in);

    public String mostrarTitulo(String titulo) {
        return "\n=== " + titulo + " ===\n";
    }

    public String menuPrincipalTexto() {
        return "\n=== MENÚ PRINCIPAL ===\n"
            + "1. Registrar médico\n"
            + "2. Mostrar médicos\n"
            + "3. Programar cita\n"
            + "4. Listar citas\n"
            + "5. Cancelar cita\n"
            + "6. Reagendar cita\n"
            + "7. Mostrar historial de reagendamientos\n"
            + "8. Reporte de nómina\n"
            + "0. Salir\n"
            + "Seleccione una opción: ";
    }

    public int leerOpcion() {
        int opcion = sc.nextInt();
        sc.nextLine();
        return opcion;
    }

    public String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public int leerEntero(String mensaje) {
        System.out.print(mensaje);
        int valor = sc.nextInt();
        sc.nextLine();
        return valor;
    }

    public double leerDouble(String mensaje) {
        System.out.print(mensaje);
        double valor = sc.nextDouble();
        sc.nextLine();
        return valor;
    }

    // --- NUEVOS MÉTODOS ---
    public String mensajeTipoMedico() {
        return "\nSeleccione el tipo de médico:\n"
            + "1. Doctor General\n"
            + "2. Cirujano\n"
            + "3. Obstetra\n"
            + "4. Enfermero\n"
            + "5. Psicólogo\n"
            + "Opción: ";
    }

    public String mensajeNombre() {
        return "Ingrese el nombre completo del médico: ";
    }

    public String mensajeExperiencia() {
        return "Años de experiencia (ej. 5 años, 10 años): ";
    }

    public String mensajePaciente() {
        return "Nombre del paciente: ";
    }

    public String mensajeTipoCita() {
        return "Tipo de cita (Consulta general, Cirugía, Control prenatal, Terapia psicológica...) ";
    }

    public String mensajeDiasReagendar() {
        return "¿Cuántos días desea mover la cita?: ";
    }
}
