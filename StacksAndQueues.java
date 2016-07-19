public class Queues{

	int Qsize;
	private int[]queues;
	private int nItems;

	public ArrayQueue(int size){
		this.QSIZE=size;
		this.QUEUE=new int [this.QSIZE];

	}

	public boolean isFull{
		if (this.nItems==this.QSIZE) {
			System.out.println("QUEUE is FULL");
			return true;
			
		}else{
			return false;
		}
	}

public boolean isEMPTY(){


	if (this.nItems == 0) {
		System.out.print("QUEUE is EMPTY");
		return true;
		
	}else{
		return false;
    }


}

public boolean ENQUEUE(int num){

	System.out.println("Trying to enqueue"+num+"...");
	if (this.isFull()) {
		this.QUEUE[nItems]=num;
		System.out.println("\t"+"ADDED"+NUM);
		this.nItems++;
		
	}else{


	}

}
public int DEQUEUE(){
	System.out.println("Trying to DEQUEUE"+num+"....");
    IF (this.isFull()){
    	this.Queues[]
    }
}
public void rearrangeQUEUE(){

	public int peekFront(){
        return this.Queues[0];
	}
	public int peekRear(){
		return this.Queues[this.nItems-1];
	}
}

