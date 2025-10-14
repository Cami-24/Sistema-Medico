import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Reagendamiento {
    private List<String> historialCambios;

    public Reagendamiento() {
        historialCambios = new ArrayList<>();
    }

    // Reagenda y registra el cambio
    public void reagendarCita(Cita cita, LocalDateTime nuevaFecha) {
        LocalDateTime fechaAntigua = cita.getFechaHora();
        cita.setFechaHora(nuevaFecha);
        cita.setEstado("REAGENDADA");
        String registro = "Cita " + cita.getIdCita() + " reagendada de " + fechaAntigua + " a " + nuevaFecha;
        historialCambios.add(registro);
    }

    // Registra el cambio cuando ManagerOperation lo llama directamente
    public void registrarCambio(Cita cita) {
        String registro = "Cita " + cita.getIdCita() + " reagendada a " + cita.getFechaHora();
        historialCambios.add(registro);
    }

    // Devuelve historial en texto (ManagerOperation lo muestra)
    public String getHistorialTexto() {
        if (historialCambios.isEmpty()) return "No hay cambios registrados.\n";
        StringBuilder sb = new StringBuilder("===== Historial de Reagendamientos =====\n");
        for (String s : historialCambios) {
            sb.append(s).append("\n");
        }
        return sb.toString();
    }

    // Método auxiliar para Main si quisieras imprimir directamente
    public void mostrarHistorial() {
        System.out.println(getHistorialTexto());
    }
}
