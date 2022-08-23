package codingWithJohn.java;

public class Printer <T extends Animal /* Makes it so that any type of Animal can be put in */> { //Can also be <T> //You can even implement interface be doing <T extends Serializable>, one might think it is <T implements Serializable>, but that is not the proper syntax 																	 One	might also do <T extends Animals & Serializable> and list as many interfaces, but only one class, and that class must be at the start.					
	T thingToPrint;
	
	public Printer(T thingToPrint) {
		this.thingToPrint = thingToPrint;
	}
	
	public void print() {
		thingToPrint.eat(); //If we didn't have a bounded generic, then we couldn't have called the eat method, because we would have had no way to know whether or not the thing being passed in was an Animal or not, ergo no way of knowing whether it has an eat() method of not
		System.out.println(thingToPrint); 
	}
}
