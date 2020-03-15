package com.yobuligo.DemoController.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PersonController {

	@GetMapping("/person")
	public Person getPerson() {
		Person person = new Person();
		person.setFirstname("Max");
		person.setLastname("Müller");
		return person;
	}
	
}
