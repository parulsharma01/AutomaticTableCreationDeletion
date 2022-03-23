package com.spring.security.oauth.repos;

import com.spring.security.oauth.entities.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Integer> {
}
