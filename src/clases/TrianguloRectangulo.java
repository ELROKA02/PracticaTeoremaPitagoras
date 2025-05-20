package clases;

public class TrianguloRectangulo {

	int a;	//cateto a
	int b;	//cateto b
	double c;	//hipotenusa
	
	/**
	 * Constructor del triangulo rectangulo
	 * 
	 * @param a	Recibe e valor del cateto a
	 * @param b	Recibe el valor del cateto b
	 * @throws IllegalArgumentException	Esta excepcion controla que ninguno de los catetos sea igual a 0 o negativo
	 */
	public TrianguloRectangulo(int a, int b) throws IllegalArgumentException{
		
		if (a<=0 || b<=0) {
			throw new IllegalArgumentException("Ninguno de los catetos pueden ser negativos");
		}
		
		this.a = a;
		this.b = b;
	}
	
	/**
	 * Constructor de un triangulo rectangulo por defecto cuando no se da valores
	 */
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	
	/**
	 * Calcula y devuelve el area de un triangulo rectangulo
	 * 
	 * @return devuelve el area
	 */
	public double area() {
		double area = (a*b)/2.0;
		return area;
	}
	
	/**
	 * Calcula y devuelve la hipotenusa
	 * 
	 * @return devuelve la hipotenusa
	 */
	public double hipotenusa () {
		double hipotenusa = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		this.c = hipotenusa;
		return hipotenusa;
	}

	
	/**
	 * CAalcula el perimetro del triangulo
	 * 
	 * @return devuelve el perimetro del triangulo
	 */
	public double perimetro () {
		double perimetro = a + b + hipotenusa();
		return perimetro;
	}

	
	/********************** GETTERS Y SETTERS *************************/
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	public String toString() {
		return "El cateto a es igual a " + this.a + " ,el b es igual a "+this.b + " y la hipotenusa es igual a " + this.c;
	}
	
	
}
