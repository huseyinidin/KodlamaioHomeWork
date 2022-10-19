package kodlamaio.src.dataAccess;

import kodlamaio.src.entities.Instructor;

public class JdbcInstructorDao implements InsturctorDao{

	@Override
	public void add(Instructor instructor) {

		System.out.println("Added to database with JDBC " + instructor.getInstructorName());

	}

}
