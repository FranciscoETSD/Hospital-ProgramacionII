import java.util.Date;

public class Visita {
    String codVista;
    Date fechaHora;
    Servicio servicio;
    Medico medico;
    String diagnostico;
    String tratamientos;
    int numeroCama;
    Date fechaSalida;
    Historial historial;

    public Visita(String codVista, Date fechaHora, Servicio servicio, Medico medico, String diagnostico, String tratamientos, int numeroCama, Date fechaSalida, Historial historial) {
        this.codVista = codVista;
        this.fechaHora = fechaHora;
        this.servicio = servicio;
        this.medico = medico;
        this.diagnostico = diagnostico;
        this.tratamientos = tratamientos;
        this.numeroCama = numeroCama;
        this.fechaSalida = fechaSalida;
        this.historial = historial;
    }

    public String getCodVista() {
        return codVista;
    }

    public void setCodVista(String codVista) {
        this.codVista = codVista;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamientos() {
        return tratamientos;
    }

    public void setTratamientos(String tratamientos) {
        this.tratamientos = tratamientos;
    }

    public int getNumeroCama() {
        return numeroCama;
    }

    public void setNumeroCama(int numeroCama) {
        this.numeroCama = numeroCama;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Historial getHistorial() {
        return historial;
    }

    public void setHistorial(Historial historial) {
        this.historial = historial;
    }
}
