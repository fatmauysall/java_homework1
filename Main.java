package homework;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"java","engin") {};
		Course course2 = new Course(2, "c#","kerem") {};
		Course course3 = new Course(3,"phyton","murat") {};
		

		
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		
		courseManager.completed(course1);
		courseManager.completed(course2);
		courseManager.completed(course3);
		
	}

}


