package kodlamaio.src.business;

import java.util.List;

import kodlamaio.src.core.logging.Logger;
import kodlamaio.src.dataAccess.CourseDao;
import kodlamaio.src.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private List<Course> courses;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, List<Course> courses, Logger[] loggers) {
		this.courseDao = courseDao;
		this.courses = courses;
		this.loggers = loggers;

	}

	public void add(Course course) throws Exception {

		for (Course courseName : courses) {
			if (courseName.getCourseName().equals(course.getCourseName())) {
				throw new Exception("This course name already exists.");
			} else if (course.getPrice() < 0) {
				throw new Exception("Course price can't be lower than 0");
			}
		}
		courseDao.add(course);
		courses.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());
		}
	}
}
