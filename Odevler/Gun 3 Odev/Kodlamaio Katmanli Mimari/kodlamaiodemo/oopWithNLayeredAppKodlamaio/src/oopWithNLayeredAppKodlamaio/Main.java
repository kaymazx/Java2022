package oopWithNLayeredAppKodlamaio;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayeredAppKodlamaio.business.CategoryManager;
import oopWithNLayeredAppKodlamaio.business.CourseManager;
import oopWithNLayeredAppKodlamaio.business.InstructorManager;
import oopWithNLayeredAppKodlamaio.core.logging.DatabaseLogger;
import oopWithNLayeredAppKodlamaio.core.logging.FileLogger;
import oopWithNLayeredAppKodlamaio.core.logging.Logger;
import oopWithNLayeredAppKodlamaio.core.logging.MailLogger;
import oopWithNLayeredAppKodlamaio.dataAcces.HibernateCourseDao;
import oopWithNLayeredAppKodlamaio.dataAcces.HibernateInstructorDao;
import oopWithNLayeredAppKodlamaio.dataAcces.JdbcCategoryDao;
import oopWithNLayeredAppKodlamaio.entities.Category;
import oopWithNLayeredAppKodlamaio.entities.Course;
import oopWithNLayeredAppKodlamaio.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = { new DatabaseLogger(), new FileLogger(), new MailLogger() };

		System.out.println("Instructor");
		System.out.println("-*-");

		Instructor instructor = new Instructor(1, "Engin", "Demirog");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor);

		System.out.println("-*-");
		System.out.println("Course");
		System.out.println("-*-");

		Course course1 = new Course(1, "Yazilim Gelistirici Kursu", 500);
		Course course2 = new Course(2, "Programlamaya Giris Kursu", 1000);
		Course course3 = new Course(3, "Agirlastirilmis Java Kursu", 1500);

		List<Course> courseList = new ArrayList<>();
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers, courseList);
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);

		System.out.println("-*-");
		System.out.println("Category");
		System.out.println("-*-");

		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Yabanci Dil Gelistirme");
		Category category3 = new Category(3, "Ingilizce Programlama");

		List<Category> categoryList = new ArrayList<>();
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers, categoryList);
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);
	}

}
