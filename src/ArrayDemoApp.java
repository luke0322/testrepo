import java.util.ArrayList;
import java.util.Collections;

public class ArrayDemoApp {
public static void main(String[] args) {
	System.out.println("Welcome to the Collections Framework");
	doOldSchoolArrays();
	System.out.println();
	doNewArrays();
	System.out.println();
	doNewArrays2();
	}

public static void doOldSchoolArrays() {
	ArrayList students = new ArrayList();
	students.add("Eric");
	students.add("Luke");
	students.add("Bill"); //array list type keeps order tracked
	students.add("Lisa");
	students.add("Denise");
	students.add("Andrew");
	students.add("Emilie");
	students.add("Joe");
	
	for (int i = 0; i<students.size(); i++) {
		String str = (String) students.get(i);
		System.out.println("Student name = " + str);
		}
	}

public static void doNewArrays() {
	ArrayList<String> students = new ArrayList<String>();
	students.add("Eric");
	students.add("Luke");
	students.add("Bill"); //array list type keeps order tracked
	students.add("Lisa");
	students.add("Denise");
	students.add("Andrew");
	students.add("Emilie");
	students.add("Joe");
	
	for (String s: students) { //for this collection/array list, iterate through that list, each el is s
		System.out.println("Student name [JDK 1.5]: " + s);
		}
	}
public static void doNewArrays2() {
	ArrayList<String> students = new ArrayList<>();
	students.add("Eric");
	students.add("Luke");
	students.add("Bill"); //array list type keeps order tracked
	students.add("Lisa");
	students.add("Denise");
	students.add("Andrew");
	students.add("Emilie");
	students.add("Joe");
	
	for (String s: students) { //for this collection/array list, iterate through that list
		System.out.println("Student" +students.indexOf(s)+  " name [JDK 1.7]: " + s); //each element is s in the list
		} //cannot do indexing with an enhanced for loop
	
	if(students.contains("Lisa")) { //returns true, displays output from below
		System.out.println("Lisa is here");
	}
	if(students.contains("Sean")) { //returns false, does not print (not in list)
		System.out.println("Sean is here");
	}
	
	System.out.println(students.indexOf("Joe"));
	System.out.println(students.get(2));
	//students.set(1, "Bob"); //overwrites and changes list to remove Luke
	System.out.println(students);
	Collections.sort(students, Collections.reverseOrder()); //manipulating list to sort alphabetically
	System.out.println("Sorted students: " + students);
	Collections.shuffle(students);
	System.out.println("Random students: " + students);
	
	students.remove("Joe");
	System.out.println("Joe gone students: " + students);
	}

}

