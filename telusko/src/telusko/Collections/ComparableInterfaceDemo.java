package telusko.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Stud implements Comparable<Stud>{
	int rollno, marks;
	String name;
	
	public Stud(int rollno, int marks, String name) {
		super();
		this.rollno = rollno;
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Stud [rollno=" + rollno + ", marks=" + marks + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Stud o) {
		return 0;
	}
}

public class ComparableInterfaceDemo {

	public static void main(String[] args) {

		List<Stud> studs = new ArrayList<>();
		
		studs.add(new Stud(23, 55, "Mahesh"));
		studs.add(new Stud(20, 64, "Larrry"));
		studs.add(new Stud(19, 25, "Sonnny"));
		studs.add(new Stud(26, 35, "Arvind"));
		
		Collections.sort(studs, (i, j) -> i.marks>j.marks?1:-1);
		
		for(Stud s: studs)
			System.out.println(s); 		
	}

}
