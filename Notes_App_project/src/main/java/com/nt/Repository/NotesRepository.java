package com.nt.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Notes;
import com.nt.entity.User;


public interface NotesRepository  extends JpaRepository<Notes, Integer>{
	
	public List<Notes> findByUser(User user);

}
