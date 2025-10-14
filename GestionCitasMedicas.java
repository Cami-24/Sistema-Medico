import java.util.ArrayList;
import java.util.List;

public class GestionCitasMedicas {
    private List<Cita> listaCitas;

    public GestionCitasMedicas() {
        listaCitas = new ArrayList<>();
    }

    public void programarCita(Cita cita) {
        listaCitas.add(cita);
    }

    // Devuelve la representación en texto de todas las citas
    public String listarCitasTexto() {
        if (listaCitas.isEmpty()) return "No hay citas registradas.\n";
        StringBuilder sb = new StringBuilder("===== LISTA DE CITAS =====\n");
        for (Cita c : listaCitas) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }

    // Cancela una cita por id y devuelve mensaje textual
    public String cancelarCitaTexto(int idCita) {
        for (Cita c : listaCitas) {
            if (c.getIdCita() == idCita) {
                c.setEstado("CANCELADA");
                return "Cita cancelada: ID " + idCita + "\n";
            }
        }
        return "No se encontró la cita con ID " + idCita + "\n";
    }

    public List<Cita> getCitas() {
        return listaCitas;
    }

    // Método opcional de ayuda si en algún momento quieres imprimir desde Main
    public void listarCitas() {
        if (listaCitas.isEmpty()) {
            System.out.println("No hay citas registradas.");
        } else {
            for (Cita c : listaCitas) {
                System.out.println(c);
            }
        }
    }
}
