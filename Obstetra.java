public class Obstetra extends Medico{
    private int numeroPartosRealizados;
    private int numeroCitasPrenatales;
    private double tarifaHora;;


    // Constructor
    public Obstetra(int id, String nombreCompleto, String departamento, String añosExperiencia, double sueldoBase, int numeroPartosRealizados, int numeroCitasPrenatales, double tarifaHora) {
        super(id, nombreCompleto, departamento, añosExperiencia, sueldoBase);
        this.numeroPartosRealizados = numeroPartosRealizados;
        this.numeroCitasPrenatales = numeroCitasPrenatales;
        this.tarifaHora = tarifaHora;
    }

    //Metodos

    public double calcularSalario() {
        return this.sueldoBase + ((this.numeroPartosRealizados+this.numeroCitasPrenatales) * this.tarifaHora);
    }

        @Override
    public void atenderPaciente() {
        // equivale a hacer consulta
    }

    @Override
    public void hacerCirujia() {
        // equivale a hacer parto
    }

    @Override
    public void registrarCitaPrenatal(){
        //
    }
}