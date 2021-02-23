package javaArrayStructure;

import java.lang.Math;

public class DataStructureHomework {

	public static void main(String[] args) {
		
		int[] arrayToSum = {1,23,4,5,7};
		int sumOfArray = sumTheArray(arrayToSum);
		System.out.println(sumOfArray);
		int size = 4; 
		int power = 2;
		double result = toPower(size, power);
		System.out.println(result);
	}
	//First Question
	public static int sumTheArray(int [] myArray) {
		int answer = 0;
		for(int i =0;i<myArray.length;i++) {
			answer = answer + myArray[i];
		}
	return answer;
	}
	//Second Question
	//Prints 2 which is the index of the biggest number
			    	
				    	
	//Question three		        

		
	public static double toPower(double number1, double number2) {
		double answer = Math.pow(number1, number2);
		return answer;
	}
				     
}

