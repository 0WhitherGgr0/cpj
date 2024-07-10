package cpj.sesion2.mensaje;

import java.util.Random;

public class MessageGeneratorInstanceDemo {
	private static String[] mensajes = { "La vida es lo que pasa mientras.... - John Lennon",
			"No esperes a que lleguen las .... - H. Jackson Brown Jr.",
			"El éxito es la suma de pequeños .... - Robert Collier",
			"La mejor manera de predecir .... - Abraham Lincoln", "No dejes que lo que no puedes ---. - John Wooden" };

	public String getMessage() {
		Random ran = new Random();
		int index = ran.nextInt(mensajes.length);
		return mensajes[index];
	}

	public static void main(String[] args) {
		MessageGeneratorInstanceDemo demo = new MessageGeneratorInstanceDemo();
		System.out.println(demo.getMessage());
	}
}