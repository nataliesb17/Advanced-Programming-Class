package it114;

import java.util.Queue;
import java.util.LinkedList;

public class class917 {
	
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.add("dogs");
		queue.add("puppy");
		queue.add("doggo");
		queue.add("pupperoni");
		
		//Show everything in the queue
		System.out.println("Queue: " + queue);
		
		//Remove the first one in the queue
		String bye = queue.remove();
		System.out.println("Removed: " + bye);
		
		//Peek at the first one in the queue
		String peekaboo = queue.peek();
		System.out.println("First Element: " + peekaboo);
		
		//See the size of a queue
		int size = queue.size();
		System.out.println("Size of Queue: " + size);
		
		//See if the queue contains specific strings
		boolean bool = queue.contains("doggo");
		boolean bool2 = queue.contains("cats");
		System.out.println("Is Doggo in the Queue? " + bool);
		System.out.println("Is Cats in the Queue? " + bool2);
	}
	
}
