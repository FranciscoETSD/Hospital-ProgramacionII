import java.sql.SQLOutput;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //hospital
        Hospital cochabamba = new Hospital("SAAV", "SAAVEDRA" ,"Cochabamba","75931857","CIRUGIAS A CORAZON ABIERTO","Francisco");

        //paciente
        Paciente carlos = new Paciente ("2343","SANDRO","HEREDIA","MATAMOROS","3283453","02/01/1994","76753");

        //visitas
        Visita familiares = new Visita ("23","01/07/2023 12:13","SAAVEDRA","CIRUGIA A CORAZON AVIERTO","Francisco","SOBREVIVIO","Descanso rotundo por 1 mes","64","2/7/2021","Primera vez");

        System.out.println("*****HOSPITAL:*****");

        System.out.println(cochabamba.getCodHospital());
        System.out.println(cochabamba.getNombre());
        System.out.println(cochabamba.getCiudad());
        System.out.println(cochabamba.getTelefono());
        System.out.println(cochabamba.getServicios());
        System.out.println(cochabamba.getDirector());

        System.out.println("*****PACIENTE:*****");

        System.out.println(carlos.getCodPaciente());
        System.out.println(carlos.getNombre());
        System.out.println(carlos.getPrimerApellido());
        System.out.println(carlos.getSegundoApellido());
        System.out.println(carlos.getDNI());
        System.out.println(carlos.getFechaNacimiento());
        System.out.println(carlos.getNumeroSeguridadSocial());

        System.out.println("*****VISITA:*****");

        System.out.println(familiares.getCodVisita());
        System.out.println(familiares.getFechaHora());
        System.out.println(familiares.getHospital());
        System.out.println(familiares.getServicio());
        System.out.println(familiares.getMedico());
        System.out.println(familiares.getDiagnostico());
        System.out.println(familiares.getTratamiento());
        System.out.println(familiares.getNumeroCama());
        System.out.println(familiares.getFechaSalida());
        System.out.println(familiares.getHistorial());
            }
}
