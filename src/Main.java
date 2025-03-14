public class Main {
    public static void main(String[] args) {
        CristianoRonaldo cr7 = new CristianoRonaldo("Cristiano Ronaldo", 927, 255, 34.60);
        System.out.println(cr7.toString());
        System.out.println("¿Es leyenda?: " + cr7.esLeyenda());
        cr7.mejorarVelocidad(5);
        System.out.println("Nueva velocidad: " + cr7.getVelocidad());
        System.out.println(cr7.resumenEstadisticas());
    }
}