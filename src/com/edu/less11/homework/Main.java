package com.edu.less11.homework;
/*
 * Программа для сложения двух комплексных чисел
 */
public class Main {

	public static void main(String[] args) {
		ComplexNumber num1 = new ComplexNumber(4.2, -4.1);
		ComplexNumber num2 = new ComplexNumber(-11.2, 1.5);
		ComplexNumber num3 = add(num1, num2);
		printAddResult(num1, num2, num3);
	}

	public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
		double sumRealPart = num1.realPart + num2.realPart;
		double sumImaginaryPart = num1.imaginaryPart + num2.imaginaryPart;
		return new ComplexNumber(sumRealPart, sumImaginaryPart);
	}
	
	public static void printAddResult(ComplexNumber member1, ComplexNumber member2, ComplexNumber addResult) {
		System.out.printf("(%s) + (%s) = (%s)", member1, member2, addResult);
	}
}
