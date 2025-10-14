public class Cirujano extends Medico{
    private String tipoOperacion;
    private int horasCirujia;
    private double tarifaHora;
    private double bonoRiesgo;

    //Constructor
    public Cirujano(int id, String nombreCompleto, String departamento, String añosExperiencia, double sueldoBase, String tipoOperacion, int horasCirujia, double tarifaHora, double bonoRiesgo) {
        super(id, nombreCompleto, departamento, añosExperiencia, sueldoBase);
        this.tipoOperacion = tipoOperacion;
        this.horasCirujia = horasCirujia;
        this.tarifaHora = tarifaHora;
        this.bonoRiesgo = bonoRiesgo;
    }

    //Metodos
    public double calcularSalario() {
        return this.sueldoBase + (this.horasCirujia * this.tarifaHora) + this.bonoRiesgo;
    }

    @Override
    public void atenderPaciente() {
        // Acción de atender paciente
    }

    @Override
    public void hacerCirujia() {
        // Acción de hacer cirugía
    }

    @Override
    public void registrarCitaPrenatal(){
    throw new UnsupportedOperationException("Un Doctor General no registra citas prenatales.");
    }
}