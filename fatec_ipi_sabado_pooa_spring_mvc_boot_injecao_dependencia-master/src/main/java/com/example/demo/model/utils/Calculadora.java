package com.example.demo.model.utils;



public class Calculadora {

	public double calculaMedia (double... notas) {
		double m = 0;
		for (double d : notas) {
			m+=d;
		}
		return m / notas.length;
	}
}
