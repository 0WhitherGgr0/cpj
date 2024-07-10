package cpj.sesion2.lab;

import java.util.ArrayList;
import java.util.List;

public class BasicLibDemo {
	private String[] opciones = {"Circulo", "Rectangulo", "Cadena(String)", "Fechas", "Lista(Nuevo elemento)", "Lista(Mostrar contenido)"};
	
	public static void main(String[] args) throws Exception {
		BasicLibDemo m = new BasicLibDemo();
		m.mostrarMenu();
		int opcion = m.leerOpcionValida();
		m.procesarOpcion(opcion);
	}

	void mostrarMenu(){
		int n=1;
		for (String opc : opciones) {
			 System.out.format("%d.- %s%n", n++, opc);
		}
	}
	int leerOpcionValida(){
		int opc;
			try {
				opc= leerOpcion();
				return opc;
			} catch (Exception e) {
				return leerOpcionValida();
			}
	}
	
	int leerOpcion() throws Exception{
		String opc = System.console().readLine("Seleccione una opcion: ");
		//System.out.print("Seleccione una opcion: ");
		//String opc = new BufferedReader(new InputStreamReader(System.in)).readLine();
		int op = Integer.parseInt(opc);
		if (esOpcionValida(op))
			return op;
		else throw new Exception("La opcion seleccionada no es valida");
		
	}
	private boolean esOpcionValida(int dia) {
		return dia >0 && dia <= opciones.length;
	}
	
	void procesarOpcion(int opcion){
		List<String> lista = new ArrayList<>();
		switch(opcion){
		case 1:
			String radioStr = System.console().readLine("Ingrese el radio: ");
			double radio = Double.parseDouble(radioStr);
			System.out.format("El area del circulo con radio %f es %f%n", radio, 3.14159*radio*radio);
			break;
		case 2:
			System.out.println("???(Por desarrollar.)");
			break;
		case 3:
			String cad1 = System.console().readLine("Ingrese un string: ");
			String cad2 = System.console().readLine("Ingrese otro string: ");
			String cad3 = System.console().readLine("Escoja un caracter especial(*#.-/): ");
			int pos = cad1.indexOf(cad2);
			if (pos >= 0) {
				System.out.format("La cadena '%s' es parte de '%s', y se encuentra en la posicion %d%n", cad2, cad1, pos);
				System.out.format("Con la subcadena('%s') eliminada seria '%s'%n", cad2, "???(Por desarrollar)");
				System.out.format("Con la subcadena('%s') remplazada por '%s' seria '%s'%n", cad2, cad3, "???");
			}else{
				System.out.format("La cadena '%s' NO es parte de '%s'", cad2, cad1);				
			}
			break;
		case 4:
			System.out.println("???(Por desarrollar.)");
			break;

		case 5:
			String cad = System.console().readLine("Ingrese elemento: ");
			lista.add(cad);
			break;
		case 6:
			System.out.println("Contenido de la lista es:");
			for (String elem : lista) {
				System.out.println(elem);
			} 
			break;

		default:
			System.exit(0);
			break;
		}
	}
}