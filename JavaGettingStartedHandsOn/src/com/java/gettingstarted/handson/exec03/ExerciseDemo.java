package com.java.gettingstarted.handson.exec03;

public class ExerciseDemo {

	public static void main(String[] args){
		System.out.println("-- Running unary operator Demo\n" );
		
        int i = 3;
        i++;
        System.out.println("Result is " + i);    // "4"
        --i;                     
        System.out.println("Result is " + i);    // "3"
        System.out.println("Result is " + ++i);  // "4"
        System.out.println("Result is " + i++);  // "4"
        System.out.println("Result is " + i);    // "5"
    }
	
}
