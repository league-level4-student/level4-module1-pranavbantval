package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	
	public ArrayList() {
	}
	
	public int get(int loc) throws IndexOutOfBoundsException {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(206);
	
		return 0;
	}
	
	public void add(T val) {
		
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		class Student { 
			public String name; 
			public Student(String s) {
				name = s;
			}
		}
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("Tim"));
		list.add(new Student("Sara"));
		list.add(new Student("Kamara"));
		list.add(new Student("Devaugn"));
		
		list.remove(0);
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}