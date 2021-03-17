package treeset;
import java.util.Iterator;
import java.util.TreeSet;

public class treesetcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<String> temp=new TreeSet<String>();
temp.add("rat");
temp.add("ant");
temp.add("cat");

Iterator<String> i=temp.iterator();
while(i.hasNext())
	System.out.println(i.next());

TreeSet<String> temp1=new TreeSet<String>();
temp1.add("dog");
temp1.add("hen");
temp1.add("sheep");

temp.addAll(temp1);
System.out.println("The details is: "+temp);
	}

}
