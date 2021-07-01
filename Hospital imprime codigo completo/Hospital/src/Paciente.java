public class Paciente {
    private String codPaciente;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String DNI;
    private String fechaNacimiento;
    private String numeroSeguridadSocial;

    public Paciente(String codPaciente, String nombre, String primerApellido, String segundoApellido, String DNI, String fechaNacimiento, String numeroSeguridadSocial) {
        this.setCodPaciente(codPaciente);
        this.setNombre(nombre);
        this.setPrimerApellido(primerApellido);
        this.setSegundoApellido(segundoApellido);
        this.setDNI(DNI);
        this.setFechaNacimiento(fechaNacimiento);
        this.setNumeroSeguridadSocial(numeroSeguridadSocial);
    }



    @Override
    public String toString() {
        return "Paciente{" +
                "codPaciente='" + getCodPaciente() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", primerApellido='" + getPrimerApellido() + '\'' +
                ", segundoApellido='" + getSegundoApellido() + '\'' +
                ", DNI='" + getDNI() + '\'' +
                ", fechaNacimiento=" + getFechaNacimiento() +
                ", numeroSeguridadSocial='" + getNumeroSeguridadSocial() + '\'' +
                '}';
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }
}
