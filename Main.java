import java.time.LocalDateTime;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Vista vista = new Vista();
        ManagerOperation manager = new ManagerOperation();
        boolean continuar = true;

        System.out.print(vista.mostrarTitulo("Sistema de Gestión Hospitalaria"));

        while (continuar) {
            System.out.print(vista.menuPrincipalTexto());
            int opcion = vista.leerOpcion();

            if (opcion == 1) {
                System.out.print(vista.mensajeTipoMedico());
                int tipo = vista.leerEntero("");
                String nombre = vista.leerTexto(vista.mensajeNombre());
                String experiencia = vista.leerTexto(vista.mensajeExperiencia());

                Medico nuevo = null;

                if (tipo == 1) {
                    nuevo = new DoctorGeneral(
                        manager.getListaMedicos().size() + 1,
                        nombre,
                        "Medicina General",
                        experiencia,
                        8500
                    );
                } else if (tipo == 2) {
                    nuevo = new Cirujano(
                        manager.getListaMedicos().size() + 1,
                        nombre,
                        "Cirugía General",
                        experiencia,
                        15000,
                        "Cirugía del aparato digestivo",
                        3,
                        350,
                        800
                    );
                } else if (tipo == 3) {
                    nuevo = new Obstetra(
                        manager.getListaMedicos().size() + 1,
                        nombre,
                        "Obstetricia",
                        experiencia,
                        20000,
                        10,
                        5,
                        400
                    );
                } else if (tipo == 4) {
                    nuevo = new Enfermero(
                        manager.getListaMedicos().size() + 1,
                        nombre,
                        "Enfermería",
                        experiencia,
                        6500,
                        "Noche",
                        "Licenciatura en Enfermería",
                        75,
                        500
                    );
                } else if (tipo == 5) {
                    nuevo = new Psicologo(
                        manager.getListaMedicos().size() + 1,
                        nombre,
                        "Psicología Clínica",
                        experiencia,
                        9000,
                        "Cognitivo-Conductual",
                        120,
                        300
                    );
                }

                if (nuevo != null) {
                    manager.registrarMedico(nuevo);
                    System.out.println(" Médico registrado correctamente.");
                } else {
                    System.out.println(" Tipo de médico no válido.");
                }

            } else if (opcion == 2) {
                System.out.println(manager.obtenerListaMedicos());

            } else if (opcion == 3) {
                int idMedico = vista.leerEntero("Ingrese ID del médico (ver lista de médicos): ");
                String paciente = vista.leerTexto(vista.mensajePaciente());
                String tipoCita = vista.leerTexto(vista.mensajeTipoCita());

                Medico medico = manager.buscarMedicoPorId(idMedico);
                if (medico != null) {
                    int idCita = manager.getGestionCitas().getCitas().size() + 100;
                    Cita cita = new Cita(idCita, paciente, medico, LocalDateTime.now().plusDays(1), tipoCita);
                    manager.getGestionCitas().programarCita(cita);
                    System.out.println(" Cita programada con éxito. ID de la cita: " + idCita);
                } else {
                    System.out.println(" Médico no encontrado.");
                }

            } else if (opcion == 4) {
                System.out.println(manager.listarCitasTexto());

            } else if (opcion == 5) {
                System.out.println(manager.listarCitasTexto()); // mostrar antes de cancelar
                int idCancelar = vista.leerEntero("Ingrese ID de la cita a cancelar: ");
                System.out.println(manager.cancelarCitaTexto(idCancelar));

            } else if (opcion == 6) {
                System.out.println(manager.listarCitasTexto());
                int idReagendar = vista.leerEntero("Ingrese ID de la cita a reagendar: ");
                int dias = vista.leerEntero(vista.mensajeDiasReagendar());
                System.out.println(manager.reagendarCitaTexto(idReagendar, dias));

            } else if (opcion == 7) {
                System.out.println(manager.mostrarHistorialTexto());

            } else if (opcion == 8) {
                System.out.println(manager.reporteNominaTexto());

            } else if (opcion == 0) {
                System.out.println(" Saliendo del sistema...");
                continuar = false;

            } else {
                System.out.println(" Opción no válida.");
            }
        }
    }
}
