package fr.project.benj.service.impl;

import fr.project.benj.model.Course;
import fr.project.benj.repository.CourseRepository;
import fr.project.benj.service.contract.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

	private final CourseRepository courseRepository;

	@Autowired
	public CourseServiceImpl(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@Override
	public Course createCourse(String libelle) {
		Course course = new Course(libelle);
		courseRepository.save(course);
		return course;
	}
}
