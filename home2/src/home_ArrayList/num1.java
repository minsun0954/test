package home_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class num1 {

	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList(10);
		
		list1.add(0);
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		
		System.out.println(list1);
		
		System.out.println("-------------------");
		
		list1.add(3,7);	// 3자리에 7들어가고 뒤로 밀림
		System.out.println(list1);

		list1.add(3,11);	// 3자리에 11들어가고 뒤로 밀림
		System.out.println(list1);
		
		System.out.println("-------------------");
		
		List copyList = list1.subList(0,4);
		System.out.println(list1);
		System.out.println(copyList); // 0~3 인덱스 추출
		
		System.out.println("-------------------");
		
		// 수정하고 싶을때 arrayList 
		ArrayList list2 = new ArrayList(list1.subList(0,4));
		System.out.println(list1);
		System.out.println(list2);
		

	}

}
