package Question3_7_AnimalQueue._166;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by SiyuanZeng's on 9/10/2014.
 */
public class AnimalQueue {
    private LinkedList<Cat> cats = new LinkedList<Cat>();
    private LinkedList<Dog> dogs = new LinkedList<Dog>();

    public List<Cat> getCats() {
        return cats;
    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public boolean enqueueDog(Dog dog) {
        return dogs.add(dog);
    }

    public boolean enqueueCat(Cat cat) {
        return cats.add(cat);
    }

    public Dog dequeueDog() {
        return dogs.poll();
    }

    public Animal peek() {
        if (dogs.size() == 0) {
            return cats.peek();
        } else if (cats.size() == 0) {    // Better since it is either … or …
            return dogs.peek();
        }

        Cat cat = cats.peek();
        Dog dog = dogs.peek();

        if (dog.hasOrderBiggerthan(cat)) {
            return dog;
        } else {
            return cat;
        }
    }

    public Cat dequeueCat() {
        return cats.poll();
    }


    public Animal dequeueAnimal() {
        Cat cat = null;
        Dog dog = null;

        if (dogs.size() == 0) {
            return dequeueCat();
        }

        if (cats.size() == 0) {
            return dequeueDog();
        }

        cat = dequeueCat();
        dog = dequeueDog();

        if (cat.hasOrderBiggerthan(dog)) {
            return cat;
        }

        return dog;
    }

    public int size() {
        return dogs.size() + cats.size();
    }
}