package basicosjaime;

public class BasicosJaime {

	public static void main(String[] args) {
		
		numericos();
		System.out.println();
		cadenas();
		System.out.println();
		logicos();
	}
	
	public static void numericos() {

        // declaraci�n
        byte bity;
        short corto;
        int entero;
        long largo;
        float flota;
        double doble;

        // asignaci�n
        bity = 127;
        corto = 32767;
        entero = 10000000;
        largo = 1975264296;
        flota = (float) 1000.99;
        doble = 450000.125608;

        // salida
        System.out.println("*** Ejemplos valores tipos b�sicos num�ricos:");
        System.out.println("* Tipo byte: " + bity);
        System.out.println("* Tipo short: " + corto);
        System.out.println("* Tipo entero: " + entero);
        System.out.println("* Tipo long: " + largo);
        System.out.println("* Tipo float: " + flota);
        System.out.println("* Tipo double: " + doble);
    }

	public static void cadenas() {

        // declaraci�n
        String texto;

        // asignaci�n
        texto = "Esta cadena de texto se ha creado con la clase String";

        // salida
        System.out.println("*** Ejemplo de cadena de texto:");
        System.out.println(texto);
    }
	
	public static void logicos() {

        // declaraci�n
        boolean leon;
        boolean tigre;
        boolean oso;

        // asignaci�n
        leon = true;
        tigre = true;
        oso = false;

        // salida
        System.out.println("*** Visualizaci�n tras uso de variables tipo boolean:");
        System.out.println("�Es el oso un felino?");
        if (oso == leon) {
      		System.out.println("S�, el oso es un felino.");
        }else {
      		System.out.println("No, el oso no es un felino.");
        }
        System.out.println();
        System.out.println("�Y el le�n y el tigre?");
        if (tigre == leon) {
      		System.out.println("S�, el le�n y el tigre son felinos.");
        }else {
      		System.out.println("No, tampoco son felinos.");
        }
    }
}
