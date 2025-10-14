public class Psicologo extends Medico {
    private String tipoTerapia;
    private int sesionesMensuales;
    private double tarifaSesion;

    // Constructor
    public Psicologo(int id, String nombreCompleto, String departamento, String añosExperiencia, double sueldoBase, String tipoTerapia, int sesionesMensuales, double tarifaSesion) {
        super(id, nombreCompleto, departamento, añosExperiencia, sueldoBase);
        this.tipoTerapia = tipoTerapia;
        this.sesionesMensuales = sesionesMensuales;
        this.tarifaSesion = tarifaSesion;
    }

    // Métodos

    public double calcularSalario() {
        return this.sueldoBase + (this.sesionesMensuales * this.tarifaSesion);
    }

        @Override
    public void atenderPaciente() {
        // equivale a realizar terapia
    }

    @Override
    public void hacerCirujia() {
    throw new UnsupportedOperationException("Un Psicólogo no realiza cirugías.");
    }

    @Override
    public void registrarCitaPrenatal(){
    throw new UnsupportedOperationException("Un Psicólogo no registra citas prenatales.");
    }
}