package com.kryhowsky.tacocloud.repository;

import com.kryhowsky.tacocloud.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
