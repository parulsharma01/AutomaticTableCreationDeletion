package com.spring.security.oauth.repos;

import com.spring.security.oauth.entities.Role;
import com.spring.security.oauth.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
}
