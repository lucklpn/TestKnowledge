package br.com.luciano.test.knowledge;

import java.util.ArrayList;
import java.util.List;

public class Matrix {
	private List<Integer> result = new ArrayList<>();
	
	public Matrix matrixRecursiveToArray(List<?> param) {
		for (Object element : param) {
			if (element instanceof List) 
				this.matrixRecursiveToArray((List<?>)element);
			else
				getInteger(element);
		}
		
		return this;
	}
	
	private void getInteger(Object param) {
		try {
			result.add((Integer)param);
		} catch (ClassCastException e) {
			throw e;
		}
	}
	
	public String toString() {
		String resultString = "[";
		for (Integer element : result)
			resultString += element.toString() + ",";
		
		//Return the String without comma
		return resultString.substring(0, resultString.length() -1) + "]";
	}
}