package oopWithNLayeredAppKodlamaio.business;

import oopWithNLayeredAppKodlamaio.core.logging.Logger;
import oopWithNLayeredAppKodlamaio.dataAcces.InstructorDao;
import oopWithNLayeredAppKodlamaio.entities.Instructor;

public class InstructorManager {

	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getInstructorName() + " " + instructor.getInstructorName());
		}
	}
}
