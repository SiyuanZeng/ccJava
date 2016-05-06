package Question3_7_AnimalQueue.Original;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by SiyuanZeng's on 4/17/2016.
 */
public class AnimalQueueTest {

    @Test
    public void testEnqueue1() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Callie"));
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Dog("Fido"));
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Dexter"));
        animals.enqueue(new Dog("Dobo"));
        animals.enqueue(new Cat("Copa"));
        animals.enqueue(new Dog("Dapa"));
        animals.enqueue(new Cat("Kilo"));

        assertEquals(10, animals.size());
        assertEquals(5, animals.getCatSize());
        assertEquals(5, animals.getDogSize());
        assertEquals(10, animals.getOrder());
    }

    @Test
    public void testEnqueueDogsOnly2() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Dog("Fido"));
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Dog("Dexter"));

        assertEquals(3, animals.size());
        assertEquals(0, animals.getCatSize());
        assertEquals(3, animals.getDogSize());
        assertEquals(3, animals.getOrder());
    }

    @Test
    public void testDequeueAnyWhenThereAreOnlyDogs3() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        Dog dogFido = new Dog("Fido");
        animals.enqueue(dogFido );
        Dog dogDora = new Dog("Dora");
        animals.enqueue(dogDora);
        Dog dogDexter = new Dog("Dexter");
        animals.enqueue(dogDexter);

        assertEquals(dogFido, animals.dequeueAny());
    }

    @Test
    public void testDequeueAnyWhenThereAreOnlyCats4() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        Cat catCallie = new Cat("Callie");
        animals.enqueue(catCallie);
        Cat catKiki = new Cat("Kiki");
        animals.enqueue(catKiki);
        Cat catCopa = new Cat("Copa");
        animals.enqueue(catCopa);

        assertEquals(catCallie, animals.dequeueAny());
    }

    @Test
    public void testDequeueAnyWhenDogIsOlderThanCat5() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        Dog dogFido = new Dog("Fido");
        animals.enqueue(dogFido );

        Cat catCallie = new Cat("Callie");
        animals.enqueue(catCallie);

        assertEquals(dogFido, animals.dequeueAny());
    }

    @Test
    public void testDequeueAnyWhenCatIsOlderThanDog6() throws Exception {
        AnimalQueue animals = new AnimalQueue();

        Cat catKiki = new Cat("Kiki");
        animals.enqueue(catKiki);

        Dog dogFido = new Dog("Fido");
        animals.enqueue(dogFido );

        assertEquals(catKiki, animals.dequeueAny());
    }

    @Test
    public void testPeekOnlyDogs() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        Dog dogFido = new Dog("Fido");
        animals.enqueue(dogFido );
        Dog dogDora = new Dog("Dora");
        animals.enqueue(dogDora);
        Dog dogDexter = new Dog("Dexter");
        animals.enqueue(dogDexter);

        assertEquals(dogFido, animals.peek());
    }

    @Test
    public void testPeekOnlyCats() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        Cat catCallie = new Cat("Callie");
        animals.enqueue(catCallie);
        Cat catKiki = new Cat("Kiki");
        animals.enqueue(catKiki);
        Cat catCopa = new Cat("Copa");
        animals.enqueue(catCopa);

        assertEquals(catCallie, animals.peek());
    }


    @Test
    public void shouldReturnDogWhenDogIsOlderThanCat5() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        Dog dogFido = new Dog("Fido");
        animals.enqueue(dogFido );

        Cat catCallie = new Cat("Callie");
        animals.enqueue(catCallie);

        assertEquals(dogFido, animals.peek());
    }

    @Test
    public void shouldReturnCatWhenCatIsOlderThanDog6() throws Exception {
        AnimalQueue animals = new AnimalQueue();

        Cat catKiki = new Cat("Kiki");
        animals.enqueue(catKiki);

        Dog dogFido = new Dog("Fido");
        animals.enqueue(dogFido );

        assertEquals(catKiki, animals.peek());
    }

    @Test
    public void shouldReturnTotalSizeWhenThereAreDogsAndCats() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Callie"));
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Dog("Fido"));
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Dexter"));
        animals.enqueue(new Dog("Dobo"));
        animals.enqueue(new Cat("Copa"));
        animals.enqueue(new Dog("Dapa"));
        animals.enqueue(new Cat("Kilo"));

        assertEquals(10, animals.size());
    }


    @Test
    public void shouldReturnTotalSizeWhenThereAreOnlyCats() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Callie"));
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Cat("Copa"));
        animals.enqueue(new Cat("Kilo"));

        assertEquals(5, animals.size());
    }

    @Test
    public void shouldReturnTotalSizeWhenThereAreOnlyDogs() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Dog("Fido"));
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Dog("Dexter"));
        animals.enqueue(new Dog("Dobo"));
        animals.enqueue(new Dog("Dapa"));

        assertEquals(5, animals.size());
    }

    @Test
    public void getDogSize() {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Cat("Callie"));
        animals.enqueue(new Cat("Kiki"));
        animals.enqueue(new Dog("Fido"));
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Dexter"));
        animals.enqueue(new Dog("Dobo"));
        animals.enqueue(new Cat("Copa"));
        animals.enqueue(new Dog("Dapa"));
        animals.enqueue(new Cat("Kilo"));

        assertEquals(5, animals.getDogSize());
    }

    @Test
    public void getCatSize() {
        AnimalQueue animals = new AnimalQueue();
        animals.enqueue(new Dog("Fido"));
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Dexter"));
        animals.enqueue(new Dog("Dobo"));
        animals.enqueue(new Cat("Copa"));
        animals.enqueue(new Dog("Dapa"));
        animals.enqueue(new Cat("Kilo"));

        assertEquals(3, animals.getCatSize());
    }

    @Test
    public void testDequeueDogs() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        Cat catCallie = new Cat("Callie");
        animals.enqueue(catCallie);
        animals.enqueue(new Cat("Kiki"));
        Dog dogFido = new Dog("Fido");
        animals.enqueue(dogFido);
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Dexter"));
        animals.enqueue(new Dog("Dobo"));
        animals.enqueue(new Cat("Copa"));
        animals.enqueue(new Dog("Dapa"));
        animals.enqueue(new Cat("Kilo"));

        assertEquals(dogFido, animals.dequeueDogs());
    }

    @Test
    public void testDequeueCats() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        Cat catCallie = new Cat("Callie");
        animals.enqueue(catCallie);
        animals.enqueue(new Cat("Kiki"));
        Dog dogFido = new Dog("Fido");
        animals.enqueue(dogFido);
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Dexter"));
        animals.enqueue(new Dog("Dobo"));
        animals.enqueue(new Cat("Copa"));
        animals.enqueue(new Dog("Dapa"));
        animals.enqueue(new Cat("Kilo"));

        assertEquals(catCallie, animals.dequeueCats());
    }

    @Test
    public void testPeekDogs() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        Cat catCallie = new Cat("Callie");
        animals.enqueue(catCallie);
        animals.enqueue(new Cat("Kiki"));
        Dog dogFido = new Dog("Fido");
        animals.enqueue(dogFido);
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Dexter"));
        animals.enqueue(new Dog("Dobo"));
        animals.enqueue(new Cat("Copa"));
        animals.enqueue(new Dog("Dapa"));
        animals.enqueue(new Cat("Kilo"));

        assertEquals(dogFido, animals.peekDogs());
    }

    @Test
    public void testPeekCats() throws Exception {
        AnimalQueue animals = new AnimalQueue();
        Cat catCallie = new Cat("Callie");
        animals.enqueue(catCallie);
        animals.enqueue(new Cat("Kiki"));
        Dog dogFido = new Dog("Fido");
        animals.enqueue(dogFido);
        animals.enqueue(new Dog("Dora"));
        animals.enqueue(new Cat("Kari"));
        animals.enqueue(new Dog("Dexter"));
        animals.enqueue(new Dog("Dobo"));
        animals.enqueue(new Cat("Copa"));
        animals.enqueue(new Dog("Dapa"));
        animals.enqueue(new Cat("Kilo"));

        assertEquals(catCallie, animals.peekCats());
    }
}