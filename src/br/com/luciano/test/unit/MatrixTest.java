package br.com.luciano.test.unit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.luciano.test.knowledge.Matrix;

public class MatrixTest {

	@Test
	public void testWith4Number() {
		//Main test
		Matrix matrix = new Matrix();
		String expected = "[1,2,3,4]";
		
		List<Object> childrenArray2 = Arrays.asList(3);
		List<Object> childrenArray1 = Arrays.asList(1,2,childrenArray2);
		List<Object> mainArray = Arrays.asList(childrenArray1,4);
		String current = matrix.matrixRecursiveToArray(mainArray).toString();
		assertEquals(expected, current);
	}

	@Test
	public void testWith10Number() {
		//Addicional test
		Matrix matrix = new Matrix();
		String expected = "[1,2,3,4,5,6,7,8,9,10]";
		
		List<Object> childrenArray3 = Arrays.asList(7,8,9);
		List<Object> childrenArray2 = Arrays.asList(4,5,6,childrenArray3);
		List<Object> childrenArray1 = Arrays.asList(1,2,3,childrenArray2);
		List<Object> mainArray = Arrays.asList(childrenArray1,10);
		String current = matrix.matrixRecursiveToArray(mainArray).toString();
		
		assertEquals(expected, current);
	}
	
	@Test(expected=ClassCastException.class)
	public void testWithFail() {
		//Test with fail
		Matrix matrix = new Matrix();
		
		List<Object> childrenArray2 = Arrays.asList(3,5.5); // Error cast 5.5
		List<Object> childrenArray1 = Arrays.asList(1,2,childrenArray2);
		List<Object> mainArray = Arrays.asList(childrenArray1,4);
		matrix.matrixRecursiveToArray(mainArray);
	}
}