package godOfJava2nd.ch22;

import java.util.ArrayList;

public class ListSample {
	public static void main(String[] args) {
		ListSample sample = new ListSample();
		sample.checkArrayList();
		sample.checkArrayList2();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void checkArrayList() {
		ArrayList list1 = new ArrayList();
		list1.add(new Object());
		list1.add("ArrayList sample.");
		list1.add(new Double(1));
	}
	public void checkArrayList2() {
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add(1, "A1");
		
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("second A");
		list.addAll(list2);
		
		for(String str : list) {
			System.out.println(str);
		}
	}
}