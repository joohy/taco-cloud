package com.action.in.taco.cloud.core.repository;

import com.action.in.taco.cloud.core.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}