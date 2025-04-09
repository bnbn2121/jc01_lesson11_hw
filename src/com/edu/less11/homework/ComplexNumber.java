package com.edu.less11.homework;

public class ComplexNumber {
	double realPart;
	double imaginaryPart;

	public ComplexNumber(double realPart, double imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	@Override
	public String toString() {
		if (imaginaryPart < 0) {
			return String.format("%.1f - %.1fi", realPart, -imaginaryPart);
		} else {
			return String.format("%.1f + %.1fi", realPart, imaginaryPart);
		}
	}

}
