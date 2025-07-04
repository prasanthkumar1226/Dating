package org.jsp.datingg.dao;

import java.util.List;
import java.util.Optional;

import org.jsp.datingg.entity.User;
import org.jsp.datingg.repository.UserRepository;
import org.jsp.datingg.util.UserGender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class UserDao {
	@Autowired
	UserRepository userRepository;

	public User saveUser(User user) {
		return userRepository.save(user);
	}

	public List<User> findAllMaleUsers() {
		return userRepository.findByGender(UserGender.MALE);
	}

	public List<User> findAllFemaleUsers() {
		return userRepository.findByGender(UserGender.FEMALE);
	}

	public Optional<User> findUserById(int id) {
		return userRepository.findById(id);
	}	
}
