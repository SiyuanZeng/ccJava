package Question3_7_AnimalQueue.Original;

public abstract class Animal {
	protected int order;
	protected String name;
	public Animal(String n) {
		name = n;
	}
	
	public abstract String name();
	
	public void setOrder(int ord) {
		order = ord;
	}
	
	public int getOrder() {
		return order;
	}
	
	public boolean isOlderThan(Animal a) {
		return this.order < a.getOrder();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Animal animal = (Animal) o;

		if (order != animal.order) return false;
		return !(name != null ? !name.equals(animal.name) : animal.name != null);

	}

	@Override
	public int hashCode() {
		int result = order;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}
}
