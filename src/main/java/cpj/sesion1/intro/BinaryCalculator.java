package cpj.sesion1.intro;

import java.util.Scanner;

public class BinaryCalculator {
	private int op1;
	private int op2;
	private String operando;

	public BinaryCalculator() {
		this(0, 0, "+");
	}

	public BinaryCalculator(int op1, int op2, String operando) {
		this.op1 = op1;
		this.op2 = op2;
		this.operando = operando;
	}

	public int getOp1() {
		return op1;
	}

	public void setOp1(int op1) {
		this.op1 = op1;
	}

	public int getOp2() {
		return op2;
	}

	public void setOp2(int op2) {
		this.op2 = op2;
	}

	public String getOperando() {
		return operando;
	}

	public void setOperando(String operando) {
		this.operando = operando;
	}

	public double getResultado() {
		int resultado = 0;
		if (operando.equals("+")) {
			resultado = op1 + op2;
		} else if (operando.equals("-")) {
			resultado = op1 - op2;
		} else if (operando.equals("*")) {
			resultado = op1 * op2;
		} else if (operando.equals("/")) {
			resultado = op1 / op2;
		} else {
			throw new RuntimeException("Operador no soportado o invalido");
		}
		return resultado;
	}

	private static void demoConConstructorQueUsanArgs(Scanner scan) {
		System.out.print("Ingrese operador 1: ");
		int op1 = scan.nextInt();
		System.out.print("Ingrese operador 2: ");
		int op2 = scan.nextInt();
		System.out.print("Ingrese operando: ");
		String operando = scan.next();
		BinaryCalculator bc = new BinaryCalculator(op1, op2, operando);
		System.out.printf("%d %s %d es: %.2f%n", bc.getOp1(), bc.getOperando(), bc.getOp2(), bc.getResultado());
	}



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		demoUsandoConstructorNoArg(scan);
		scan.close();
	}

	private static void demoUsandoConstructorNoArg(Scanner scan) {
		// TODO Auto-generated method stub
		
	}
}
