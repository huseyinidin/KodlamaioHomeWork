package kodlamaio.src.business;

import java.util.List;

import kodlamaio.src.core.logging.Logger;
import kodlamaio.src.dataAccess.InsturctorDao;
import kodlamaio.src.entities.Instructor;

public class InstructorManager {

	private InsturctorDao instructorDao;
	private List<Instructor> instructors;
	private Logger[] loggers;
	
	public InstructorManager(InsturctorDao instructorDao, List<Instructor> instructors, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.instructors = instructors;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) throws Exception {
		for (Instructor instructorName : instructors) {
			if(instructorName.getInstructorName().equals(instructor.getInstructorName())) {
				throw new Exception ("This instructor name already exists.");
			}
		}
		instructors.add(instructor);
		instructorDao.add(instructor);

		for(Logger logger :loggers) {
			logger.log(instructor.getInstructorName());
		}
	}

	
	
	
	
}
