import java.util.List;

public class Servicio {
    private String idServicio;
    private String nombre;
    private List<Hospital> hospitales;
    private int numeroCamas;
    private String comentario;

    public Servicio(String idServicio, String nombre, List<Hospital> hospitales, int numeroCamas, String comentario) {
        this.setIdServicio(idServicio);
        this.setNombre(nombre);
        this.setHospitales(hospitales);
        this.setNumeroCamas(numeroCamas);
        this.setComentario(comentario);
    }



    @Override
    public String toString() {
        return "Servicio{" +
                "comentario='" + getComentario() + '\'' +
                '}';
    }

    public String getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(String idServicio) {
        this.idServicio = idServicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Hospital> getHospitales() {
        return hospitales;
    }

    public void setHospitales(List<Hospital> hospitales) {
        this.hospitales = hospitales;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
