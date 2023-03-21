package model;

public class Lavadora extends Electrodomestico {

	private int precio;
	private boolean aguacaliente;
	//constructor con marca y potencia
	
	public Lavadora(String marca, int potencia) {
		super(marca, potencia);
	}
	//constructor completo marca portencia precio , modo de funcionamiento
	
	public Lavadora( String marca, int potencia, int precio, boolean aguacaliente) {
		super(marca, potencia);
		this.precio = precio;
		this.aguacaliente = false;
	}

	//getters and setters
	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isAguacaliente() {
		return aguacaliente;
	}

	public void setAguacaliente(boolean aguacaliente) {
		this.aguacaliente = aguacaliente;
	}

	//toString
	
	@Override
	public String toString() {
		return "Lavadora [precio=" + precio + ", aguacaliente=" + aguacaliente + ", getTipo()=" + getTipo()
				+ ", getMarca()=" + getMarca() + ", getPotencia()=" + getPotencia() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
