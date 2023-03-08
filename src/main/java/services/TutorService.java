package services;

import java.util.List;


import entities.Tutor;
import exceptions.NullEmailFoundException;
import exceptions.NullUserFound;

public interface TutorService {
	
	public Tutor registerTutor(Tutor tutor) throws NullUserFound, NullEmailFoundException;
	
	public List<Tutor> getAllTutors();
	
	public Tutor getTutorById(Integer pid) throws NullUserFound;
	
	public Tutor updateTutor(Tutor tutor) throws NullUserFound;
	
	public String deleteTutor(Tutor tutor) throws NullUserFound;
	
	public Tutor loginTutor(String email, String password) throws NullUserFound;

	
	
}