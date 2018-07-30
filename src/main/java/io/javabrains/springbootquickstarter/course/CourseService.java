package io.javabrains.springbootquickstarter.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository CourseRepository;
	

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		CourseRepository.findByTopicId(topicId)
		.forEach(courses::add);
		return courses;
	}

	public Course getCourse(String id) {
//		courseRepository.findByName("___") no necesitas declararlo porque spring boot lo hace por nosotros
		return CourseRepository.findOne(id);
	
	}

	public void addCourse(Course course) {
		CourseRepository.save(course);

	}

	public void updateCourse(Course course) {
		CourseRepository.save(course);
		}


	public void deleteCourse(String id) {
		CourseRepository.delete(id);;
	}

}