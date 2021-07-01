public class Historial {
    String codHistorial;
    Paciente paciente;

    public Historial(String codHistorial, Paciente paciente) {
        this.codHistorial = codHistorial;
        this.paciente = paciente;
    }

    public String getCodHistorial() {
        return codHistorial;
    }

    public void setCodHistorial(String codHistorial) {
        this.codHistorial = codHistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
