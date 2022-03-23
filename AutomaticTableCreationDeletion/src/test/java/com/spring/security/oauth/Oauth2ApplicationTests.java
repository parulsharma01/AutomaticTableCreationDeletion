package com.spring.security.oauth;

import com.spring.security.oauth.entities.Role;
import com.spring.security.oauth.entities.User;
import com.spring.security.oauth.repos.RoleRepository;
import com.spring.security.oauth.repos.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import java.util.HashSet;

@SpringBootTest
class Oauth2ApplicationTests {
	@Autowired
	UserRepository userRepository;

	@Autowired
	RoleRepository roleRepository;

	@Test
	void contextLoads() {
	}
	@Test
	@Sql({"/createSchema.sql"})
	void createAllTables(){}

	@Test
	void insertMTMUser(){
		User user = new User();
		user.setName("Parul Sharma");
		HashSet<Role> roles = new HashSet<Role>();
		Role role = new Role();
		role.setName("ROLE_ADMIN");
		Role role2 = new Role();
		role2.setName("ROLE_USER");
		roles.add(role);
		roles.add(role2);
		user.setRoles(roles);
		userRepository.save(user);
	}
//
//	@Test
//	@Sql({"/dropSchema.sql"})
//	void dropAllTables(){}

}
