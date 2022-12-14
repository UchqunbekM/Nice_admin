package com.example.nice_admin.services;

import java.util.List;
import java.util.Optional;

import com.example.nice_admin.models.State;
import com.example.nice_admin.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StateService {
	
	
	@Autowired
	private StateRepository stateRepository;
	
	//Return list of states
	public List<State> getStates(){
		return stateRepository.findAll();
	}
	
	//SAve new state
	public void save(State state) {
		stateRepository.save(state);
	}
	
	//get by id
	public Optional<State> findById(int id) {
		return stateRepository.findById(id);
	}

	public void delete(Integer id) {
		stateRepository.deleteById(id);
	}
	
	
}
