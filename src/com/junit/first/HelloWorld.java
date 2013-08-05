package com.junit.first;

public class HelloWorld
{ 
	
  public int multiply(int x, int y){
	  
	  if (x > 999) {
	      throw new IllegalArgumentException("X should be less than 1000");
	    }
	  
	  return x*y;	  
  }
  
  public static void main(String[] args)
  {
    System.out.println("Hello World");
  }
}