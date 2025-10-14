public abstract class Medico {
    protected int id;
    protected String nombreCompleto;
    protected String departamento;
    protected String añosExperiencia;
    protected double sueldoBase;

    //Constructor
    public Medico(int id, String nombreCompleto, String departamento, String añosExperiencia, double sueldoBase) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.departamento = departamento;
        this.añosExperiencia = añosExperiencia;
        this.sueldoBase = sueldoBase;
    }

    //Getters y Setters

    public int getId() {
        return id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAñosExperiencia() {
        return añosExperiencia;
    }
    
    public void setAñosExperiencia(String añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public abstract double calcularSalario();

    public abstract void atenderPaciente();
    public abstract void hacerCirujia();
    public abstract void registrarCitaPrenatal();

    @Override
    public String toString() {
        return "\nID: " + id + 
               "\nNombre completo: " + nombreCompleto + 
               "\nDepartamento: " + departamento + 
               "\nAños de experiencia: " + añosExperiencia + 
               "\nSueldo base: Q" + sueldoBase;
    }
}