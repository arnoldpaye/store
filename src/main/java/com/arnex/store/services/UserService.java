package com.arnex.store.services;

import org.springframework.stereotype.Service;

import com.arnex.store.entities.User;
import com.arnex.store.repositories.UserRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;
    private final EntityManager entityManager;

    @Transactional
    public void showEntityStates() {
        var user =  User.builder().name("Arnex").email("arnex@email.com").password("password").build();

        userRepository.save(user);

        if (entityManager.contains(user)) {
            System.out.println("Persistent");
        } else {
            System.out.println("Transient / Detached");
        }
    }

    public void showRelatedEntities() {
        var profile = profileRepository.findAllById(2L).
        System.out.println(user.getEmail());
    }
}
