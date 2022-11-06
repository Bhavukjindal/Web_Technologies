class Employee{
	String name;
	int year_of_joining;
	String Address;
	
	 Employee(String name , int year, String Address) {
		this.name= name;
		this.year_of_joining = year;
		this.Address = Address;
	}
	 void printEmployee(){
		 String s  = name + "    "+year_of_joining+ "       " + Address;
		 System.out.println(s);
	 }
}


public class ques2 {

	public static void main(String[] args) {
		System.out.println("Name   Year of joining   Address");
		Employee e1 = new Employee("Robert  " , 1994, "  64C- WallsStreat");
		e1.printEmployee();
		Employee e2 = new Employee("Sam     " , 2000, "  68D- WallsStreat");
		e2.printEmployee();
		Employee e3 = new Employee("John    " , 1999, "  26B- WallsStreat");
		e3.printEmployee();
	}

}