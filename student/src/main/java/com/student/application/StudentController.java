package ccc;

@path(/student)
public class StudentController {

	StudentService studentService = new StudentService();	

	@GET
	@path(/getStudentDetails)
	@Produces({MediaType.APPLICATION_JSON})
	 public List<Student> getAllStudents(@Context HttpHeaders headers)
	 {
		List<Student> students = studentService.getAllStudents();
		return students;
	 }
	
	
	
	@POST
	@path(/addStudentDetails)
	@Produces(MediaType.APPLICATION_XML)
	public String addStudent(Student student)
	{
		
	    return studentService.addStudent(student);

	}

	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	
	public Student updateStudent(@PathParam("id")int rollno ,Student student)
	{
		student.setRollNo(id);
		return studentService.update(student);
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_XML)
	
	public String removeStudent(@PathParam("id") int rollno)
	{
	return studentService.delete(id);

	}
}
