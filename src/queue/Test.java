package queue;

public class Test {

	public static void main(String[] args) {
		
		Queuee kuyruk =new Queuee();
		
		kuyruk.enqueue(1);
		kuyruk.enqueue(2);
		kuyruk.enqueue(3);
		kuyruk.enqueue(4);
		kuyruk.enqueue(5);
		
		kuyruk.print();
		
		System.out.println("********");
		
		kuyruk.dequeue();
		
		kuyruk.print();
		
		System.out.println("********");
		kuyruk.enqueue(6);
		kuyruk.print();
		
		

	}

}
