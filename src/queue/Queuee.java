package queue;

import java.util.LinkedList;

public class Queuee {
	
	private LinkedList<Integer> linkedList;
	
	public Queuee(){
		linkedList=new LinkedList<Integer>();
	}
	
	public void enqueue(int data) {
		linkedList.add(data);
	}
	
	public void dequeue() {
		linkedList.removeFirst();
	}
	
	public int getFront() {
		return linkedList.getFirst();
	}
	
	public int getSize() {
		return linkedList.size();
	}
	
	public void print() {
		for(int i=0;i<linkedList.size();i++) {
			System.out.println(linkedList.get(i));
		}
	}
	

}
