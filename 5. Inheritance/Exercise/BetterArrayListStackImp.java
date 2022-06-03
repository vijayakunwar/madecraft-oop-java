package Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class BetterArrayListStackImp {

	List<String> myList = new ArrayList<>();
	Random random = new Random();
	
	public List<String> createList(String item) {
		// insert the specified element at the specified position in the list
		myList.add(0,item); 
		return myList;
		
	}
	public void allItem() {
		int index=0;
		for(String s : myList) {
			System.out.println("Index: "+ index++ +"-->"+"Stack item :"+s);
		}
	}
	public void lastItemInStack() {
		System.out.println(myList.get(myList.size()-1));
		
	}
	public void firstItemInStack() {
		System.out.println(myList.get(0));
	}
	
	public void removeStackItem() {
		int randomIndex = random.nextInt(0, myList.size());
		System.out.println("Item at index : "+randomIndex +" will be removed froms stack");
		myList.remove(randomIndex);
	}
	//to sort the stack Item
	public void sortStackItem() {
		List<String> sortedList = myList.stream().sorted().collect(Collectors.toList());
		sortedList.forEach(System.out::println);
		
		//this code put all item as String resulting all item with same index[0]
		/*
		 * Collections.sort(myList); for(String s : myList) { int index=0;
		 * System.out.println("Index: "+ index++ +"-->"+"Stack item :"+s); }
		 */
	}
}
