package kodlamaio.src.dataAccess;

import kodlamaio.src.entities.Instructor;

public class HibernateInstructorDao implements InsturctorDao {

	@Override
	public void add(Instructor instructor) {

		System.out.println("Added to database with Hibernate " + instructor.getInstructorName());

	}
}
