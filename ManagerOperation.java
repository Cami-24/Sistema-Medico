import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class ManagerOperation {
    private List<Medico> listaMedicos;
    private GestionCitasMedicas gestionCitas;
    private Reagendamiento reagendamiento;

    public ManagerOperation() {
        listaMedicos = new ArrayList<>();
        gestionCitas = new GestionCitasMedicas();
        reagendamiento = new Reagendamiento();
    }

    public List<Medico> getListaMedicos() {
        return listaMedicos;
    }

    public GestionCitasMedicas getGestionCitas() {
        return gestionCitas;
    }

    public Reagendamiento getReagendamiento() {
        return reagendamiento;
    }

    public void registrarMedico(Medico medico) {
        listaMedicos.add(medico);
    }

    public Medico buscarMedicoPorId(int id) {
        for (Medico m : listaMedicos) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }

    public String obtenerListaMedicos() {
        if (listaMedicos.isEmpty()) {
            return "No hay médicos registrados.\n";
        }
        StringBuilder sb = new StringBuilder("===== LISTA DE MÉDICOS =====\n");
        for (Medico m : listaMedicos) {
            sb.append(m).append("\n");
        }
        return sb.toString();
    }

    public String listarCitasTexto() {
        return gestionCitas.listarCitasTexto();
    }

    public String cancelarCitaTexto(int id) {
        return gestionCitas.cancelarCitaTexto(id);
    }

    public String reagendarCitaTexto(int id, int dias) {
        for (Cita c : gestionCitas.getCitas()) {
            if (c.getIdCita() == id) {
                c.setFechaHora(c.getFechaHora().plusDays(dias));
                c.setEstado("REAGENDADA");
                reagendamiento.registrarCambio(c);
                return "Cita reagendada exitosamente.\n";
            }
        }
        return "No se encontró la cita.\n";
    }

    public String mostrarHistorialTexto() {
        return reagendamiento.getHistorialTexto();
    }

    public String reporteNominaTexto() {
        StringBuilder sb = new StringBuilder("===== REPORTE DE NÓMINA =====\n");
        double total = 0;
        for (Medico m : listaMedicos) {
            double salario = m.calcularSalario();
            sb.append(String.format("%s - Q%.2f\n", m.getNombreCompleto(), salario));
            total += salario;
        }
        sb.append(String.format("TOTAL: Q%.2f\n", total));
        return sb.toString();
    }
}
