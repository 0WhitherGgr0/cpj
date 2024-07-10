package cpj.sesion2.lab;


public class MensajePorDia {
	private String[] nombreDia = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
	private String[] mensajeDia = {"ED", "PPP", "CPJ", "...", "CJP", "...", "..."};
	
	public static void main(String[] args) throws Exception {
		MensajePorDia m = new MensajePorDia();
		m.mostrarMenu();
		int dia = m.leerDia();
		m.mostrarMensaje(dia);
	}

	void mostrarMenu(){
		for (String dia : nombreDia) {
			 System.out.println(dia);
		}
	}
	int leerDiaValido(){
		int dia;
			try {
				dia = leerDia();
				return dia;
			} catch (Exception e) {
				return leerDiaValido();
			}
	}
	
	int leerDia() throws Exception{
		String diaOpt = System.console().readLine("Seleccione un dia: ");
		//System.out.print("Seleccione un dia: ");
		//String diaOpt = new BufferedReader(new InputStreamReader(System.in)).readLine();
		int dia = Integer.parseInt(diaOpt);		
		if (diaValido(dia))
			return dia;
		else throw new Exception("El dia seleccionado no es valido");
		
	}
	private boolean diaValido(int dia) {
		return dia >0 && dia <= nombreDia.length;
	}
	
	void mostrarMensaje(int dia){
		System.out.format("El dia seleccionado es %d, %s%n", dia, nombreDia[dia-1]);
	}
	
}