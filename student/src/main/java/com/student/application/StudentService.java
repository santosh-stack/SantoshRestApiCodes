package ccc;

import java.util.List;

public class StudentService {
	 public List<Student> getAllStudents()
	    {
	        List<Student> students = new ArrayList<Student>();	
	        Student s1 = new Student(1,17, "Amit", "Agarwal");
	        Student s2 = new Student(2,18,"Anuj","Kulhari");
	        students.add(s1);
	        students.add(s2);
	        return students;
	    }	
}
