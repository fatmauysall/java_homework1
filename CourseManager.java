package homework;

public class CourseManager {

	public void add(Course course) {
		System.out.println("Successfully added : " +course.courseName);
	}
	
	public void completed(Course course) {
		System.out.println("Successfully completed : " +course.courseName);
	}
}
