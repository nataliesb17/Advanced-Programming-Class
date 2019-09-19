package it114;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> myStrings = new ArrayList<String>();
		
		//Part 1
		myStrings.add("Eel");
		myStrings.add("Cat");
		myStrings.add("Dog");
		myStrings.add("Fish");
		myStrings.add("Lizard");
		myStrings.add("Ant");
		
		//Part 2
		Collections.sort(myStrings);
		Collections.reverse(myStrings);
		
		System.out.println("Reverse Order List: ");
		
		int i;
		for (i = 0; i < myStrings.size(); i++) {
			System.out.println(myStrings.get(i));
		}
		System.out.println("\n");
		
		//Part 3
		
		Collections.shuffle(myStrings);
		System.out.println("Shuffled List: ");
		for (i = 0; i < myStrings.size(); i++) {
			System.out.println(myStrings.get(i));
		}
		System.out.println("\n");
		
		//Part 4
		//Section 1
		
		List<Integer> numbers = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		int sum = 0;
		for(int i1 = 0; i1 < numbers.size(); i1++) {
		    sum += numbers.get(i1);
		}
		System.out.println("Sum of List: " + sum);
		
		
		//Section 2
		
		List<String> evenNum = new ArrayList<String>();
		List<String> oddNum = new ArrayList<String>();
		
		int int2;
		for (int i2 = 0; i2 < numbers.size(); i2++) {
			int number;
			number = numbers.get(i2);
			if (number % 2 == 0) {
				evenNum.add((Integer.toString(number)));
			}
			else {
				oddNum.add((Integer.toString(number)));
			}
		}
		
		System.out.println("Odd Numbers: ");
		for (i = 0; i < oddNum.size(); i++) {
			System.out.println(oddNum.get(i));
		}
		System.out.println("Even Numbers: ");
		for (i = 0; i < evenNum.size(); i++) {
			System.out.println(evenNum.get(i));
		}
		
		//Part 5
		int x = myStrings.size(); //this makes x equal to the amount of items in the list
		for (int i1 = 0; i1 < x; i1++) {  //creating a for loop so that each item in the list is swapped, this ends when i1 is greater than the amount of items in list, aka x
			int r = (int)(Math.random() * (i+1)); //this takes a 
			Object swap = myStrings.get(r);
			myStrings.set(r,  myStrings.get(i1));
			myStrings.set(i1,(String)swap);
		}
		System.out.println("Knuth");
		for(int i1 = 0; i1< myStrings.size(); i1++) {
			System.out.println(myStrings.get(i1));
		}
		
		
	}
}
