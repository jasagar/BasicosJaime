package basicosjaime;

public class BasicosJaime {

	public static void main(String[] args) {
		
		logicos();

	}
	
	public static void logicos() {

        // declaración
        boolean leon;
        boolean tigre;
        boolean oso;

        // asignación
        leon = true;
        tigre = true;
        oso = false;

        // salida
        System.out.println("*** Visualización tras uso de variables tipo boolean:");
        System.out.println("¿Es el oso un felino?");
        if (oso == leon) {
      		System.out.println("Sí, el oso es un felino.");
        }else {
      		System.out.println("No, el oso no es un felino.");
        }
        System.out.println();
        System.out.println("¿Y el león y el tigre?");
        if (tigre == leon) {
      		System.out.println("Sí, el león y el tigre son felinos.");
        }else {
      		System.out.println("No, tampoco son felinos.");
        }
    }

}
