package Question3_7_AnimalQueue._165;

import java.util.LinkedList;

public class AnimalQueue {
    LinkedList<Dog> dogs = new LinkedList<Dog>();
    LinkedList<Cat> cats = new LinkedList<Cat>();

    private int order = 0;

    public void enqueue(Animal a) {
        a.setOrder(order);
        order++;
        if (a instanceof Dog) {
            dogs.addLast((Dog) a);
        } else if (a instanceof Cat) {
            cats.addLast((Cat) a);
        }
    }

    public Animal dequeueAny() {
        Cat cat = null;
        Dog dog = null;

        if (dogs.size() != 0) {
            dog = dequeueDog();
        }

        if (cats.size() != 0) {
            cat = dequeueCat();
        }

        if (null == cat) return dog;
        if (null == dog) return cat;

        if (cat.getOrder() < dog.getOrder()) return cat;
        return dog;
    }

    public Animal peek() {
        if (dogs.size() == 0) {
            return cats.peek();    // LinkedList also has peek()
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


    public Cat dequeueCat() {
        return cats.poll();

    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Dog peekDogs() {    // When can I return null? Null is handled in other layers.
        // How to handle NullPointerException?
        return dogs.peek();
    }

    public Cat peekCats() {
        return cats.peek();
    }
}


