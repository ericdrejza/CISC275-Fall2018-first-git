
public abstract class Animal implements Comparable<Animal>{

	String name;
	int numLegs;
	
	Animal (String name, int numLegs){
		this.name = name;
		this.numLegs = numLegs;
	}
	
	public int getLegs() {
		return numLegs;
	}
	
	@Override
	public String toString() {
		return name + ": " + numLegs + " legs";
	}
	
	
}
