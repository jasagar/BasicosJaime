package basicosjaime;

public class BasicosJaime {

	public static void main(String[] args) {
		
		logicos();

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
