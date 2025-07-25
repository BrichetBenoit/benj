package fr.project.benj.controller;

import fr.project.benj.model.Course;
import fr.project.benj.service.contract.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses")
public class CourseController {

	private final CourseService courseService;

	@Autowired
	public CourseController(CourseService courseService) {
		this.courseService = courseService;
	}

	@PostMapping
	public ResponseEntity<Course> createCourse(@RequestBody String libelle) {
		Course created = courseService.createCourse(libelle);
		return ResponseEntity.ok(created);
	}
}
