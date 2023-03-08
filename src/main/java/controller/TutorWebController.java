package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import entities.Tutor;
import exceptions.NullEmailFoundException;
import exceptions.NullUserFound;
import services.TutorService;

@RestController
@CrossOrigin("http://localhost:8020")
@RequestMapping("/tutor")
public class TutorWebController {

	@Autowired
	TutorService tutorService;
	
	
	@GetMapping("/")
	public String defaultMessage() {
		return "Welcome to Tutor controller";
	}
	
	@PostMapping("/registerTutor")
	public Tutor registerTutor(@RequestBody Tutor tutor) throws NullUserFound, NullEmailFoundException {
		return tutorService.registerTutor(tutor);
	}
	
	@GetMapping("/allTutors")
	public List<Tutor> getAllTutors(){
		return tutorService.getAllTutors();
	}
	
	@PostMapping("/updateTutor")
	public Tutor updateTutor(@RequestBody Tutor tutor) throws NullUserFound {
		return tutorService.updateTutor(tutor);
	}
	
	@DeleteMapping("/deleteTutor")
	public String deleteTutor(@RequestBody Tutor tutor) throws NullUserFound {
		return tutorService.deleteTutor(tutor);
	}
	
	
	@GetMapping("/loginTutor/{email}/{pass}")
	public Tutor loginTutor(@PathVariable String email, @PathVariable String pass) throws NullUserFound
	{
		return tutorService.loginTutor(email, pass);
	}
}