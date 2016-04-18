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
				setResult(element);
		}
		
		return this;
	}
	
	private void setResult(Object param) {
		try {
			result.add((Integer)param);
		} catch (ClassCastException e) {
			throw e;
		}
	}
	
	@Override
	public String toString() {
		String resultString = "[";
		for (Integer element : result)
			resultString += element.toString() + ",";
		
		//Return the String without comma
		return resultString.substring(0, resultString.length() -1) + "]";
	}
}