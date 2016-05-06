package Question3_7_AnimalQueue.Original;

public class Dog extends Animal {
	public Dog(String n) {
		super(n);
	}
	
	public String name() {
		return "Dog: " + name;
	}


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Dog dog = (Dog) o;

		if (order != dog.order) return false;
		return !(name != null ? !name.equals(dog.name) : dog.name != null);

	}

	@Override
	public int hashCode() {
		int result = order;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}


}
