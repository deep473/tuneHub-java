package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Users;
import com.example.demo.repositories.UsersRepository;

@Service
public class UsersServiceImplementation
implements UsersService
{
	@Autowired
	UsersRepository repo;
	
	@Override
	public String addUser(Users user) 
	{
		repo.save(user);
		return "user is created and saved";
	}

	@Override
	public boolean emailExists(String email) {
		
		if(repo.findByEmail(email) == null) 
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public boolean validateUser(String email, String password) {
		
		Users user = repo.findByEmail(email);
		String db_password = user.getPassword();
		if(db_password.equals(password))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

	@Override
	public String getRole(String email) {
		return (repo.findByEmail(email).getRole());
	}

	@Override
	public Users getUser(String email) {
		return repo.findByEmail(email);
	}

	@Override
	public void updateUser(Users user) {
		repo.save(user);
	}
}










