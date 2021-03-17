package linkedlist;
//import java.util.*;
//import java.util.Iterator;
import java.util.LinkedHashSet;
public class linklistcls {

	public static void main(String[] args) {
		LinkedHashSet<Employee> emp=new LinkedHashSet<Employee>();
		Employee e1 = new Employee(1,"Dini","Rangasamy","Chithra",25);
		Employee e2= new Employee(2,"Khavi","Rajendran","Kannammal",23);
      
		emp.add(e1);
		emp.add(e2);
		
		/*Iterator<Employee> i=emp.iterator();
		while(i.hasNext())
		{
			System.out.println("id:"+i.next()+"fathername"+i.next()+" "+"mothername"+i.next()+" "+"age"+i.next());
			  
			  }*/
		for(Employee i: emp) {
			System.out.println("id:"+i.id + " "+"name: " + i.name + " "+"fathername: " +
		i.fathername + " "+"mothername: " + i.mothername + " "+"age: " + i.age);
		}
		
	}

}

class Employee{
	int id;
	String name,fathername,mothername;
	int age;
	public Employee(int id, String name, String fathername, String mothername, int age) {
		super();
		this.id = id;
		this.name = name;
		this.fathername = fathername;
		this.mothername= mothername;
		this.age = age;
	}
}