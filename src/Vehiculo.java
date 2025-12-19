public abstract class Vehiculo {
    protected String matricula;
    protected String tipo;
    protected String FechaHora;
    protected String HoraEntrada;
    protected double tarifaBase = 2.0;

    public Vehiculo(String matricula, String fechaHora, String horaEntrada) {
        this.matricula = matricula;
        this.FechaHora = fechaHora;
        this.HoraEntrada = horaEntrada;
    }

    public String getMatricula() {
        return matricula;
    }

    public abstract double Calculatarifa(int HoraEntrada);

    @Override
    public String toString() {
        return tipo + " - Matricula: " + matricula +
                "Fecha Entrada: " + FechaHora +
                "Hora Entrada: " + HoraEntrada;
    }
}