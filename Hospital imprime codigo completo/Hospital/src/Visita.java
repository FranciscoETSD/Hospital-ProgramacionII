public class Visita {
    private String codVisita;
    private String fechaHora;
    private String hospital;
    private String servicio;
    private String medico;
    private String diagnostico;
    private String tratamiento;
    private String numeroCama;
    private String fechaSalida;
    private String historial;

    public Visita(String codVisita, String fechaHora, String hospital, String servicio, String medico, String diagnostico, String tratamiento, String numeroCama, String fechaSalida, String historial) {
        this.setCodVisita(codVisita);
        this.setFechaHora(fechaHora);
        this.setHospital(hospital);
        this.setServicio(servicio);
        this.setMedico(medico);
        this.setDiagnostico(diagnostico);
        this.setTratamiento(tratamiento);
        this.setNumeroCama(numeroCama);
        this.setFechaSalida(fechaSalida);
        this.setHistorial(historial);
    }



    @Override
    public String toString() {
        return "Visita{" +
                "codVisita='" + getCodVisita() + '\'' +
                ", fechaHora=" + getFechaHora() +
                ", hospital=" + getHospital() +
                ", servicio=" + getServicio() +
                ", medico=" + getMedico() +
                ", diagnostico='" + getDiagnostico() + '\'' +
                ", tratamiento='" + getTratamiento() + '\'' +
                ", numeroCama=" + getNumeroCama() +
                ", fechaSalida=" + getFechaSalida() +
                ", historial=" + getHistorial() +
                '}';
    }

    public String getCodVisita() {
        return codVisita;
    }

    public void setCodVisita(String codVisita) {
        this.codVisita = codVisita;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getNumeroCama() {
        return numeroCama;
    }

    public void setNumeroCama(String numeroCama) {
        this.numeroCama = numeroCama;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHistorial() {
        return historial;
    }

    public void setHistorial(String historial) {
        this.historial = historial;
    }
}
