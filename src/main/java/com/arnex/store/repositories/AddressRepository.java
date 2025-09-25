package com.arnex.store.repositories;

import org.springframework.data.repository.CrudRepository;

import com.arnex.store.entities.Address;

public interface AddressRepository extends CrudRepository<Address, Long> {
    
}
