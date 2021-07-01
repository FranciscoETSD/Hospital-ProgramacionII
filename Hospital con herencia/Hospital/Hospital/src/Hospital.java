import java.util.List;

public class Hospital {
    String CodHospital;
    String nombre;///
    Ciudad ciudad;
    int telefono;
    List<Servicio> servicios;
    Medico director;

    public Hospital(String codHospital, String nombre, Ciudad ciudad, int telefono, List<Servicio> servicios, Medico director) {
        CodHospital = codHospital;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.servicios = servicios;
        this.director = director;
    }

    public String getCodHospital() {
        return CodHospital;
    }

    public void setCodHospital(String codHospital) {
        CodHospital = codHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }

    public Medico getDirector() {
        return director;
    }

    public void setDirector(Medico director) {
        this.director = director;
    }
}
