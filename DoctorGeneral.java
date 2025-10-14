public class DoctorGeneral extends Medico {
    private String especializacion;
    private int capacidadPacientes;
    private double tarifaConsulta;

    // Constructor
    public DoctorGeneral(int id, String nombreCompleto, String departamento, String añosExperiencia, double sueldoBase) {
        super(id, nombreCompleto, departamento, añosExperiencia, sueldoBase);
        this.especializacion = "Medicina General";
        this.capacidadPacientes = 30; // Capacidad por día
        this.tarifaConsulta = 50.0; // Tarifa por consulta
    }

    //Metodos
     public double calcularSalario() {
        return this.sueldoBase + (this.capacidadPacientes * this.tarifaConsulta * 30); // al mes
    }

    @Override
    public void atenderPaciente() {
        // Acción de atender paciente
    }

    @Override
    public void hacerCirujia() {
    throw new UnsupportedOperationException("Un Doctor General no realiza cirugías.");
    }

    @Override
    public void registrarCitaPrenatal(){
    throw new UnsupportedOperationException("Un Doctor General no registra citas prenatales.");
    }
}
