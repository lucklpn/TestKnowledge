package br.com.luciano.main;

import java.util.Arrays;
import java.util.List;

import br.com.luciano.test.knowledge.Matrix;

public class Main {
	public static void main(String[] args) {
		/* Write some code, that will flatten an array of arbitrarily 
		 * nested arrays of integers into a flat array of integers. 
		 * e.g. [[1,2,[3]],4] -> [1,2,3,4]. 
		 * */
		Matrix matrix = new Matrix();
		
		//Fill List with recursive Array
		List<Object> childrenArray2 = Arrays.asList(3);
		List<Object> childrenArray1 = Arrays.asList(1,2,childrenArray2);
		List<Object> mainArray = Arrays.asList(childrenArray1,4);
		
		try {
			System.out.println(matrix.matrixRecursiveToArray(mainArray).toString());
		} catch (ClassCastException c) {
			System.out.println("Error in cast, avaliable only Integer in Array");
		} catch (Exception e) {
			System.out.println("Unknown error in the Matrix");
		}
	}
}