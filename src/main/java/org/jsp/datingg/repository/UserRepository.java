package org.jsp.datingg.repository;

import java.util.List;

import org.jsp.datingg.entity.User;
import org.jsp.datingg.util.UserGender;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findByGender(UserGender male);

}
