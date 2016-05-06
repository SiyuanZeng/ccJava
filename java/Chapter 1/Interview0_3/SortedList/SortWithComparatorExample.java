package Interview0_3.SortedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithComparatorExample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i=0;i<10;i++) {
			list.add((int) (Math.random() * 100));
		}
		
		System.out.println("Initial List: "+list);
		Collections.sort(list, new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				return i2.intValue() - i1.intValue();
			}
			
		});
		System.out.println("Sorted List: "+list);
		
	}

}
