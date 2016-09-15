package Lambda;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerExample {
    public static void main(String[] args) {
        List<Student> list = new ArrayList();
        list.add(new Student("Ram",20));
        list.add(new Student("Shyam",22));
        list.add(new Student("Kabir",18));
        //Creating instance of Consumer functional interface
        Consumer<Student> style = (Student s) -> System.out.println("Name:"+s.name +" and Age:"+s.age);
        //first way using Consumer
        list.forEach(style);
        //second way using method reference 
        list.forEach(Student::printData);
        //third way using lambda expression
        list.forEach(s -> s.printData());
    }

    private static class Student {

        private String name;
        private int age;

        Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        void printData(){
            System.out.println("Name: "+ name + " Age: " + age);
        }

    }
}