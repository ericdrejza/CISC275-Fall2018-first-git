
public class Dog extends Animal {
	
	Dog(String name, int numLegs) {
		super(name, numLegs);
	}

	@Override
	public int compareTo(Animal other) {
		return this.getLegs() - other.getLegs();
	}

}
