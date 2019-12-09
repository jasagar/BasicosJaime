package basicosjaime;

public class BasicosJaime {

	public static void main(String[] args) {
		
		numericos();
		System.out.println();
		cadenas();
		System.out.println();
	}
	
	public static void numericos() {

        // declaración
        byte bity;
        short corto;
        int entero;
        long largo;
        float flota;
        double doble;

        // asignación
        bity = 127;
        corto = 32767;
        entero = 10000000;
        largo = 1975264296;
        flota = (float) 1000.99;
        doble = 450000.125608;

        // salida
        System.out.println("*** Ejemplos valores tipos básicos numéricos:");
        System.out.println("* Tipo byte: " + bity);
        System.out.println("* Tipo short: " + corto);
        System.out.println("* Tipo entero: " + entero);
        System.out.println("* Tipo long: " + largo);
        System.out.println("* Tipo float: " + flota);
        System.out.println("* Tipo double: " + doble);
    }

	public static void cadenas() {

        // declaración
        String texto;

        // asignación
        texto = "Esta cadena de texto se ha creado con la clase String";

        // salida
        System.out.println("*** Ejemplo de cadena de texto:");
        System.out.println(texto);
    }
}
