package com.arnex.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.arnex.store.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {
    
}
