import java.time.LocalDateTime;

public class Cita {
    private int idCita;
    private String nombrePaciente;
    private Medico medicoAsignado;
    private LocalDateTime fechaHora;
    private String tipoCita;  // consulta, cirugía, etc.
    private String estado;    // PROGRAMADA, CONFIRMADA, CANCELADA, REAGENDADA

    public Cita(int idCita, String nombrePaciente, Medico medicoAsignado, LocalDateTime fechaHora, String tipoCita) {
        this.idCita = idCita;
        this.nombrePaciente = nombrePaciente;
        this.medicoAsignado = medicoAsignado;
        this.fechaHora = fechaHora;
        this.tipoCita = tipoCita;
        this.estado = "PROGRAMADA";
    }

    // Getters y Setters
    public int getIdCita() { return idCita; }
    public String getNombrePaciente() { return nombrePaciente; }
    public Medico getMedicoAsignado() { return medicoAsignado; }
    public LocalDateTime getFechaHora() { return fechaHora; }
    public String getTipoCita() { return tipoCita; }
    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }
    public void setFechaHora(LocalDateTime fechaHora) { this.fechaHora = fechaHora; }

    @Override
    public String toString() {
        return "Cita ID: " + idCita +
               " | Paciente: " + nombrePaciente +
               " | Médico: " + medicoAsignado.getNombreCompleto() +
               " | Fecha: " + fechaHora +
               " | Estado: " + estado;
    }
}
