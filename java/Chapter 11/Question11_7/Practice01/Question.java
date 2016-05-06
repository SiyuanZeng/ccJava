package Question11_7.Practice01;

/**
 * Created by SiyuanZeng's on 10/15/2014.
 */

import java.util.ArrayList;

import static java.util.Collections.sort;

public class Question {

    public static ArrayList<HeightWeight> initialize() {
        ArrayList<HeightWeight> items = new ArrayList<HeightWeight>();

        HeightWeight item = new HeightWeight(65, 60);
        items.add(item);

        item = new HeightWeight(70, 150);
        items.add(item);

        item = new HeightWeight(56, 90);
        items.add(item);

        item = new HeightWeight(75, 190);
        items.add(item);

        item = new HeightWeight(60, 95);
        items.add(item);

        item = new HeightWeight(68, 110);
        items.add(item);

        item = new HeightWeight(35, 65);
        items.add(item);

        item = new HeightWeight(40, 60);
        items.add(item);

        item = new HeightWeight(45, 63);
        items.add(item);

        return items;
    }

    //What data structure should I use?
    public static ArrayList<HeightWeight>circusStunt (ArrayList<HeightWeight> array) {
        sort(array);
        return  getLongestSequence(array);
    }


    public static ArrayList<HeightWeight> getLongestSequence(ArrayList<HeightWeight> array) {
        ArrayList<ArrayList<HeightWeight>> solutions = new ArrayList();
        // What data structure is it ? I should filled my mind with questions and then read through the code.

        sequence(array, solutions, 0);
        ArrayList<HeightWeight> longestSequence = null;
        for ( int i = 0; i < array.size(); i++) {
            longestSequence = getLongerSequence(longestSequence, solutions.get(i));
        }

        return longestSequence;

    }

    // Naming is important, I can't think up an appropriate name for the methods.
    // No return pass by reference.
    public static void sequence(ArrayList<HeightWeight> array, ArrayList<ArrayList<HeightWeight>> solutions, int currentIndex) {
        if (currentIndex >= array.size() || currentIndex < 0) {
            return;
        }

        HeightWeight current = array.get(currentIndex);

        ArrayList<HeightWeight> longestSequence = null;

        for (int i = 0; i < currentIndex; i++) {
            if (current.isLargerThan(array.get(i))) {
                longestSequence = getLongerSequence(longestSequence, solutions.get(i));
            }
        }
        ArrayList<HeightWeight> newSequence = new ArrayList<HeightWeight> ();

        if (null != longestSequence) {
            //What methods should I use?
            newSequence.addAll(longestSequence);
        }

        newSequence.add(current);
        solutions.add(newSequence);
        sequence(array, solutions, currentIndex + 1);
    }

        // Do I need to specify the variable types?
        // It is not easy to write all the code, it really needs patience and skills, especially flawless code.
    public static ArrayList<HeightWeight> getLongerSequence(ArrayList<HeightWeight> longestSequence, ArrayList<HeightWeight> solution) {
        if (null == longestSequence) {
            return solution;
        } else if (null == solution) {
            return longestSequence;
        }

        return longestSequence.size() > solution.size()? longestSequence: solution;
    }

    public static void printList(ArrayList<HeightWeight> list) {
        for (int i = 0; i < list.size(); i++) {
            HeightWeight item = list.get(i);
            System.out.println(item.toString() + " ");
        }
    }
    public static void main(String[] args) {
        ArrayList<HeightWeight> items = initialize();
        ArrayList<HeightWeight> solution = circusStunt(items);
        printList(solution);
    }
}
