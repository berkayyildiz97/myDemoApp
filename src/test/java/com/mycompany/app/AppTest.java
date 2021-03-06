package com.mycompany.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.TestCase;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
	public void testFound() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array1, array2, array3, 7));
    }

    public void testNotFound() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array1, array2, array3, 2));
    }

    public void testFoundUnequalSizedArraysMax1() {
	  ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
	  ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3 ));
      assertTrue(new App().search(array1, array2, array3, 6));
    }

	public void testFoundUnequalSizedArraysMax2() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3 ));
	  ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
      assertTrue(new App().search(array1, array2, array3, 6));
    }

	public void testFoundUnequalSizedArraysMax3() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3 ));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
	  ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
      assertTrue(new App().search(array1, array2, array3, 6));
    }

	public void testNotFoundUnequalSizedArraysMax1() {
	  ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
	  ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3 ));
      assertFalse(new App().search(array1, array2, array3, 3));
    }

	public void testNotFoundUnequalSizedArraysMax2() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3 ));
	  ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
      assertFalse(new App().search(array1, array2, array3, 3));
    }

	public void testNotFoundUnequalSizedArraysMax3() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3 ));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
	  ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));
      assertFalse(new App().search(array1, array2, array3, 3));
    }

    public void testEmptyArrays() {
      ArrayList<Integer> array1 = new ArrayList<>();
      ArrayList<Integer> array2 = new ArrayList<>();
      ArrayList<Integer> array3 = new ArrayList<>();
      assertFalse(new App().search(array1, array2, array3, 1));
    }

    public void testNullArray1() {
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(null,array2,array3, 1));
    }

    public void testNullArray2() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
      ArrayList<Integer> array3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array1,null,array3, 1));
    }

	public void testNullArray3() {
      ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(2, 3, 4, 5));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array1,array2,null, 1));
    }

}
