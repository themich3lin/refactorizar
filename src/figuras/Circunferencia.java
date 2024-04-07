package figuras;

public class Circunferencia {
	private static final double PI = 3.1416;
	private double radio;
	private String color;

	public Circunferencia(double radio) {
		this.radio = radio;
	}

	public double getRad() {
		return radio;
	}

	public void setRad(double rad) {
		this.radio = rad;
	}

	public void imprimir() {
		color = "rojo";
		System.out.println("Diametro: " + (2 * radio));
		System.out.println("Color: " + color);
		double area1 = 2 * 3.1416 * radio * radio;
		double area = area1;
		System.out.println(area);
	}

	public boolean esIgual(boolean considerarDeciamales, Circunferencia otro) {
		double radio1 = this.radio;
		double radio2 = otro.getRad();
		if (considerarDeciamales) {
			if (radio1 == radio2)
				return true;
			else
				return false;
		} else {
			if (Math.abs(radio1 - radio2) < 1)
				return true;
			else
				return false;
		}
	}
}

