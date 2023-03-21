package model;

public class Electrodomestico {
	//Variables
	
private String tipo;
private String marca;
private int potencia;

	//Constructor

public Electrodomestico(String tipo, String marca, int potencia) {
	
	this.tipo = tipo;
	this.marca = marca;
	this.potencia = potencia;
}
//Getter and Setter

public Electrodomestico(String marca, int potencia) {
	this.marca = marca;
	this.potencia = potencia;
	// TODO Auto-generated constructor stub
}

public String getTipo() {
	return tipo;
}
public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public int getPotencia() {
	return potencia;
}
public void setPotencia(int potencia) {
	potencia = potencia;
}
//toString

@Override
public String toString() {
	return "Electrodomestico [tipo=" + tipo + ", marca=" + marca + ", Potencia=" + potencia + "]";
}
//Metodos Electrodomestico


public void getConsumo(int horas) {
	int ghoras=horas;
	int gpotencia=this.potencia;
	int resul;
	resul=horas*potencia;
	System.out.println("el consumo ha sido en watios a sido " + resul + "w");
	
}
public void getCosteConsumo(int horas) {
	double costeHora=0.132;
	int gpotencia=this.potencia;
	int ghoras=horas;
	double resul=((gpotencia*horas)*0.132)/1000;
	System.out.println("el coste total ha sido " + "potencia " +getPotencia()+ "w x horas "+horas+" x tarifa "+ costeHora+ " entre 1000 = "+  resul + " euros ");
}

}
