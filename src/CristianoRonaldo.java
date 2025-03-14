public class CristianoRonaldo {
    // Atributos
    private String nombre;
    private int golesTotales;
    private int asistencias;
    private double velocidad;

    // Constructor vacío
    public CristianoRonaldo() {
    }

    // Constructor con parámetros
    public CristianoRonaldo(String nombre , int golesTotales , int asistencias , double velocidad) {
        this.nombre = nombre;
        this.golesTotales = golesTotales;
        this.asistencias = asistencias;
        this.velocidad = velocidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGolesTotales() {
        return golesTotales;
    }

    public void setGolesTotales(int golesTotales) {
        this.golesTotales = golesTotales;
    }

    public int getAsistencias() {
        return asistencias;
    }
    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    public double getVelocidad() {
        return velocidad;
    }
    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    // Metodo to string
    @Override
    public String toString() {
        return "CristianoRonaldo{" +
                "nombre='" + nombre + '\'' +
                ", golesTotales=" + golesTotales +
                ", asistencias=" + asistencias +
                ", velocidad=" + velocidad +
                '}';
    }
    // Métodos propios
    public boolean esLeyenda() {
        return golesTotales > 700; // Consideramos a un jugador leyenda si supera 700 goles
    }
    public double mejorarVelocidad(double porcentaje) {
        velocidad += velocidad * (porcentaje / 100);
        return velocidad;
    }
    public String resumenEstadisticas() {
        return nombre + " ha marcado " + golesTotales + " goles y realizado " + asistencias + " asistencias.";
    }
}