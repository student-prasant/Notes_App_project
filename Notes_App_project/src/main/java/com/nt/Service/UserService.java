package com.nt.Service;

import com.nt.entity.User;

public interface UserService {
	
	public User saveUser(User user);
	
	
	public boolean existEmailCheck(String email);

}
