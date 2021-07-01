import java.util.Date;
import java.util.List;

public class Medico extends Persona{
    private String codMedico;
    private List<Servicio> servicios;
    private Hospital hospital;

    public Medico(String nombre, String primerApellido, String segundoApellido, String DNI, Date fechaNacimiento, String codMedico, List<Servicio> servicios,Hospital hospital) {
        super(nombre, primerApellido, segundoApellido, DNI, fechaNacimiento);
        this.setCodMedico(codMedico);
        this.setServicios(servicios);
        this.setHospital(hospital);
    }

    public String getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(String codMedico) {
        this.codMedico = codMedico;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
