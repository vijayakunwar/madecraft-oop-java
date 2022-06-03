package Exercise;

public class mainArrayListPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BetterArrayListStackImp betterArrayList = new BetterArrayListStackImp();
		betterArrayList.createList("One");
		betterArrayList.createList("Onnne");
		betterArrayList.createList("Three");
		betterArrayList.createList("012");
		betterArrayList.createList("11");
		betterArrayList.createList("1");
		betterArrayList.createList("ONe");
		betterArrayList.createList("ONNNe");
		betterArrayList.createList("one");
		betterArrayList.createList("onnne");
		
		betterArrayList.allItem();
		
		System.out.println("--------Access last element of stack---------");
		
		betterArrayList.lastItemInStack();
		
		System.out.println("------After acessing last element of stack--");
		betterArrayList.allItem();
		
		System.out.println("----Accessing first element in stack-----");
		betterArrayList.firstItemInStack();
		
		
		
		betterArrayList.createList("2.5");
		betterArrayList.createList("one");
		betterArrayList.createList("333.00");
		betterArrayList.createList("333");
		
		System.out.println("-----Stack after adding more item------");
		betterArrayList.allItem();
		
		System.out.println("----Accessing first element in stack after adding item-----");
		betterArrayList.firstItemInStack();
		
		System.out.println("------removing item from stack---------------");
		betterArrayList.removeStackItem();
		
		System.out.println("---------stack after removing item----------");
		betterArrayList.allItem();
		
		System.out.println("-------\"sorted item in Ascending order\"-------");
		betterArrayList.sortStackItem();
		
		System.out.println("----listing all item from main Stack-------");
		betterArrayList.allItem();
		
		
		
		
		
		

	}

}
