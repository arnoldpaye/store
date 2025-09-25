package com.arnex.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.arnex.store.entities.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Long> {
    
}
