package kodlamaio.src.dataAccess;

import kodlamaio.src.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		
		System.out.println("Added to database with JDBC " + course.getCourseName());
		
	}

}
