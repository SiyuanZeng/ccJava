package Question3_7_AnimalQueue.Original;

import java.util.LinkedList;

public class AnimalQueue {
	LinkedList<Dog> dogs = new LinkedList<Dog>();
	LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order = 0;

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public void enqueue(Animal a) {
		a.setOrder(order); //What does the order for?
		order++;
		if (a instanceof Dog) {
			dogs.addLast((Dog) a);
		} else if (a instanceof Cat) {
			cats.addLast((Cat)a);
		}
	}
	
	public Animal dequeueAny() {
		if (dogs.size() == 0) {
			return dequeueCats();
		} else if (cats.size() == 0) {
			return dequeueDogs();
		}
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if (dog.isOlderThan(cat)) {
			return dogs.poll();
		} else {
			return cats.poll();
		}
	}

	//Todo: sort everything in age order.
	
	public Animal peek() {
		if (dogs.size() == 0) {
			return cats.peek();
		} else if (cats.size() == 0) {
			return dogs.peek();
		}
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if (dog.isOlderThan(cat)) {
			return dog;
		} else {
			return cat;
		}
	}
	
	public int size() {
		return dogs.size() + cats.size();
	}

	public int getDogSize() {
		return dogs.size();
	}

	public int getCatSize() {
		return cats.size();
	}
	
	public Dog dequeueDogs() {
		return dogs.poll();
	}
	
	public Dog peekDogs() {
		return dogs.peek();
	}
	
	public Cat dequeueCats() {
		return cats.poll();
	}
	
	public Cat peekCats() {
		return cats.peek();
	}
}
