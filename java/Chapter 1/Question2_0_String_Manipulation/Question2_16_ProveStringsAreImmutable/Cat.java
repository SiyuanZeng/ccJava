package Question2_0_String_Manipulation.Question2_16_ProveStringsAreImmutable;

/**
 * Created by SiyuanZeng's on 4/24/2016.
 */
public class Cat extends Animal {
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        Cat.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}
