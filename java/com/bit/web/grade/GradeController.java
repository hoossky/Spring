package com.bit.web.grade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bit.web.util.Messenger;

@RestController
@RequestMapping("/grade")
public class GradeController {
	@Autowired GradeService gradeService;
	
//	@PostMapping("/register")
//	public Messenger add(@RequestBody Grade grade) {
//		gradeService.add(grade);
//		
//		
//	}
	@PostMapping("/total")
	public int total(@RequestBody Grade grade) {
		int total =0;
		return total;
		
	}
	@PostMapping("/average")
	public int average(@RequestBody Grade grade) {
		int average = 0;
		return average;
	}
	
	@GetMapping("/count")
	public int count(@RequestBody Grade grade) {
		int returnCount = 0;
		return returnCount;
	}
	
}
