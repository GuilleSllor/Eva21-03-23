package controller;

import model.Lavadora;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lavadora S135 = new Lavadora("samsung", 1500, 600, false);
		S135.getConsumo(4);
		S135.getCosteConsumo(5);
	}

}
