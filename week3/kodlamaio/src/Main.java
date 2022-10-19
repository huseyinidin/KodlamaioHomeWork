package kodlamaio.src;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.src.business.CategoryManager;
import kodlamaio.src.business.CourseManager;
import kodlamaio.src.business.InstructorManager;
import kodlamaio.src.core.logging.DatabaseLogger;
import kodlamaio.src.core.logging.FileLogger;
import kodlamaio.src.core.logging.Logger;
import kodlamaio.src.core.logging.MailLogger;
import kodlamaio.src.dataAccess.HibernateCategoryDao;
import kodlamaio.src.dataAccess.HibernateCourseDao;
import kodlamaio.src.dataAccess.HibernateInstructorDao;
import kodlamaio.src.dataAccess.JdbcCourseDao;
import kodlamaio.src.entities.Category;
import kodlamaio.src.entities.Course;
import kodlamaio.src.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Instructor instructor = new Instructor(1, "Engin", 35 , "MCT, PMP ve ITIL");
		
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		List<Instructor> instructors = new ArrayList<Instructor>();
		
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), instructors, loggers);
		instructorManager.add(instructor);
		
		
		System.out.println("****************************");

		Course course1 = new Course(1, "Java", 1500);
		Course course2 = new Course(2, "C#", 1500);
		Course course3 = new Course(3, "Java Script", 1500);
		Course course4 = new Course(4, "C++", 1500);

		List<Course> courses = new ArrayList<Course>();


		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), courses, loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);

		System.out.println("****************************");

		Category category1 = new Category(1, "Software");
		Category category2 = new Category(2, "Hardware");

		List<Category> categories = new ArrayList<Category>();

		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), categories, loggers);

		categoryManager.add(category1);
		categoryManager.add(category2);

	}

}
