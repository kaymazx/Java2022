package oopWithNLayeredAppKodlamaio.business;



import java.util.List;

import oopWithNLayeredAppKodlamaio.core.logging.Logger;
import oopWithNLayeredAppKodlamaio.dataAcces.CourseDao;
import oopWithNLayeredAppKodlamaio.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.setCourseDao(courseDao);
		this.courses = courses;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getCoursePrice() < 0) {
			throw new Exception("Kurs fiyati 0 dan kucuk olamaz.");
		}
		for (Course courses : courses) {
			if (courses.getCourseName().equals(course.getCourseName())) {
				throw new Exception("Kurs ismi ayni olamaz.");
			}

		}

		courses.add(course);
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getCourseName());

		}
	}

	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

}
