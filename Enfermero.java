public class Enfermero extends Medico{
    private String turno; // "Día" o "Noche"
    private String nivelCertificacion;
    private double tarifaHora;
    private double bonificacionNocturna;

    //Constructor
    public Enfermero(int id, String nombreCompleto, String departamento, String añosExperiencia, double sueldoBase, String turno, String nivelCertificacion, double tarifaHora, double bonificacionNocturna) {
        super(id, nombreCompleto, departamento, añosExperiencia, sueldoBase);
        this.turno = turno;
        this.nivelCertificacion = nivelCertificacion;
        this.tarifaHora = tarifaHora;
        this.bonificacionNocturna = bonificacionNocturna;
    }

    //Metodos
    public double calcularSalario() {
        double salario = this.sueldoBase + (160 * this.tarifaHora); // Suponiendo 160 horas al mes
        if ("Noche".equalsIgnoreCase(this.turno)) {
            salario += this.bonificacionNocturna;
        }
        return salario;
    }

    
    @Override
    public void atenderPaciente() {
        // Acción de atender paciente
    }

    @Override
    public void hacerCirujia() {
    throw new UnsupportedOperationException("Un Enfermero no realiza cirugías.");
    }

    @Override
    public void registrarCitaPrenatal(){
    throw new UnsupportedOperationException("Un Enfermero no registra citas prenatales.");
    }
}