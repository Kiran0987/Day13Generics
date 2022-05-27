package com.bridge.generics;

public class PrintArray {
	public static <T> void toPrint(T[] inputArray) {
		for (T element: inputArray) {
			System.out.printf("%s ", element); 
		}
		System.out.println();
	}
	public static void main (String[] args) {
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = { 1.1,4.5,3.3,6.7};
		Character[] charArray = {'H','E','L','O','O'};
		PrintArray.toPrint(intArray);
		PrintArray.toPrint(doubleArray);
		PrintArray.toPrint(charArray);
	}
}